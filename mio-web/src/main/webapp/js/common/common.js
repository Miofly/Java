/*ajax二次封装 post*/
function ajaxPostPre(url,callback,param) {
    $.ajax({
        type: "post",
        url: url,
        data: param,
        dataType: 'json',

        beforeSend: function () {
            $("body").append('<div id="pload" style="position:fixed;top:30%;left:43%;z-index:1200;' +
                'background:url('+getRootPath()+'/images/loading.gif) top center no-repeat;width:200px;height:30px;' +
                'margin:auto auto;"></div>');
        },
        complete: function () {
            $("#pload").remove();
        },
        success: callback,
        error: function () {
            mntip('操作失败，请联系管理员','danger');
        }
    });
}

/*ajax二次封装 get*/
function ajaxGetPre(url,callback,param) {
    $.ajax({
        type: "get",
        url: url,
        data: param,
        dataType: 'json',
        beforeSend: function () {
            $("body").append('<div id="pload" style="position:fixed;top:30%;z-index:1200;' +
                'background:url('+getRootPath()+'/images/loading.gif) top center no-repeat;width:100%;height:100%;' +
                'margin:auto auto;"></div>');
        },
        complete: function () {
            $("#pload").remove();
        },
        success: callback,
        error: function () {
            mntip('操作失败，请联系管理员','danger');
        }
    });
}

/*datagrid控制*/
/**
 *     datagrid("${basePath}sts/softs",'title',false,false)
 * @param url
 * @param title
 * @param showHeader
 */
function datagrid(url,title,header,alternate) {
    grid.set({
        url:url,ajaxType:'get',showHeader:header,title:title,/*显示表头以及表头命名*/
        columns: columns,/*列的集合*/ pager:"#pager1",
        pageSize:30,sizeList:[30,60,90,700],/*显示条数|页尺寸集合*/
        /*virtualScroll:true,*//*虚拟滚动。当显示的数据超过500以上时，请设置此属性，能极大提升性能*/
        virtualColumns:false,/*虚拟滚动列，在列较多时有用，提高性能*/
        sortField:id,sortOrder:'asc',sortMode:'client',/*排序字段 排序方向 排序模式设置为"client"后则时客户端排序*/
        showColumns:true,/*显示表头*/
        showPagerButtonText:false,/*显示分页按钮文本*/
        showHGridLines:false,showVGridLines:false,/*显示横/竖向表格线条*/
        showCellTip:true,/*允许单元格提示框（当宽度变小有省略号时）*/
        allowCellWrap:false,/*允许单元格换行*/
        allowSortColumn:true,allowMoveColumn:true,allowResizeColumn:true,/*允许列排序 允许移动列 允许拖拽调节列宽度*/
        allowCellSelect:true,/*允许选中单个单元格*/
        multiSelect:true,/*多选框*/
        allowAlternating:alternate,/*显示斑马纹*/ allowResize:true,/*允许拖拽调节表格尺寸*/
        pageSizeWidth:58,/*分页控件pageSize选择框的宽度*/
        pageIndexField:'pageIndex',/*分页索引字段名*/
        pageSizeField:'pageSize',/*分页条数字段名*/
        sortFieldField:'sortField',/*排序字段的字段名*/
        sortOrderField:'sortOrder',/*排序方向字段名*/
        totalField:'total',dataField:'data',/*数据字段名*/
        allowCellEdit:false,editNextOnEnterKey:false,editNextRowCell:false,/*编辑单元格*/
        showColumnsMenu:true,/*显示列菜单。实现显示、隐藏列*/
        skipReadOnlyCell:true,/*tab导航编辑时非编辑直接跳过*/
        showSortIcon:false,/*显示可派序列的提示图标*/
    });
    grid.load();
}

/*多个输入框前端校验*/
/*left center 左中   right center 右中 center top 上中   center bottom 下中*/
function checkTips(inputs,errorCon,tarX,tarY) {
    var queryString = inputs;
    /*前端验证*/
    var result = true;
    $.each(queryString,function(i){
        $(this).poshytip('hide');
        if(($(this).val() =="") ){
            // var errorContent = errorCon;
            $(this).poshytip({
                className: 'tip-yellow',
                content:errorCon,
                showOn: 'none',
                alignTo: 'target',
                alignX: tarX,
                alignY: tarY,
                offsetX: 0,
                offsetY: 5,
                timeOnScreen:2000
            });
            $(this).poshytip('show');
            $(this).focus();
            result = false ;
            return false ;
        }

    });
    return result;
}

