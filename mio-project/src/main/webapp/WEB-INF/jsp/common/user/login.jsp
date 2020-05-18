<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>用户登录</title>
    <%@include file="../../common.jsp" %>
</head>
<body style="width: 100%;height: 100%;background: url(${basePath}images/login.jpg) center center;background-size: 100% 100%;">

<%--用户登录页面--%>
<div style="width:100%;height: 100%;padding-top: 4%;">
    <div style="margin: 0 auto;height: 50px;width: 345px;margin-bottom: 1%">
        <img src="${basePath}images/zgyd.png"
             style="width: 50px;height: 50px" alt="">
        <span style="font-size: 40px;display: block;
      margin-left: 15%;margin-top: -14.5%">SoftWare Admin</span>
    </div>

    <%--登录主界面--%>
    <form id="mio-loginFrame" method="post" onsubmit="return false;" class="mio-shadow"
          style="border-radius: 30px;width: 400px;background: rgba(255,255,255,0.8);display: block;
        padding:30px 30px 40px 50px;margin:0 auto;">

        <div style="border-bottom: 1px solid black;height: 30px;margin-bottom:30px;width: 300px">
            <span style="font-family:  Tahoma,Helvetica,Arial,’宋体’,sans-serif;font-size: 26px;padding-bottom: 5px;line-height: 10px">用户登录</span>
            <span style="float: right;">没有账号 <a href="${basePath}common/user/register"
                                                style="color: red;cursor: pointer">立即注册</a></span>
        </div>
        <%--用户名--%>
        <div style="position: relative">
            <em style="font-family: “Arial”,”Microsoft YaHei”,”黑体”,”宋体”,sans-serif;
          position: absolute;top: 8px;left: 10px;font-size: 16px">登录名：</em>
            <input style="width: 300px;text-indent: 70px" type="text" autocomplete="off"
                   class="mio-inp username" name="username" placeholder="请输入用户名" maxlength="32"/>
            <span class="glyphicon glyphicon-remove small mio-remove" style="z-index: 1000"></span>
        </div>
        <br>
        <%----%>
        <div style="position: relative">
            <em style="font-family: “Arial”,”Microsoft YaHei”,”黑体”,”宋体”,sans-serif;
          position: absolute;top: 8px;left: 10px;font-size: 16px">密 &nbsp;&nbsp;码：</em>
            <input style="text-indent: 70px;width: 300px;" name="password" autocomplete="off"
                   type="password" class="mio-inp pwd1" id="pwd1" maxlength="16"
                   placeholder="请输入密码" onpaste="return false;" oncontextmenu="return false" oncopy="return false">
            <i class="password1 fa fa-eye-slash" style="visibility: hidden;margin-left: -30px"></i>
        </div>
        <br>


        <div class="code" style="display: none">
            <input placeholder="请输入验证码" value="hidden" autocomplete="off" style="width: 300px;margin-bottom: 20px"
                   id="randomcode" name="validateCode" class="mio-inp  mio-code"/>
            <span class="glyphicon glyphicon-remove small mio-remove" style="z-index: 1000;margin-left: -85px"></span>
            <img id="randomcode_img" src="${basePath}validatecode" alt="" width="63" height="39"
                 style="margin-left: 237px;border-bottom-right-radius: 5px;margin-top: -59px;
           border-top-right-radius: 5px;display: block"/>
            <br>
        </div>

        <input type="button" value="登录" class="mio-regLogin" id="loginBtn" style="margin-bottom: 15px"/>

        <%--修改密码--%>
        <a style="text-decoration:none;margin-left: 150px;height: 26px;width: 80px"
           class="mio-a" href="${basePath}common/user/upPwd">修改密码</a>

        <%--重置--%>
        <div style="margin-top: -25px;margin-left: 246px" id="mio-reset">
            <i class="fa fa-undo" style="color: white;margin-right: -23px"></i>
            <input style="width: 60px;padding-left: 15px" type="button" value="清空" class="mio-btn-red">
        </div>


    </form>

</div>
<script>
    /*密码框的设置*/
    showPwd($('.pwd1'), $('.password1'));
    enter($('#loginBtn'));
    /*输入框蓝色阴影*/
    inputBorder($('.mio-inp'));

    /*重置为空*/
    $('#mio-reset').click(function () {
        $('.username').val("");
        $('.pwd1').val("");
        if ($('.code').css('display') != 'none') {
            $('.mio-code').val("");
        }
    });

    /*清除内容*/
    remove($('.username'));
    remove($('.mio-code'));

    $('#randomcode_img').click(function () {
        randomcode_refresh()
    });

    $('#loginBtn').click(function () {
        if ($('.username').val() == '' || $('.username').val() == null) {
            checkTip($('.username'), '必须填写', 'right', 'center');
            $('.username').focus()
        } else if ($('.pwd1').val() == '' || $('.pwd1').val() == null) {
            checkTip($('.pwd1'), '必须填写', 'right', 'center');
            $('.pwd1').focus()
        } else if ($('.code').css('display') == 'block' && $('.mio-code').val() == '') {
            checkTip($('.mio-code'), '必须填写', 'right', 'center');
            $('.mio-code').focus()
        } else {
            $.ajax({
                url: "${basePath}/user/login",//请求路径
                type: "POST",//请求方式
                data: $('#mio-loginFrame').serializeJson(),
                async: true,//异步
                dataType: "json",//数据类型可以为 text xml json  script  jsonp
                success: function (result) {//返回的参数就是 action里面所有的有get和set方法的参数
                    mntip(result.commonResultInfo.message, 'info');

                    if (result.commonResultInfo.message == '登录成功') {
                        $(location).attr('href', '${basePath}common/tableJsZc');
                    } else {
                        randomcode_refresh();
                        if (result.commonResultInfo.message == '登录用户不存在' || result.commonResultInfo.message == '用户名或密码错误') {
                            randomcode_refresh();
                            $('.username').focus();
                        }
                        if ($('#randomcode').val() == 'hidden') {
                            $('#randomcode').val("");
                        }
                        $('.code').slideDown(700);

                        if (result.commonResultInfo.message == '验证码输入错误') {
                            randomcode_refresh();
                            $('.mio-code').focus();
                        }

                    }
                },
                error: function (result) {
                    console.log(result);
                    mntip('操作失败', 'danger');
                    grid.reload();
                }
            });
        }

    });
    //刷新验证码
    //实现思路，重新给图片的src赋值，后边加时间，防止缓存
    function randomcode_refresh() {
        $("#randomcode_img").attr('src',
            '${basePath}validatecode?time' + new Date().getTime());
    }

</script>

</body>
</html>