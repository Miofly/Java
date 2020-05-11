<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String ctx =request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
%>
<!DOCTYPE html>
<head>
    <meta name=”viewport” content=”width=device-width, initial-scale=1″ />
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>山东移动省市一体化</title>
    <%@include file="common.jsp"%>
    <script type="text/javascript" src="<%=ctx%>/xrainbow/serviceAxClient.js"></script>
    <script type="text/javascript" src="<%=ctx%>/Js/comm/sys.js"></script>
    <script type="text/javascript" src="<%=ctx%>/Js/comm/md5.js"></script>
    <script type="text/javascript" src="<%=ctx%>/Js/json/json2.js"></script>
    <script type="text/javascript" src="<%=ctx%>/Js/comm/basic.js"></script>
    <link rel="stylesheet" href="../css/other/swipers.css">
    <script src="../js/ssyth/offlinemap/apiv2.0.min.js"></script>
    <script src="../js/ssyth/offlinemap/map_load.js"></script>

    <style type="text/css">
        /*整体定义*/
        body, html{width: 100%;height: 100%;overflow: hidden;margin:0;}
        /*定义背景颜色*/
        /*百度地图先隐藏*/
        #map_demo{display: none;margin-top: 105px;width: 88%;margin-left: 80px;height: 110%}
        /*百度地图与bootstrap冲突的bug.baidu-maps label{max-width: none;}*/
        /*搜索提示词的框*/
        #auto_div{border-radius: 5px;display: block;width: 320px;
            background: rgba(0,0,0,0.5);position: absolute;top: 60px;left: 0;color:white;}
        #auto_div li{padding:5px 0 5px 10px;border-bottom: 1px dashed #eee;color:white;
            font-size: 18px;background: rgba(0,0,0,0.6);}
    </style>
    <script>
        $(function () {
            $("#search_text").keyup(function (event) {
                    /*只要输入先清空上一次的列表*/
                    $('#auto_div').html('');
                    var old_value;
                    if ($("#search_text").val() != '') {
                        old_value = $("#search_text").val();
                    } else {
                        old_value = 'ddddd'
                    }

                    /*关键字查找搜索列表的数据*/
                    var sql1 = "select 'area' as area,l.lan_name,barea_name as depart_name," +
                        "null as LONGITUDE,NULL as LATITUDE,null as CITY    " +
                        "from area_info ai ,lan_info l     " +
                        "where ai.lan_id = l.lan_id  and ai.barea_name like '%" + old_value + "%'  " +
                        "union all select 'depart' as area , substr(ai.barea_name,0,3) as cityName, " +
                        "depart_name,longitude,latitude,substr(ai.barea_name,4,6) AS CITY  " +
                        "from depart_info di,area_info ai  " +
                        "where longitude not in('null','0','1','待定')  " +
                        "AND ai.sd_area_id = di.area_id and depart_name like '%" + old_value + "%'";
                    var result = queryAnyList("",sql1);

                    bdata(result);
                     
                }
            );

            $('.search-icon').click(function () {
                if ($('.search-input').val().length != 0 && $('.search-input').attr("area") == 'depart') {

                    /* $('.cityName').css('display', 'block')
					 $('.cityName').html($('.search-input').attr("city") + "数据总览");*/
                    $('#pro_map').css('display', 'none');
                    $('#city_map').css('display', 'none');
                    $('#retCity').css('display', 'block');
                    $('#retPro').css('display', 'none');
                    $('#map_demo').css('display', 'block');
                    $('#main').css('display', 'none');
                    $('.cityName').css('display', 'block');
                    var cityname = $('.search-input').attr("cityname");

                    /*当日业务量*/
                    var dsywl="select sum(t.per_value) as busicount from mn_per_busicount_currval t where t.data_time>=trunc(sysdate) " +
    "and t.kpi_code='busicount' and t.object_name like '%"+cityname+"%' ";
    var result = queryAnyList("",dsywl);
     $.each(result,function(i,data){
        var test = data["BUSICOUNT"];
        $('#drywl').html('<li>'+test+'</li>');
    });

 
 var pieChartpm = "select  t.kpi_name , sum(per_value) as per_value from bomc.mn_per_crmerrocount_currval t  where t.object_name = '"+cityname+"' and t.data_time > trunc(sysdate) and t.kpi_code in ('crmcicserro','crmiferro','crmoraerro') group by kpi_name order by  per_value desc";
   
   var piedata = [];
   var result = queryAnyList("",pieChartpm);
     $.each(result,function(i,data){
        var NAME = data["KPI_NAME"];
        var VALUE = data["PER_VALUE"];
       
       var d1={};
       d1.name=NAME;
       d1.y=VALUE;
       piedata.push(d1);
       console.log(piedata)
        pieChart($('#container3'),piedata);
    });



/*报错量*/
 var drbc="select sum(t.per_value) as crmerrocount  from mn_per_crmerrocount_currval t  where t.data_time>=trunc(sysdate) and t.kpi_code='crmerrocount' and  t.object_name =   '"+cityname+"'";
    var result = queryAnyList("",drbc);
     $.each(result,function(i,data){
        var test = data["CRMERROCOUNT"];
        $('#drbcl').html('<li>'+test+'</li>');
    });



/*业务量图表*/
  var zdzx11 = " select to_char( t.data_time,'hh24:mi:ss') as time,t.per_value as busicount from mn_per_busicount_currval t where t.data_time>=to_date(to_char(sysdate,'yyyymmdd')||'080000','yyyymmddhh24miss') and t.data_time<to_date(to_char(sysdate,'yyyymmdd')||'180000','yyyymmddhh24miss')  and t.kpi_code='busicount' and t.object_name like '%"+cityname+"%'   order by data_time";
   var ywdata = [];
   var ywtime = [];
   var result = queryAnyList("",zdzx11);
     $.each(result,function(i,data){
      var ywsdata = data['BUSICOUNT'];
      var ywstime = data['TIME'];

      
      ywstimes=ywstime.replace(/:00:00/g,"");
      ywdata.push(parseInt(ywsdata));
      ywtime.push(ywstimes);
        splineChart($('#container'),'业务量',ywtime,ywdata);
    });

/*报错量*/
var bcywltb = "   select to_char( t.data_time,'hh24:mi:ss') as time, t.per_value  as crmerrocount  from mn_per_crmerrocount_currval t  where  t.data_time>=to_date(to_char(sysdate,'yyyymmdd')||'080000','yyyymmddhh24miss')  and t.data_time<to_date(to_char(sysdate,'yyyymmdd')||'180000','yyyymmddhh24miss') and t.kpi_code='crmerrocount' and   t.object_name like '%"+cityname+"%'  order by t.data_time";
 var bcdata = [];
   var bctime = [];
   var result = queryAnyList("",bcywltb);
     $.each(result,function(i,data){
      var bcsdata = data['CRMERROCOUNT'];
      var bcstime = data['TIME'];

      bctimes=bcstime.replace(/:00:00/g,"");
      bcdata.push(parseInt(bcsdata));
      bctime.push(bctimes);

      splineChart($('#container1'),'报错量',bctime,bcdata);
    });


                    var city = $('.search-input').attr("city");
                    baiduMapData(cityname,city);

                }else if ($('.search-input').val().length != 0 && $('.search-input').attr("area") == 'area') {
                    var chart1 = echarts.init(document.getElementById('city_map'));
                    // if(chart1!=null&&chart1!=''&&chart1!=undefined){
                    chart1.dispose();
                    $('.cityName').css('display', 'none');
                    $('#map_demo').css('display', 'none');
                    $('#pro_map').css('display', 'none');
                    $('#city_map').css('display', 'block');
                    $('#main').css('display','block');
                    $('#retPro').css('display', 'block');
                    $('#retCity').css('display', 'none');
                    

                    var cname = $('.search-input').attr("cityname");

                    mapShow(cname,'city_map');

                }
            })


            $("#search_text").focus(function () {

                console.log($('#auto_div li').length)
                if($('#auto_div li').length==0){
                    $('#auto_div').css('border','none')
                }else{
                    $('#auto_div').show()
                }

            });
            $(window).resize(function () {          //当浏览器大小变化时
                /* alert($(window).height());          //浏览器时下窗口可视区域高度
				 alert($(document).height());        //浏览器时下窗口文档的高度
				 alert($(document.body).height());   //浏览器时下窗口文档body的高度
				 alert($(document.body).outerHeight(true)); //浏览器时下窗口文档body的总高度 包括border padding margin*/
                // window.location.reload();

            });
        })
    </script>
