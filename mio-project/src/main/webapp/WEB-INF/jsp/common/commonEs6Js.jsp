/*miniui提示*/
let tip = (con,st='info',time=2000) => {
mini.showTips({
content:con,
state: st,
x: 'center',
y: 'center',
timeout: time
});
}

/*
ajax请求，默认get
1、get方式的安全性较Post方式要差些，包含机密信息的话，建议用Post数据提交方式；
2、在做数据查询时，建议用Get方式；而在做数据添加、修改或删除时，建议用Post方式；

上传文件时
ajaxFn("${basePath}upload", (data) => {
tip(data.resultInfo.message);
}, 'post', formData, false, false);

get请求(get参数可填undefined)
ajaxFn(`${basePath}sts/qst?
beginTime=${'${bt}'}&endTime=${'${et}'}&region=${'${re}'}&tabName=${'${tn}'}`, (data) => {
console.log(data);
}, undefined);
post请求
ajaxFn('${basePath}sts/qst', (data) => {
console.log(data);
}, 'post', {beginTime:bt,endTime:et,region:re,tabName:tn});

嵌套ajax请求
ajaxFn('${basePath}', (data) => {
console.log(data);
}).then(() => {
ajaxFn('${basePath}', (data) => {
console.log(data);
});
});
*/
let  ajaxFn = (url,callback,type="get",param,
// contentType="application/x-www-form-urlencoded; charset=utf-8",
contentType="application/json;charset=utf-8",
processData="true") => {
let p = new Promise((resolve, reject) => {
$.ajax({
type: type,
url: url,
data: param,
dataType: 'json',
// 设置请求头Content-Type，上传文件时设置为false
contentType: contentType,
/* 上传文件时
* 必须false才会避开jQuery对 formdata 的默认处理
* XMLHttpRequest会对 formdata 进行正确的处理
* jquery独有的。processData的默认值是true。用于对data参数进行序列化处理
*/
processData: processData,
cache: false, // 是否缓存
beforeSend () {
$("body").append('<div id="pload" style="position:fixed;top:30%;left:43%;z-index:1200;' +
'background:url('+getUrl()+'/images/loading.gif) top center no-repeat;width:200px;height:30px;' +
'margin:auto auto;"></div>');
},
complete () {
$("#pload").remove();
},
success: (data) => {
callback(data);
resolve();
},
error: () => {
tip('操作失败，请联系管理员','danger');
reject();
}
});
});
return p;
}

/*获取当前项目地址*/
let getUrl = () => {
//获取当前网址，如： http://localhost:8083/uimcardprj/share/meun.jsp
let curWwwPath=window.document.location.href;
//获取主机地址之后的目录，如： uimcardprj/share/meun.jsp
let pathName=window.document.location.pathname;
let pos=curWwwPath.indexOf(pathName);
//获取主机地址，如： http://localhost:8083
let localhostPaht=curWwwPath.substring(0,pos);
//获取带"/"的项目名，如：/uimcardprj
let projectName=pathName.substring(0,pathName.substr(1).indexOf('/')+1);
return(localhostPaht+projectName);
}

/*
20190329141344 时间随机数
timeUtils(0,new Date().getDate(),true).replace(/-/g,'').replace(/:/g,'').replace(/\s+/g,'')
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
let timeUtils = (monthNum,dayNum,times=false,hourNum=new Date().getHours(),minNum=new Date().getMinutes(),
secondNum=new Date().getSeconds(),millSecondNum=new Date().getMilliseconds(),weeks=false,ifTrans=true,milltimes=false) => {
let time =
new Date(
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
).setMilliseconds(millSecondNum)
);
if(ifTrans){
return transferDate(time,times,weeks,milltimes);
}else{
return time
}
}

/*
实时展示当前时间
showTime($('#time'))
showTime($('#time'),false) // 不显示星期
*/
let showTime = (ele,ifweek=true) => {
setInterval(function(){
ele.html(timeUtils(0,new Date().getDate(),new Date().getHours(),
new Date().getMinutes(),new Date().getSeconds(),true,ifweek))
},1000);
}

/*日期转换(中国标准时间)*/
let transferDate = (date,times,weeks,milltimes=false) => {
var date = new Date(date);
var year = date.getFullYear(); // 从 Date 对象以四位数字返回年份。
var month = date.getMonth()+1; // 从 Date 对象返回月份 (0 ~ 11)。
var week = date.getDay(); // 从 Date 对象返回一周中的某一天 (0 ~ 6)。
var day = date.getDate();  // 从 Date 对象返回一个月中的某一天 (1 ~ 31)。
var hour = date.getHours();	// 返回 Date 对象的小时 (0 ~ 23)。
var min = date.getMinutes(); // 返回 Date 对象的分钟 (0 ~ 59)。
var second = date.getSeconds();	// 返回 Date 对象的秒数 (0 ~ 59)。
var millSecond = date.getMilliseconds();	// 返回 Date 对象的秒数 (0 ~ 59)。
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
if(milltimes){
dateString = year+'-'+addZero(month)+'-'+addZero(day)+' '+addZero(hour)+':'+addZero(min)+':'+addZero(second)+':'+addZero(millSecond);
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
let addZero = str => {
let num;
str>=10?num=str:num="0"+str;
return num;
}

/*
laydateChoice(元素ID（'#id'）,时间类型(datetime所有),是否开启范围选择boolean)
laydateChoice('#mio-dateRange','datetime','~',false);
*/
function laydateChoice(ele,datetype='datetime',range='~',bl){
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

let GetQueryString = name =>
{
let reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)");
let r = window.location.search.substr(1).match(reg);
if(r!=null)return  unescape(r[2]); return null;
}

/*跳转页面*/
let hrefPage = url => {
window.location.href=url;
}

/*当前时间随机数 int型*/
let dateNum = () => {
return parseInt(timeUtils(0,new Date().getDate(),true).replace(/-/g,'').replace(/:/g,'').replace(/\s+/g,''));
}

/*当前时间随机数 添加自定义字符串 字符串型 到毫秒*/
let dateNumString = (str="mystr") => {
return timeUtils(0,new Date().getDate(),true,undefined,undefined,undefined,undefined,false,true,true).replace(/-/g,'').replace(/:/g,'').replace(/\s+/g,'')+str
}

