<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
	<title>密码修改</title>
	<%@include file="../../common.jsp"%>
</head>
<body style="width: 100%;height: 100%;background: url(${basePath}images/login.jpg) center center;background-size: 100% 100%;">

<div style="width:100%;height: 100%;padding-top: 4%;">
	<div style="margin: 0 auto;height: 50px;width: 345px;margin-bottom: 1%">
		<img src="${basePath}images/zgyd.png" style="width: 50px;height: 50px" alt="">
		<span style="font-size: 40px;display: block;margin-left: 15%;margin-top: -14.5%">SoftWare Admin</span>
	</div>


	<%--登录主界面--%>
	<form  id="mio-upPwd" method="post" onsubmit="return false;" class="mio-shadow"
		   style="border-radius: 30px;width: 400px;background: rgba(255,255,255,0.8);display: block;
        padding:30px 30px 40px 50px;margin:0 auto;">
		<div style="border-bottom: 1px solid black;height: 30px;margin-bottom: 10px;width: 300px">
			<span style="font-size: 26px;padding-bottom: 5px;line-height: 10px">密码修改</span>
			<span style="float: right;">没有账号 <a href="${basePath}register" style="color: red;cursor: pointer">立即注册</a></span>
		</div>
		<input autocomplete="off" style="width: 300px;margin-bottom: 20px;margin-top: 20px" type="text" class="mio-inp username" name="username" placeholder="请输入你的用户名">
		<span class="glyphicon glyphicon-remove small mio-remove" style="z-index: 1000"></span>
		<br>
		<input style="width: 300px;margin-bottom: 20px" type="text" class="mio-inp phone" name="phone" placeholder="请输入你的手机号">
		<span class="glyphicon glyphicon-remove small mio-remove" style="z-index: 1000"></span>
		<br>
		<input style="width: 300px;margin-bottom: 20px" name="password"
			   type="password" class="mio-inp password" autocomplete="off"
			   placeholder="请输入新密码" onpaste="return false;"
			   oncontextmenu="return false" oncopy="return false">
		<i class="password1 fa fa-eye-slash" style="visibility: hidden;margin-left: -30px"></i>
		<br>
		<input type="button" value="提交" class="mio-regLogin" id="mio-upPwdBtn" />
	</form>
</div>
<script>
	enter($('#mio-upPwdBtn'));
    /*密码框的设置*/
    showPwd($('.password'),$('.password1'));
	remove($('.username'))
	remove($('.phone'))
    /*输入框蓝色阴影*/
    inputBorder($('.mio-inp'));
	$('#mio-upPwdBtn').click(function () {
	    if (checkTips($("#mio-upPwd input"),'必须填写','right','center')) {
            $.ajax({
                url: "${basePath}user/upPwd",//请求路径
                type: "POST",//请求方式
                data:$('#mio-upPwd').serializeJson(),
                async:false,/*同步*/
                dataType: "json",//数据类型可以为 text xml json  script  jsonp
                success: function(result){//返回的参数就是 action里面所有的有get和set方法的参数
                    console.log(result);
                    /*数据返回成功调用函数*/
                    mntip(result.commonResultInfo.message,'info');
                    if(result.commonResultInfo.message=='未知错误！请联系管理员'){
                        mntip(result.commonResultInfo.message,'info');
					}else if(result.commonResultInfo.message=='用户信息输入错误'){
                        $('.username').focus();
                    }else{
                        setTimeout(function(){
                            mntip('正在跳转至登录界面....','info');
                        },500);
                        setInterval(function(){
                            $(location).attr('href', '${basePath}login');
						},2000);
					}

                },
                error: function (result) {
                    console.log(result);
                    mntip('操作失败','danger');
                }
            });
	    }

    })


</script>
</body>
</html>