<script>

            
           
    var proSql = "select lan_name,x,y,dist_sroce from lan_info li,alarm_dist ad " +
        "where li.lan_id_sd = ad.in_id_sd";
    /*省级地图数据*/
    var result = queryAnyList("",proSql);
    successFun(result)
    /*省级地图*/
    function successFun(result){
        //echarts地图省市级别定义
        $.get('../js/ssyth/json/sd.json', function (mapJson) {
            //注册可用的地图
            echarts.registerMap('shandong', mapJson);

            //在id为mainMap的dom元素中显示地图
            var chartPro = echarts.init(document.getElementById('pro_map'));

            /*定义一串数组*/
            var ssyth_name =[]; var ssyth_mapx =[];
            var ssyth_mapy =[]; var ssyth_mapscore =[];
            /*取出数组里数据*/
            $.each(result,function(i,data){
                var NAME = data["LAN_NAME"];var MAPX = data["X"];
                var MAPY = data["Y"];var MAPSCORE = data["DIST_SROCE"];
                ssyth_name.push(NAME);ssyth_mapx.push(MAPX);
                ssyth_mapy.push(MAPY);ssyth_mapscore.push(MAPSCORE);
            });

            /*定义echarts地图数据格式*/
            var proData=[];
            for(i=0;i<ssyth_name.length;i++){
                proData.push(
                    {
                        name:ssyth_name[i],
                        value:[ssyth_mapx[i],ssyth_mapy[i],ssyth_mapscore[i]]
                    }
                )
            }

            /*省级图表定义*/
            mapOpt(null,proData,'shandong','rgba(0,0,0,0.3)');

            /*定义图表，数据重新载入*/
            chartPro.setOption(option,true);

            /*点击市，进入市的详细地图*/
            chartPro.on('click', function (result) {
                /*17地市名称*/
                selectCity = result.name;
                $('#pro_map').css('display','none');/*隐藏省级*/
                $('#city_map').css('display','block');/*显示市级*/
                $('#retPro').css('display','block');/*返回按钮*/
                /*市级地图显示echarts*/
                mapShow(selectCity,'city_map');
            });


        });
    }

    /*搜索列表的设置*/
    function bdata(result) {

        var depart1 = [];
        var longitude1 = [];
        var latitude1 = [];
        var area = [];
        var lanName = [];

        $.each(result, function (i, dataBean) {
            var DEPART = dataBean["DEPART_NAME"];
            var LONGITUDE = dataBean["LONGITUDE"];
            var LATITUDE = dataBean["LATITUDE"];


            depart1.push(DEPART);
            longitude1.push(LONGITUDE);
            latitude1.push(LATITUDE);
            //搜索框中列表的信息
            $('#auto_div').append('<li city="' + dataBean.CITY + '" area="' + dataBean.AREA + '" ' +
                'cityname="' + dataBean.LAN_NAME + '" ' +
                'class="listli" x="' + dataBean.LONGITUDE + '" y="' + dataBean.LATITUDE + '">' + dataBean.DEPART_NAME + '</li>')
        });


        $("#auto_div").slideDown(300);//只要输入就显示列表框

        /*添加滚动条及高度*/
        if ($('#auto_div li').length > 21) {
            $('#auto_div').css('overflow-y', 'scroll');
            $('#auto_div').height(525);
        } else if($('#auto_div li').length < 5) {
           $('#auto_div').css('overflow-y', 'hidden');
            $('#auto_div').css('overflow', 'hidden');
            $('#auto_div').height(0);
            $('#auto_div').height($('#auto_div li').length * 30)
        }
        else {
            $('#auto_div').css('overflow-y', 'hidden');
            $('#auto_div').css('overflow', 'hidden');
            $('#auto_div').height(0);
            $('#auto_div').height(($('#auto_div li').length+5) * 30)
        }

        //模糊匹配，将所有匹配项显示
        for (var i = 0; i < $(".listli").length; i++) {
            if ($(".listli").eq(i).text().indexOf($("#search_text").val()) >= 0) {
                $(".listli").eq(i).css('display', 'block');
            }
        }

        //点击获取所需参数，数据加载到输入框
        $(".listli").click(function () {
            $("#search_text").val($(this).text());
            $("#search_text").attr("x", $(this).attr("x"));
            $("#search_text").attr("y", $(this).attr("y"));
            $("#search_text").attr("cityname", $(this).attr("cityname"));
            $("#search_text").attr("area", $(this).attr("area"));
            $("#search_text").attr("city", $(this).attr("city"));

        });

        $('body').click(function (e) {
            var target = $(e.target);
            if(!target.is('#search_text')){
                if($('#auto_div').is(':visible')){
                    $('#auto_div').css('display', 'none');
                }
            }

        })

        $(".listli").hover(function () {
            $(this).css('background-color', 'white').css('color', 'black');
        }, function () {
            $(this).css('background-color', 'rgba(0,0,0,0.5)').css('color', 'white');
        });
    }
    /*返回省级地图*/
    function goBackProeMap(){

        $('#pro_map').css('display','block');
        $('#city_map').css('display','none');
        $('#retPro').css('display','none');


 var pieChartpm = "select  t.kpi_name , sum(per_value) as per_value from bomc.mn_per_crmerrocount_currval t  where t.object_name = '山东省' and t.data_time > trunc(sysdate) and t.kpi_code in ('crmcicserro','crmiferro','crmoraerro') group by kpi_name order by  per_value desc";
   
   var piedata = [];
   var result = queryAnyList("",pieChartpm);
     $.each(result,function(i,data){
        var NAME = data["KPI_NAME"];
        var VALUE = data["PER_VALUE"];
       
       var d1={};
       d1.name=NAME;
       d1.y=VALUE;
       piedata.push(d1);
       console.log(piedata)
        pieChart($('#container3'),piedata);
    });


/*业务量图表*/
  var zdzx11 = " select to_char( t.data_time,'hh24:mi:ss') as time,t.per_value as busicount from mn_per_busicount_currval t where t.data_time>=to_date(to_char(sysdate,'yyyymmdd')||'080000','yyyymmddhh24miss') and t.data_time<to_date(to_char(sysdate,'yyyymmdd')||'180000','yyyymmddhh24miss')  and t.kpi_code='busicount' and t.object_code =   'SD|bsacHal'  order by data_time";
   var ywdata = [];
   var ywtime = [];
   var result = queryAnyList("",zdzx11);
     $.each(result,function(i,data){
      var ywsdata = data['BUSICOUNT'];
      var ywstime = data['TIME'];

      
      ywstimes=ywstime.replace(/:00:00/g,"");
      ywdata.push(parseInt(ywsdata));
      ywtime.push(ywstimes);
        splineChart($('#container'),'业务量',ywtime,ywdata);
    });

/*报错量*/
var bcywltb = "   select to_char( t.data_time,'hh24:mi:ss') as time, t.per_value  as crmerrocount  from mn_per_crmerrocount_currval t  where  t.data_time>=to_date(to_char(sysdate,'yyyymmdd')||'080000','yyyymmddhh24miss')  and t.data_time<to_date(to_char(sysdate,'yyyymmdd')||'180000','yyyymmddhh24miss') and t.kpi_code='crmerrocount' and  t.object_code =   'SD'  order by t.data_time";
 var bcdata = [];
   var bctime = [];
   var result = queryAnyList("",bcywltb);
     $.each(result,function(i,data){
      var bcsdata = data['CRMERROCOUNT'];
      var bcstime = data['TIME'];

      bctimes=bcstime.replace(/:00:00/g,"");
      bcdata.push(parseInt(bcsdata));
      bctime.push(bctimes);

      splineChart($('#container1'),'报错量',bctime,bcdata);
    });

        /*当日业务量*/
var dry="select sum(t.per_value) as busicount  from mn_per_busicount_currval t  where t.data_time>=trunc(sysdate) and t.kpi_code='busicount' and  t.object_code =   'SD|bsacHal'";
    var result = queryAnyList("",dry);
     $.each(result,function(i,data){
        var test = data["BUSICOUNT"];
        $('#drywl').html('<li>'+test+'</li>');

/*报错量*/
 var drbc="select sum(t.per_value) as crmerrocount  from mn_per_crmerrocount_currval t  where t.data_time>=trunc(sysdate) and t.kpi_code='crmerrocount' and  t.object_code =   'SD'";
    var result = queryAnyList("",drbc);
     $.each(result,function(i,data){
        var test = data["CRMERROCOUNT"];
        $('#drbcl').html('<li>'+test+'</li>');
    });


        /*终端在线数量*/
var zdzx = "select  sum(decode(t.is_status,1,1,0)) as oll, count(1) as zl,  round(sum(decode(t.is_status,1,1,0))/count(1)*100) as onlineper  from stable_terminal_info t inner join depart_info dp on t.office_id=dp.depart_id and dp.status=1 inner join area_info ai on dp.area_id=ai.sd_area_id inner join lan_info l on ai.lan_id=l.lan_id where 1=1";

   var result = queryAnyList("",zdzx);
     $.each(result,function(i,data){
        var test = data["OLL"];
        $('#zdzx').html('<li>'+test+'</li>');
    });
    });




    }
    /*返回市级地图*/
    function goBackCityMap(){
        $('#retPro').css('display','block');
        $('#pro_map').css('display','none');
        $('#city_map').css('display','block');
        $('#retCity').css('display','none');
        $('#map_demo').css('display','none');
        $('#main').css('display','block');
        // console.log($('.cityName').attr("city"));
        mapShow($('.cityName').attr("city"),'city_map');
        $('.cityName').html('');
    }
    /*销毁地图*/
    function disposeChart(){
        var chart = echarts.init(document.getElementById('city_map'));
        if(chart!=null&&chart!=''&&chart!=undefined){
            chart.dispose();
        }
    }


    </script>
