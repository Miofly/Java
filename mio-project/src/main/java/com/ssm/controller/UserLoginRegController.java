package com.ssm.controller;

import com.mio.global.CommonResultUtil;
import com.mio.global.CommonSubmitResultInfo;
import com.mio.global.Config;
import com.mio.pojo.CommonUser;
import com.mio.result.ResultInfo;
import com.mio.result.ResultUtil;
import com.mio.result.SubmitResultInfo;
import com.mio.util.CookieUtils;
import com.ssm.service.UserLoginRegService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserLoginRegController {

    private static Logger logger = LoggerFactory.getLogger(UserLoginRegController.class);

    @Autowired
    private UserLoginRegService userLoginRegService;

    // 用户登录且返回用户信息
    @RequestMapping("/commonLogin")
    @ResponseBody
    public CommonSubmitResultInfo commonLogin(HttpServletRequest request, HttpServletResponse response,
                                              String username, String password) throws Exception {
        CommonSubmitResultInfo result = userLoginRegService.generalLogin(username, password);
        /*获取token信息*/
        String token = result.getCommonResultInfo().getData().toString();
        //判断是否登录成功
        if (!token.equals("") || token != null) {
            /*把token设置到session中，不设置过期时间*/
            CookieUtils.setCookie(request, response, Config.userToken, token, false);
        }
        return CommonResultUtil.createSubmitResult(CommonResultUtil.createSuccess(Config.MESSAGE,
                result.getCommonResultInfo().getData(), 118, null));
    }

    // 用户注销
    @RequestMapping("/commonLogout")
    @ResponseBody
    public CommonSubmitResultInfo commonLogout(HttpServletRequest request, HttpServletResponse response) throws Exception {
        CookieUtils.deleteCookie(request, response, Config.userToken);
        return CommonResultUtil.createSubmitResult(CommonResultUtil.createSuccess(Config.MESSAGE, null, 906, null));
    }

    /*注册*/
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public CommonSubmitResultInfo register(CommonUser commonUser) throws Exception {
        System.out.println(commonUser.toString());

        userLoginRegService.register(commonUser);
        return CommonResultUtil.createSubmitResult(CommonResultUtil.createSuccess(Config.MESSAGE, null, 101, null));
    }


    /*检验用户输入数据是否冲突*/
    @RequestMapping("/check/{param}/{type}")
    @ResponseBody
    public CommonSubmitResultInfo checkData(@PathVariable String param, @PathVariable Integer type) throws Exception {
        userLoginRegService.checkData(param, type);
        return CommonResultUtil.createSubmitResult(CommonResultUtil.createSuccess(Config.MESSAGE, null, 906, null));
    }

    /*登录加验证码*/
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public SubmitResultInfo login(String username, String password, String validateCode,
                                  HttpSession session, HttpServletRequest request, HttpServletResponse response) throws Exception {
        if (validateCode.equals("hidden")) {
            ResultInfo resultInfo = userLoginRegService.login(username, password);
            /*获取token信息*/
            String token = resultInfo.getData().toString();
            //判断是否登录成功
            if (token != "" || token != null) {
                /*把token设置到session中，不设置过期时间*/
                CookieUtils.setCookie(request, response, Config.userToken, token);
            } else {
                /*获取token信息失败*/
                CommonResultUtil.throwExcepion(CommonResultUtil.createInfo(Config.MESSAGE, null, 107, null));

            }
            return ResultUtil.createSubmitResult(ResultUtil.createInfos(Config.MESSAGE, 100, null, resultInfo.getData()));

        } else {
            String validateCode_session = (String) session.getAttribute("validateCode");

            if (validateCode_session != null && !validateCode_session.equals(validateCode)) {
                //验证码输入错误
                CommonResultUtil.throwExcepion(CommonResultUtil.createInfo(Config.MESSAGE, null, 102, null));

            }
            ResultInfo resultInfo = userLoginRegService.login(username, password);
            /*获取token信息*/
            String token = resultInfo.getData().toString();
            //判断是否登录成功
            if (token != "" || token != null) {
                /*把token设置到session中，不设置过期时间*/
                CookieUtils.setCookie(request, response, Config.userToken, token, 5);
            } else {
                /*获取token信息失败*/
                CommonResultUtil.throwExcepion(CommonResultUtil.createInfo(Config.MESSAGE, null, 107, null));

            }
            //返回带有token信息的结果
            return ResultUtil.createSubmitResult(ResultUtil.createInfos(Config.MESSAGE, 100, null, resultInfo.getData()));
        }


    }


    /*登录不加验证码*/
    @RequestMapping(value = "/login1", method = RequestMethod.POST)
    @ResponseBody
    public SubmitResultInfo login1(String username, String password,
                                   HttpSession session, HttpServletRequest request, HttpServletResponse response) throws Exception {

        ResultInfo resultInfo = userLoginRegService.login(username, password);
        /*获取token信息*/
        String token = resultInfo.getData().toString();
        //判断是否登录成功
        if (token != "" || token != null) {
            /*把token设置到session中，不设置过期时间*/
            CookieUtils.setCookie(request, response, Config.userToken, token, 259200);
        }
        //返回带有token信息的结果
        return ResultUtil.createSubmitResult(ResultUtil.createInfos(Config.MESSAGE, 118, null, resultInfo.getData()));

    }


    /*根据token获取用户信息*/
    @RequestMapping(value = "/token/{token}")
    @ResponseBody
    public Object getUserByToken(HttpServletRequest request, HttpServletResponse response, @PathVariable String token, String callback) throws Exception {
        CommonUser commonUser = userLoginRegService.getUserByToken(token);
        //响应结果之前，判断是否为jsonp请求
        if (StringUtils.isNotBlank(callback)) {
            //把结果封装成一个js语句响应
            MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(commonUser);
            mappingJacksonValue.setJsonpFunction(callback);
            return mappingJacksonValue;
        }
        return commonUser;
    }

    /*注销*/
    @RequestMapping("/logout")
    @ResponseBody
    public SubmitResultInfo logout(HttpServletRequest request, HttpServletResponse response) throws Exception {

        /*根据cookie名称取cookie的值*/
        String userToken = CookieUtils.getCookieValue(request, Config.userToken, false);
        System.out.println(userToken);
        /*把redis的过期时间设为0*/
        userLoginRegService.logout(userToken);
        /*删除cookie的值*/
        CookieUtils.deleteCookie(request, response, Config.userToken);
        //返回结果
        return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));

    }

    /*修改密码*/
    @RequestMapping("/upPwd")
    public @ResponseBody
    SubmitResultInfo updatePwd(String username, String password, String phone) throws Exception {
        userLoginRegService.updatePwd(username, password, phone);
        return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 103, null));
    }

}