/*单个校检的提示*/
function checkTip(ele,errorStr,tarX,tarY){
    ele.poshytip('hide');
    ele.poshytip({
        className: 'tip-yellow',
        content: errorStr,
        showOn: 'none',
        alignTo: 'target',
        alignX: tarX,
        alignY: tarY,
        offsetX: 0,
        offsetY: 3,
        timeOnScreen: 1500
    });
    ele.poshytip('show');
    $(this).focus();

}

/*输入框边框阴影效果*/
function inputBorder(ele){
    ele.focus(function () {
        $(this).addClass('mio-border')
        // $(this).css({"box-shadow":"0 0 10px lightblue",'border':'1px solid lightblue'})
    });
    ele.blur(function () {
        $(this).removeClass('mio-border')
        // $(this).css({"box-shadow":"0 0 0 lightblue",'border':'1px solid transparent'})
    })
}

/*输入框内容清除*/
function remove(ele){
    if(ele.val()==''||ele.val()==null||ele.val()==""||
        ele.html()==''||ele.html()==null||ele.html()==""){
        ele.next().css('visibility','hidden');
    }else{
        ele.next().css('visibility','visible');
    }
    if(ele.val()!=''){
        ele.next().css('visibility','visible');
    }else{
        ele.next().css('visibility','hidden');
    }
    ele.keyup(function() {
        if($(this).val()==''){
            $(this).next().css('visibility','hidden');
        }else{
            $(this).next().css('visibility','visible');
        }
        $(this).change();
    });
    ele.change(function () {
        if($(this).val()!=''){
            $(this).next().css('visibility','visible');
        }else{
            $(this).next().css('visibility','hidden');
        }
    });
    /*点击清除*/
    ele.next().click(function () {
        ele.focus();
        ele.val('');
        $(this).css('visibility','hidden');
    });
    /*失去焦点时判断*/
    ele.blur(function() {
        if($(this).val()==''){
            $(this).next().css('visibility','hidden');
        }else{
            $(this).next().css('visibility','visible');
        }
    });
    ele.focus(function() {
        if($(this).val()==''){
            $(this).next().css('visibility','hidden');
        }else{
            $(this).next().css('visibility','visible');
        }
    });
}

/*输入框字符长度大于指定值提示*/
function inpLenMax(ele,num){
    ele.keyup(function () {
        if(ele.val().length>num){
            checkTip(ele,'输入字符不得超过'+num+'个','right','center');
        }
    });
}

/*输入框字符长度判断(由其他事件触发)*/
function inpLen(ele,minNum,maxNum) {
    if(ele.val().length<minNum){
        checkTip(ele,'当前字符数小于'+minNum+'，请重新输入','right','center');
        ele.focus();
    }
    if(ele.val().length>maxNum){
        checkTip(ele,'当前字符数大于'+maxNum+'，请重新输入','right','center');
        ele.focus();
    }
}

/*回车键触发点击*/
function enter(ele){
    $(document).keydown(function (event) {
        if (event.keyCode == 13) {
            ele.click();
        }
    });
}

/*退出键触发点击*/
function esc(ele){
    $(document).keydown(function (event) {
        if (event.keyCode == 27) {
            ele.click();
        }
    });
}

/*退出键关闭窗口*/
function escHide(ele){
    $(document).keydown(function (event) {
        console.log(event.keyCode);
        if (event.keyCode == 27) {
            ele.slideUp();
            $('#mask').remove();
        }
    });
}