</head>
<body>

   <div style="width: 100%;height: 100%;
   background: url(../images/ssybg.jpg) repeat-x;background-size: 100% 100%;">

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

                      <%-- <div style="
                       background-image: linear-gradient(to top, rgba(0,0,0,0.1) 0%, rgba(0,0,0,0.7) 100%);
                       width: 280px;height: 230px;position: fixed;top:280px;left:20px"></div>--%>
                       <div style="margin-top: 5%">
                           <h4 class="mio-mp" style="color:white" id="zdzx"></h4>
                           <em class="mio-whiteText mio-mp" style="font-size: 10px">终端在线数量</em>
                       </div>
                   </div>
                   <%--告警信息--%>
                   <div class="mio-scrollNewPar"  style="margin-top: 10%;height: 50.5%;
                        overflow: hidden;color:white">
                       <ul class="mio-scrollNews" style="font-size: 10px;"></ul>
                   </div>
               </div>
           </div>

           <%--地图--%>
           <div style="width: 60%;height: 73%;float: left;margin-left: -45px;margin-top: -45px">
               <div class="search-wrapper" style="transform: scale(0.7);z-index: 1000;margin-top: -47px;margin-left: -403px">
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
                   <div id="container" style="width: 100%;height: 49%;margin-left: -20px"></div>
                   <div id="container1" style="width: 100%;height: 49%;margin-left: -20px;margin-top: 2%"></div>
               </div>
           </div>

       </div>

    
       <%--底部--%>
       <div style="width: 100%;height: 27%;background: rgba(0,0,0,0.7)">
           <%--左侧--%>
           <div style="float: left;width: 21.9%;height: 100%">
               <div style="margin-bottom: 20px">
                   <img src=../images/zgyd.png alt=""style="float: left;width: 20%;height: 20%;margin-top: 5%;margin-left: 5%">
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
                                       <tbody id="ywlpmds" style="font-size: 12px;font-style: normal;margin-top: 10px">
                                           
                                           
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
                                       <tbody id="dshypm" style="font-size: 12px;font-style: normal;margin-top: 10px">
                                      
                                       </tbody>
                                   </table>
                               </div>
                           </div>

                         
                       </div>

                       <!-- Add Pagination -->
                       <div class="swiper-pagination" style="display: none"></div>
                       <!--左右翻页按钮-->
                       <div class="swiper-button-prev" style="display: none;"></div>
                       <div class="swiper-button-next" style="display: none"></div>
                   </div>
               </div>

           </div>

       </div>

   </div>
