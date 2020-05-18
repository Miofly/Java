<%--
  Created by IntelliJ IDEA.
  User: MIO
  Date: 2019/3/27
  Time: 14:29
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
		body {width: 100%;height: 90%;background: url(${basePath}images/calendar/3.jpg) no-repeat;background-size: 100% 100%;}

	</style>
</head>
<body>
<div id="app" >
	<Modal style="transition: 1s;" v-model="visible2"  width="800"
		   @on-ok="ok" @on-cancel="cancel"
		   ok-text="确认"	:styles="{top: '20px'}"
		   cancel-text="取消"
		   title="查看事件">
		<div>
			<span>事件类型：</span>
			<i-select v-model="schevent.schType" @on-change="getItemValue" search style="width:200px" id="ivew-search1">
				<i-option v-for="item in eventType"
						  :value="item.schType" :key="item.schType">
					{{ item.schTypename }}</i-option>
			</i-select>
		</div>
		<br>
		<div>
			<span>事件标题：</span>
			<i-input v-model="schevent.schTitle" id="sjbt" clearable placeholder="请输入事件标题" style="width: 200px" />
		</div>
		<br>
		<div>
			<span>开始时间：</span>
			<%--
				type：date、daterange、datetime、datetimerange、year、month
				:value="value1" 绑定默认value
				format format="yyyy年MM月dd日 HH时mm分ss秒 "
			--%>
			<date-picker v-model="schevent.beginTime"
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
			<i-input  v-model="schevent.schDesc" autosize type="textarea" :rows="4" placeholder="请输入事件描述" />
		</div>
		<br>
		<div style="width: 100px;margin: 0 auto">
			<i-button  type="dashed" size="small" @click="show1" style="">添加详细步骤</i-button>
		</div>
		<transition name="slide-fade">
			<div id="ifons1"  style="margin-top: 1px">
				<div style="margin-left: 47.5%;width: 100px;margin-top: 7px;margin-bottom: 7px" >
					<Icon title="添加步骤" @click="add" class="addThing" size="25" style="margin: 0 auto;" type="ios-add-circle-outline" />
				</div>
				<%--详细捕步骤--%>
				<div v-for="(todo, index) in step"  style="width: 650px;height: 40px">
					<div style="float: left">
						<span>开始时间：</span>
						<date-picker v-model="todo.beginTime" type="datetime" :options="options1" placeholder="选择开始时间"
									  confirm style="width: 170px">
						</date-picker>
					</div>
					
					<%--<div style="float: left">
						<span  style="margin-left: 10px">事件类型：</span>
						<i-input v-model="todo.detailType" clearable placeholder="请选择事件类型" style="width: 230px" />
					</div>--%>

					<div style="float: left">
						<span  style="margin-left: 10px">事件标题：</span>
						<i-input v-model="todo.detailContent" clearable placeholder="请输入事件标题" style="width: 230px" />
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
                    beginTime: '',
                    endTime: '',
                    schDesc: '',
                    schId: parseInt(GetQueryString("id")),
                    // updateTime: ''
                },
                step:[],

				subThing: [],

                sjTitle: '',
                eveSel: '',
				starttime: '',
				endtime: '',
                scheDesc: '',

				cont: '',

                visible: true,
                visible1: true,
                visible2: true,
                eventType: [],

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
                let self = this;
                // console.log(this.step[index].schId);
                // console.log(this.step[index].detailId);
                this.subThing.push({schId:this.step[index].schId,detailId:this.step[index].detailId})
                this.step.splice(index,1)
            },
            /*模态框执行事件*/
            ok () {
                let self = this;
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

                // this.schevent.updateTime = timeUtils(0,new Date().getDate(),true);
                this.schevent.beginTime = transferDate(this.schevent.beginTime,true);
                this.schevent.endTime = transferDate(this.schevent.endTime,true);



				let stepNew = [];
				let stepOld = [];


                ajaxFn(`${basePath}sche/upEvent`, (data) => {
                    // console.log(data);
                    <%--hrefPage("${basePath}common/calendar/calendar")--%>
                },'post',JSON.stringify(this.schevent)).then(() => {

                    for(let i=0;i<this.step.length;i++){
                        if(this.step[i].resField1==="new"){
                            stepNew.push(this.step[i])
                        }
                        if(this.step[i].resField1===null||this.step[i].resField1===""||this.step[i].resField1==="no"){
                            stepOld.push(this.step[i])

                        }
                    }

                    ajaxFn('${basePath}sche/upSubEvent', (data) => {
                    },'post',JSON.stringify(stepOld));

                    ajaxFn('${basePath}sche/insertSubEvt', (data) => {
                    },'post',JSON.stringify(stepNew));

					ajaxFn('${basePath}sche/delSubEvent', (data) => {
                        hrefPage("${basePath}common/calendar/calendar")
					},'post',JSON.stringify(this.subThing));
				})

            },
            cancel () {
                hrefPage("${basePath}common/calendar/calendar")
            },
            add () {
                this.step.push({
                    schId: parseInt(GetQueryString("id")),
                    detailId: dateNumString("datail"),
                    detailContent: '',
                    beginTime: '',
                    createdTime: timeUtils(0,new Date().getDate(),true),
                    resField1: "new"
                })
            }
        },
        created: function () {
            //为了在内部函数能使用外部函数的this对象，要给它赋值了一个名叫self的变量。
            let self = this;
            ajaxFn(`${basePath}sche/event?schId=${'${GetQueryString("id")}'}`, (data) => {
                self.schevent.schTitle = data[0].schTitle;
                self.schevent.schType = data[0].schType;
                self.schevent.beginTime = data[0].beginTime;
                self.schevent.endTime = data[0].endTime;
                self.schevent.schDesc = data[0].schDesc;
            });
            ajaxFn('${basePath}sche/type', (data) => {
                self.eventType = data;
            });
            ajaxFn(`${basePath}sche/mge?id=${'${GetQueryString("id")}'}`, (data) => {
				console.log(data);
                self.step=data
            });
        }
    })


</script>
</body>
</html>