/*查看密码*/
function showPwd(pwd,eye){

    if(pwd.val()!=''){
        pwd.next().css('visibility','visible');
    }
    pwd.keyup(function() {
        if($(this).val()==''){
            $(this).next().css('visibility','hidden');
        }
        $(this).change();
    });
    pwd.change(function () {
        if($(this).val()!=''){
            $(this).next().css('visibility','visible');
        }
    });
    /*失去焦点时判断*/
    pwd.blur(function() {
        if($(this).val()==''){
            $(this).next().css('visibility','hidden');
        }
    });

    eye.click(function () {
        if(eye.hasClass("fa-eye-slash")){
            $(this).removeClass("fa-eye-slash").addClass("fa-eye");
            $(this).prev().attr("type", "text");
        }
        else{
            $(this).removeClass("fa-eye").addClass("fa-eye-slash");
            $(this).prev().attr("type", "password");
        }
    })
}

/*查看title*/
function showTitle(ele) {
    ele.mouseover(function () {
        this.title=this.value;
    })
}

/*复制,剪切，删除*/
/*execCommand('copy/cut/delete','点击按钮ID','输入框ID');*/
function execCommand(command,btnId,textId){
    var btn = document.getElementById(btnId);
    btn.addEventListener('click', function(){
        var inputText = document.getElementById(textId);
        var currentFocus = document.activeElement;
        inputText.focus();
        inputText.setSelectionRange(0, inputText.value.length);
        document.execCommand(command, true);
        currentFocus.focus();
    });
}

/*获取地址栏参数信息
* GetQueryString("url")
*/
function GetQueryString(name)
{
    var reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)");
    var r = window.location.search.substr(1).match(reg);
    if(r!=null)return  unescape(r[2]); return null;
}

/*
laydateChoice(元素ID（'#id'）,时间类型(datetime所有),是否开启范围选择boolean)
 */
function laydateChoice(ele,datetype,range){
    laydate.render({
        elem: ele, //指定元素
        type:datetype
        /* year	年选择器	只提供年列表选择
         month	年月选择器	只提供年、月选择
         date	日期选择器	可选择：年、月、日。type默认值，一般可不填
         time	时间选择器	只提供时、分、秒选择
         datetime	日期时间选择器	可选择：年、月、日、时、分、秒*/
        ,range: range //或 range: '~' 来自定义分割字符
        // ,format: 'yyyy-MM-dd HH:mm:ss'
        /*   yyyy-MM-dd HH:mm:ss	2017-08-18 20:08:08
             yyyy年MM月dd日 HH时mm分ss秒	2017年08月18日 20时08分08秒
             yyyyMMdd	20170818     dd/MM/yyyy	18/08/2017
             yyyy年M月	2017年8月     M月d日	8月18日
             北京时间：HH点mm分	北京时间：20点08分
             yyyy年的M月某天晚上，大概H点	2017年的8月某天晚上，大概20点*/
        // ,value: '2018-11-13 00:00:00 ~ 2018-12-28 00:00:00'//必须遵循format参数设定的格式
        // ,min: '2017-1-1',max: '2017-12-31'//日期有效范围只限定在：2017年
        //日期有效范围只限定在：2017年 ,min: '2017-1-1' ,max: '2017-12-31'
        //时间有效范围设定在: 上午九点半到下午五点半,min: '09:30:00' ,max: '17:30:00'
        // ,btns: ['clear', 'now' ,'confirm']
        ,theme: 'grid'/*主题*/
        // ,calendar: true/*是否显示公历节日*/
        // ,lang: 'en'/*国际版*/
    });
}

/*控制表格添加修改时，禁止排序移动列，开启编辑*/
function tableControl() {
    grid.set({
        allowSortColumn:false,allowMoveColumn:false,allowResizeColumn:false,/*允许列排序 允许移动列 允许拖拽调节列宽度*/
        allowCellEdit:true,editNextOnEnterKey:true,editNextRowCell:true/*--编辑单元格--*/
    });
}

/*取消编辑，但可以排序列*/
function tableControlf() {
    grid.set({
        allowSortColumn:true,allowMoveColumn:true,allowResizeColumn:true,/*允许列排序 允许移动列 允许拖拽调节列宽度*/
        allowCellEdit:false,editNextOnEnterKey:false,editNextRowCell:false/*--禁止编辑单元格--*/
    });
}

/*右键菜单设置*/
function rightMenu(page){
    $("body").contextMenu({
        menu:
            [
                {text: "进入大屏",callback: function() {
                        window.open(page,'_blank')
                    }},
                {text: "刷新",callback: function() {
                        window.location.reload()
                    }}
            ]
    });
}