<script>

    
    var dry="select sum(t.per_value) as busicount  " +
        "from mn_per_busicount_currval t  where t.data_time>=trunc(sysdate) " +
        "and t.kpi_code='busicount' and  t.object_code =   'SD|bsacHal'";
    var result = queryAnyList("",dry);
     $.each(result,function(i,data){
        var test = data["BUSICOUNT"];
        $('#drywl').html('<li>'+test+'</li>');
    });

/*报错量*/
 var drbc="select sum(t.per_value) as crmerrocount  from mn_per_crmerrocount_currval t  where t.data_time>=trunc(sysdate) and t.kpi_code='crmerrocount' and  t.object_code =   'SD'";
    var result = queryAnyList("",drbc);
     $.each(result,function(i,data){
        var test = data["CRMERROCOUNT"];
        $('#drbcl').html('<li>'+test+'</li>');
    });


/*终端在线数量*/
var zdzx = "select  sum(decode(t.is_status,1,1,0)) as oll, count(1) as zl, " +
    " round(sum(decode(t.is_status,1,1,0))/count(1)*100) as onlineper " +
    " from stable_terminal_info t inner join depart_info dp " +
    "on t.office_id=dp.depart_id and dp.status=1 inner join area_info ai on " +
    "dp.area_id=ai.sd_area_id inner join lan_info l on ai.lan_id=l.lan_id where 1=1";

   var result = queryAnyList("",zdzx);
     $.each(result,function(i,data){
        var test = data["OLL"];
        $('#zdzx').html('<li>'+test+'</li>');
    });


