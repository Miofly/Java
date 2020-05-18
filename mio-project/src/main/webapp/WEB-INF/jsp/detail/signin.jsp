<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html class="login-bg">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>软件详情</title>
    <%@include file="../common.jsp"%>
    
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	
    <!-- bootstrap -->
    <link href="${basePath}css/detail/bootstrap/bootstrap.css" rel="stylesheet" />
    <link href="${basePath}css/detail/bootstrap/bootstrap-responsive.css" rel="stylesheet" />
    <link href="${basePath}css/detail/bootstrap/bootstrap-overrides.css" type="text/css" rel="stylesheet" />

    <!-- global styles -->
    <link rel="stylesheet" type="text/css" href="${basePath}css/detail/layout.css" />
    <link rel="stylesheet" type="text/css" href="${basePath}css/detail/elements.css" />
    <link rel="stylesheet" type="text/css" href="${basePath}css/detail/icons.css" />

    <!-- libraries -->
    <link rel="stylesheet" type="text/css" href="${basePath}css/detail/lib/font-awesome.css" />
    
    <!-- this page specific styles -->
    <link rel="stylesheet" href="${basePath}css/detail/compiled/signin.css" type="text/css" media="screen" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" /></head>
<body>

    <div class="row-fluid login-wrapper">
        <img class="logo" src="${basePath}images/LOGO171.png"/>

        <div class="span4 box">
            <div class="content-wrap">
                <h6>登 录</h6>
                <form id="mio-loginFrame" method="post" onsubmit="return false;">
                    <input class="span12 username" name="username" type="text" placeholder="您的账号" />
                    <input class="span12 password" name="password" type="password" placeholder="您的密码" />
                </form>

                <%--<a href="#" class="forgot">忘记密码?</a>
                <div class="remember">
                    <input id="remember-me" type="checkbox" />
                    <label for="remember-me">记住密码</label>
                </div>--%>
                <a class="btn-glow primary login" id="loginBtn">登 录</a>
            </div>
        </div>

       <%-- <div class="span4 no-account">
            <p>没有账号?</p>
            <a href="signup.html">注 册</a>
        </div>--%>
    </div>

	<!-- scripts -->
<%--    <script src="${basePath}js/detail/jquery-latest.js"></script>
    <script src="${basePath}js/detail/bootstrap.min.js"></script>
    <script src="${basePath}js/detail/theme.js"></script>--%>

    <script>
        $('#loginBtn').click(function () {
            if($('.username').val()==''||$('.username').val()==null){
                checkTip($('.username'),'必须填写','right','center');
                $('.username').focus()
            }else if($('.password').val()==''||$('.password').val()==null){
                checkTip($('.password'),'必须填写','right','center');
                $('.password').focus()
            }else{
                $.ajax({
                    url: "${basePath}sm/login",//请求路径
                    type: "POST",//请求方式
                    data:$('#mio-loginFrame').serializeJson(),
                    async:true,//异步
                    dataType: "json",//数据类型可以为 text xml json  script  jsonp
                    success: function(result){//返回的参数就是 action里面所有的有get和set方法的参数
                        mntip(result.message,'info');
                        $('.username').focus();
                        if(result.message=='登录成功'){
                            $(location).attr('href', '${basePath}detail/index');
                        }
                    },
                    error: function (result) {
                        console.log(result);
                        mntip('操作失败','danger');
                        grid.reload();
                    }
                });
            }

        });


        if("${exceptionResultInfo.message}"!=null&&
            "${exceptionResultInfo.message}"!=''&&
           "${exceptionResultInfo.message}"!=undefined){
            mntip("${exceptionResultInfo.message}",'info');
        }

        enter($('#loginBtn'))
    </script>
</body>
</html>