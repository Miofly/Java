<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>用户注册</title>
    <%@include file="../../common.jsp" %>
</head>
<body style="width: 100%;height: 100%;background: url(${basePath}images/login.jpg) center center;background-size: 100% 100%;">
<%--用户登录注册页面--%>
<div style="width:100%;height: 100%;padding-top: 4%;">
    <div style="margin: 0 auto;height: 50px;width: 345px;margin-bottom: 1%">
        <img src="${basePath}images/zgyd.png" style="width: 50px;height: 50px" alt="">
        <span style="font-size: 40px;display: block;margin-left: 15%;margin-top: -14.5%">SoftWare Admin</span>
    </div>
    <%--注册主界面--%>
    <form id="mio-regFrame" method="post" onsubmit="return false;" class="mio-shadow"
          style="border-radius: 30px;width: 400px;background: rgba(255,255,255,0.8);display: block;
        padding:30px 30px 40px 50px;margin:0 auto;">

        <div style="border-bottom: 1px solid black;height: 30px;margin-bottom: 30px;width: 300px">
            <span style="font-size: 26px;padding-bottom: 5px;line-height: 10px">用户注册</span>
            <span style="float: right;">已有账号 <a href="${basePath}common/user/login" style="color: red;cursor: pointer">立即登录</a></span>
        </div>
        <%--用户名--%>
        <div style="position: relative">
            <em style="font-family: “Arial”,”Microsoft YaHei”,”黑体”,”宋体”,sans-serif;
          position: absolute;top: 8px;left: 10px;font-size: 16px">登录名：</em>
            <input style="text-indent: 90px;width: 300px;" type="text"
                   class="mio-inp username" name="username" placeholder="请输入用户名"/>
            <span class="glyphicon glyphicon-remove small mio-remove" style="z-index: 1000"></span>
        </div>
        <br>
        <%--密码--%>
        <div style="position: relative">
            <em style="font-family: “Arial”,”Microsoft YaHei”,”黑体”,”宋体”,sans-serif;
          position: absolute;top: 8px;left: 10px;font-size: 16px">密码：</em>
            <input style="width: 300px;text-indent: 90px;" name="password"
                   type="password" class="mio-inp pwd1" id="pwd1"
                   placeholder="请输入密码" onpaste="return false;" oncontextmenu="return false" oncopy="return false">
            <i class="password1 fa fa-eye-slash" style="visibility: hidden;margin-left: -30px"></i>
        </div>
        <br>
        <%--密码确认--%>
        <div style="position: relative">
            <em style="font-family: “Arial”,”Microsoft YaHei”,”黑体”,”宋体”,sans-serif;
          position: absolute;top: 8px;left: 10px;font-size: 16px">密码确认：</em>
            <input style="text-indent: 90px;width: 300px;" name="password2" type="password" class="mio-inp pwd2"
                   placeholder="请再次输入密码" onpaste="return false;" oncontextmenu="return false" oncopy="return false">
            <i class="password2 fa fa-eye-slash" style="visibility: hidden;margin-left: -30px"></i>
        </div>
        <br>
        <%--邮箱--%>
        <div style="position: relative">
            <em style="font-family: “Arial”,”Microsoft YaHei”,”黑体”,”宋体”,sans-serif;
          position: absolute;top: 8px;left: 10px;font-size: 16px">邮箱：</em>
            <input style="text-indent: 90px;width: 300px;" type="text" class="mio-inp email" name="email"
                   placeholder="请输入邮箱" autocomplete="off"/>
            <span class="glyphicon glyphicon-remove small mio-remove"></span>
        </div>
        <br>
        <%--手机号码--%>
        <div style="position: relative">
            <em style="font-family: “Arial”,”Microsoft YaHei”,”黑体”,”宋体”,sans-serif;
          position: absolute;top: 8px;left: 10px;font-size: 16px">手机号：</em>
            <input onkeyup="this.value=this.value.replace(/[^\d]/g,'') "
                   onafterpaste="this.value=this.value.replace(/[^\d]/g,'')"
                   maxlength=11 style="text-indent: 90px;width: 300px;" type="text"
                   class="mio-inp phone" name="phone" placeholder="请输入手机号码"/>
            <span class="glyphicon glyphicon-remove small mio-remove"></span>
        </div>
        <br>
        <input type="button" value="注册" class="mio-regLogin" id="regBtn" style="width: 300px"/>
        <%--<input type="reset" value="重置" class="mio-regLogin" style="width: 50px">--%>
    </form>

