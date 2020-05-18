package com.ssm.controller;

import com.mio.global.Config;
import com.mio.pojo.CommonUser;
import com.mio.util.CookieUtils;
import com.mio.global.CommonResultInfo;
import com.mio.global.CommonResultUtil;
import com.ssm.pojo.CommonUserDev;
import com.ssm.pojo.vo.CommonUserDevCustomVo;
import com.ssm.service.SoftManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;


/**
 * describe: 软件管理接口
 *
 * @author wfd
 * @date 2019/05/14
 */

@Controller
@RequestMapping("/sm")
public class SoftManageController {

    @Autowired
    private SoftManageService softManageService;



    // 根据设备编码获取绑定的用户
    @RequestMapping("/getUid")
    @ResponseBody
    public CommonResultInfo getUserId(String devId) throws Exception {
        List<Map<String, String>> userId = softManageService.getUserId(devId);
        return CommonResultUtil.createSuccess(Config.MESSAGE, userId, 906, null);
    }

    // 根据用户手机号码查询用户信息
    @RequestMapping("/getUserInfo")
    @ResponseBody
    public CommonResultInfo getUserInfos(String phone) throws Exception {
        List<CommonUser> result = softManageService.getUserInfos(phone);
        return CommonResultUtil.createSuccess(Config.MESSAGE, result, 906, null);
    }

    // 根据用户手机号码获取用户权限
    @RequestMapping("/getPermission")
    @ResponseBody
    public CommonResultInfo getPermission(String userId) throws Exception {
        List<Map<String, String>> result = softManageService.getPermission(userId);
        return CommonResultUtil.createSuccess(Config.MESSAGE, result, 906, null);
    }

    // 根据用户登录信息获取绑定设备信息
    @RequestMapping("/getDevInfo")
    @ResponseBody
    public CommonResultInfo getDevInfos(String userId) throws Exception {
        List<CommonUserDevCustomVo> result = softManageService.getDevInfos(userId);
        return CommonResultUtil.createSuccess(Config.MESSAGE, result, 906, null);
    }

    // 解绑某台设备
    @RequestMapping("/deletePer")
    @ResponseBody
    public CommonResultInfo deletePermission(String userId, String devId) throws Exception {
        softManageService.deletePermission(userId, devId);
        return CommonResultUtil.createSuccess(Config.MESSAGE, null, 906, null);
    }
    // 绑定某台设备
    @RequestMapping("/insertDev")
    @ResponseBody
    public CommonResultInfo insertDevInfo(CommonUserDev commonUserDev) throws Exception {
        softManageService.insertDevInfo(commonUserDev);
        return CommonResultUtil.createSuccess(Config.MESSAGE, null, 906, null);
    }

    // 用户注册
    @RequestMapping("/insertUser")
    @ResponseBody
    public CommonResultInfo insertUser(CommonUser commonUser) throws Exception {
        softManageService.insertUser(commonUser);
        return CommonResultUtil.createSuccess(Config.MESSAGE, null, 906, null);
    }
}
