package com.mio.service;

import com.mio.pojo.CommonUser;
import com.mio.result.ResultInfo;

public interface UserLoginRegService {

    /*检验用户输入数据是否冲突*/
    public void checkData(String param, int type) throws Exception;

    /*用户注册*/
    public void register(CommonUser commonUser) throws Exception;

    /*用户登录*/
    public ResultInfo login(String username, String password) throws Exception;

    /*根据token取到用户信息*/
    public CommonUser getUserByToken(String token) throws Exception;

    /*用户退出*/
    public void logout(String token) throws Exception;

    /*更改密码*/
    public void updatePwd(String username,String password,String phone) throws Exception;






    //    public String login(String username, String password) throws Exception;
}