</div>
<script>
    enter($('#regBtn'));
    /*密码框的设置*/
    showPwd($('.pwd1'), $('.password1'));
    showPwd($('.pwd2'), $('.password2'));
    $(".email").mailAutoComplete();//邮箱
    /*输入框蓝色阴影*/
    inputBorder($('.mio-inp'));

    /*清除内容*/
    remove($('.username'));
    remove($('.phone'));
    remove($('.email'));

    $('#regBtn').click(function () {
        if (checkTips($("#mio-regFrame input"), '必须填写', 'right', 'center')) {
            if ($(".pwd1").val() != $(".pwd2").val()) {
                checkTip($(".pwd2"), '两次的密码输入不一致，请输入', 'right', 'center');
                $(".pwd2").select();
                $(".pwd2").focus();
            } else {
                unameCheck();
            }
        }
    });

    /*验证数据是否重复*/
    /*用户名验证*/
    function unameCheck() {
        $.ajax({
            url: "${basePath}/user/check/" + $('.username').val() + "/1",//请求路径
            type: "POST",//请求方式
            // data:{sql:proSql},
            async: true, /*异步*/
            dataType: "json",//数据类型可以为 text xml json  script  jsonp
            success: function (result) {//返回的参数就是 action里面所有的有get和set方法的参数
                console.log(result);
                /*数据返回成功调用函数*/
                if (result.commonResultInfo.message == '未知错误！请联系管理员') {
                    mntip(result.commonResultInfo.message, 'info');
                } else if (result.commonResultInfo.message == '用户注册信息输入不完整') {
                    mntip('用户已存在', 'info');
                    $('.username').focus();
                } else {
                    phoneCheck();
                }
            },
        });
    }

    function phoneCheck() {
        $.ajax({
            url: "${basePath}/user/check/" + $('.phone').val() + "/2",//请求路径
            type: "POST",//请求方式
            // data:{sql:proSql},
            async: true, /*异步*/
            dataType: "json",//数据类型可以为 text xml json  script  jsonp
            success: function (result) {//返回的参数就是 action里面所有的有get和set方法的参数
                /*数据返回成功调用函数*/
                if (result.commonResultInfo.message == '用户注册信息输入不完整') {
                    mntip('手机号码被占有', 'info');
                    $('.phone').focus();
                } else {
                    emailCheck();
                }
            },
        });
    }

    /*邮箱验证*/
    function emailCheck() {
        $.ajax({
            url: "${basePath}/user/check/" + $('.email').val() + "/3",//请求路径
            type: "POST",//请求方式
            // data:{sql:proSql},
            async: true, /*异步*/
            dataType: "json",//数据类型可以为 text xml json  script  jsonp
            success: function (result) {//返回的参数就是 action里面所有的有get和set方法的参数
                /*数据返回成功调用函数*/
                if (result.commonResultInfo.message == '用户注册信息输入不完整') {
                    mntip('邮箱被占用', 'info');
                    $('.email').focus();
                } else {
                    reg();
                }
            },
        });
    }

    /*用户注册*/
    function reg() {
        console.log($("#mio-regFrame").serializeJson());
        $.ajax({
            url: "${basePath}/user/register",//请求路径
            type: "POST",//请求方式
            data: $("#mio-regFrame").serializeJson(),
            async: true, /*异步*/
            dataType: "json",//数据类型可以为 text xml json  script  jsonp
            success: function (result) {//返回的参数就是 action里面所有的有get和set方法的参数
                mntip(result.commonResultInfo.message, 'info');
                /*setTimeout(function () {
                    mntip('正在跳转至登录界面....', 'info');
                }, 500);
                setInterval(function () {
                    $(location).attr('href', '${basePath}common/user/login');
                }, 2000);*/
            },
        });
    }
</script>

</body>
</html>