/*业务量图表*/
  var zdzx11 = " select to_char( t.data_time,'hh24:mi:ss') as time,t.per_value as busicount from mn_per_busicount_currval t where t.data_time>=to_date(to_char(sysdate,'yyyymmdd')||'080000','yyyymmddhh24miss') and t.data_time<to_date(to_char(sysdate,'yyyymmdd')||'180000','yyyymmddhh24miss')  and t.kpi_code='busicount' and t.object_code =   'SD|bsacHal'  order by data_time";
   var ywdata = [];
   var ywtime = [];
   var result = queryAnyList("",zdzx11);
     $.each(result,function(i,data){
      var ywsdata = data['BUSICOUNT'];
      var ywstime = data['TIME'];

      
      ywstimes=ywstime.replace(/:00:00/g,"");
      ywdata.push(parseInt(ywsdata));
      ywtime.push(ywstimes);
        splineChart($('#container'),'业务量',ywtime,ywdata);
    });

/*报错量*/
var bcywltb = "   select to_char( t.data_time,'hh24:mi:ss') as time, t.per_value  as crmerrocount  from mn_per_crmerrocount_currval t  where  t.data_time>=to_date(to_char(sysdate,'yyyymmdd')||'080000','yyyymmddhh24miss')  and t.data_time<to_date(to_char(sysdate,'yyyymmdd')||'180000','yyyymmddhh24miss') and t.kpi_code='crmerrocount' and  t.object_code =   'SD'  order by t.data_time";
 var bcdata = [];
   var bctime = [];
   var result = queryAnyList("",bcywltb);
     $.each(result,function(i,data){
      var bcsdata = data['CRMERROCOUNT'];
      var bcstime = data['TIME'];

      bctimes=bcstime.replace(/:00:00/g,"");
      bcdata.push(parseInt(bcsdata));
      bctime.push(bctimes);

      splineChart($('#container1'),'报错量',bctime,bcdata);
    });

 
    swiperBtn($('.swiper-container'));
    swiper('.swiper-container',false,3,10);
    var gjsql = "SELECT DEPART_NAME FROM DEPART_INFO where rownum<=30";
    var ssyth_name =[];
    var result = queryAnyList("",gjsql);
    
    $.each(result,function(i,data){
        var test = data["DEPART_NAME"];
        $('.mio-scrollNews').append('<li>'+test+'</li>');
    });

   
   /*地市业务量排名*/
   var ywlpm = "select temp.* from ( select t.object_name ,sum(per_value) as per_value from bomc.mn_per_crmerrocount_currval t where t.object_code like 'SD._%' and t.data_time > trunc(sysdate) and t.kpi_code='crmerrocount' group by t.object_name order by  per_value desc)temp where rownum<7";

   var result = queryAnyList("",ywlpm);
     $.each(result,function(i,data){
        var NAME = data["OBJECT_NAME"];
        var VALUE = data["PER_VALUE"];
        $('#ywlpmds').append('<tr><td>'+NAME+'</td><td>'+VALUE+'</td></tr>');
    });

   /*地市报错量排名*/
