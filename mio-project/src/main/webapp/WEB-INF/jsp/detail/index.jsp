<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html class="login-bg">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>软件详情</title>
    <%@include file="../common.jsp" %>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>

    <!-- bootstrap -->
    <link href="${basePath}css/detail/bootstrap/bootstrap.css" rel="stylesheet"/>
    <link href="${basePath}css/detail/bootstrap/bootstrap-responsive.css" rel="stylesheet"/>
    <link href="${basePath}css/detail/bootstrap/bootstrap-overrides.css" type="text/css" rel="stylesheet"/>

    <!-- libraries -->
    <link href="${basePath}css/detail/lib/jquery-ui-1.10.2.custom.css" rel="stylesheet" type="text/css"/>
    <link href="${basePath}css/detail/lib/font-awesome.css" type="text/css" rel="stylesheet"/>

    <!-- global styles -->
    <link rel="stylesheet" type="text/css" href="${basePath}css/detail/layout.css"/>
    <link rel="stylesheet" type="text/css" href="${basePath}css/detail/elements.css"/>
    <link rel="stylesheet" type="text/css" href="${basePath}css/detail/icons.css"/>

    <!-- this page specific styles -->
    <link rel="stylesheet" href="${basePath}css/detail/compiled/index.css" type="text/css" media="screen"/>

    <style>
        /*内容区margin-top*/
        /*#pad-wrapper{margin-top: 20px}*/
        /*.content{height: 430px;}*/
        /*.content{min-height: 500px!important;height: 540px;margin-bottom:0px;padding-bottom:0}*/
        /*.mini-panel-header{height: 10px}*/
        /*.pull-right {margin-right: 20%}*/
        .content {
            min-height: 410px !important;
            height: 590px;
            margin-bottom: 0px;
            padding-bottom: 0;
            margin-left: 150px
        }

        #pad-wrapper {
            margin-top: 20px;
            padding: 0 0 !important;
        }

        #main-stats {
            height: 70px
        }

        .disabled {
            pointer-events: none;
        }

        .pull-right .glow:hover {
            color: black !important;
        }

        #main-stats .stat {
            border-right: 2px solid #ddd;
            padding: 30px 0px 0px 0px;
            box-shadow: 0px 0px 0px 0px transparent
        }

        #main-stats .stat .data .number {
            font-size: 22px
        }

        #main-stats .stat .data {
            font-size: 15px
        }

        #sidebar-nav {
            width: 160px
        }

        #dashboard-menu .pointer {
            right: 16px
        }

        /*文字居中*/
        .chosen-container-single .chosen-single span {
            text-align: center;
            margin-top: 1px;
        }

        /*select框边框与圆角*/
        .chosen-container {
            border-radius: 5px;
            margin-right: 6px
        }

        /*select框高度*/
        .chosen-container-single .chosen-single {
            border: 1px solid #d2d2d2;
            color: rgb(85, 85, 85);
            height: 24px;
            background: white;
            border-radius: 5px;
            padding: 0
        }

        /*文字位置*/
        .chosen-container-single .chosen-single span {
            line-height: 24px;
            margin-right: 0
        }

        /*阴影*/
        .chosen-container {
            box-shadow: 0px 0px 0px transparent;
            left: -1px
        }

        /*箭头位置*/
        .chosen-container-single .chosen-single div b {
            background: transparent
        }

        /*箭头位置*/
        .chosen-container-active.chosen-with-drop .chosen-single div b {
            background-position: -16px 8px;
        }

        /*select框颜色*/
        .chosen-container-active.chosen-with-drop .chosen-single {
            background: white
        }

        /*x的位置*/
        .chosen-container-single .chosen-single abbr {
            top: 13px
        }

        /*option划过时颜色*/
        /*.chosen-container .chosen-results li.highlighted{background: rgba(0,0,255,0.5)}*/
        /*.chosen-drop{height: 390px}*/
        .chosen-container .chosen-results {
            max-height: 400px !important;
            margin: 0 0px 0px 0;
            padding-left: 0;
            border: 1px solid #ddd;
            border-bottom: none
        }

        .chosen-whth-drop {
            border: 1px solid #000 !important;
        }

        .chosen-container .chosen-results li {
            padding: 3px 0;
            text-align: center;
        }

        /*.result-selected{background: rgb(59, 159, 243);color: white}*/
        .chosen-container .chosen-results li:hover {
            background: rgb(59, 159, 243)
        }

    </style>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
