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

    <!-- libraries -->
    <link href="${basePath}css/detail/lib/jquery-ui-1.10.2.custom.css" rel="stylesheet" type="text/css" />
    <link href="${basePath}css/detail/lib/font-awesome.css" type="text/css" rel="stylesheet" />

    <!-- global styles -->
    <link rel="stylesheet" type="text/css" href="${basePath}css/detail/layout.css" />
    <link rel="stylesheet" type="text/css" href="${basePath}css/detail/elements.css" />
    <link rel="stylesheet" type="text/css" href="${basePath}css/detail/icons.css" />

    <!-- this page specific styles -->
    <link rel="stylesheet" href="${basePath}css/detail/compiled/index.css" type="text/css" media="screen" />

    <style>
        /*内容区margin-top*/
   /*     #pad-wrapper{margin-top: 20px}
        .content{min-height: 500px!important;height: 590px;margin-bottom:0px;padding-bottom:0}
        .mini-panel-header{height: 10px}
        .pull-right {margin-right: 20%}*/
    </style>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" /></head>
<body>

<!-- 要显示的区域 -->
<div id="header"></div>

<div id="left"></div>



	<!-- main container -->
    <div class="content">

        <div class="container-fluid">

            <!-- upper main stats -->
            <div id="main-stats">
                <div class="row-fluid stats-row">
                    <div class="span3 stat">
                        <div class="data">
                            <span class="number">2457</span>
                            visits
                        </div>
                        <span class="date">Today</span>
                    </div>
                    <div class="span3 stat">
                        <div class="data">
                            <span class="number">3240</span>
                            users
                        </div>
                        <span class="date">February 2014</span>
                    </div>
                    <div class="span3 stat">
                        <div class="data">
                            <span class="number">322</span>
                            orders
                        </div>
                        <span class="date">This week</span>
                    </div>
                    <div class="span3 stat last">
                        <div class="data">
                            <span class="number">$2,340</span>
                            sales
                        </div>
                        <span class="date">last 30 days</span>
                    </div>
                </div>
            </div>

            <div id="pad-wrapper">
                <div class="row-fluid chart">
                    <h4>
                        Statistics

                        <div class="btn-group pull-right">
                            <input style="margin: 1px 10px 0 0px;height: 25px!important;" type="text" id="mio-dateRange" class="mio-date" placeholder="请选择时间范围">

                            <button class="glow left active">DAY</button>
                            <button class="glow middle ">WEEK</button>
                            <button class="glow right">MONTH</button>
                        </div>
                    </h4>
                    <br>
                    <div class="span12">
                        <div id="container" style="width: 80%;height: 90%;background: white"></div>
                    </div>
                </div>

                <ul style="background: black;color: white;width: 18%;height: 90%;float: right;
                margin-top: -400px" class="mio-login-frame">
                    <li>dasdasda</li>
                    <li>213123123</li>
                    <li>123123123</li>
                </ul>
            </div>
        </div>
    </div>


