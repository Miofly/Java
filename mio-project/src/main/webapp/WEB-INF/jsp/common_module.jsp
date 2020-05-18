<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@include file="common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>系统界面</title>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8" />
    <link rel="stylesheet" href="${basePath}css/other/swipers.css">
    <%--加载百度地图--%>
    <script src="${basePath}js/ssyth/offlinemap/apiv2.0.min.js"></script>
    <script src="${basePath}/js/ssyth/offlinemap/map_load.js"></script>
    <style>
        .swiper-wrapper .swiper-slide{background: rgba(0,0,0,0.7)!important;color: white}
    </style>
</head>
<body style="background: rgba(0,0,0,0.8);position: relative;height: 2000px">
    <%--搜索框--%>
    <div style="position: absolute;top: 0px;left: 0px">
        <div class="search-wrapper" style="transform: scale(0.7);">
            <div class="input-holder">
                <input type="text" class="search-input" placeholder="please input" />
                <button class="search-icon" onclick="searchToggle(this, event);"><span></span></button>
            </div>
            <span class="close" onclick="searchToggle(this, event);"></span>
            <div class="result-container">

            </div>
        </div>
    </div>

    <%--单条信向上滚动--%>
    <div class="mio-singlesl"  style="border-radius: 10px;height: 28px;padding:5px 5px 5px 20px;
    width: 200px;background: rgba(0,0,0,1);overflow: hidden;
    position: absolute;top: 45px;left: 5px;cursor: pointer">
        <ul class="mio-scrollNews" style="color: white;height: 160px;overflow: hidden;"></ul>
    </div>

    <%--阴影框，遮罩--%>
    <div class="mio-yyframe"  style="position: absolute;left: 5px;top: 75px;height: 100px"></div>

    <%--文字向上滚动，ul列表形式--%>
    <div class="mio-scrollNewPar mio-yyframe"  style="height: 120px;padding:20px;width: 280px;
                overflow: hidden;position: absolute;top: 190px;left: 5px;color: white;cursor: pointer">
        <ul class="mio-scrollNews" style="height: 160px;overflow: hidden;"></ul>
    </div>

    <%--当前时间--%>
    <div style="color: white;position: absolute;top: 320px;left: 15px;" id="nowTime"></div>

    <%--开始结束时间范围选择laydate--%>
    <input style="position: absolute;top: 340px;left: 5px;" type="text" id="mio-dateRange" class="mio-date" placeholder="请选择时间范围">
    <input style="position: absolute;top: 390px;left: 5px;width: 150px" type="text" id="mio-dateSingle" class="mio-date" placeholder="请选择时间范围">

    <%--输入框--%>
    <div class="inpdiv" style="position: absolute;left: 310px;top: 0;background: rgba(233,233,233,1);padding: 30px;border-radius: 10px">
        <%--
              限制只输入数字
              onkeyup="this.value=this.value.replace(/[^\d]/g,'') " onafterpaste="this.value=this.value.replace(/[^\d]/g,'')"
              输入字母和下横线的正则表达式
              onkeyup="this.value=this.value.replace(/[^_a-zA-Z]/g,'')" onpaste="this.value=this.value.replace(/[^_a-zA-Z]/g,'')"
              输入框只能输入字母数字和下横线的正则表达式
              onkeyup="this.value=this.value.replace(/[^\w]/g,'')" onpaste="this.value=this.value.replace(/[^\w]/g,'')"
              密码框 onpaste="return false; 输入框禁止粘贴功能
              maxlength=6 长度限制
              --%>
        <input onkeyup="this.value=this.value.replace(/[^\d]/g,'') "
               onafterpaste="this.value=this.value.replace(/[^\d]/g,'')"
               type="text" id="t1" class="mio-inp" name="username"
               placeholder="请输入"  onpaste="return false;" />
        <span class="glyphicon glyphicon-remove small mio-remove"></span>
        <br>

        <input style="margin-top: 20px" autocomplete="off"  type="text" id="t3"
               class="mio-inp" name="username"
               placeholder="请输入" />
        <span class="glyphicon glyphicon-remove small mio-remove"></span>
        <br>

        <input autocomplete="off" onpaste="return false;" oncut="return false;"
               type="password" id="t2" class="mio-inp "
               style="margin-top: 20px" name="username"  placeholder="用户名"/>
        <span class="glyphicon glyphicon-remove small mio-remove"></span>
        <br>


        <%--小输入框--%>
        <input style="margin-top: 10px" type="text" class="mio-inp-common mio-email">
        <br>
        <%--查看密码--%>
        <%--密码框复制粘贴限制--%>
        <%--onpaste="return false;" oncut="return false;"  oncontextmenu="return false" oncopy="return false"--%>
        <input style="margin-top: 10px;width: 300px" type="password" class="mio-inp pwd" onpaste="return false;" oncut="return false;"  oncontextmenu="return false" oncopy="return false">
        <i class="password fa fa-eye-slash" style="visibility: hidden;margin-left: -30px"></i>

    </div>

    <%--按钮框--%>
    <div style="position: absolute;left: 310px;top: 310px;background: rgba(0,0,0,0.3);padding: 30px;border-radius: 10px">
        <%--按钮--%>
        <input style="" type="button" value="btn" id="testBtn" class="mio-btn-white">

        <div style="" >
            <%--查询按钮--%>
            <div style="float: left;margin-left: 10px;margin-top:5px">
                <i class="fa fa-search" style="color: white;margin-right: -23px"></i>
                <input style="width: 60px;padding-left: 15px" type="button" value="查询"  class="mio-btn-blue">
            </div>
            <%--复制--%>
            <div style="float: left;margin-left: 10px;margin-top:5px">
                <i class="fa fa-copy" style="color: white;margin-right: -23px"></i>
                <input style="width: 60px;padding-left: 15px" type="button" value="复制"  class="mio-btn-blue">
            </div>
            <%--剪切--%>
            <div style="float: left;margin-left: 10px;margin-top:5px">
                <i class="fa fa-cut fa-flip-horizontal" style="color: white;margin-right: -23px"></i>
                <input style="width: 60px;padding-left: 15px" type="button" value="剪切"  class="mio-btn-blue">
            </div>
            <%--刷新--%>
            <div style="float: left;margin-left: 10px;margin-top:5px">
                <i class="fa fa-repeat" style="color: white;margin-right: -23px"></i>
                <input style="width: 60px;padding-left: 15px" type="button" value="刷新"  class="mio-btn-blue">
            </div>
            <br>
            <%--编辑--%>
            <div class="mio-upt" style="float: left;margin-left: 10px;margin-top:5px">
                <i class="fa fa-pencil" style="color: white;margin-right: -23px"></i>
                <input style="width: 60px;padding-left: 15px;" type="button" value="编辑"  class="mio-btn-blue">
            </div>
            <%--新增--%>
            <div style="float: left;margin-left: 10px;margin-top:5px">
                <i class="fa fa-plus" style="color: white;margin-right: -23px"></i>
                <input style="width: 60px;padding-left: 15px;" type="button" value="添加"  class="mio-btn-blue">
            </div>
            <%--删除--%>
            <div style="float: left;margin-left: 10px;margin-top:5px">
                <i class="fa fa-times" style="color: white;margin-right: -23px"></i>
                <input style="width: 60px;padding-left: 15px;" type="button" value="删除"  class="mio-btn-blue">
            </div>
            <%--保存--%>
            <div style="float: left;margin-left: 10px;margin-top:5px">
                <i class="fa fa-save" style="color: white;margin-right: -23px"></i>
                <input style="width: 60px;padding-left: 15px;" type="button" value="保存"  class="mio-btn-blue">
            </div>
            <br>
            <%--导入--%>
            <div style="float: left;margin-left: 10px;margin-top:5px">
                <i class="fa fa-arrow-circle-o-up" style="color: white;margin-right: -23px"></i>
                <input style="width: 60px;padding-left: 15px;" type="button" value="导入"  class="mio-btn-blue">
            </div>
            <%--导出--%>
            <div style="float: left;margin-left: 10px;margin-top:5px" >
                <i class="fa fa-arrow-circle-o-down" style="color: white;margin-right: -23px"></i>
                <input style="width: 60px;padding-left: 15px;" type="button" value="导出"  class="mio-btn-blue">
            </div>
            <%--上传--%>
            <div style="float: left;margin-left: 10px;margin-top:5px">
                <i class="fa fa-upload" style="color: white;margin-right: -23px"></i>
                <input style="width: 60px;padding-left: 15px" type="button" value="上传"  class="mio-btn-blue">
            </div>
            <%--下载--%>
            <div style="float: left;margin-left: 10px;margin-top:5px">
                <i class="fa fa-download" style="color: white;margin-right: -23px"></i>
                <input style="width: 60px;padding-left: 15px" type="button" value="下载"  class="mio-btn-blue">
            </div>
			<br>
			<%--重置--%>
			<div style="float: left;margin-left: 10px;margin-top:5px">
				<i class="fa fa-undo" style="color: white;margin-right: -23px"></i>
				<input style="width: 60px;padding-left: 15px" type="reset" value="重置"  class="mio-btn-red">
			</div>
        </div>

        <div style="float: left;margin-left: 10px;margin-top:5px">
            <%--copy--%>
            <input type="button" class="mio-btn-blue" style="width: 45px;height: 23px;box-shadow: none" id="copy" value="copy"/>
            <%--cut--%>
            <input type="button" class="mio-btn-blue" style="width: 45px;height: 23px;box-shadow: none" id="cut" value="cut"/>
            <%--delete ed1941--%>
            <input type="button" class="mio-btn-blue" style="width: 45px;height: 23px;box-shadow: none;background: red" value="delete" id="delete"/>
        </div>

        <select  style=""  class="mio-sel" name="" >
            <option value="" selected>全省</option>
            <option value="1">卫生局</option>
            <option value="2">卫生院</option>
            <option value="3">卫生室</option>
            <option value="4">供货商</option>
            <option value="0">系统管理员</option>
        </select>

        <%--返回图标--%>
        <i title="返回" class="fa fa-reply mio-blg mio-reply" style=""></i>

        <%--a标签做按钮--%>
        <a style="text-decoration:none;" class="mio-a" href=https://www.baidu.com/>返回</a>
    </div>

    <%--错误信息div--%>
    <div class="mio-tipDiv mio-shadow" style="position: absolute;left: 5px;top: 440px">
        <div style="">
            <em style="margin-left: 125px;">提示</em>
            <span title="关闭" style="visibility: visible;margin-left: 265px;margin-top: -15px;display: block" class="glyphicon glyphicon-remove small mio-remove" onclick="$('.mio-tipDiv').slideUp();$('#mask').remove();"></span>
        </div>
        <br>
        <ul id="test111" style=";margin-top: -20px" class="mio-errCon"></ul>
        <input title="关闭" style="width: 40px;height: 20px;margin-left: 120px;margin-top: -10px" type="button" class="mio-btn-white closeDiv" onclick="$('.mio-tipDiv').slideUp();$('#mask').remove();" value="close">
    </div>

    <%--swiper--%>
    <div id="mio-swiper" style="position: absolute;top: 10px;left: 650px">

        <div  class="swiper-container" style="width: 600px;height:200px;">

            <div class="swiper-wrapper">
                <div class="swiper-slide">
                    <div id="container1" style="width: 200px;height: 100px;background: black"></div>
                </div>
                <div class="swiper-slide" style="z-index: 9999999">
                    <div id="container2" style="width: 200px;height: 100px;background: black"></div>
                </div>
                <div class="swiper-slide">Slide 3</div>
                <div class="swiper-slide">Slide 10</div>
            </div>
            <!-- Add Pagination -->
            <div class="swiper-pagination" style="display: none"></div>
            <!--左右翻页按钮-->
            <div class="swiper-button-prev" style="display: none;"></div>
            <div class="swiper-button-next" style="display: none"></div>
        </div>
    </div>

    <%--折线图表--%>
    <div style="position: absolute;top: 520px;left: 10px">
         <div id="container" style="width: 300px;height: 200px;background: black"></div>
    </div>

    <%--select框--%>
    <div style="position: absolute;top: 750px;left: 10px;">
        <select class="selectBox" style="width: 260px"  data-placeholder="Select Your Options">
            <option value=""></option>
            <optgroup label="NFC EAST">
                <option>Dallas Cowboys</option>
                <option>New York Giants</option>
                <option>Philadelphia Eagles</option>
                <option>Washington Redskins</option>
            </optgroup>

            <optgroup label="NFC NORTH">
                <option>Chicago Bears</option>
                <option>Detroit Lions</option>
                <option>Green Bay Packers</option>
                <option>Minnesota Vikings</option>
            </optgroup>
        </select>
    </div>
    <%--ehcarts地图--%>
    <div style="position: absolute;right: -110px;top: 200px">
        <div id="pro_map1" style="width:600px;height: 580px;"></div>
    </div>
    <%--百度地图--%>
    <div style="position: absolute;right: 300px;top: 230px">
        <h6 class="cityName" style="color: white;z-index: 100;font-size: 20px;font-weight: normal"></h6>
        <div id="map_demo" class="baidu-maps" style="width: 300px;height: 300px"></div>
    </div>
    <%--文字--%>
    <div style="position: absolute;right: 10px;top: 780px;background: cadetblue;width: 300px" onselectstart="return false"<%--禁止左键划字复制功能--%>
         oncontextmenu=self.event.returnValue=false<%--禁止右键菜单--%>>
        <%--华文细黑--%>
        <span style="font-family: STXihei;color: white;margin-top: 10px;font-size:18px;text-align: center;display: block">我12的31232测213试3213213体213test font YEs</span>
        <%--冬青黑体--%>
        <span style="font-family: Hiragino Sans GB;color: white;margin-top: 10px;font-size:18px;text-align: center;display: block">我12的31232测213试3213213体213test font YEs</span>
        <%--Safari下默认的字体--%>
        <span style="font-family: Times New Roman;color: white;margin-top: 10px;font-size:18px;text-align: center;display: block">我12的31232测213试3213213体213test font YEs</span>
        <%--微软正黑体 --%>
        <span style="font-family: Microsoft JhengHei;color: white;margin-top: 10px;font-size:18px;text-align: center;display: block">我12的31232测213试3213213体213test font YEs</span>
        <%--仿宋 --%>
        <span style="font-family: FangSong;color: white;margin-top: 10px;font-size:18px;text-align: center;display: block">我12的31232测213试3213213体213test font YEs</span>
        <%--楷体 --%>
        <span style="font-family: KaiTi;color: white;margin-top: 10px;font-size:18px;text-align: center;display: block">我12的31232测213试3213213体213test font YEs</span>
        <%--华文楷体--%>
        <span style="font-family: STKaiti;color: white;margin-top: 10px;font-size:18px;text-align: center;display: block">我12的31232测213试3213213体213test font YEs</span>
        <%--华文仿宋--%>
        <span style="font-family: STFangsong;color: white;margin-top: 10px;font-size:18px;text-align: center;display: block">我12的31232测213试3213213体213test font YEs</span>
        <%--黑体--%>
        <span style="font-family: SimHei;color: white;margin-top: 10px;font-size:18px;text-align: center;display: block">我12的31232测213试3213213体213test font YEs</span>
        <%--微軟正黑體--%>
        <span style="font-family: Microsoft JhengHei;color: white;margin-top: 10px;font-size:18px;text-align: center;display: block">我12的31232测213试3213213体213test font YEs</span>
        <%--隶书--%>
        <span style="font-family: LiSu;color: white;margin-top: 10px;font-size:18px;text-align: center;display: block">我12的31232测213试3213213体213test font YEs</span>
        <%--幼圆--%>
        <span style="font-family: YouYuan;color: white;margin-top: 10px;font-size:18px;text-align: center;display: block">我12的31232测213试3213213体213test font YEs</span>
        <%--华文楷体--%>
        <span style="font-family: STKaiti;color: white;margin-top: 10px;font-size:18px;text-align: center;display: block">我12的31232测213试3213213体213test font YEs</span>
        <%--方正舒体--%>
        <span style="font-family: FZShuTi;color: white;margin-top: 10px;font-size:18px;text-align: center;display: block">我12的31232测213试3213213体213test font YEs</span>
        <%--华文彩云--%>
        <span style="font-family: STCaiyun;color: white;margin-top: 10px;font-size:18px;text-align: center;display: block">我12的31232测213试3213213体213test font YEs</span>
        <%--华文行楷--%>
        <span style="font-family: STXingkai;color: white;margin-top: 10px;font-size:18px;text-align: center;display: block">我12的31232测213试3213213体213test font YEs</span>
        <%--华文新魏--%>
        <span style="font-family: STXinwei;color: white;margin-top: 10px;font-size:18px;text-align: center;display: block">我12的31232测213试3213213体213test font YEs</span>
    </div>

    <%--返回顶部--%>
    <i class="back_to_top fa fa-rocket" title="返回顶部"></i>

    <script>
        $(".mio-email").mailAutoComplete();//邮箱
        /*select框*/selectChosen($('.selectBox'));
        /*echarts地图*/mapShow('聊城市','pro_map1')
        /*百度地图*/baiduMapData('威海市','文登区');

        /*swiper设置*/
        swiper('.swiper-container',false,3,10);
        swiperBtn($('.swiper-container'));

        /*显示title*/showTitle($('input'));

        /*laydate组件*/
        laydateChoice('#mio-dateRange','datetime',true);
        laydateChoice('#mio-dateSingle','datetime',false);

        /*折线图表*/splineChart($('#container'));

        /*饼图*/pieChart($('#container1'));
        /*饼图*/pieChart($('#container2'));


        /*前端限制*/
        $('#testBtn').click(function () {
            checkTips($('.inpdiv input'),'请输入','right','center');
            /*字符长度限制函数，输入触发*/
            inpLen($('#t1'),2,5);
        });

        /*输入字符长度过长提示，keyup事件*/
        inpLenMax($('#t1'),5);

        /*回车触发*/
        enter($('#testBtn'));

        /*密码框的设置*/
        showPwd($('.pwd'),$('.password'));

        /*输入框蓝色阴影*/
        inputBorder($('.mio-inp'));

        /*清除内容*/
        remove($('#t1'));
        remove($('#t2'));
        remove($('#t3'));

        /*文字自动向上滚动*/
        autoScrolls($(".mio-scrollNewPar"),'-20px','3000');

        /*ajax定时刷新*/
        var proSql = "select NAME from mio_left_list";
        ajaxr();
        setInterval(function(){
            ajaxr()
        }, 60000);
        function ajaxr() {
            $.ajax({
                url: "/common/sqlStr",//请求路径
                type: "POST",//请求方式
                data:{sql:proSql},
                async:true,/*异步*/
                dataType: "json",//数据类型可以为 text xml json  script  jsonp
                success: function(result){//返回的参数就是 action里面所有的有get和set方法的参数
                    /*数据返回成功调用函数*/
                    successFun(result);
                }
            });
        }

        function successFun(result){

            /*先清空*/
            $('.mio-scrollNewPar ul').html('');
            $.each(result, function (i, data) {
                $('.mio-scrollNewPar ul').append('<li>'+data['NAME']+'</li>')
            });
        }

        /*单条数据的滚动*/
        $.ajax({
            url: "/common/sqlStr",//请求路径
            type: "POST",//请求方式
            data:{sql:proSql},
            async:true,/*异步*/
            dataType: "json",//数据类型可以为 text xml json  script  jsonp
            success: function(result){//返回的参数就是 action里面所有的有get和set方法的参数
                /*数据返回成功调用函数*/
                $.each(result, function (i, data) {
                    $('.mio-singlesl ul').append('<li style="height:20px">'+data['NAME']+'</li>')
                });
            }
        });
        setInterval('AutoScroll(".mio-singlesl")', 3000);

        /*当前时间*/
        setInterval(function(){nowTimeHtml($('#nowTime'));},1000);

        goTop($('.back_to_top'));

    </script>
</body>
</html>