</head>
<body>

<!-- 要显示的区域 -->
<div id="header"></div>

<div id="left"></div>


<!-- main container -->
<div class="content">

    <div class="container-fluid" style="padding-right: 0;padding-left: 0">

        <!-- upper main stats -->
        <div id="main-stats">
            <div class="row-fluid stats-row" id="rjxxlb" style="margin-left: 20px;">

            </div>
        </div>
        <div style="height: 12px;background: #ddd"></div>
        <div id="pad-wrapper" style="">
            <div class="row-fluid chart">
                <h4>
                        <span style="font-size: 20px;font-family:'Open Sans', sans-serif;position: relative;
                        font-style: normal;font-weight: 600;margin-left: 30px;color:rgb(41, 50, 58);
                        ">Intranet Software Install<span
                                style="font-size: 14px;position: absolute;top:5px;width: 100px;margin-left: 5px"> &nbsp;&nbsp;&nbsp;下载趋势</span> </span>

                    <%--下载量--%>
                    <div class="btn-group pull-right" style="margin-top: -4px;font-style: normal">
                        <select id="dsType" class="selectBox" style="width: 100px;margin-bottom: 10px!important;
                            height: 23px;margin-right: 10px" data-placeholder="Select Your Options">
                            <option value="">全省</option>

                        </select>

                        <select id="rjType" class="selectBox"
                                style="width: 100px;margin-bottom: 20px!important;box-shadow: none;"
                                data-placeholder="Select Your Options">
                            <option value="">全部软件</option>
                        </select>


                        <input style="z-index: 999999;width: 157px;margin: 0px 6px 0 0px;border: 1px solid #d2d2d2;
                            height: 16px!important;line-height: 18px;" type="text" id="mio-dateRange" class="mio-date"
                               placeholder="请选择时间范围">
                        <a id="searchTime" class="addrow btn-flat primary new-product"
                           style="height: 18px;line-height: 17px;padding: 3px 15px;margin-top: 1px;margin-right: 5px">
                            查询 </a>
                        <a id="export" class="addrow btn-flat primary new-product"
                           style="height: 18px;line-height: 17px;padding: 3px 15px;margin-top: 1px;margin-right: 5px">
                            导出 </a>
                        <%--<button id="timeToday" class="glow left ">本日</button>
                        <button id="timeWeek" class="glow middle active">本周</button>
                        <button id="timeMonth" class="glow right active">本月</button>--%>
                    </div>
                </h4>
                <div style="height: 2px;width: 99%;background: #ddd;margin: 20px auto 0px;margin-bottom: 20px"></div>
                <div class="span12">
                    <div id="container" style="float: left;width: 71%;height: 385px;background: white;"></div>
                    <div style="width: 2px;height:360px;float: left;background: #ddd;
                        margin-top: 0px;margin-left: 25px;margin-right: 25px"></div>

                    <div style="float: left;width: 250px;height: 400px;margin-right: 20px">
                            <span style="font-size: 16px;font-family:'Open Sans', sans-serif;display: block;font-style: normal;
                                font-weight: 600;margin-left:6px;margin-top: 0px;color:rgb(41, 50, 58);
                             ">下载排行TOP10</span>
                        <div style="height: 2px;width: 96%;background: #ddd;margin: 18px 0px 8px 8px;"></div>
                        <div id="container1" style="margin-left: 0px;height: 330px;"></div>
                    </div>

                </div>
            </div>


        </div>
    </div>
</div>


