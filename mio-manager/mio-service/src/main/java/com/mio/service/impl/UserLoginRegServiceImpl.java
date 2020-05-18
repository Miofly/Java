package com.mio.service.impl;

import com.mio.global.CommonResultUtil;
import com.mio.global.Config;
import com.mio.mapper.CommonUserMapper;
import com.mio.pojo.CommonUser;
import com.mio.pojo.CommonUserExample;
import com.mio.result.ResultInfo;
import com.mio.result.ResultUtil;
import com.mio.service.JedisClient;
import com.mio.service.UserLoginRegService;
import com.mio.util.JsonUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class UserLoginRegServiceImpl implements UserLoginRegService {


    @Autowired
    private CommonUserMapper commonUserMapper;

    @Autowired
    private JedisClient jedisClient;
    @Value("${REDIS_SESSION_EXPIRE}")
    private Integer REDIS_SESSION_EXPIRE;

    /*检验用户输入数据是否冲突*/
    public void checkData(String param, int type) throws Exception {
        //根据不同的type生成不同的查询条件
        CommonUserExample example = new CommonUserExample();
        CommonUserExample.Criteria criteria = example.createCriteria();
        //1：用户名 2：手机号 3：邮箱
        if (type == 1) {
            criteria.andUsernameEqualTo(param);
        } else if (type == 2) {
            criteria.andPhoneEqualTo(param);
        } else if (type == 3) {
            criteria.andEmailEqualTo(param);
        } else {
            /*类型错误*/
            CommonResultUtil.throwExcepion(CommonResultUtil.createInfo(Config.MESSAGE, null, 108, null));

        }
        //执行查询
        List<CommonUser> list = commonUserMapper.selectByExample(example);

        //判断结果中是否包含数据
        if (list != null && list.size() > 0) {
            //信息已存在
            CommonResultUtil.throwExcepion(CommonResultUtil.createInfo(Config.MESSAGE, null, 116, null));
        }

    }

    /*注册*/
    public void register(CommonUser commonUser) throws Exception {
        if (StringUtils.isBlank(commonUser.getUsername()) ||
                StringUtils.isBlank(commonUser.getPassword()) ||
                StringUtils.isBlank(commonUser.getPhone())) {
            /*注册信息输入不完整*/
            CommonResultUtil.throwExcepion(CommonResultUtil.createInfo(Config.MESSAGE, null, 116, null));

        }
        //对密码进行md5加密
        String md5Pass = DigestUtils.md5DigestAsHex(commonUser.getPassword().getBytes());
        commonUser.setPassword(md5Pass);
        commonUser.setState(1);
        //把用户数据插入到数据库中
        commonUserMapper.insert(commonUser);
    }

    /*登录*/
    public ResultInfo login(String username, String password) throws Exception {
        CommonUserExample example = new CommonUserExample();
        CommonUserExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(username);
        List<CommonUser> list = commonUserMapper.selectByExample(example);
        /*用户不存在*/
        if (list == null || list.size() == 0) {
            CommonResultUtil.throwExcepion(CommonResultUtil.createInfo(Config.MESSAGE, null, 101, null));

        }

        CommonUser commonUser = list.get(0);
        /*验证密码*/
        if (!DigestUtils.md5DigestAsHex(password.getBytes()).equals(commonUser.getPassword())) {
            /*密码错误*/
            CommonResultUtil.throwExcepion(CommonResultUtil.createInfo(Config.MESSAGE, null, 100, null));
        }

        String token = UUID.randomUUID().toString();

        /*密码不存储到redis*/
        commonUser.setPassword(null);
        /*把账户信息存储到redis*/
        jedisClient.set("SESSION:" + token, JsonUtils.objectToJson(commonUser));
        jedisClient.expire("SESSION:" + token, REDIS_SESSION_EXPIRE);

        return ResultInfo.ok(token);
    }

    /*根据token取得用户信息*/
    public CommonUser getUserByToken(String token) throws Exception {
        //根据token到redis中取用户信息
        String json = jedisClient.get("SESSION:" + token);
        //取不到用户信息，登录已经过期，返回登录过期
        if (StringUtils.isBlank(json)) {
            CommonResultUtil.throwExcepion(CommonResultUtil.createInfo(Config.MESSAGE, null, 117, null));
        }
        //取到用户信息更新token的过期时间
        jedisClient.expire("SESSION:" + token, REDIS_SESSION_EXPIRE);
        //返回对象信息
        CommonUser commonUser = JsonUtils.jsonToPojo(json, CommonUser.class);
        return commonUser;
    }

    /*注销redis里token过期时间改为0*/
    public void logout(String token) throws Exception {

        if (token == "" || token == null) {
            CommonResultUtil.throwExcepion(CommonResultUtil.createInfo(Config.MESSAGE, null, 106, null));
        }

//        String json = jedisClient.get("SESSION:" + token);
//        jedisClient.expire("SESSION:" + token, 0);
        jedisClient.del("SESSION:" + token);
    }

    /*修改密码，根据具体条件修改*/
    public void updatePwd(String username, String password, String phone) throws Exception {
        CommonUserExample example = new CommonUserExample();
        CommonUserExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(username).andPhoneEqualTo(phone);
        List<CommonUser> list = commonUserMapper.selectByExample(example);

        if (list == null || list.size() == 0) {
            CommonResultUtil.throwExcepion(CommonResultUtil.createInfo(Config.MESSAGE, null, 117, null));
        }

        CommonUser commonUser = list.get(0);
        String md5Pass = DigestUtils.md5DigestAsHex(password.getBytes());
        commonUser.setPassword(md5Pass);
        commonUser.setUpdated(new Date());
        commonUserMapper.updateByExampleSelective(commonUser, example);

    }


}
