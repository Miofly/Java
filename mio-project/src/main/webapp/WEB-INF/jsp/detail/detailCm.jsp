<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%--logo头部--%>
<script type="text/x-dot-template" id="headerTmp">

    <div class="navbar navbar-inverse" >
        <div class="navbar-inner" style="height: 45px">
            <a class="brand"><img id="dt-logo" src="{{=it.logo}}" style="margin-left: -40px;height:20px;width: 200px"/></a>

            <ul class="nav pull-right">
                <%--<li class="hidden-phone">--%>
                    <%--<input class="search" type="text" />--%>
                <%--</li>--%>
                <%--<li class="notification-dropdown hidden-phone">
                    <a href="#" class="trigger">
                        <i class="icon-warning-sign"></i>
                        <span class="count">8</span>
                    </a>
                    <div class="pop-dialog">
                        <div class="pointer right">
                            <div class="arrow"></div>
                            <div class="arrow_border"></div>
                        </div>
                        <div class="body">
                            <a href="#" class="close-icon"><i class="icon-remove-sign"></i></a>
                            <div class="notifications">
                                <h3>You have 6 new notifications</h3>
                                <a href="#" class="item">
                                    <i class="icon-signin"></i> New user registration
                                    <span class="time"><i class="icon-time"></i> 13 min.</span>
                                </a>
                                <a href="#" class="item">
                                    <i class="icon-signin"></i> New user registration
                                    <span class="time"><i class="icon-time"></i> 18 min.</span>
                                </a>
                                <a href="#" class="item">
                                    <i class="icon-envelope-alt"></i> New message from Alejandra
                                    <span class="time"><i class="icon-time"></i> 28 min.</span>
                                </a>
                                <a href="#" class="item">
                                    <i class="icon-signin"></i> New user registration
                                    <span class="time"><i class="icon-time"></i> 49 min.</span>
                                </a>
                                <a href="#" class="item">
                                    <i class="icon-download-alt"></i> New order placed
                                    <span class="time"><i class="icon-time"></i> 1 day.</span>
                                </a>
                                <div class="footer">
                                    <a href="#" class="logout">View all notifications</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </li>
                <div class="copyrights">Collect from <a href="#"  title="网站模板">网站模板</a></div>
                <li class="notification-dropdown hidden-phone">
                    <a href="#" class="trigger">
                        <i class="icon-envelope-alt"></i>
                    </a>
                    <div class="pop-dialog">
                        <div class="pointer right">
                            <div class="arrow"></div>
                            <div class="arrow_border"></div>
                        </div>
                        <div class="body">
                            <a href="#" class="close-icon"><i class="icon-remove-sign"></i></a>
                            <div class="messages">
                                <a href="#" class="item">
                                    <img src="img/contact-img.png" class="display" />
                                    <div class="name">Alejandra Galván</div>
                                    <div class="msg">
                                        There are many variations of available, but the majority have suffered alterations.
                                    </div>
                                    <span class="time"><i class="icon-time"></i> 13 min.</span>
                                </a>
                                <a href="#" class="item">
                                    <img src="img/contact-img2.png" class="display" />
                                    <div class="name">Alejandra Galván</div>
                                    <div class="msg">
                                        There are many variations of available, have suffered alterations.
                                    </div>
                                    <span class="time"><i class="icon-time"></i> 26 min.</span>
                                </a>
                                <a href="#" class="item last">
                                    <img src="img/contact-img.png" class="display" />
                                    <div class="name">Alejandra Galván</div>
                                    <div class="msg">
                                        There are many variations of available, but the majority have suffered alterations.
                                    </div>
                                    <span class="time"><i class="icon-time"></i> 48 min.</span>
                                </a>
                                <div class="footer">
                                    <a href="#" class="logout">View all messages</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </li>--%>
                <li class="dropdown">
                    <a href="#" style="font-size: 16px" class="dropdown-toggle hidden-phone" data-toggle="dropdown" id="userInfo">

                        <b class="caret"></b>
                    </a>
                    <%--<ul class="dropdown-menu">--%>
                        <%--<li><a href="#">Personal info</a></li>--%>
                        <%--<li><a href="#">Account settings</a></li>--%>
                        <%--<li><a href="#">Billing</a></li>--%>
                        <%--<li><a href="#">Export your data</a></li>--%>
                        <%--<li><a href="#">Send feedback</a></li>--%>
                    <%--</ul>--%>
                </li>
                <%--<li class="settings hidden-phone">--%>
                    <%--<a href="#" role="button">--%>
                        <%--<i class="icon-cog"></i>--%>
                    <%--</a>--%>
                <%--</li>--%>
                <li class="settings hidden-phone">
                    <a href="#" role="button" id="userlogout">
                        <i class="icon-share-alt"></i>
                    </a>
                </li>
            </ul>
        </div>
    </div>

    </div>


    </div>