<%@include file="detailCm.jsp" %>
<script>
    /*select框*/
    selectChosen($('.selectBox'));
    $("#dsType").change(function () {
        console.log($("#dsType").val());
    });


    $('#export').click(function () {
        var bt = $('#mio-dateRange').val().slice(0, 10);
        var et = $('#mio-dateRange').val().slice(13, 23) + ' 23:59:59';
        ajaxPostPre('${basePath}sts/export', exportCk, {
            beginTime: bt,
            endTime: et,
            region: $('#dsType').val(),
            tabName: $('#rjType').val()
        })
    })

    function exportCk(data) {
        console.log(data);
        // hrefPage(data.resultInfo.message)
    }

    var chart = null;
    var chart1 = null;

    /*select框*/
    selectChosen($('.selectBox'));


    noItself('#mio-dateRange', ck);

    function ck() {
        $('#mio-dateRange').blur();
    }

    laydateChoice('#mio-dateRange', 'date', '~', false);

    $('#searchTime').click(function () {
        if ($('#mio-dateRange').val() != '' && $('#mio-dateRange').val() != null) {
            var bt = $('#mio-dateRange').val().slice(0, 10);
            var et = $('#mio-dateRange').val().slice(13, 23) + ' 23:59:59';
            if ($('#dsType').val() != '' && $('#rjType').val() != '') {
                ajaxPostPre('${basePath}sts/down', downCk, {
                    beginTime: bt,
                    endTime: et,
                    region: $('#dsType').val(),
                    tabName: $('#rjType').val()
                });
                if (bt.slice(0, 10) != et.slice(0, 10)) {
                    qst('${basePath}sts/qst', {
                        beginTime: bt,
                        endTime: et,
                        region: $('#dsType').val(),
                        tabName: $('#rjType').val()
                    }, false, -45);
                } else {
                    qst('${basePath}sts/qst', {
                        beginTime: bt,
                        endTime: et,
                        region: $('#dsType').val(),
                        tabName: $('#rjType').val()
                    }, true, 0);
                }
                rank('${basePath}sts/ranks', {
                    beginTime: bt,
                    endTime: et,
                    region: $('#dsType').val(),
                    tabName: $('#rjType').val()
                });
            }
            if ($('#dsType').val() != '' && $('#rjType').val() == '') {
                ajaxPostPre('${basePath}sts/down', downCk, {beginTime: bt, endTime: et, region: $('#dsType').val()});
                if (bt.slice(0, 10) != et.slice(0, 10)) {
                    qst('${basePath}sts/qst', {beginTime: bt, endTime: et, region: $('#dsType').val()}, false, -45);
                } else {
                    qst('${basePath}sts/qst', {beginTime: bt, endTime: et, region: $('#dsType').val()}, true, 0);
                }
                rank('${basePath}sts/ranks', {beginTime: bt, endTime: et, region: $('#dsType').val()});
            }
            if ($('#dsType').val() == '' && $('#rjType').val() != '') {
                ajaxPostPre('${basePath}sts/down', downCk, {beginTime: bt, endTime: et, tabName: $('#rjType').val()});
                if (bt.slice(0, 10) != et.slice(0, 10)) {
                    qst('${basePath}sts/qst', {beginTime: bt, endTime: et, tabName: $('#rjType').val()}, false, -45);
                } else {
                    qst('${basePath}sts/qst', {beginTime: bt, endTime: et, tabName: $('#rjType').val()}, true, 0);
                }
                rank('${basePath}sts/ranks', {beginTime: bt, endTime: et, tabName: $('#rjType').val()});
            }
            if ($('#dsType').val() == '' && $('#rjType').val() == '') {
                ajaxPostPre('${basePath}sts/down?beginTime=' + bt + '&endTime=' + et + '', downCk);
                if (bt.slice(0, 10) != et.slice(0, 10)) {

                    qst('${basePath}sts/qst?beginTime=' + bt + '&endTime=' + et + '', '', false, -45);
                } else {

                    qst('${basePath}sts/qst?beginTime=' + bt + '&endTime=' + et + '', '', true, 0);
                }
                rank('${basePath}sts/ranks?beginTime=' + bt + '&endTime=' + et + '');
            }
        }

    })
    $('#mio-dateRange').val(timeUtils(0, new Date().getDate() - 30) + ' ~ ' + timeUtils(0, new Date().getDate() - 1));
    ajaxPostPre('${basePath}sts/down?beginTime=' + timeUtils(0, new Date().getDate() - 30) + '&endTime=' + timeUtils(0, new Date().getDate()) + '', downCk);
    qst('${basePath}sts/qst', {
        beginTime: timeUtils(0, new Date().getDate() - 30),
        endTime: timeUtils(0, new Date().getDate())
    }, false, -45);
    rank('${basePath}sts/ranks', {
        beginTime: timeUtils(0, new Date().getDate() - 30),
        endTime: timeUtils(0, new Date().getDate())
    });
    ajaxPostPre('${basePath}sts/tNameA', rjCk);

    function rjCk(result) {
        $.each(result, function (i, data) {
            $('#rjType').append('<option type=' + data.tabCode + '>' + data.tabName + '</option>');
            $(".selectBox").trigger("chosen:updated");
        });
    }

    ajaxPostPre('${basePath}sts/dslx', dsCk);

    function dsCk(result) {
        $.each(result, function (i, data) {
            $('#dsType').append('<option type=' + data.regionName + '>' + data.regionName + '</option>');
            $(".selectBox").trigger("chosen:updated");
        });
    }

    function downCk(result) {
        var num = 0;
        for (i = 0; i < result.length; i++) {
            if (result[i].sl != '--') {
                num = num + parseInt(result[i].sl);
            }
        }
        $('#rjxxlb').html('');
        $('#rjxxlb').html('<div class="span3 stat spanWid"  style="margin-left:11px;">' +
            '<div class="data" style="padding-right: 30px!important;">' +
            '<span class="number" style="position: relative;left:-40px;top:-5px">' + num + '' +
            '</span><p style="position: relative;top:-25px;left:10px">下载总量</p>' +
            '</div>' +
            '</div>');
        $.each(result, function (i, data) {
            console.log(data);
            $('#rjxxlb').append(
                '<div class="span3 stat spanWid"  style="margin-left:6px">' +
                '<div class="data" style="padding-right: 30px!important;">' +
                '<span class="number" style="position: relative;left:-40px;top:-5px">' + data.sl + '' +
                '</span><p id="rjName" style="position: relative;top:-25px;left:10px">' + data.tabName + '</p>' +
                '</div>' +
                '</div>'
            );
            if (data.tabName.length == 4) {
                $('#rjName').css('left', '10px')
            }
        })
        $('.spanWid').css('width', toPercent(100, result.length + 1.75))
    }

    function qst(url, param, dot, jd) {
        $.getJSON(url, param, function (data) {
            var datatime = [];
            var datanum = [];
            $.each(data, function (i, result) {
                var datatimes = result["time"];
                var datanums = result["sl"];

                datatime.push(datatimes.substring(5));
                datanum.push(parseInt(datanums));

            });
            chart = Highcharts.chart('container', {
                chart: {
                    type: 'areaspline',
                    // backgroundColor: 'rgba(0,0,0,0.7)',
                    backgroundColor: 'white', style: {color: 'red', fontSize: '16px'}
                    // plotBackgroundImage: '/images/ssybg.jpg'/*绘图区域背景图片*/
                },
                title: {
                    text: null
                    /*text:'下载趋势',align:'center',floating:false,/!*是否浮动，设置浮动后，标题将不占用图表区位置*!/
                    marginBottom:120,/!*标题和图表区的间隔，当有副标题时，表示标题和副标题之间的间隔*!/
                    style:{color: 'rgba(0,0,0,0.8)',fontSize: '16px',fontWeight:'bold',fontFamily:'Open Sans'},x:-336,y:10/!*相对于水平、垂直对齐的偏移量*!/*/
                },
                /*  subtitle: {
                     text: 'Source: WorldClimate.com'
                 },*/
                xAxis: {
                    title: {text: null},
                    // crosshair: true,/*十字准心线*/
                    lineColor: 'transparent', /*轴线颜色*/
                    /*alternateGridColor: '#FDFFD5',/!*隔行变色*!/*/
                    categories: datatime,
                    labels: {
                        rotation: jd,
                        step: 4, /*间隔刻度*/
                        style: {
                            color: 'rgb(110, 130, 155)'/*坐标轴文字颜色*/
                        }
                    },
                    // /*刻度线颜色*/tickColor:'transparent',
                    // visible: true/*是否显示坐标轴*/
                },
                yAxis: {
                    // endOnTick: false,
                    title: {text: null},
                    crosshair: true,
                    gridLineColor: 'tarnsparent',
                    /*网格线颜色*/
                    /*gridLineColor:'red',*/
                    /*虚线*//*gridLineDashStyle: 'longdash',*/
                    /*labels: {
                        step:1,/!*显示间隔*!/
                        style: {
                            color: 'rgb(110, 130, 155)'/!*坐标轴文字颜色*!/
                        },
                        formatter: function () {
                            return this.value + 'k';
                        }
                    },*/
                    offset: -10, /*文字偏移*/
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
                    shared: true,

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
                    {
                        name: '下载量', cursor: 'pointer', /*变换手势*/

                        marker: {
                            enabled: dot
                        },
                        lineColor: 'transparent',
                        fillOpacity: 0.5,
                        // enableMouseTracking: true,
                        color: 'rgb(50,160,238)', /*线条颜色*/
                        // dashStyle: 'Solid',
                        /*线条样式Solid
                    ShortDash   ShortDot  ShortDashDot  ShortDashDotDot Dot Dash
                    LongDash    DashDot LongDashDot LongDashDotDo*/
                        data: datanum
                    },
                ],
                /*关闭图例series的name*/
                legend: {
                    enabled: false,
                    itemHiddenStyle: {color: 'lightblue'}, /*图例隐藏时颜色*/
                    itemStyle: {color: 'rgb(110, 130, 155)', fontWeight: 'bold'}, /*图例基本样式*/
                    itemHoverStyle: {color: 'rgb(110, 130, 155)'}, /*图例滑入时样式*/
                    // floating: true,x: 90,y: 60,
                },
                /*是否显示版权信息*/credits: {enabled: false},
                /*导出功能模块*/exporting: {enabled: false},
            });
        });
    }

    function rank(url, param) {
        $.getJSON(url, param, function (data) {
            var dataName = [];
            var dataNum = [];
            var dataType = [];

            $.each(data, function (i, result) {
                var dataNames = result["softName"];
                var dataNums = result["sl"];
                var dataTypes = result["tabName"];
                // console.log(dataNames.split("["));
                // console.log();
                dataType.push(dataTypes);
                dataName.push(dataNames.split("[")[1].replace(/]/g, ""));
                dataNum.push(parseInt(dataNums));
            });
            chart1 = Highcharts.chart('container1', {
                chart: {
                    type: 'bar',
                    // backgroundColor: 'rgba(0,0,0,0.7)',
                    backgroundColor: 'white', style: {color: 'red', fontSize: '16px'},
                    // plotBackgroundImage: '/images/ssybg.jpg'/*绘图区域背景图片*/
                },
                title: {
                    text: null
                    // text:'下载排行',align:'center',floating:false,/*是否浮动，设置浮动后，标题将不占用图表区位置*/
                    // marginBottom:0,/*标题和图表区的间隔，当有副标题时，表示标题和副标题之间的间隔*/
                    // style:{color: 'rgba(0,0,0,0.8)',fontSize: '16px',fontWeight:'bold',fontFamily:'Open Sans'},x:-80,y:15/*相对于水平、垂直对齐的偏移量*/
                },
                /*  subtitle: {
                     text: 'Source: WorldClimate.com'
                 },*/
                xAxis: {
                    title: {text: null},
                    // crosshair: true,/*十字准心线*/
                    lineColor: 'transparent', /*轴线颜色*/
                    /*alternateGridColor: '#FDFFD5',/!*隔行变色*!/*/
                    categories: dataName,
                    margin: 1000,

                    labels: {
                        reserveSpace: true,
                        align: 'left',
                        step: 1, /*间隔刻度*/
                        width: 0,
                        style: {
                            color: 'rgb(110, 130, 155)', /*坐标轴文字颜色*/
                        },
                        //对横坐标刻度值进行格式化
                        formatter: function () {
                            //获取到刻度值
                            var labelVal = this.value;
                            //实际返回的刻度值
                            var reallyVal = labelVal;
                            // console.log(reallyVal,strlength(labelVal));
                            //判断刻度值的长度
                            if (strlength(labelVal) >= 15) {
                                //截取刻度值
                                reallyVal = labelVal.substr(0, 7) + '...'
                                // reallyVal = labelVal.substr(0,8)+"<br/>"+labelVal.substring(3,labelVal.length-1);
                            }
                            return reallyVal;
                        },
                    },
                    /*刻度线颜色*/tickColor: 'transparent',
                    visible: true/*是否显示坐标轴*/
                },
                yAxis: {
                    title: {text: null}, crosshair: true,
                    gridLineColor: 'tarnsparent',
                    /*网格线颜色*//*gridLineColor:'red',*/
                    /*虚线*//*gridLineDashStyle: 'longdash',*/
                    labels: {
                        step: 1, /*显示间隔*/
                        style: {
                            color: 'rgb(110, 130, 155)'/*坐标轴文字颜色*/
                        },
                        /*formatter: function () {
                            return this.value + 'k';
                        }*/

                    },
                    visible: false/*是否显示坐标轴*/
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
                    shared: true,
                    formatter: function () {
                        // console.log();
                        // console.log(this.points.series.points);
                        return ('[' + dataType[this.points[0].point.index] + ']' + this.x + '<br>' + '<span style="font-weight: bold">下载量</span>：' + this.y);
                    }
                },
                plotOptions: {
                    bar: {
                        dataLabels: {
                            enabled: true,
                            allowOverlap: false, // 允许数据标签重叠
                        },
                        pointWidth: 13
                    },
                },
                series: [
                    {
                        name: '下载量', cursor: 'pointer', /*变换手势*/

                        marker: {
                            symbol: 'diamond'
                        },
                        fillOpacity: 0.5,
                        // enableMouseTracking: true,
                        color: 'rgb(50,160,238)', /*线条颜色*/
                        dashStyle: 'Solid', /*线条样式Solid
                ShortDash   ShortDot  ShortDashDot  ShortDashDotDot Dot Dash
                LongDash    DashDot LongDashDot LongDashDotDo*/
                        data: dataNum,
                    },
                ],
                /*关闭图例series的name*/
                legend: {
                    enabled: false,
                    itemHiddenStyle: {color: 'lightblue'}, /*图例隐藏时颜色*/
                    itemStyle: {color: 'rgb(110, 130, 155)', fontWeight: 'bold'}, /*图例基本样式*/
                    itemHoverStyle: {color: 'rgb(110, 130, 155)'}, /*图例滑入时样式*/
                    // floating: true,x: 90,y: 60,
                },
                /*是否显示版权信息*/credits: {enabled: false},
                /*导出功能模块*/exporting: {enabled: false},
            });
        });
    }

    $('#timeToday').click(function () {
        $('#mio-dateRange').val(nowDate(0) + ' 00:00:00' + ' ~ ' + nowDate(0) + ' 23:59:59');
        $('#timeWeek').addClass('active');
        $('#timeMonth').addClass('active');
        $(this).removeClass('active');
        ajaxPostPre('${basePath}sts/down?beginTime=' + nowDate(0) + ' ' + '00:00:00', downCk);
        qst('${basePath}sts/qst?beginTime=' + nowDate(0) + ' 00:00:00&endTime=' + nowDate(1) + ' 00:00:00', true);
        rank('${basePath}sts/ranks?beginTime=' + nowDate(0) + ' ' + '00:00:00');
    })
    $('#timeWeek').click(function () {
        $('#mio-dateRange').val(getWeek() + ' ~ ' + nowDate(0) + ' 23:59:59');
        $('#timeToday').addClass('active');
        $('#timeMonth').addClass('active');
        $(this).removeClass('active');
        ajaxPostPre('${basePath}sts/down?beginTime=' + getWeek() + '&endTime=' + nowTime() + '', downCk);
        qst('${basePath}sts/qst?beginTime=' + getWeek() + '&endTime=' + nowTime() + '', false);
        rank('${basePath}sts/ranks?beginTime=' + getWeek() + '&endTime=' + nowTime() + '');
    })
    $('#timeMonth').click(function () {
        $('#mio-dateRange').val(getMonth() + ' ~ ' + nowDate(0) + ' 23:59:59');
        $('#timeWeek').addClass('active');
        $('#timeToday').addClass('active');
        $(this).removeClass('active');
        ajaxPostPre('${basePath}sts/down?beginTime=' + getMonth() + '&endTime=' + nowTime() + '', downCk);
        qst('${basePath}sts/qst?beginTime=' + getMonth() + '&endTime=' + nowTime() + '', false);
        rank('${basePath}sts/ranks?beginTime=' + getMonth() + '&endTime=' + nowTime() + '');
    })

    /*$('#mio-dateRange').click(function () {
        laydateChoice('#mio-dateRange','datetime','~',true);
        $('#layui-laydate1').show()
    })*/

</script>

</body>
</html>