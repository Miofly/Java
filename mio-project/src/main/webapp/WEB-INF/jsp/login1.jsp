<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>Login</title>
    <link rel="stylesheet" href="/css/other/login.css">
    <%@include file="common.jsp"%>
    <script src="/js/other/login.js"></script>

</head>
<body style="width: 100%;height: 100%">
<%--用户登录注册页面--%>
<div style="width:100%;height: 100%;background: url(../../images/login.jpg) center center;background-size: 100% 100%;">
    <%--背景图片--%>
    <%--<div class="mio-login-img" style="width: 100%;height: 100%">--%>
        <%--登录主界面--%>
        <form id="mio-formlogin" method="post" onsubmit="return false;">
            <div class="mio-login-frame">
                <h3 class="mio-login-title">Please Login</h3>
                <%--用户名--%>
                <span>用户名：</span>
                <%--
                限制只输入数字
                onkeyup="this.value=this.value.replace(/[^\d]/g,'') " onafterpaste="this.value=this.value.replace(/[^\d]/g,'')"
                输入字母和下横线的正则表达式
                onkeyup="this.value=this.value.replace(/[^_a-zA-Z]/g,'')" onpaste="this.value=this.value.replace(/[^_a-zA-Z]/g,'')"
                输入框只能输入字母数字和下横线的正则表达式
                onkeyup="this.value=this.value.replace(/[^\w]/g,'')" onpaste="this.value=this.value.replace(/[^\w]/g,'')"
                --%>
                <input maxlength=6 type="text" id="mio-loginName" name="username" class="mio-login-text" placeholder="please input username"/>
                <span class="glyphicon glyphicon-remove small mio-remove"></span>
                <br>
                <%--密码--%>
                <%--onpaste="return false; 输入框禁止粘贴功能--%>
                <span>密&nbsp;&nbsp;&nbsp;&nbsp;码：</span>
                <input type="password" id="mio-loginPwd" name="password" class="mio-login-text" placeholder="please input password" onpaste="return false;"/>
                <span class="glyphicon glyphicon-remove small mio-remove" id="mio-remove2"></span>
                <br>
                <%--验证码--%>
                <span>验证码：</span>
                <input type="text" id="mio-loginCode" name="code" class="mio-login-text" placeholder="please input code"/>
                <span class="glyphicon glyphicon-remove small mio-remove" id="mio-remove3"></span>
                <br>
                <%--登录--%>
                <input type="button" id="mio-submit" class="mio-login-button btn btn-info" value="登录"/><br>
                <%--其他--%>
                <div class="mio-login-other">
                    <a href="javascript:void(0);" class="mio-forgetPwd">忘记密码</a>
                    <a href="javascript:void(0);" class="mio-register" id="mio-register">用户注册</a>
                </div>
            </div>
        </form>

        <%--注册主界面--%>
        <form id="personRegForm" method="post" onsubmit="return false;">
              <div id='mio-register-frame'>
                    <%--关闭按钮--%>
                    <div id='mio-closeReg' style="display: none;">
                        <span class="glyphicon glyphicon-remove"></span>
                    </div>
                    <br />
                    <!-- 会员注册 -->
                    <div id='mio-regCon' style="display: none;">
                        <div id="mio-lab1">
                            <span id="mio-lab-login">会员注册</span>
                            <span id="mio-lab-mio-toLogin">
		        		        &emsp;已有账号&nbsp;
		        		        <a href="/login" id='mio-toLogin' style="color: #EB9316;cursor: pointer;">立即登录</a>
		        	        </span>
                        </div>
                        <div id="mio-form-container2" style="padding-top: 25px;">

                            <input type="text" class="form-control" name="username"  placeholder="用户名" id="mio-regist-account"/>
                            <span class="glyphicon glyphicon-remove small mio-remove1"></span>

                            <input onselectstart="return false"<%--禁止左键划字复制功能--%> type="password" class="form-control" name="password" placeholder="密码" id="mio-regist-password1" />
                            <span class="glyphicon glyphicon-remove small mio-remove1"></span>

                            <input onselectstart="return false"<%--禁止左键划字复制功能--%> type="password" class="form-control" placeholder="确认密码" id="mio-regist-password2" />
                            <span class="glyphicon glyphicon-remove small mio-remove1"></span>

                            <input type="text" class="form-control" name="phone" placeholder="手机号" id="mio-regist-phone" />
                            <span class="glyphicon glyphicon-remove small mio-remove1"></span>

                            <input onkeyup="this.value=this.value.replace(/[^\d]/g,'') " onafterpaste="this.value=this.value.replace(/[^\d]/g,'')" type="text" class="form-control" placeholder="验证码" id="mio-regist-vcode" />
                            <span class="glyphicon glyphicon-remove small mio-remove2"></span>

                            <input id="mio-getVCode" type="button" class="btn btn-info" value="点击发送验证码" onclick="sendCode(this)" />
                        </div>
                        <input type="button" value="注册" class="btn btn-info" id="mio-regist-btn"/>
                    </div>
             </div>
      </form>
   <%--</div>--%>