/*增加滚动条*/
function addScroll1(ele,ht) {
    console.log(ele.height());
    console.log(ele.parent().height());
    // ele.parent().css({'height':0+'px'});
    if(ele.parent().height()>ht){
        // ele.children().eq(0).css('margin-left','255px');
        // ele.children().eq(0).css('color','black');
        // ele.find('span').eq(0).css('color','black');
        ele.css({'height':(ht-20)+'px','overflow-y':'scroll','overflow-x':'hidden'});
    }
}

/*增加滚动条*/
function addScroll(ele,ht) {
    // ele.parent().css({'height':0+'px  '});
    var l = ele.find('li').length;
    if(l>20){
    //     // ele.children().eq(0).css('margin-left','255px');
    //     // ele.children().eq(0).css('color','black');
    //     // ele.find('span').eq(0).css('color','black');
       ele.css({'height':ht+'px','overflow-y':'scroll','overflow-x':'hidden'});
    // ele.css({'height':(ht-20)+'px','overflow-y':'scroll','overflow-x':'hidden'});
    //     ele.height()
    }else {
        if(l%2==0){
            ele.css({'height':20*(l/2)+'px','overflow-y':'hidden','overflow-x':'hidden'});
        }
        if(l%2==1){
            ele.css({'height':20*[(l+1)/2]+'px','overflow-y':'hidden','overflow-x':'hidden'});
        }
    }
}

/*form表单搜索设置查询*/
function formsearch(ele) {
    /*把form表单的所有值转换成json数据*/
    var formdata =ele.serializeJson();
    grid.load(formdata);
}

/*有增删改的数据未保存，是否取消本次操作？*/
function beforeConfirm(){
    grid.on("beforeload", function (e) {
        if (grid.getChanges().length > 0) {

            if (confirm("有增删改的数据未保存，是否取消本次操作？")) {
                e.cancel = true;
            }
        }
    });
}

/*遮盖所有元素*/
function mask() {
    $('<div id="mask" style="width: ' + $(window).width() + 'px; '+ 'height: ' + $(window).height() + 'px;background: #000;opacity: 0;position: fixed;z-index: 1000;top: 0;left: 0;\n"></div>').appendTo("body");
    // 窗口大小变化，调整 mask 大小
    $(window).on("resize", function() {
        if($("#mask").length) {
            $("#mask").css({
                width: $(window).width(),
                height: $(window).height(),
                opacity: 0
            });
        }
    });
};

/*浏览器兼容性css调整*/
function getBrowser(){
    if(!!window.ActiveXObject || "ActiveXObject" in window){
        ieCss();
    }
    if(navigator.userAgent.indexOf("Firefox")!=-1){
        return "Firefox";
    }
    if(navigator.userAgent.indexOf("Chrome")!=-1){
        // alert("CHrome")
    }
    if(navigator.userAgent.indexOf("Safari")!=-1){
        return "Safari";
    }
}

/*alert*/
function at(message){
    mini.alert(message,'系统提示');
}

/*
* miniUI 提示
* default|success|info|warning|danger
*/
function mntip(con,st){
    mini.showTips({
        content:con,
        state: st,
        x: 'center',
        y: 'center',
        timeout: '2000'
    });
}

/*swiper按钮滑入滑出隐藏显示*/
function swiperBtn(ele){
    ele.mouseover(function () {
        $('.swiper-button-prev').fadeIn(300);
        $('.swiper-button-next').fadeIn(300);
        // $('.swiper-pagination').slideDown(600);
    });
    ele.mouseleave(function () {
        $('.swiper-button-prev').fadeOut();
        $('.swiper-button-next').fadeOut();
        // $('.swiper-pagination').slideUp();
    });
}

