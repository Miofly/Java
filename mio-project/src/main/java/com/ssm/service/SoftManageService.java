package com.ssm.service;


import com.mio.pojo.CommonUser;
import com.mio.result.ResultInfo;
import com.ssm.pojo.CommonUserDev;
import com.ssm.pojo.vo.CommonUserDevCustomVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * describe: 软件管理
 *
 * @author wfd
 * @date 2019/05/14
 */
public interface SoftManageService {
    // 用户登录
    CommonUser generalLogin(String username, String password) throws Exception;
    // 根据设备编码获取绑定的用户
    List<Map<String, String>> getUserId(String devId) throws Exception;
    // 根据用户手机号码查询用户信息
    List<CommonUser> getUserInfos(String phone) throws Exception;
    // 根据用户手机号码获取用户权限
    List<Map<String, String>> getPermission(String userId) throws Exception;
    // 根据用户登录信息获取绑定设备信息
    List<CommonUserDevCustomVo> getDevInfos(String userId) throws Exception;
    // 解绑某台设备
    void deletePermission(String userId, String devId) throws Exception;
    // 绑定某台设备
    void insertDevInfo(CommonUserDev commonUserDev) throws Exception;
    // 用户注册
    void insertUser(CommonUser commonUser) throws Exception;
}
