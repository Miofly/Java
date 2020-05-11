/*
ajax二次封装 post
ajaxPostPre(getRootPath()+"/map/city",proMapck);
*/
function ajaxPostPre(url,callback,param) {
  $.ajax({
    type: "post",
    url: url,
    data: param,
    dataType: 'json',
    contentType:"application/x-www-form-urlencoded; charset=utf-8",
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
    contentType:"application/x-www-form-urlencoded; charset=utf-8",
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

/*
    当天
    timeUtils(0,new Date().getDate()) || new Date().toLocaleString() -- "2019-2-27 22:14:35"
    timeUtils(0,new Date().getDate(),true,0,0,0)+" ~ "+timeUtils(0,new Date().getDate(),true,23,59,59)
    昨天
    timeUtils(0,new Date().getDate()-1,true,0,0,0)+" ~ "+timeUtils(0,new Date().getDate()-1,true,23,59,59)
    本周
    timeUtils(0,new Date().getDate()-(new Date().getDay()||7)+1,true,0,0,0)+" ~ "+
    timeUtils(0,new Date().getDate()-(new Date().getDay()||7)+7,true,23,59,59)  // 本周最后一天
    // 到当天最后一天
    timeUtils(0,new Date().getDate()-(new Date().getDay()||7)+1,true,0,0,0)+" ~ "+timeUtils(0,new Date().getDate(),23,59,59)
    上周
    timeUtils(0,new Date().getDate()-(new Date().getDay()||7)-6,true,0,0,0)+" ~ "+
    timeUtils(0,new Date().getDate()-(new Date().getDay()||7),23,true,59,59)  // 上周最后一天
    本月
    timeUtils(0,1) 本月第一天   timeUtils(-1,0) 本月最后一天
    timeUtils(0,1,true,0,0,0)+" ~ "+timeUtils(-1,0,true,23,59,59)
    timeUtils(0,1,true,0,0,0)+" ~ "+timeUtils(0,new Date().getDate(),true,23,59,59) 今天最后时间
    上个月
    timeUtils(1,1) 上个月第一天  timeUtils(0,0) 上个月最后一天
    timeUtils(1,1,true,0,0,0)+" ~ "+timeUtils(1,1,true,23,59,59)
    近一周
    timeUtils(0,new Date().getDate()-7)+昨天
    timeUtils(0,new Date().getDate()-7,true,0,0,0)+" ~ "+timeUtils(0,new Date().getDate()-1,true,23,59,59)
    近一个月
    timeUtils(0,new Date().getDate()-30)+昨天
    timeUtils(0,new Date().getDate()-30,true,0,0,0)+" ~ "+timeUtils(0,new Date().getDate()-1,true,23,59,59)

    中国标准时间
    timeUtils(0,new Date().getDate(),null,null,null,false,false,false)
 */
function timeUtils(monthNum,dayNum,times,hourNum,minNum,secondNum,weeks,ifTrans) {
  // function timeUtils(monthNum,dayNum,hourNum=new Date().getHours(),minNum=new Date().getMinutes(),secondNum=new Date().getSeconds(),times=true,weeks=false,ifTrans=true) {
  //设置默认值，ie不支持es6语法
  if(hourNum==undefined)hourNum=new Date().getHours();
  if(minNum==undefined)minNum=new Date().getMinutes();
  if(secondNum==undefined)secondNum=new Date().getSeconds();
  if(times==undefined)times=false;
  if(weeks==undefined)weeks=false;
  if(ifTrans==undefined)ifTrans=true;
  // hourNum=hourNum||new Date().getHours();
  // minNum=minNum||new Date().getMinutes();
  // secondNum=secondNum||new Date().getSeconds();
  // times=times||true;
  // weeks=weeks||false;
  // ifTrans=ifTrans||true;

  var time =
    new Date(
      new Date(
        new Date(
          new Date(
            new Date(
              new Date().setMonth(
                new Date().getMonth()-monthNum
              )
            ).setDate(dayNum)
          ).setHours(hourNum)
        ).setMinutes(minNum)
      ).setSeconds(secondNum)
    );
  if(ifTrans){
    return transferDate(time,times,weeks);
  }else{
    return time
  }
}

/*
实时展示当前时间
showTime($('#time'))
showTime($('#time'),false) // 不显示星期
*/
function showTime (ele,ifweek) {
// function showTime (ele,ifweek=true) {
//   ifweek=ifweek||true;
  if(ifweek==undefined)ifweek=true;
  setInterval(function(){
    ele.html(timeUtils(0,new Date().getDate(),new Date().getHours(),
      new Date().getMinutes(),new Date().getSeconds(),true,ifweek))
  },1000);
}

/*日期转换(中国标准时间)*/
function transferDate(date,times,weeks) {
  var year = date.getFullYear(); // 从 Date 对象以四位数字返回年份。
  var month = date.getMonth()+1; // 从 Date 对象返回月份 (0 ~ 11)。
  var week = date.getDay(); // 从 Date 对象返回一周中的某一天 (0 ~ 6)。
  var day = date.getDate();  // 从 Date 对象返回一个月中的某一天 (1 ~ 31)。
  var hour = date.getHours();	// 返回 Date 对象的小时 (0 ~ 23)。
  var min = date.getMinutes(); // 返回 Date 对象的分钟 (0 ~ 59)。
  var second = date.getSeconds();	// 返回 Date 对象的秒数 (0 ~ 59)。
  /*星期用汉字替代*/
  if(week==1)week='一';
  if(week==2)week='二';
  if(week==3)week='三';
  if(week==4)week='四';
  if(week==5)week='五';
  if(week==6)week='六';
  if(week==7)week='天';
  var dateString = year+'-'+addZero(month)+'-'+addZero(day);
  // 是否显示时间
  if(times){
    dateString = year+'-'+addZero(month)+'-'+addZero(day)+' '+addZero(hour)+':'+addZero(min)+':'+addZero(second);
  }
  if(weeks&&times){
    dateString = year+'-'+addZero(month)+'-'+addZero(day)+' '+addZero(hour)+':'+addZero(min)+':'+addZero(second)+' '+'星期'+week;
  }
  if(weeks&&!times){
    dateString = year+'-'+addZero(month)+'-'+addZero(day)+' '+'星期'+week;
  }
  return dateString;
}

/*
补位 当某个字段不是两位数时补0
给时间函数用
*/
function addZero(str){
  var num;
  str>=10?num=str:num="0"+str;
  return num;
}

/*
laydateChoice(元素ID（'#id'）,时间类型(datetime所有),是否开启范围选择boolean)
laydateChoice('#mio-dateRange','datetime','~',false);
 */
function laydateChoice(ele,datetype,range,bl){
  laydate.render({
    elem: ele, //指定元素
    type:datetype,
    /* year	年选择器	只提供年列表选择
     month	年月选择器	只提供年、月选择
     date	日期选择器	可选择：年、月、日。type默认值，一般可不填
     time	时间选择器	只提供时、分、秒选择
     datetime	日期时间选择器	可选择：年、月、日、时、分、秒*/
    range: range, //或 range: '~' 来自定义分割字符
    // ,format: 'yyyy-MM-dd HH:mm:ss'
    /*   yyyy-MM-dd HH:mm:ss	2017-08-18 20:08:08
         yyyy年MM月dd日 HH时mm分ss秒	2017年08月18日 20时08分08秒
         yyyyMMdd	20170818     dd/MM/yyyy	18/08/2017
         yyyy年M月	2017年8月     M月d日	8月18日
         北京时间：HH点mm分	北京时间：20点08分
         yyyy年的M月某天晚上，大概H点	2017年的8月某天晚上，大概20点*/
    // value: nowDate(0)+' 00:00:00'+' ~ '+nowDate(0)+' 23:59:59',//必须遵循format参数设定的格式
    // ,min: '2017-1-1',
    // max: nowDate(0)+' 23:59:59',//日期有效范围限定
    max: nowDate(0),//日期有效范围限定
    //日期有效范围只限定在：2017年 ,min: '2017-1-1' ,max: '2017-12-31'
    //时间有效范围设定在: 上午九点半到下午五点半,min: '09:30:00' ,max: '17:30:00'
    // ,btns: ['clear', 'now' ,'confirm']
    theme: 'grid',/*主题*/
    // ,calendar: true/*是否显示公历节日*/
    // ,lang: 'en'/*国际版*/
    closeStop: ele ,show: bl, //直接显示，防止highcharts点击的bug问题
    // trigger: 'click',/*防止闪现问题 采用click弹出*/
    //结束时间默认为23:59:59
    // done: function(date){
    //   $(".layui-laydate-footer [lay-type='datetime'].laydate-btns-time").click();
    //   $(".laydate-main-list-1 .layui-laydate-content li ol li:last-child").click();
    //   $(".layui-laydate-footer [lay-type='date'].laydate-btns-time").click();
    // },
    extrabtns: [
      {id: 'today', text: '今天', range: [new Date(), new Date()]},
      {id: 'lastday-7', text: '过去7天', range: [new Date(new Date().setDate(new Date().getDate()-7)), new Date(new Date().setDate(new Date().getDate()-1))]},
      {id: 'lastday-30', text: '过去30天', range: [new Date(new Date().setDate(new Date().getDate()-30)), new Date(new Date().setDate(new Date().getDate()-1))]},
      {id: 'yesterday', text: '昨天', range: [new Date(new Date().setDate(new Date().getDate()-1)), new Date(new Date().setDate(new Date().getDate()-1))]},
      {id: 'thismonth', text: '本月', range: [timeUtils(0,1,false,null,null,null,false,false),new Date()]},
      {id: 'lastmonth', text: '上个月', range: [timeUtils(1,1,false,null,null,null,false,false),timeUtils(0,0,false,null,null,null,false,false)]}
    ],
  });
}

/*
highcharts图表设置
highchartOpt('container','column','bar11')
*/
function highchartOpt(ele,type,name) {
  chart = Highcharts.chart(ele, {
    chart: {
      type: type,
      // spline  折线图  areaspline  面积折线图 bar 横柱状图 column 竖向柱状图
      backgroundColor: 'rgba(0,0,0,1)',
      // backgroundColor: 'transparent', // 背景色
      // plotBackgroundImage: '../images/ssybg.jpg'/*背景色用图片代替*/
    },
    title: {
      // text: null // 不展示标题
      text:'业务量数量',align:'center',
      floating:false,/*是否浮动，设置浮动后，标题将不占用图表区位置*/
      // margin:130,/*标题和图表区的间隔，当有副标题时，表示标题和副标题之间的间隔*/
      style:{color: 'red',fontSize: '18px',fontWeight:600,fontFamily:'YouYuan'},
      x:10,y:10/*相对于水平、垂直对齐的偏移量*/
    },
    subtitle: {
      text: null // 不展示标题
      /*text: 'Source: WorldClimate.com',
      style:{color: 'red',fontSize: '13px',fontWeight:600},*/
    },
    xAxis: {
      title: {text: null},
      crosshair: true,/*十字准心线*/
      lineColor: 'transparent', /*x轴线颜色*/
      // alternateGridColor: '#FDFFD5', // 隔行变色
      /*数据*/
      categories: ['胡22歌', '林心..如', '维11维信息', '二代证符号1a[]', '测..试[专用]', '测试字符数特殊..符号','胡22歌', '林心..如', '维11维信息', '二代证符号1a[]', '测..试[专用]', '测试字符数特殊..符号'],
      labels: {
        reserveSpace:true, // 不占用图表内容，坐标轴文字左对齐时使用
        align:'left', // 坐标轴文字左对齐 center right
        rotation: 0, // 坐标轴文字旋转
        step: 1, /*间隔刻度*/
        style: {
          color: 'rgba(255,255,255,1)'/*坐标轴文字颜色*/
        },
        formatter: function() {
          //对坐标轴文字的处理
          //获取到刻度值
          var labelVal = this.value;
          //实际返回的刻度值
          var reallyVal = labelVal;
          //判断刻度值的长度
          if(strlength(labelVal) > 15){
            //截取刻度值
            reallyVal = labelVal.substr(0,2)+'...'
            // reallyVal = labelVal.substr(0,8)+"<br/>"+labelVal.substring(3,labelVal.length-1);
          }
          return reallyVal;
        },
      },
      tickInterval:1, /*间隔显示*/
      tickPixelInterval: 10,/*坐标轴刻度间隔*/
      // offset: 0, /*x坐标轴文字距离图表的距离*/
      tickColor: 'transparent', /*刻度线颜色 |小竖条*/
      visible: true/*是否显示坐标轴*/
    },
    yAxis: {
      endOnTick: false, /*强制数据结束于标线*/
      opposite: false, // 对面显示 坐标轴从左边换到右边
      title: {text: null},
      crosshair: true,/*十字准心线*/
      gridLineColor: 'transparent',/*网格线颜色 多个横线===*/
      // gridLineDashStyle: 'longdash', /*将网格线变为虚线--*/
      labels: {
        rotation: 45, // 坐标轴文字旋转
        step: 1, /*显示间隔*/
        style: {
          color: 'rgba(255,255,255,1)'/*坐标轴文字颜色*/
        },
        formatter: function () {
          return this.value /*+ 'k'*/;
        }
      },
      // offset: 151, /*y坐标轴文字距离图表的距离*/
      visible: true,/*是否显示坐标轴*/
      /*每个小刻度的线的控制  设置黑色的Y轴次级刻度线*/
      // minorGridLineColor: '#C5EEFA',/*次网格线的颜色*/
      // minorGridLineDashStyle: 'longdash',/*次级网格线的风格为长破折号*/
      // minorTickInterval: 'auto',/*次网格*/
      //  minorGridLineWidth: 3,
      //  minorTickInterval: 'auto',
      //  minorTickColor: '#ffffff',
      //  minorTickWidth: 1
    },
    tooltip: {
      crosshairs: true,
      shared: true,
      formatter: function () {
        return(this.x+'<br>'+'<span style="font-weight: bold">下载量</span>：'+this.y);
      }
      /*formatter: function () {
          // console.log();
          // console.log(this.points.series.points);
          return('['+dataType[this.points[0].point.index]+']'+this.x+'<br>'+'<span style="font-weight: bold">下载量</span>：'+this.y);
      }*/
    },
    plotOptions: {
      bar: {
        dataLabels: {
          enabled: true,
          allowOverlap: true, // 允许数据标签重叠
        },
        pointWidth: 13, // 柱子的宽度
      },
    },
    series: [
      {
        name: name,cursor:'pointer',/*变换手势*/
        marker: {
          // enabled: false, // 不显示图表上的点
          symbol: 'diamond', // 点的类型 square
          radius: 5, // 点的圆角
          lineColor: 'white', // 折线图点的边框颜色
          lineWidth: 2, // 折线图点的边框宽度
        },
        enableMouseTracking: true, // 禁用鼠标滑入显示
        color:'lightblue', // 线条颜色 或者面积图包围背景色 柱状图柱子色 ,折线图点的背景色
        lineColor: 'white', // 线条颜色
        fillOpacity: 0.3, // 面积图包围背景色通明度
        dashStyle: 'Solid',
        /*线条样式Solid ShortDash   ShortDot  ShortDashDot  ShortDashDotDot Dot Dash
        LongDash    DashDot LongDashDot LongDashDotDo*/
        data: [3.7, 5.2, 4.7, 6.5, 19, 12.2, 1.0, 5.6, 4.2, 3.3, 6.6, 4.8]
      }
    ],
    /*关闭图例series的name*/
    legend: {
      enabled: true,
      itemDistance: 100,/*多个图列名字之间的距离*/
      itemHiddenStyle: {color: 'lightblue'}, /*图例隐藏时颜色*/
      itemStyle: {color: 'white', fontWeight: 'bold'}, /*图例基本样式*/
      itemHoverStyle: {color: 'white'}, /*图例滑入时样式*/
      // floating: true,x: 90,y: 60,
    },
    /*是否显示版权信息*/credits: {enabled: false},
    /*导出功能模块*/exporting: {enabled: false},
  })
}

/*
精确字符串的实际长度，汉字代表2个长度，其他（数字，符号）代表一个长度
 */
function strlength(str) {
  //先把中文替换成两个字节的英文，在计算长度
  return str.replace(/[\u0391-\uFFE5]/g,"aa").length;
}

/*
返回随机数
mathRandom() 10以内的整数
mathRandom(100,false) 100以内的两位小数
mathRandom(10,false,4) 10以内的4位小数
 */
function mathRandom(num,ifint,decimal) {
  if(num==undefined) num = 100;
  if(ifint==undefined) ifint = true;
  if(decimal==undefined) decimal = 2;
  var number = (Math.random()*num).toFixed(decimal);
  if(ifint) number = Math.round(number);
  return number;
}

/*
键盘事件(加入回调函数)
27 esc 13 回车
*/
function keyFun(keycode,callback){
  $(document).keydown(function (event) {
    if (event.keyCode == keycode) {
      callback()
    }
  });
}

/*
获取cookie的值
 */
function getCookie(cookieName) {
  if (document.cookie.length>0)
  {
    c_start=document.cookie.indexOf(cookieName + "=")
    if (c_start!=-1)
    {
      c_start=c_start + cookieName.length+1
      c_end=document.cookie.indexOf(";",c_start)
      if (c_end==-1) c_end=document.cookie.length
      return unescape(document.cookie.substring(c_start,c_end))
    }
  }
  return ""
}

/*
设置cookie 全站有效
让cookie失效 setcookie('userToken','',-1)
*/
function setCookie(name, value, liveMinutes) {
	if (liveMinutes == undefined || liveMinutes == null) {
		liveMinutes = 60 * 2;
	}
	if (typeof (liveMinutes) != 'number') {
		liveMinutes = 60 * 2;//默认120分钟
	}
	var minutes = liveMinutes * 60 * 1000;
	var exp = new Date();
	exp.setTime(exp.getTime() + minutes + 8 * 3600 * 1000);
	//path=/表示全站有效，而不是当前页
	document.cookie = name + "=" + value + ";path=/;expires=" + exp.toUTCString();
}

/*
定时器
 */
function timer(callback,time){
  if(time==undefined) time = 3000;
  var hd = setInterval(function(){
    callback();
  }, time);
}

/*
文字向上滚动。
containerId 滚动板外层节点的 ID
numViews 分几屏滚动，需要滚动显示的总行数应该是分屏数的整倍数 可填返回值的length。
showTime 每屏固定住时显示的时间，单位毫秒
scrollTime 每次滚动一屏用的时间，单位毫秒
ScrollUl('scrollGj', $('#scrollGj ul li').length, 1000, 200);
 */
function ScrollUl(containerId, numViews, showTime, scrollTime) {
  //定时器变量，因为有移到层上时停止滚动的事件处理，而那时可能还没开始定时器呢，所以先把这个变量声明出来。
  this.timer=null;
  this.numViews = numViews;
  this.showTime = showTime;
  this.scrollTime = scrollTime;
  this.container = document.getElementById(containerId);
  var ulChild = this.container.getElementsByTagName('ul');
  var ul = ulChild[0];
  //ul 是未使用 CSS 明确指定高度的，IE 中用 realstyle 取不到高度，只能得到 auto，而 getBoundingClientRect() 是 IE 和 FF 都支持的方式。
  var rect = ul.getBoundingClientRect();
  var heightAll = rect.bottom - rect.top;
  var heightView = heightAll / this.numViews;
  var msPerPx = this.scrollTime / heightView;
  //复制出一份来，接在原块的后面，用于头接尾的显示

  var ulCopy = ul.cloneNode(true);
  ulCopy.style.top = heightAll+'px';
  this.container.appendChild(ulCopy);
  var itself = this;
  //向上滚动的函数
  var scrollView = function() {
    var oldTop = (''==ul.style.top) ? 0: parseInt(ul.style.top) ;
    //移动到顶后，把位置复原，两个块继续从 0 开始向上移。
    if (oldTop < -heightAll)
    {
      oldTop = 0;
    }
    ul.style.top = (oldTop - 1) +'px';
    ulCopy.style.top = (oldTop + heightAll- 1) +'px';
    //每滚一整屏多停一会。oldTop-1 是为了让其停在整数位置。
    var duration = (0 == ((oldTop-1) % heightView)) ? itself.showTime:msPerPx;
    itself.timer = setTimeout(scrollView, duration);
  };
  //把 slide 定义为 prototype 的方法时，似乎这样 setTimeout(itself.slide, itself.showTime); 定时操作不灵，而只能是局部函数才能定时操作，如果带参数，还得封装成匿名函数：
  itself.timer = setTimeout(scrollView, itself.showTime);
  //鼠标移上时停止滚动
  this.container.onmousemove = function() {
    console.log(1111);
    window.clearTimeout(itself.timer);
  };
  //鼠标移开时继续滚动，不用区分当时是在整屏停止还是滚动中了，全都按静止时间来延时就得了。
  this.container.onmouseout = function() {
    console.log("sad");
    itself.timer = setTimeout(scrollView, itself.showTime);
  };
};

/*
swiper按钮滑入滑出隐藏显示
swiperBtn($('.swiper-container'));
*/
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
swiper('.swiper-container',3,10);
元素，显示个数，距离
*/
function swiper(ele,gs,jl) {
  var swiper = new Swiper(ele, {
    mousewheel: true,/*鼠标滑轮控制*/
    loop : false,/*循环*/
    // slidesPerView: 'auto',
    // loopedSlides: 4,
    // autoplay: autoplay,//可选选项，自动滑动
    autoplay : {
      delay:5000,
      disableOnInteraction: false, // 触碰后自动切换也不会停止
      reverseDirection: false, // 是否开启反向轮播
    },

    // effect : 'fade', // fade cube coverflow flip
    // fade效果参数
    /*fadeEffect: {
      crossFade: true,
    },*/

    // cube效果参数
    /*cubeEffect: {
      slideShadows: true,
      shadow: true,
      shadowOffset: 100,
      shadowScale: 0.6
    },*/

    // coverflow效果
    /*coverflowEffect: {
      rotate: 30,
      stretch: 10,
      depth: 60,
      modifier: 2,
      slideShadows : true
    },*/
    // centeredSlides: true,
    // autoHeight: true, //高度随内容变化
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

  /*鼠标滑入滑出，关闭开启自动播放*/
  swiper.el.onmouseover = function(){
    swiper.autoplay.stop();
  };
  swiper.el.onmouseleave = function(){
    swiper.autoplay.start();
  }
}

/*跳转页面*/
function hrefPage(url) {
  window.location.href=url;
}

/*刷新界面*/
function reload() {
  window.location.reload()
}

/*
点击元素除其本身以外的地方调用函数
closest会首先检查当前元素是否匹配，如果匹配则直接返回元素本身。
如果不匹配则向上查找父元素，一层一层往上，直到找到匹配选择器的元素。
如果什么都没找到则返回一个空的jQuery对象。
 */
function noItself(ele,callback){
  $(document).bind("click", function (e) {
    if($(e.target).closest(ele).length>0){
      // 点击其本身调用的事件
    }else{
      // 点击除其本身调用的事件
      callback()
    }
  });
}