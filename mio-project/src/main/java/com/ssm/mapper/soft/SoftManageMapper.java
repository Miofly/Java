package com.ssm.mapper.soft;

import com.mio.pojo.CommonUser;
import com.ssm.pojo.vo.CommonUserDevCustomVo;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

/**
 * describe:
 *
 * @author wfd
 * @date 2019/05/14
 */
public interface SoftManageMapper {

    // 根据设备编码获取绑定的用户
    List<Map<String, String>>  getUserId(@Param(value = "devId") String devId);
    // 根据用户手机号码查询用户信息
    List<CommonUser> getUserInfos(@Param(value = "phone") String phone);
    // 根据用户手机号码获取用户权限
    List<Map<String, String>> getPermission(@Param(value = "userId") String userId);
    // 根据用户登录信息获取绑定设备信息
    List<CommonUserDevCustomVo> getDevInfos(@Param(value = "userId") String userId);
}