</div>
<script>
    $(function () {
        $('#mio-regist-btn').click(function () {
            $.ajax({
                url: "/user/register",//请求路径
                type: "POST",//请求方式
                data:$('#personRegForm').serializeJson(),
                async:false,/*同步*/
                dataType: "json",//数据类型可以为 text xml json  script  jsonp
                success: function(result){//返回的参数就是 action里面所有的有get和set方法的参数
                    /*数据返回成功调用函数*/
                    console.log(result);
                    // mntip(result.commonResultInfo.message,'info');
                /*    $.each(result,function(i,data){
                        var test = data[""];
            //             $('.testul').append('<li>'+test+'</li>');
                    });*/
                },
                error: function (result) {
                    console.log(result);
                    mntip('操作失败','danger');
                }
            });
        })
    })
</script>
<script type="text/javascript">
    /*/!*登录*!/


    var REGISTER={
        param:{
            //单点登录系统的url
            surl:""
        },
        beforeSubmit:function() {
            //检查用户是否已经被占用
            $.ajax({
                url : REGISTER.param.surl + "/user/check/"+escape($("#mio-regist-account").val())+"/1?r=" + Math.random(),
                success : function(data) {
                    if (data.data) {
                        //检查手机号是否存在
                        $.ajax({
                            url : REGISTER.param.surl + "/user/check/"+$("#mio-regist-phone").val()+"/2?r=" + Math.random(),
                            success : function(data) {
                                if (data.data) {
                                    REGISTER.doSubmit();
                                } else {
                                    alert("此手机号已经被注册！");
                                    $("#mio-regist-phone").select();
                                }
                            }
                        });
                    } else {
                        alert("此用户名已经被占用，请选择其他用户名");
                        $("#mio-regist-account").select();
                    }
                }
            });

        },
        doSubmit:function() {
            $.post("/user/register",$("#personRegForm").serialize(), function(data){
                console.log(data);
                if(data.status == 200){
                    alert('用户注册成功，请登录！');
                    REGISTER.login();
                } else {
                    alert("注册失败！");
                }
            });
        },
        login:function() {
            location.href = "/page/login";
            return false;
        },
        reg:function() {


            if (checkTips($("#mio-form-container2 input"),'必须填写')) {
                if ($("#mio-regist-password1").val() != $("#mio-regist-password2").val()) {
                    checkTip($("#mio-regist-password2"),'两次的密码输入不一致，请输入');
                    $("#mio-regist-password2").select();
                    $("#mio-regist-password2").focus();
                }else{
                    this.beforeSubmit();
                }
            }
        }
    };
*/
</script>
<script type="text/javascript">
   /* var clock = '';
    var nums = 30;
    var btn;
    function sendCode(thisBtn) {
        btn = thisBtn;
        btn.disabled = true; //将按钮置为不可点击
        btn.value = '重新获取（'+nums+'）';
        clock = setInterval(doLoop, 1000); //一秒执行一次
    }

    function doLoop() {
        nums--;
        if (nums > 0) {
            btn.value = '重新获取（'+nums+'）';
        } else {
            clearInterval(clock); //清除js定时器
            btn.disabled = false;
            btn.value = '点击发送验证码';
            nums = 10; //重置时间
        }
    }*/

</script>
</body>
</html>