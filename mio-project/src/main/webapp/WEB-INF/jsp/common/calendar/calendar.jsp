<%--
  Created by IntelliJ IDEA.
  User: MIO
  Date: 2019/3/25
  Time: 8:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Title</title>
	<%@include file="../../commonES6.jsp" %>
	<link rel="stylesheet" href="${basePath}css/calendar/fullcalendar.css">
	<link rel="stylesheet" href="${basePath}css/calendar/fullcalendar.print.css" media='print' >
	<script src="${basePath}js/calendar/lunar.js"></script>
	<script src="${basePath}js/calendar/moment.min.js"></script>
	<script src="${basePath}js/calendar/fullcalendarNew.js"></script>

	<%--iview--%>
	<link rel="stylesheet" type="text/css" href="${basePath}js/iview/dist/styles/iview.css">
	<script type="text/javascript" src="${basePath}js/iview/vue.min.js"></script>
	<script type="text/javascript" src="${basePath}js/iview/dist/iview.js"></script>

	<style>
		/*3 5 6*/
		body {width: 100%;height: 90%;background: url(${basePath}images/calendar/3.jpg) no-repeat;background-size: 100% 100%;}
		/*表格长宽*/
		#calendar {margin: 20px auto 0px;max-width: 1200px;
			background: rgba(255,255,255,0.1);border-radius: 10px}
		/*事件放置上去鼠标样式*/
		.fc-event-container a{cursor: pointer}
		/*星期六背景色和字体颜色*/
		.fc-unthemed td.fc-sat{background: rgba(215,215,215,0.7)!important;color:black;; border: 1px solid #ddd;border-bottom: none}
		/*星期天背景色和字体颜色*/
		.fc-unthemed td.fc-sun{background: rgba(215,215,215,0.7)!important;color:black; border: 1px solid #ddd;border-bottom: none}
		.fc-content-skeleton td{}
		/*今天背景色和字体颜色*/
		.fc-unthemed td.fc-today {background: #f3715c;color: white;; border: 1px solid #ddd;border-bottom: none }
		/*今天的按钮样式*/
		.fc-today-button,.fc-button{background: white;transition: 0.3s}
		.fc-today-button:hover,.fc-button:hover{color: #57a3f3;background-color: #fff;border-color: #57a3f3;}
		/*天的字体样式*/
		.fc-day-number{font-size: 16px}
		/*节日字体样式*/
		.fc-day-cnTerm{font-size: 16px;font-family: YouYuan}
		/*所有边框颜色*/
		.fc-unthemed th, .fc-unthemed td, .fc-unthemed thead, .fc-unthemed tbody, .fc-unthemed .fc-divider, .fc-unthemed .fc-row, .fc-unthemed .fc-content, .fc-unthemed .fc-popover, .fc-unthemed .fc-list-view, .fc-unthemed .fc-list-heading td{
			border-color: #ddd;
		}
		/*!*表格高度的调节*!*/
		/*.fc-basic-view .fc-body .fc-row{min-height: 2px}*/
		/*!*按钮字体颜色调节 *!*/
		/*.fc button{font-size: 10px;color: black}*/
		/*!*周标题样式调节*!*/
		/*.fc-widget-header{color: black;font-family: YouYuan;font-style: normal;*/
		/*font-size: 14px;font-weight: normal}*/
		/*!*周六周天单独设置调节，选择是否日期样式跟随*!*/
		/*!*.fc-sun,.fc-sat{color: red}*!*/
		/*.fc-sun,.fc-sat{color: red!important;}*/
		/*!*天样式调节*!*/
		/*.fc-day-top{color: #64a4f5;font-size: 10px;cursor: pointer}*/
		/*!*当天格子样式调节*!*/
		/*.fc-unthemed td.fc-today{border: none;background: rgba(235,248,251,1)}*/
		/*!*天文字居中,垂直和水平*!*/
		/*.fc .fc-row .fc-content-skeleton table, .fc .fc-row .fc-content-skeleton td, .fc .fc-row .fc-helper-skeleton td{text-align: center}*/
		/*.fc-row .fc-content-skeleton{line-height: 27px;}*/
		/*.fc-ltr .fc-basic-view .fc-day-top .fc-day-number{float: none;clear: both!important;padding: 0}*/
		/*!*上个月文字颜色*!*/
		/*.fc-other-month{color: black;}*/
		/*!*取消日历边框*!*/
		/*.fc td, .fc th{border: none}*/
		/*.fc button, .fc table, body .fc{font-size: 10px;background: white;}*/
		/*!*标头前进后退按钮样式*!*/
		/*.fc-toolbar button{outline:none;!*取消按钮点击的边框*!border:0px;background-color:transparent;font-family: YouYuan;color: black;font-size: 14px}*/
		/*.fc-toolbar.fc-header-toolbar{margin-bottom: 5px}*/
		/*!*中间按钮位置*!*/
		/*.fc-toolbar .fc-center{margin-top: 1px}*/
		/*.fc-center button{padding-top: -7px;margin-top: -2px;padding-left: 10px}*/
		/*!*最左最右侧按钮位置*!*/
		/*.fc .fc-toolbar>*>*{margin-left: 0;padding-left: 5px}*/
		/*.fc .fc-toolbar>*>*{margin-left: 0;padding-left: 5px}*/
		/*.fc .fc-toolbar>*>:first-child{margin-left: 1px}*/
		/*.fc .fc-toolbar>*>:nth-child(2){margin-right: 1px}*/
		/*!*标头title*!*/
		/*.fc-center h2{margin-right: 5px;font-size: 14px;font-weight: normal;font-family: YouYuan;margin-top: 5px}*/
		/*!*按钮的阴影*!*/
		/*.fc-state-default{box-shadow: none}*/
		/*!*表格背景颜色*!*/
		/*.fc-view-container table{background: white}*/
		/*!*事件的个数样式*!*/
		/*tr:first-child>td>.fc-day-grid-event{margin-top: -25px;text-align: center;*/
		/*margin-left: 23px;color: white!important;font-style: normal;opacity: 0.7;*/
		/*width: 0.8rem;height: 0.8rem;border-color: red!important;z-index: 1;*/
		/*background: rgba(255,0,0,1)!important;border-radius: 50%;padding: 0;line-height: .8rem;}*/
		/*.fc-day-grid-event .fc-time{font-weight: normal;}*/
	</style>
	<style>
		/* 可以设置不同的进入和离开动画 */
		/* 设置持续时间和动画函数 */
		.slide-fade-enter-active {
			transition: all .3s ease;
		}
		.slide-fade-leave-active {
			transition: all .3s cubic-bezier(1.0, 0.5, 0.8, 1.0);
		}
		.slide-fade-enter, .slide-fade-leave-to
			/* .slide-fade-leave-active for below version 2.1.8 */ {
			transform: translateX(10px);
			opacity: 0;
		}
		.ivu-icon-ios-add-circle-outline{transition: 0.5s;cursor: pointer}
		.ivu-icon-ios-add-circle-outline:hover{color: #57a3f3}
		.fc-day-top.fc-other-month{opacity: 0.5}
		.fc-day-header div{font-size: 16px}
	</style>
</head>
<body style="">

	<div id='calendar' style="position: relative">
		<div id="app">
			<i-button @click="show" style="position: absolute;top:0;left: 675px;">+新建</i-button>
			<%--
				@on-ok	@on-cancel 模态框按钮确定取消事件
				:loading="loading" 点击确定按钮对话框不会自动消失，并显示 loading 状态 表单提交
				:closable="false" 禁用关闭含esc
				:mask-closable="false" 禁用遮罩层
				:styles="{top: '20px'}" 距离顶部20px
				class-name="vertical-center-modal" 垂直居中
				scrollable 页面是否可以滚动
				<style lang="less">
   					.vertical-center-modal{
   					    display: flex;
   					    align-items: center;
   					    justify-content: center;

   					    .ivu-modal{
   					        top: 0;
   					    }
   					}
				</style>
				fullscreen 全屏显示 	footer-hide	可以隐藏底部内容
				draggable	对话框可以进行拖拽移动
			--%>
			<Modal style="transition: 1s" v-model="visible" width="580"
				   @on-ok="ok" @on-cancel="cancel"
				   ok-text="确认" <%--fullscreen--%> :styles="{top: '20px'}"
				   cancel-text="取消"
				   title="新增事件">
				<div>
					<span>事件类型：</span>
					<i-select v-model="schevent.schType" @on-change="getItemValue" search style="width:200px" id="ivew-search">
						<i-option v-for="item in cityList"
								  :value="item.schType" :key="item.schType">
							{{ item.schTypename }}</i-option>
					</i-select>
				</div>
				<br>
				<div>
					<span>事件标题：</span>
					<i-input v-model="schevent.schTitle" clearable placeholder="请输入事件标题" style="width: 200px" />
				</div>
				<br>
				<div>
					<span>开始时间：</span>
					<%--
						type：date、daterange、datetime、datetimerange、year、month
						:value="value1" 绑定默认value
						format format="yyyy年MM月dd日 HH时mm分ss秒 "
					--%>
					<date-picker  v-model="schevent.beginTime"
						type="datetime" :options="options1" placeholder="选择开始时间"
						<%--format="yyyy-MM-dd HH:mm:ss"--%> confirm
						style="width: 200px">
					</date-picker>

					<span>结束时间：</span>
					<date-picker v-model="schevent.endTime"
								 type="datetime" :options="options1" placeholder="选择结束时间"
					<%--format="yyyy-MM-dd HH:mm:ss"--%> confirm
								 style="width: 200px">
					</date-picker>
				</div>
				<br>
				<div>
					<span>事件描述：</span>
					<i-input  v-model="schevent.schDesc"  autosize type="textarea" :rows="4" placeholder="请输入事件描述" />
				</div>
				<br>
				<div style="width: 100px;margin: 0 auto">
					<i-button  type="dashed" size="small" @click="show1" style="/*margin: 0 auto*/">添加详细步骤</i-button>
				</div>
				<transition name="slide-fade">
					<div id="ifons" v-show="visible1" style="margin-top: 1px">
						<div style="margin-left: 46.3%;width: 100px">
							<Icon title="添加步骤" @click="add" class="addThing" size="25"  type="ios-add-circle-outline" />
						</div>
						<%--详细捕步骤--%>
						<div v-for="(todo, index) in step" style="height: 40px">
							<div style="float: left">
								<span>开始时间：</span>
								<date-picker v-model="todo.beginTime"  type="datetime" :options="options1" placeholder="选择开始时间"
											 confirm style="width: 170px">
								</date-picker>
							</div>

							<div style="float: left">
								<span style="margin-left: 10px">事件标题：</span>
								<i-input  v-model="todo.detailContent"  clearable placeholder="请输入事件标题" style="width: 200px" />
							</div>

							<icon @click="delSubEvt(index)" style="float: left" size="30"  type="ios-trash-outline" />
						</div>

					</div>
				</transition>

				<%--自定义按钮--%>
				<%--<div slot="footer">
					<i-button type="error" size="large" long  >Delete</i-button>
				</div>--%>
			</Modal>
		</div>
	</div>

<%--<script src="${basePath}js/common/common_newsES6.js"></script>--%>
<script type="text/babel">
    <%@include file="../../common/commonEs6Js.jsp"%>
    new Vue({
        el: '#app',
        data () {
            return {
				schevent: {
                    schType: '',
                    schTitle: '',
                    beginTime: timeUtils(0,new Date().getDate(),true,0,0,0),
                    endTime: timeUtils(0,new Date().getDate(),true,23,59,59),
                    schDesc: '',
                    schId: parseInt(timeUtils(0,new Date().getDate(),true).replace(/-/g,'').replace(/:/g,'').replace(/\s+/g,'')),
					createdTime: timeUtils(0,new Date().getDate(),true)
       			},

                sjTitle: '',
                visible: false,
                visible1: false,
                visible2: false,
                cityList: [],
                step:[{
                    schId: '',
                    detailId: dateNumString("datail"),
                    detailContent: '',
                    beginTime: '',
                    createdTime: timeUtils(0,new Date().getDate(),true)
				}],
                model8: '',
                value1: timeUtils(0,new Date().getDate(),true,0,0,0),
                value2: timeUtils(0,new Date().getDate(),true,23,59,59),
                // 选择器额外配置
                loading: true,
                options1: {
                    /*
					   设置快捷选项，每项内容：
					   text | String：显示的文案
					   value | Function：返回指定的日期，如需自己控制逻辑，可不设置，并使用 onClick 回调
					   onClick | Function：点击时的回调，参数为当前日期选择器的 Vue 实例，当需要自定义复杂操作时，可以使用
					*/
                    shortcuts: [
                        {
                            text: '今天',
                            value () {
                                return new Date();
                            },
                            onClick: (picker) => {
                                // this.$Message.info('Click today');
                            }
                        },
                        {
                            text: '昨天',
                            value () {
                                return timeUtils(0,new Date().getDate()-1,true,0,0,0);
                            },
                        },
                        {
                            text: '前天',
                            value () {
                                return timeUtils(0,new Date().getDate()-2,true,0,0,0);
                            },
                        },
                        {
                            text: '明天',
                            value () {
                                return timeUtils(0,new Date().getDate()+1,true,0,0,0);
                            },
                        },
                        {
                            text: '后天',
                            value () {
                                return timeUtils(0,new Date().getDate()+2,true,0,0,0);
                            },
                        },
                        {
                            text: '本周一',
                            value () {
                                return timeUtils(0,new Date().getDate()-(new Date().getDay()||7)+1,true,0,0,0);
                            },
                        },
                        {
                            text: '本周五',
                            value () {
                                return timeUtils(0,new Date().getDate()-(new Date().getDay()||7)+5,true,0,0,0);
                            },
                        },
                        {
                            text: '本月初',
                            value () {
                                return timeUtils(0,1,true,0,0,0);
                            },
                        },
                        {
                            text: '本月末',
                            value () {
                                return timeUtils(-1,0,true,0,0,0);
                            },
                        }
                    ]
                },
                options2: {
                    shortcuts: [
                        {
                            text: '1 week',
                            value () {
                                const end = new Date();
                                const start = new Date();
                                start.setTime(start.getTime() - 3600 * 1000 * 24 * 7);
                                return [start, end];
                            }
                        },
                        {
                            text: '1 month',
                            value () {
                                const end = new Date();
                                const start = new Date();
                                start.setTime(start.getTime() - 3600 * 1000 * 24 * 30);
                                return [start, end];
                            }
                        },
                        {
                            text: '3 months',
                            value () {
                                const end = new Date();
                                const start = new Date();
                                start.setTime(start.getTime() - 3600 * 1000 * 24 * 90);
                                return [start, end];
                            }
                        }
                    ]
                }
            }
        },
        methods: {
            show: function () {
                this.visible = true;
            },
            show1: function () {
                this.visible1 = !this.visible1;
            },
            show2(test) {
                let self = this;
                this.visible2 = !this.visible2;
            },
            getItemValue(val) {
                // 当下拉框的值改变后，这里可以通过改变的值向后台发送请求获取其他数据。
                // 可以通过函数默认的返回值 val 获取到下拉框选中的值
                // 也可以通过select绑定的值 this.formSend.code 获取到下拉框选中的值
                console.log(val);
            },
            delSubEvt (index) {
                this.step.splice(index,1)
			},
            /*模态框执行事件*/
            ok () {
                Date.prototype.format = function(fmt) {
                    var o = {
                        "M+" : this.getMonth()+1,                 //月份
                        "d+" : this.getDate(),                    //日
                        "h+" : this.getHours(),                   //小时
                        "m+" : this.getMinutes(),                 //分
                        "s+" : this.getSeconds(),                 //秒
                        "q+" : Math.floor((this.getMonth()+3)/3), //季度
                        "S"  : this.getMilliseconds()             //毫秒
                    };
                    if(/(y+)/.test(fmt)) {
                        fmt=fmt.replace(RegExp.$1, (this.getFullYear()+"").substr(4 - RegExp.$1.length));
                    }
                    for(var k in o) {
                        if(new RegExp("("+ k +")").test(fmt)){
                            fmt = fmt.replace(RegExp.$1, (RegExp.$1.length==1) ? (o[k]) : (("00"+ o[k]).substr((""+ o[k]).length)));
                        }
                    }
                    return fmt;
                }

                /*
				 * 重写时间的toJSON方法，因为在调用JSON.stringify的时候，时间转换就调用的toJSON，这样会导致少8个小时，所以重写它的toJSON方法
				 */
                Date.prototype.toJSON = function () {
                    return this.format("yyyy-MM-dd hh:mm:ss"); // util.formatDate是自定义的个时间格式化函数
                };
                let eveData;

                this.schevent.schId = dateNum();
                this.schevent.createdTime = timeUtils(0,new Date().getDate(),true);
                this.schevent.beginTime = transferDate(this.schevent.beginTime,true);
                this.schevent.endTime = transferDate(this.schevent.endTime,true);

				ajaxFn('${basePath}sche/insertEvt', (data) => {

				},"post",JSON.stringify(this.schevent)).then(() => {

 				    for(let i=0;i<this.step.length;i++){
                        this.step[i].schId = this.schevent.schId;
					}
                    ajaxFn('${basePath}sche/insertSubEvt', (data) => {
                        window.location.reload()
                    },"post",JSON.stringify(this.step));
                });
            },
            cancel () {

            },
            add () {
                this.step.push({
                    schId: '',
                    detailId: dateNumString("datail"),
                    detailContent: '',
                    beginTime: '',
                    createdTime: timeUtils(0,new Date().getDate(),true)
                })
            }
        },
        created: function () {
            //为了在内部函数能使用外部函数的this对象，要给它赋值了一个名叫self的变量。
            let self = this;
            ajaxFn('${basePath}sche/type', (data) => {
                self.cityList = data;
            });
        }
    })




    <%--<%@include file="../../common/commonEs6Js.jsp"%>--%>
    $('#calendar').fullCalendar({
        header: {
            /*
			title: 显示当前月份/周/日信息
			prev: 用于切换到上一月
			next: 用于切换到下一月
			prevYear：用于切换到上一年视图的按钮
			nextYear：用于切换到下一年视图的按钮
			*/
            left: ' prevYear, prev', //
            center: 'title today addEvent',
            right: 'next, nextYear'
        },
        /*按钮文字*/
        buttonText:{
            prevYear:     '<<',  /*prevYear: '«', // «*/
            prev:     '<',
            next: '>',
            nextYear: '>>',
            today:    '今天',
            // month:    '月',
            // week:     '周',
            // day:      '日'
        },
        /*自定义按钮*/
        // customButtons: {
        //     addEvent: {
        //         text: '新建+',
        //         click: function() {
        //             alert('点击了自定义按钮!');
        //         }
        //     }
        // },
        // 限制显示在一天的事件数
        eventLimit: 4,
        // 显示的文字
        eventLimitText: '更多',
        /*标题时间格式的设置*/
        views:{
            month:{
                titleFormat:"YYYY年M月"
            },
            week:{
                titleFormat:"YYYY年M月D日",
                columnFormat:"M.D dddd"
            },
            day:{
                titleFormat:"YYYY年M月D日 dddd",
                columnFormat:"M/D dddd"
            },

        },
        aspectRatio: 1.1,
        height: 630, // 设置日历的高度，包括header日历头部，默认未设置，高度根据aspectRatio值自适应
        // contentHeight: 181, // 设置日历主体内容的高度，不包括header部分，默认未设置，高度根据aspectRatio值自适应。
        firstDay: 1, // 设置一周中显示的第一天是哪天，周日是0，周一是1，类推。
        weekends: true, // 是否显示周末，设为false则不显示周六和周日。
        // defaultDate: '2019-01-12',
        // 月份展示文字 中文
        monthNames: ['一月', '二月', '三月', '四月', '五月', '六月', '七月', '八月', '九月', '十月', '十一月', '十二月'],
        // 默认
        // monthNames: ['January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December'],
        /*自定义周显示文字*/
        // dayNamesShort: ['Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat'],
        dayNamesShort: ['周日', '周一', '周二', '周三', '周四', '周五', '周六'],
        /*
		   当单击日历中的某一天时，触发callback，用法：
		   date是点击的day的时间(如果在agenda view, 还包含时间)，在月view下点击一天时，
		   allDay是true，在agenda模式下，点击all-day的窄条时，allDay是true，
		   点击其他的agenda view下的day则为false，jsEvent就是一个普通的javascript事件，
		   包含的是click事件的基础信息。
		*/
        dayClick: function(date, allDay, jsEvent, view) {
            // .fc-highlight { !* when user is selecting cells *!*/
            // background: #bce8f1;
            // opacity: .3;
            // if($(this).css('background-color')!='rgba(0, 0, 0, 0)'){
            //     $(this).removeClass('fc-highlight');
            //
            // }else{
            //     console.log($(this).css('background-color'));
            // }
        },
        eventClick: function(date, allDay, jsEvent, view, calEvent, seg) {
            window.location.href=`http://localhost:8081/soft/common/calendar/event?id=${'${date.id}'}`;
        },
        selectable:true, // 是否允许用户通过单击或拖动选择日历中的对象，包括天和时间。
        unselectAuto: true, // 当点击页面日历以外的位置时，是否自动取消当前的选中状态。
        // unselectCancel:  // 指定哪些元素不会清空当前的选中，以JQUERY选择器的方式指定 '#someId'。
        // 被选中的函数回调
        select: function (startDate, endDate, allDay, jsEvent, cell) {

        },
        unselect: function (startDate, endDate, allDay, jsEvent, cell) {
            /*   startDate：被选中区域的开始时间
			   endDate：被选中区域的结束时间
			   allDay：是否为全天事件
			   startDate：jascript对象
			   view：当前视图对象*/
            // console.log($(this))
            // console.log($(this).css('background-color'));
            // if($(this).css('background-color')!='rgba(0, 0, 0, 0)'){
            //     $(this).removeClass('fc-highlight');
            // }else{
            //     console.log($(this).css('background-color'));
            // }
        },
        dayRender: function (date, cell) {
            // if($('.fc-day-top').find('fc-day-cnTerm').length>0){
            //     console.log(date)
            // }
            // //
            // var today = new Date();
            // var end = new Date();
            // end.setDate(today.getDate()+7);
            //
            // // if (date.getDate() === today.getDate()) {
            // //     cell.css("background-color", "red");
            // // }
            //
            // for(var i=0;i<json.length;i++){
            //     console.log(json[i].start);
            //     if(transferDate(date._d) == json[i].start) {
            //         cell.css("background-color", "yellow");
            //     }
            // }


        },
        eventColor: '#8552a1', // 设置所有日程事件的背景色和边框颜色
        // eventBackgroundColor : 'lightblue', // 设置日程事件的背景色
        eventBorderColor : 'transparent',   // 设置日程事件的边框颜色
        // eventTextColor : 'yellow', // 设置日程事件的文字颜色
		events:[{"id":20190403210657,"block": true,"sch_type":"busisys","title":"231","start":"2019-04-03","end":"2019-04-04","backgroundColor":"#33a3dc"},
    {"id":20190404143318,"block": true,"sch_type":"busisys","title":"231","start":"2019-04-04","end":"2019-04-07","backgroundColor":"#33a3dc"},
    {"id":20190404143040,"block": true,"sch_type":"busisys","title":"业务系大萨达","start":"2019-04-01","end":"2019-04-06","backgroundColor":"#33a3dc"},
    {"id":20190404144714,"block": true,"sch_type":"perch","title":"123","start":"2019-04-02","end":"2019-04-09","backgroundColor":"#65c294"},
    {"id":20190404144818,"block": true,"sch_type":"marketing","title":"231","start":"2019-04-04","end":"2019-04-08","backgroundColor":"#9b95c9"},
    {"id":20190404142819,"block": true,"sch_type":"marketing","title":"123123","start":"2019-04-04","end":"2019-04-05","backgroundColor":"#9b95c9"},
    {"id":20190404142846,"block": true,"sch_type":"marketing","title":"231","start":"2019-04-14","end":"2019-04-23","backgroundColor":"#9b95c9"}],
        /*调用数据的url*/
        <%--eventSources: [--%>
            <%----%>
            <%--{--%>
                <%--url: `${basePath}sche/sche?timeStr=${}&createdUserid=`,--%>
                <%--type: 'POST',--%>
            <%--}--%>
        <%--]--%>
       /* events: function(start, end, timezone, callback) {
            // let timestr = transferDate(new Date()).replace(/-/g,'').substring(0,6);

            let str1;
            let str2;
            let strs = $('.fc-center h2').html().replace(/年/g,'').replace(/月/g,'');
            if(strs.length<6){
                str1 = strs.substring(0,4);
                str2 = strs.substring(4,5);
                strs = str1+'0'+str2
            }else {
                strs = $('.fc-center h2').html().replace(/年/g,'').replace(/月/g,'');
            }
			ajaxFn(`${basePath}sche/sche?timeStr=${'${strs}'}&createdUserid=`, (data) => {
               let events = [];
               $.each(data,function(i,dataBean){
                   events.push({
					   id: dataBean.id,
                       title: dataBean.title,
                       start: dataBean.start, // will be parsed
                       end: dataBean.end, // will be parsed
                       backgroundColor: dataBean.backgroundColor
                   });
               });
               callback(events);
           });
        }*/
    });


/*    let newStr;
    let str1;
    let str2;
    let strs = $('.fc-center h2').html().replace(/年/g,'').replace(/月/g,'');
    if(strs.length<6){
        str1 = strs.substring(0,4);
        str2 = strs.substring(4,5);
    }
    newStr = str1+'0'+str2*/







	/*根据特定日期设置单元格样式*/




</script>

</body>
</html>