var dsbclpm = "select temp.* from ( select 　t.object_name ,　sum(per_value) as per_value　from bomc.mn_per_crmerrocount_currval t 　where t.object_name like '%市' 　and t.created_time >= sysdate -1/24/6　and t.kpi_code in ('crmerrocount')　group by object_name order by  per_value desc)temp where rownum<7";
var result = queryAnyList("",dsbclpm);
     $.each(result,function(i,data){
        var NAME = data["OBJECT_NAME"];
        var VALUE = data["PER_VALUE"];
        $('#dshypm').append('<tr><td>'+NAME+'</td><td>'+VALUE+'</td></tr>');
    });

  
  /*饼图*/
     var pieChartpm = "select  t.kpi_name , sum(per_value) as per_value from bomc.mn_per_crmerrocount_currval t  where t.object_name = '山东省' and t.data_time > trunc(sysdate) and t.kpi_code in ('crmcicserro','crmiferro','crmoraerro') group by kpi_name order by  per_value desc";
   
   var piedata = [];
   var result = queryAnyList("",pieChartpm);
     $.each(result,function(i,data){
        var NAME = data["KPI_NAME"];
        var VALUE = data["PER_VALUE"];
       
       var d1={};
       d1.name=NAME+"["+VALUE+"]";
       d1.y=VALUE;
       piedata.push(d1);
       console.log(piedata)
        pieChart($('#container3'),piedata);
    });


    setInterval(function(){nowTimeHtml($('#nowTime'));},1000);

    // winResize();
</script>

</body>
</html>