/*swiper常用设置
* swiper('.swiper-container',false,2,20);
* */
function swiper(ele,autoplay,gs,jl) {
    var swiper = new Swiper(ele, {
        mousewheel: true,/*鼠标滑轮控制*/
        loop : false,/*循环*/
        // slidesPerView: 'auto',
        // loopedSlides: 4,
        // autoplay: autoplay,//可选选项，自动滑动
        autoplay : { delay:3000,
            disableOnInteraction: false/*鼠标拖动后不自动播放解决*/
        },

        grabCursor : true,/*鼠标覆盖Swiper时指针会变成手掌形状，拖动时指针会变成抓手形状*/
        slidesPerView: gs,/*显示个数*/
        spaceBetween: jl,/*间隔距离*/
        freeMode:false,/*默认为false，普通模式：slide滑动时只滑动一格，并自动贴合wrapper，设置为true则变为free模式，slide会根据惯性滑动可能不止一格且不会贴合*/
        keyboard : true,/*键盘控制*/
        pagination: {
            el: '.swiper-pagination',
            clickable: true
        },
        navigation: {
            nextEl: '.swiper-button-next',
            prevEl: '.swiper-button-prev'
        },
    });
}

/*单条文字向上滚动
* setInterval('AutoScroll(".mio-singlesl")', 1000);
* */
function AutoScroll(obj) {
    $(obj).find("ul:first").animate({
        marginTop: "-20px"
    }, 500, function() {
        $(this).css({
            marginTop: "0px"
        }).find("li:first").appendTo(this);
    });
}

/*曲线图*/
function splineChart(ele,name,xdata,ydata){
    ele.highcharts({
        chart: {
            type: 'spline',
            // backgroundColor: 'rgba(0,0,0,0.7)',
            backgroundColor: 'transparent',style:{color: 'red',fontSize: '16px'}
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
            categories: xdata,
            labels: {
                step: 6,/*间隔刻度*/
                style: {
                    color: 'rgba(255,255,255,1)'/*坐标轴文字颜色*/
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
                    color: 'rgba(255,255,255,1)'/*坐标轴文字颜色*/
                },
                formatter: function () {
                    return this.value /*+ 'k'*/;
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
                name: name,cursor:'pointer',/*变换手势*/
                marker: {
                    symbol: 'diamond'
                },
                // enableMouseTracking: true,
                color:'white',/*线条颜色*/
                dashStyle: 'shortdot',/*线条样式Solid
                ShortDash   ShortDot  ShortDashDot  ShortDashDotDot Dot Dash
                LongDash    DashDot LongDashDot LongDashDotDo*/
                data: ydata
            }
        ],
        /*关闭图例series的name*/
        legend: {enabled: true,
            itemHiddenStyle: {color: 'lightblue'},/*图例隐藏时颜色*/
            itemStyle: {color: 'white',fontWeight: 'bold'},/*图例基本样式*/
            itemHoverStyle: {color: 'white'},/*图例滑入时样式*/
            // floating: true,x: 90,y: 60,
        },
        /*是否显示版权信息*/credits: {enabled: false},
        /*导出功能模块*/exporting: {enabled: false},
    });

}

/*饼图*/
function pieChart(ele,datass) {
    ele.highcharts({
        chart: {
            type: 'pie',
            backgroundColor: 'transparent',
            // marginTop:30,
        },
        title: {
            text: null
        },
        tooltip: {
            pointFormat: '{series.name}: <b>{point.percentage:.1f}%</b>'
        },
        plotOptions: {
            pie: {
                // center: [120, 68],/*圆饼中心位置*/
                allowPointSelect: true,/*允许图例被选中*/
                slicedOffset: 10,/*图例选中时缝的间隔*/
                startAngle: 175,/*开始角度*/
                cursor: 'pointer',
                borderColor: 'transparent',/*边线颜色*/
                // showInLegend: true,/*是否显示图例*/
                // innerSize: 80,/*设置中心圆圈*/
                /*饼图文字设置*/
                size: 100,/*圆饼大小*/
                dataLabels: {
                    enabled: true,
                    //    format: '<b>{point.name}</b>: {point.percentage:.1f} %',
                    style: {
                        color: 'white',
                        fontSize:8,
                    },
                    //     // distance: 0,/*调整文字距离*/
                },
                color:'green'
            }
        },
        /*是否显示版权信息*/credits: {enabled: false},
        /*导出功能模块*/exporting: {enabled: false},
        /*  legend: {enabled: true,
              itemHiddenStyle: {color: 'lightblue'},/!*图例隐藏时颜色*!/
              itemStyle: {color: 'white',fontWeight: 'bold'},/!*图例基本样式*!/
              itemHoverStyle: {color: 'white'},/!*图例滑入时样式*!/
              // floating: true,x: 90,y: 60,
          },*/
        series:[

            {
                name: '比列',
            data:datass
        }]

    });
}

/*曲线图*/
function splineChart1(ele,name){
    ele.highcharts({
        chart: {
            type: 'spline',
            // backgroundColor: 'rgba(0,0,0,0.7)',
            backgroundColor: 'transparent',style:{color: 'red',fontSize: '16px'}
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
                    color: 'rgba(255,255,255,1)'/*坐标轴文字颜色*/
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
                    color: 'rgba(255,255,255,1)'/*坐标轴文字颜色*/
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
                name: name,cursor:'pointer',/*变换手势*/
                marker: {
                    symbol: 'diamond'
                },
                // enableMouseTracking: true,
                color:'white',/*线条颜色*/
                dashStyle: 'shortdot',/*线条样式Solid
                ShortDash   ShortDot  ShortDashDot  ShortDashDotDot Dot Dash
                LongDash    DashDot LongDashDot LongDashDotDo*/
                data: [3.9, 4.2, 5.7, 8.5, 14.9, 11.2, 5.0, 12.6, 14.2, 10.3, 6.6, 4.8]
            }
        ],
        /*关闭图例series的name*/
        legend: {enabled: true,
            itemHiddenStyle: {color: 'lightblue'},/*图例隐藏时颜色*/
            itemStyle: {color: 'white',fontWeight: 'bold'},/*图例基本样式*/
            itemHoverStyle: {color: 'white'},/*图例滑入时样式*/
            // floating: true,x: 90,y: 60,
            },
        /*是否显示版权信息*/credits: {enabled: false},
        /*导出功能模块*/exporting: {enabled: false},
    });

}

