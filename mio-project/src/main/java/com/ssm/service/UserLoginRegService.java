package com.ssm.service;

import com.mio.global.CommonResultInfo;
import com.mio.global.CommonSubmitResultInfo;
import com.mio.pojo.CommonUser;
import com.mio.result.ResultInfo;
/**
 * 功能描述：用户相应接口
 * 调用方式：
 * @author wfd
 * @date 2019/6/12 16:37
 * @return
 */
public interface UserLoginRegService {
    // 用户登录且返回用户信息
    CommonSubmitResultInfo generalLogin(String username, String password) throws Exception;

    /*用户注册*/
    void register(CommonUser commonUser) throws Exception;

    /*检验用户输入数据是否冲突*/
    void checkData(String param, int type) throws Exception;

    /*用户登录*/
    ResultInfo login(String username, String password) throws Exception;

    ResultInfo loginNoRedis(String username, String password) throws Exception;

    /*根据token取到用户信息*/
    CommonUser getUserByToken(String token) throws Exception;

    /*用户退出*/
    void logout(String token) throws Exception;

    /*更改密码*/
    void updatePwd(String username, String password, String phone) throws Exception;

}
