package com.ssm.filter;

import com.mio.global.CommonResultUtil;
import com.mio.global.Config;

import com.mio.util.CookieUtils;
import com.mio.util.ResourcesUtil;
import com.ssm.service.UserLoginRegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


/**
 * <p>Title: LoginInterceptor</p>
 * <p>Description:用户身份校验 </p>
 * <p>Company: www.itcast.com</p>
 *
 * @author 苗润土
 * @version 1.0
 * @date 2014年11月29日上午10:03:24
 */
public class LoginInterceptor implements HandlerInterceptor {


    @Autowired
    private UserLoginRegService userLoginRegService;

    //执行时机：进入action方法之前执行
    //使用场景：用于用户认证、用户授权拦截
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {

        // 前处理，执行handler之前执行此方法。
        // 返回true，放行	false：拦截
        // 1.从cookie中取token
        String token = CookieUtils.getCookieValue(request, Config.userToken);
        //2.如果没有token，未登录状态，直接放行

        if (token != null && token != "") {
            return true;
        }

        //校验用户访问是否是公开资源 地址
        List<String> open_urls = ResourcesUtil.gekeyList(Config.ANONYMOUS_ACTIONS);

        //用户访问的url
        String url = request.getRequestURI();
        for (String open_url : open_urls) {
            if (url.indexOf(open_url) >= 0) {
                //如果访问的是公开 地址则放行
                return true;
            }
        }

        CommonResultUtil.throwExcepion(CommonResultUtil.createInfo(Config.MESSAGE, null, 106, null));

        return false;
    }

    //执行时机：进入action方法，在返回modelAndView之前执行
    //使用场景：在这里统一对返回数据进行处理，比如统一添加菜单 导航
    @Override
    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {

    }

    //执行时机:action方法执行完成，已经 返回modelAndView，执行。
    //使用场景：统一处理系统异常，在这里统一记录系统日志 ，监控action方法执行时间，在preHandle记录开始时间，在afterCompletion记录结束时间
    @Override
    public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response, Object handler, Exception ex)
            throws Exception {

    }
}