/*饼图*/
function pieChart1(ele) {
    ele.highcharts({
        chart: {
            type: 'pie',
            backgroundColor: 'transparent',
            // marginTop:30,
        },
        title: {
            text: null
        },
        tooltip: {
            pointFormat: '{series.name}: <b>{point.percentage:.1f}%</b>'
        },
        plotOptions: {
            pie: {
                // center: [120, 68],/*圆饼中心位置*/
                allowPointSelect: true,/*允许图例被选中*/
                slicedOffset: 5,/*图例选中时缝的间隔*/
                startAngle: 90,/*开始角度*/
                cursor: 'pointer',
                borderColor: 'transparent',/*边线颜色*/
                // showInLegend: true,/*是否显示图例*/
                // innerSize: 80,/*设置中心圆圈*/
                /*饼图文字设置*/
                size: 150,/*圆饼大小*/
                dataLabels: {
                    enabled: true,
                    format: '<b>{point.name}</b>: {point.percentage:.1f} %',
                    style: {
                        color: 'white'
                    },
                    distance: -20,/*调整文字距离*/
                },
                color:'green'
            }
        },
        /*是否显示版权信息*/credits: {enabled: false},
        /*导出功能模块*/exporting: {enabled: false},
      /*  legend: {enabled: true,
            itemHiddenStyle: {color: 'lightblue'},/!*图例隐藏时颜色*!/
            itemStyle: {color: 'white',fontWeight: 'bold'},/!*图例基本样式*!/
            itemHoverStyle: {color: 'white'},/!*图例滑入时样式*!/
            // floating: true,x: 90,y: 60,
        },*/
        series: [{
            color:'red',
            name: 'Brands',
            colorByPoint: true,
            data: [
                {name: 'Chrome',y: 40,sliced: true,selected: true,color:'lightblue'},
                {name: 'Internet Explorer',y: 30,color:'rgba(173,216,230,0.7)'},
                {name: 'QQ',y: 10,color:'rgba(173,216,250,1)'},
                {name: 'Other',y: 20 ,color:'rgba(143,226,230,1)'}
            ]
        }]
    });
}