<%@include file="detailCm.jsp"%>
<script>
    laydateChoice('#mio-dateRange','datetime',true);


    $('#container').highcharts({
        chart: {
            type: 'spline',
            // backgroundColor: 'rgba(0,0,0,0.7)',
            backgroundColor: 'white',style:{color: 'red',fontSize: '16px'}
            // plotBackgroundImage: '/images/ssybg.jpg'/*绘图区域背景图片*/
        },
        title: {
            text: null
            /*  text:'业务量数量',align:'center',floating:false,/!*是否浮动，设置浮动后，标题将不占用图表区位置*!/
              margin:-30,/!*标题和图表区的间隔，当有副标题时，表示标题和副标题之间的间隔*!/
              style:{color: 'red',fontSize: '16px'},x:100,y:20/!*相对于水平、垂直对齐的偏移量*!/*/
        },
        /*  subtitle: {
             text: 'Source: WorldClimate.com'
         },*/
        xAxis: {
            title:{text:null},
            // crosshair: true,/*十字准心线*/
            lineColor: 'transparent',/*轴线颜色*/
            /*alternateGridColor: '#FDFFD5',/!*隔行变色*!/*/
            categories: ['8', '9', '10', '11', '12', '13',
                '14', '15', '16', '17', '18'],
            labels: {
                step: 1,/*间隔刻度*/
                style: {
                    color: 'rgb(110, 130, 155)'/*坐标轴文字颜色*/
                }
            },
            /*刻度线颜色*/tickColor:'transparent',
            visible: true/*是否显示坐标轴*/
        },
        yAxis: {

            title:{text:null},crosshair: true,
            gridLineColor:'tarnsparent',
            /*网格线颜色*//*gridLineColor:'red',*/
            /*虚线*//*gridLineDashStyle: 'longdash',*/
            labels: {
                step:1,/*显示间隔*/
                style: {
                    color: 'rgb(110, 130, 155)'/*坐标轴文字颜色*/
                },
                formatter: function () {
                    return this.value + 'k';
                }
            },
            offset: -10,/*文字偏移*/
            visible: true/*是否显示坐标轴*/
            /*
             minorGridLineColor: '#C5EEFA',/!*次网格线的颜色*!/
             minorGridLineDashStyle: 'longdash',/!*次级网格线的风格为长破折号*!/
             minorTickInterval: 'auto',/!*次网格*!/
            */
            /*设置黑色的Y轴次级刻度线
             minorGridLineWidth: 0,
             minorTickInterval: 'auto',
             minorTickColor: '#ffffff',
             minorTickWidth: 1
            */
        },
        tooltip: {
            crosshairs: true,
            shared: true
        },
        plotOptions: {
            // spline: {
            /*  marker: {
                  radius: 4,
                  lineColor: 'white',
                  lineWidth: 1
              }*/
            // },
            /*series: {color: '#FF0000',}*//*统一线条颜色*/

        },
        series: [
            /* {
                 name: 'Tokyo',
                 marker: {
                     symbol: 'square'
                 },
                 color:'rgba(255,255,255,0.7)',/!*线条颜色*!/
                 dashStyle: 'longdash',/!*线条样式*!/
                 data: [7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2, 23.3, 18.3, 13.9, 9.6]

             },*/
            {
                name: 'name',cursor:'pointer',/*变换手势*/
                marker: {
                    symbol: 'diamond'
                },
                // enableMouseTracking: true,
                color:'black',/*线条颜色*/
                dashStyle: 'Solid',/*线条样式Solid
                ShortDash   ShortDot  ShortDashDot  ShortDashDotDot Dot Dash
                LongDash    DashDot LongDashDot LongDashDotDo*/
                data: [3.9, 4.2, 5.7, 8123.5, 1124.9, 11231.2, 5.230, 11232.6, 21314.2, 11230.3, 6123.6, 4.8]
            },
            {
                name: 'name1',cursor:'pointer',/*变换手势*/
                marker: {
                    symbol: 'diamond'
                },
                // enableMouseTracking: true,
                color:'black',/*线条颜色*/
                dashStyle: 'Solid',/*线条样式Solid
                ShortDash   ShortDot  ShortDashDot  ShortDashDotDot Dot Dash
                LongDash    DashDot LongDashDot LongDashDotDo*/
                data: [3.9213, 4123.2, 5213.7, 8123.5, 1124.9, 11.2, 5.0, 12.6, 14.2, 10.3, 6.6, 4.8]
            }
        ],
        /*关闭图例series的name*/
        legend: {enabled: true,
            itemHiddenStyle: {color: 'lightblue'},/*图例隐藏时颜色*/
            itemStyle: {color: 'rgb(110, 130, 155)',fontWeight: 'bold'},/*图例基本样式*/
            itemHoverStyle: {color: 'rgb(110, 130, 155)'},/*图例滑入时样式*/
            // floating: true,x: 90,y: 60,
        },
        /*是否显示版权信息*/credits: {enabled: false},
        /*导出功能模块*/exporting: {enabled: false},
    });

</script>
</body>
</html>