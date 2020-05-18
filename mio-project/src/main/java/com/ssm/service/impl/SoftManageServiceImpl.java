package com.ssm.service.impl;

import com.mio.global.CommonResultUtil;
import com.mio.global.Config;
import com.mio.pojo.CommonUser;
import com.mio.pojo.CommonUserExample;
import com.mio.result.ResultUtil;
import com.ssm.mapper.CommonUserDevMapper;
import com.ssm.mapper.CommonUserMapper;
import com.ssm.mapper.soft.SoftManageMapper;
import com.ssm.pojo.CommonUserDev;
import com.ssm.pojo.CommonUserDevExample;
import com.ssm.pojo.vo.CommonUserDevCustomVo;
import com.ssm.service.SoftManageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.List;
import java.util.Map;


/**
 * describe: 软件管理接口实现类
 *
 * @author wfd
 * @date 2019/05/14
 */
@Service
public class SoftManageServiceImpl implements SoftManageService {

    private static Logger logger = LoggerFactory.getLogger(SoftManageServiceImpl.class);

    @Autowired
    private SoftManageMapper softManageMapper;

    @Autowired
    private CommonUserDevMapper commonUserDevMapper;

    @Autowired
    private CommonUserMapper commonUserMapper;

    // 用户登录
    public CommonUser generalLogin(String username, String password) throws Exception {
        CommonUserExample example = new CommonUserExample();
        CommonUserExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(username);
        List<CommonUser> list = commonUserMapper.selectByExample(example);
        System.out.println(list);
        /*用户不存在*/
        if (list == null || list.size() == 0) {
            CommonResultUtil.throwExcepion(CommonResultUtil.createInfo(Config.MESSAGE, null, 101, null));
        }
        CommonUser commonUser = list.get(0);
        /*验证密码*/
        if (!DigestUtils.md5DigestAsHex(password.getBytes()).equals(commonUser.getPassword())) {
            System.out.println(!DigestUtils.md5DigestAsHex(password.getBytes()).equals(commonUser.getPassword()));
            /*密码错误*/
            CommonResultUtil.throwExcepion(CommonResultUtil.createInfo(Config.MESSAGE, null, 100, null));
        }
        /*密码不存储到redis*/
        commonUser.setPassword(null);
        return commonUser;
    }


    // 根据设备编码获取绑定的用户
    public List<Map<String, String>> getUserId(String devId) throws Exception {
        return softManageMapper.getUserId(devId);
    }

    // 根据用户手机号码查询用户信息
    public List<CommonUser> getUserInfos(String phone) throws Exception {
        return softManageMapper.getUserInfos(phone);
    }

    // 根据用户手机号码获取用户权限
    public List<Map<String, String>> getPermission(String userId) throws Exception {
        return softManageMapper.getPermission(userId);
    }

    // 根据用户登录信息获取绑定设备信息
    public List<CommonUserDevCustomVo> getDevInfos(String userId) throws Exception {
        return softManageMapper.getDevInfos(userId);
    }

    // 解绑某台设备
    public void deletePermission(String userId, String devId) throws Exception {
        CommonUserDevExample example = new CommonUserDevExample();
        CommonUserDevExample.Criteria criteria = example.createCriteria();
        criteria.andUseridEqualTo(userId);
        criteria.andDevidEqualTo(devId);
        commonUserDevMapper.deleteByExample(example);
    }

    // 绑定某台设备
    public void insertDevInfo(CommonUserDev commonUserDev) throws Exception {
        commonUserDevMapper.insertSelective(commonUserDev);
    }

    // 用户注册
    public void insertUser(CommonUser commonUser) throws Exception {
        commonUserMapper.insertSelective(commonUser);
    }
}
