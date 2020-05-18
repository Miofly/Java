<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<head>
    <meta name=”viewport” content=”width=device-width, initial-scale=1″ />
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>山东移动省市一体化</title>
    <%@include file="common.jsp"%>
    <link rel="stylesheet" href="${basePath}css/other/swipers.css">
    <script src="${basePath}js/ssyth/offlinemap/apiv2.0.min.js"></script>
    <script src="${basePath}js/ssyth/offlinemap/map_load.js"></script>
    <script src="${basePath}js/ssyth/map.js"></script>
    <style type="text/css">
        /*整体定义*/
        body, html{width: 100%;height: 100%;overflow: hidden;margin:0;}
        /*定义背景颜色*/
        /*百度地图先隐藏*/
        #map_demo{display: none;margin-top: 12.3%;width: 87.3%;margin-left: 80px;height: 110%}
        /*百度地图与bootstrap冲突的bug.baidu-maps label{max-width: none;}*/
        /*搜索提示词的框*/
        #auto_div{border-radius: 5px;display: block;width: 320px;
            background: rgba(0,0,0,0.5);position: absolute;top: 60px;left: 0;color:white;}
        #auto_div li{padding:5px 0 5px 10px;border-bottom: 1px dashed #eee;color:white;
            font-size: 18px;background: rgba(0,0,0,0.6);}
    </style>