</script>

<%--左侧边栏--%>
<script type="text/x-dot-template" id="leftTmp">
    <div id="sidebar-nav">
        <ul id="dashboard-menu">
            {{~it:value:index}}
            <li class="{{=value.status}}">
                {{? value.status=="active" }}
                <div class="pointer">
                    <div class="arrow"></div>
                    <div class="arrow_border"></div>
                </div>
                {{?}}
                <a href="{{=value.url}}">
                    <i class="{{=value.icon}}"></i>
                    <span>{{=value.text}}</span>
                </a>
            </li>
            {{~}}
        </ul>
    </div>
</script>
<script src="${basePath}js/common/dotCommon.js"></script>

<script>

    tokenName();
    function tokenName() {
        var _ticket = $.cookie("userToken");
        console.log(_ticket);
        $('#userInfo').html(_ticket)

        <%--if(!_ticket){--%>
            <%--return ;--%>
        <%--}--%>
        <%--$.ajax({--%>
            <%--url : "${basePath}user/token/" + _ticket,--%>
            <%--dataType : "jsonp",--%>
            <%--type : "POST",--%>
            <%--success : function(result){--%>
                <%--$('#userInfo').html(result.username)--%>
            <%--},--%>
            <%--error : function (result) {--%>
                <%--// setCookie('userToken','',-1);--%>
            <%--}--%>
        <%--});--%>
    }
    /*function tokenName() {
        var _ticket = $.cookie("userToken");
        if(!_ticket){
            return ;
        }
        $.ajax({
            url : "${basePath}user/token/" + _ticket,
            dataType : "jsonp",
            type : "POST",
            success : function(result){
                $('#userInfo').html(result.username)
            },
            error : function (result) {
              // setCookie('userToken','',-1);
            }
        });
    }*/
    $('#userlogout').click(function () {
        setCookie('userToken','',-1)
        $(location).prop('href', '${basePath}detail/signin');
      /*  $.ajax({
            url: "${basePath}user/logout",//请求路径
            type: "get",//请求方式
            dataType: "json",//数据类型可以为 text xml json  script  jsonp
            complete: function () {
                $(location).prop('href', '${basePath}detail/signin');
            },
            success: function(result){//返回的参数就是 act

                console.log(result);
                $(location).prop('href', '${basePath}detail/signin');
                // mntip(result.commonResultInfo.message,'info');
                // if(result.commonResultInfo.message=='操作成功'){
                // setTimeout(function(){
                // setTimeout(function(){
                <%--window.location.replace("${basePath}detail/signin");--%>
                <%--window.location.href = "${basePath}detail/signin";--%>
                <%--$(location).attr('href', '${basePath}detail/signin');--%>
                <%--$(window).attr('location','${basePath}detail/signin');--%>
                <%--$(location).prop('href', '${basePath}detail/signin');--%>
                <%----%>
//                 }, 13000);
                // }, 3000);
                // }else{
                //     mntip(result.commonResultInfo.message,'info');
                // }
            },
            error: function (result) {
                console.log(result);
                mntip('操作失败','danger');
            }
        });*/
    })
</script>