/*js 获取当前时间
setInterval(function(){nowTimeHtml('nowTime');},1000);*/
function nowTimeHtml(ele){
    var oDiv=ele;
    var date=new Date();
    var year=date.getFullYear();//当前年份
    var month=date.getMonth();//当前月份
    var data=date.getDate();//天
    var hours=date.getHours();//小时
    var minute=date.getMinutes();//分
    var second=date.getSeconds();//秒
    var time=year+"-"+addZero((month+1))+"-"+addZero(data)+" "+addZero(hours)+":"+addZero(minute)+":"+addZero(second);
    oDiv.html(time);
}

/*补位 当某个字段不是两位数时补0*/
function addZero(str){
    var num;
    str>=10?num=str:num="0"+str;
    return num;
}

/*销毁地图
*
* disposeChart('city_map');
* */
function disposeChart(mapName){
    // var chart = echarts.init(document.getElementById(mapName));
    if(mapName!=null&&mapName!=''&&mapName!=undefined){
        mapName.dispose();
    }
}

/*特制搜索框*/
function searchToggle(obj, evt){
    var container = $(obj).closest('.search-wrapper');

    if(!container.hasClass('active')){
        container.addClass('active');
        evt.preventDefault();
    }
    else if(container.hasClass('active') && $(obj).closest('.input-holder').length == 0){
        container.removeClass('active');
        // clear input
        container.find('.search-input').val('');
        // clear and hide result container when we press close
        // container.find('.result-container').fadeOut(100, function(){$(this).empty();});
    }
}

/*浏览器大小变化重新加载页面*/
function winResize(){
    $(window).resize(function () {          //当浏览器大小变化时
        /* alert($(window).height());          //浏览器时下窗口可视区域高度
         alert($(document).height());        //浏览器时下窗口文档的高度
         alert($(document.body).height());   //浏览器时下窗口文档body的高度
         alert($(document.body).outerHeight(true)); //浏览器时下窗口文档body的总高度 包括border padding margin*/
        // window.location.reload(); //刷新
    });
}

/*echarts图表大小自适应*/
function echartAapSize(chartName){
    $(window).resize(function () {
        //当浏览器大小变化时
        chartName.resize();
    });
}

/*中国标准时间的替换
 $('.testtime').val(todate($('.testtime').val(), "-", true))
*/
function todate(inputstr, showsplit, showweek) {

    //Wed Mar 22 13:38:37 CST 2017
    inputstr = inputstr + ""; //末尾加一个空格
    var date = "";
    var month = new Array();
    var week = new Array();

    month["Jan"] = 1; month["Feb"] = 2; month["Mar"] = 3; month["Apr"] = 4; month["May"] = 5; month["Jan"] = 6;
    month["Jul"] = 7; month["Aug"] = 8; month["Sep"] = 9; month["Oct"] = 10; month["Nov"] = 11; month["Dec"] = 12;
    week["Mon"] = "一"; week["Tue"] = "二"; week["Wed"] = "三"; week["Thu"] = "四"; week["Fri"] = "五"; week["Sat"] = "六"; week["Sun"] = "日";

    str = inputstr.split(" ");
    date = str[5];
    date += showsplit + month[str[1]] + showsplit + str[2];
    if(showweek){
        date += " " + str[3]+" " + " 星期" + week[str[0]];
    }

    return date;
}

/*
    select框
    multiple    有此属性的 select 会渲染成可以多选的 Chosen 选框
    data-placeholder占位符文字
    selected, disabled设置选中、禁止状态
    select 框
 */
function selectChosen(ele){
    ele.chosen({
        disable_search:false,/*设置为 true 隐藏单选框的搜索框*/
        disable_search_threshold: 5,/*少于 n 项时隐藏搜索框*/
        no_results_text: 'No Result!',/*没有搜索到匹配项时显示的文字*/
        search_contains:true,/*搜素包含项，默认从第一个字符开始匹配*/
        max_selected_options:3,/*最多选择项数，达到最大限制时会触发 chosen:maxselected 事件*/
        display_disabled_options:true,/*是否显示禁止选择的项目*/
        display_selected_options:false,/*多选框是否在下拉列表中显示已经选中的项*/
        allow_single_deselect: false/*可删除选择项*/
//        rtl: true/*文字靠右*/
    });
}

