    $(function () {
    /*登录*/
    $("#mio-submit").click(function(){
        LOGIN.login();
    });


    inputBorder($('#mio-loginName'));
    inputBorder($('#mio-loginPwd'));
    inputBorder($('#mio-loginCode'));

    remove($('#mio-loginName'));
    remove($('#mio-loginPwd'));
    remove($('#mio-loginCode'));
    remove($('#mio-regist-account'));
    remove($('#mio-regist-password1'));
    remove($('#mio-regist-password2'));
    remove($('#mio-regist-phone'));
    remove($('#mio-regist-vcode'));




    $('#mio-loginPwd').keypress(function () {
        detectCapsLock(event,$(this));
    });
    $('#mio-regist-password1').keypress(function () {
        detectCapsLock(event,$(this));
    });
    $('#mio-regist-password2').keypress(function () {
        detectCapsLock(event,$(this));
    });
    $('#mio-loginPwd').blur(function () {
        pwdBlur();
    });
    $('#mio-loginPwd').focus(function () {
        pwdFocus()
    });
    $('#mio-regist-password1').blur(function () {
        pwdBlur();
    });
    $('#mio-regist-password1').keydown(function () {
        pwdFocus()
    });


    //打开注册窗口
    $("#mio-register").click(function() {
        // $("#mio-submit").die("click");
        $("#login_container").hide();
        $("#mio-closeReg").show();
        $("#mio-register-frame").animate({
            left: '350px',
            height: '470px',
            width: '400px'
        }, 300, function() {
            $("#mio-regCon").show(500);
            $("#mio-closeReg").animate({
                height: '20px',
                width: '20px'
            }, 500);
        });
    });
    //关闭注册窗口
    $("#mio-closeReg").click(function() {
        // $("#mio-submit").bind("click");
        $("#mio-closeReg").animate({
            height: '10px',
            width: '10px'
        }, 500, function() {
            $("#mio-closeReg").hide(500);
            $("#login_container").hide(500);
            $("#mio-regCon").hide(500);
            $("#mio-register-frame").animate({
                left: '0px',
                height: '0px',
                width: '0px'
            }, 300);
        });
    });
    /*退出键关闭注册框*/
    $(document).keydown(function (event) {
        if (event.keyCode == 27) {//esc键对应code值为27
            $("#mio-closeReg").click();
        }
    });

    $(document).keydown(function (event) {
        if (event.keyCode == 13) {//esc键对应code值为27
            $("#mio-submit").click();
        }
    });


});
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


        if (checkInput($("#mio-form-container2 input"),'必须填写')) {
            if ($("#mio-regist-password1").val() != $("#mio-regist-password2").val()) {
                tip($("#mio-regist-password2"),'两次的密码输入不一致，请输入');
                $("#mio-regist-password2").select();
                $("#mio-regist-password2").focus();
            }else{
                this.beforeSubmit();
            }
        }
    }
};
/*登录*/
var LOGIN = {
    doLogin:function() {
        $.post("/user/login", $("#mio-formlogin").serialize(),function(data){
            if (data.status == 200) {
                if (redirectUrl == "") {
                    location.href = "http://localhost:8080";
                } else {
                    location.href = redirectUrl;
                }
            } else {
                alert("登录失败，原因是：" + data.msg);
                $("#mio-loginName").select();
            }
        });
    },
    login:function() {
        if (checkTips($(".mio-login-frame input"),'必须填写','right','center')) {
            if($('#mio-loginName').val().length>=3&&$('#mio-loginName').val().length<=6){
                this.doLogin();
            }else{
                tip($("#mio-loginName"),'用户名必须在3~6位之间');
            }
        }
    }

};

function pwdBlur() {
    $('.tip-yellow').css('display','none');
}

function pwdFocus() {
    $('.tip-yellow').css('display','block');
}

/*密码开启大写提示*/
var isUpperLockShow='N';
function detectCapsLock(event,pwd){
    var e = event||window.event;
    var o = e.target||e.srcElement;
    var keyCode = e.keyCode||e.which; // 按键的keyCode
    var isShift = e.shiftKey ||(keyCode ==   16 ) || false ; // shift键是否按住
    if (
        ((keyCode >=   65   && keyCode <=   90 ) &&   !isShift) // Caps Lock 打开，且没有按住shift键
        || ((keyCode >=   97   && keyCode <=   122 ) && isShift)){
        if(isUpperLockShow=='N'){
            isUpperLockShow='Y';
            pwd.poshytip({
                className: 'tip-yellow',
                content:'大写锁定键被按下，请注意大小写',
                showOn: 'none',
                alignTo: 'target',
                alignX: 'center',
                alignY: 'bottom',
                offsetX: 0,
                offsetY: 3,
                // timeOnScreen:2000
            });
            pwd.poshytip('show');
        }
    }else if(isUpperLockShow=='Y'){
        isUpperLockShow='N';
        pwd.poshytip('hide');
    }
}

/*输入框边框*/
function inputBorder(input){
    input.focus(function () {
        $(this).addClass('mio-border')
    });
    input.blur(function () {
        $(this).removeClass('mio-border')
    })
}

/*输入框清除输入内容*/
function remove(input){
    if(input.val()!=''){
        input.next().css('visibility','visible');
    }
    input.keyup(function() {
        $(this).change();
    });
    input.change(function () {
        $(this).next().css('visibility','visible');
    });
    /*点击清除*/
    input.next().click(function () {
        input.val('');
        $(this).css('visibility','hidden');
    });
    /*失去焦点时判断*/
    input.blur(function() {
        if($(this).val()==''){
            $(this).next().css('visibility','hidden');
        }
    });
    /*有值就开启清除*/
}