</head>
<body>
   <div style="width: 100%;height: 100%;background: url(${basePath}images/ssybg.jpg) repeat-x;background-size: 100% 100%;">

       <%--上部--%>
       <div style="position: relative;height: 73%;width: 100%;">

           <%--左一div--%>
           <div style="width: 20%;height: 73%;float: left">
               <%--框--%>
               <div class="mio-yyframe" style="width: 20%;height: 80%;
               background: rgba(0,0,0,0.3);padding:1.5% 2% 1.5% 2%;position: absolute;left: 2%;top: 10%;">
                   <%--业务量信息--%>
                   <div style="">

                       <div style="">
                           <h4 class="mio-mp" style="color:white" id="drywl"></h4>
                           <em class="mio-whiteText mio-mp" style="font-size: 10px">当日业务量</em>
                       </div>

                       <div style="margin-top: 12%">
                           <h4 class="mio-mp" style="color:white" id="drbcl"></h4>
                           <em class="mio-whiteText mio-mp" style="font-size: 10px">当日报错量</em>
                       </div>

                       <div style="margin-top: 5%">
                           <h4 class="mio-mp" style="color:white" id="zdxx"></h4>
                           <em class="mio-whiteText mio-mp" style="font-size: 10px">终端在线数量/终端总数</em>
                       </div>
                   </div>
                   <%--告警信息--%>
                   <div class="mio-scrollNewPar"  style="margin-top: 10%;height: 53.5%;
                        overflow: hidden;color:white">
                       <ul class="mio-scrollNews" style="font-size: 10px;"></ul>
                   </div>
               </div>
           </div>

           <%--地图--%>
           <div style="width: 60%;height: 73%;float: left;margin-left: -45px;margin-top: -45px">
               <%--搜索--%>
               <div class="search-wrapper" style="transform: scale(0.7);z-index: 1000;margin-top: -47px;margin-left: -29.6%">
                   <div class="input-holder">
                       <input type="text" class="search-input" placeholder="please input" id="search_text" />
                       <button class="search-icon" onclick="searchToggle(this, event);"><span></span></button>
                   </div>
                   <span class="close" onclick="searchToggle(this, event);"></span>
                   <div class="result-container">
                       <ul id="auto_div"></ul>
                   </div>
               </div>

               <div id="retCity" style="z-index:999;position: absolute;top:25px;left:73.9%;display: none;">
                   <i title="返回市级地图"  onclick="goBackCityMap()"  class="fa fa-reply mio-blg mio-reply goBackCity" style="color: rgb(106,187,225);display: block;width: 30px;height: 30px;transition: 0.38s;"></i>
               </div>
               <!--返回省級地圖-->
               <div id="retPro" style="z-index:999;position: absolute;top:25px;left:73.9%;display: none;">
                   <i title="返回省级地图"  onclick="goBackProeMap()"  class="fa fa-reply mio-blg mio-reply" style="color: rgb(106,187,225);display: block;width: 30px;height: 30px;transition: 0.38s;"></i>
               </div>
               <div id="main" oncontextmenu=self.event.returnValue=false style="width: 100%;height: 100%">
                   <!--省級地圖-->
                   <div id="pro_map" style="margin-top: 0px;width:100%;height: 150%;"></div>
                   <!--單個市級地圖-->
                   <div id="city_map" style="margin-top: 30px;width:100%;display: none;height: 150%;"></div>
               </div>
               <!--百度地图-->
               <h6 class="cityName" style="position:absolute;color: white;left:575px;top:10px;z-index: 100;font-size: 20px;font-weight: normal"></h6>
               <div id="map_demo" class="baidu-maps mio-shadow" ></div>

           </div>

           <%--右侧趋势图--%>
           <div style="width: 25%;height: 73%">
               <div class="mio-yyframe" style="width: 23%;height: 80%;
			    position: absolute;right: 2%;top: 10%;
			    ">
                   <div id="container" style="min-width:200px;width: 100%;height: 49%;margin-left: -20px"></div>
                   <div id="container1" style="min-width:200px;width: 100%;height: 49%;margin-left: -20px;margin-top: 2%"></div>
               </div>
           </div>

       </div>

       <%--底部--%>
       <div style="width: 100%;height: 27%;background: rgba(0,0,0,0.7)">
           <%--左侧--%>
           <div style="float: left;width: 21.9%;height: 100%">
               <div style="margin-bottom: 20px">
                   <img src=${basePath}images/zgyd.png alt="" style="float: left;width: 20%;height: 20%;margin-top: 5%;margin-left: 5%">
                   <span style="color: #fff;font-size: 20px;margin-top:10%;margin-left: 4%;float: left;">CHINA MOBILE</span>
               </div>

               <h3 style="color: white;clear: both;margin-left: 8%;padding-top:7%;">省市一体化监控平台</h3>
               <br>
               <%--当前时间--%>
               <div style="color: rgba(255,255,255,0.8);margin-left:35%" id="nowTime"></div>
           </div>

           <%--右侧--%>
           <div style="width: 74%;height: 100%;float: left">

               <%--swiper插件使用--%>
               <div id="mio-swiper" style="width: 100%;height: 100%">
                   <div  class="swiper-container" style="width:100%;height: 100%;">

                       <div class="swiper-wrapper" style="margin-left: 10px">

                           <%--具体div--%>
                           <div class="swiper-slide">

                               <div style="color: white;">
                                   <table style="margin: 8% auto 0">

                                       <thead style="font-size: 14px;font-style: normal">
                                            <tr style="height: 35px;">
                                                <th style="width: 150px">业务报错最多的地市</th>
                                                <th style="width: 30px">当日</th>
                                            </tr>
                                       </thead>
                                       <tbody id="dsywpm" style="font-size: 12px;font-style: normal;margin-top: 10px">
                                       </tbody>
                                   </table>
                               </div>
                           </div>

                           <div  class="swiper-slide" >
                               <div id="container3" style="width: 100%;height: 100%"></div>
                           </div>

                           <div  class="swiper-slide" >
                               <div style="color: white;">
                                   <table style="margin: 8% auto 0">
                                       <thead style="font-size: 14px;font-style: normal">
                                       <tr style="height: 35px;">
                                           <th style="width: 150px">报错活跃排名</th>
                                           <th style="width: 80px">十分钟内</th>
                                       </tr>
                                       </thead>
                                       <tbody id="dsbcpm" style="font-size: 12px;font-style: normal;margin-top: 10px">

                                       </tbody>
                                   </table>
                               </div>
                           </div>
                           <div class="swiper-slide"></div>
                        </div>


                       <!--左右翻页按钮-->
                       <div class="swiper-button-prev" style="display: none;"></div>
                       <div class="swiper-button-next" style="display: none"></div>
                   </div>

                   <!-- Add Pagination -->
                   <div class="swiper-pagination" style="display: none"></div>


               </div>
           </div>

       </div>

   </div>
<script>
    /*省级地图数据*/
    ProMap();
    var proTime = setInterval(function(){ProMap();}, 30000);

    /*搜索定位数据*/
    ssInput();
    ssClick();
    ssFrameYX();

    /*当日业务量*/
    drywl('山东省');
    /*当日报错量*/
    drbcl('山东省');
    // 终端信息
    zdxx();
    /*告警*/
    gj();
    /*饼图*/
    bt('山东省');
    // 地市业务量排名
    dsywpm();
    // 地市报错量排名
    dsbcpm();
    /*业务量排名*/
    ywltb('山东省');
    // 报错量排名
    bcltb('山东省');

    /*滑入滑出隐藏显示*/
    swiperBtn($('.swiper-container'));

    swiper('.swiper-container',false,3,10);
    /*时间*/
    setInterval(function(){nowTimeHtml($('#nowTime'));},1000);

    function hd(){
        $(".mio-scrollNewPar").Scroll({
            line: 1,
            speed: 500,
            timer: 2000
        });
    }

</script>
</body>
</html>