/*打开页面
* addPage('/user/editTreeId?mioLeftListCustom.id='+row.id,'编辑',1000,600)
* */
function addPage(url,title,width,height) {
    mini.open({
        targetWindow: window,//页面对象。默认是顶级页面。
        url: url,//页面地址
        title: title, //标题
        allowResize:false,//允许尺寸调节
        allowDrag: true,         //允许拖拽位置
        showCloseButton: true,   //显示关闭按钮
        showMaxButton: true,     //显示最大化按钮
        showModal: true,        //显示遮罩
        width: width, height: height,
        onload: function () {   //弹出页面加载完成
        },
        ondestroy: function (e) {
           /* mini.confirm("", "", function (action) {
                if (action == "ok") {

                }
            })
            return false;*/
           grid.reload();

        }
    });
}

/*
*form提交(post方式)
*
*formId form Id
*callbackfn 回调函数名(要求函数必须有参数且不能多与两个,一个参数时参数为响应文本,两个参数时第一个参数为响应文本)
*param 回调函数参数(如果为null,那么调用一个参数的回调函数,否则调用两个参数的回调函数)
*dataType：预期服务器返回的数据类型
*/
function jquerySubByFId(formId,callbackFn,param,dataType){
    var formObj = jQuery("#" + formId);
    var options = {
        dataType:  ("undefined"!=dataType && null!=dataType)?dataType:"json",
        success: function(responseText) {
            if(param === null){
                callbackFn(responseText);
            }else{
                callbackFn(responseText,param);
            }
        }
    };
    formObj.ajaxSubmit(options);
}

/*
   文字向上滚动
   autoScrolls($(".mio-scrollNewPar"),'-20px','1000');
 */
function autoScrolls(ele,top,time){
    var scroll=setInterval(function(){ autoScroll(ele,top) },time);
    /*滑入清除定时器*/
    ele.hover(function(){
        clearInterval(scroll);
    },function(){
        var scroll=setInterval(function(){
            autoScroll(ele,top)
        },time);
    });
}
function autoScroll(ele,top){
    ele.find("ul").animate({
        marginTop : top
    },1000,function(){
        $(this).css({marginTop : "0px"}).find("li:first").appendTo(this);
    })

}

/*
*
* 返回顶部
*
*/
function goTop(ele){
    ele.hide();
    ele.click(function () {
        $('html,body').animate({
            scrollTop: 0
        }, 300);
    });
    $(window).on('scroll', function () {
        /*当滚动条的垂直位置大于浏览器所能看到的页面的那部分的高度时，回到顶部按钮就显示 */
        if ($(window).scrollTop() > $(window).height())
            ele.fadeIn();
        else
            ele.fadeOut();
    });
    $(window).trigger('scroll');/*触发滚动事件，避免刷新的时候显示回到顶部按钮*/
}

/*获取当前项目地址*/
function getRootPath(){
    //获取当前网址，如： http://localhost:8083/uimcardprj/share/meun.jsp
    var curWwwPath=window.document.location.href;
    //获取主机地址之后的目录，如： uimcardprj/share/meun.jsp
    var pathName=window.document.location.pathname;
    var pos=curWwwPath.indexOf(pathName);
    //获取主机地址，如： http://localhost:8083
    var localhostPaht=curWwwPath.substring(0,pos);
    //获取带"/"的项目名，如：/uimcardprj
    var projectName=pathName.substring(0,pathName.substr(1).indexOf('/')+1);
    return(localhostPaht+projectName);
}

/*url /后的名称*/
function urlEnd(url) {
    // var url = window.location.href;
    var index = url.lastIndexOf("\/");
    str = url.substring(index + 1,url.length);
    return str;
}

/*取当前页面名称，不带后缀名*/
function pageName() {
    var a = location.href;
    var b = a.split("/");
    var c = b.slice(b.length-1, b.length).toString(String).split(".");
    return c.slice(0, 1);
}

/*取当前页面名称(带后缀名)*/
function pageName1() {
    var strUrl=location.href;
    var arrUrl=strUrl.split("/");
    var strPage=arrUrl[arrUrl.length-1];
    return strPage;
}