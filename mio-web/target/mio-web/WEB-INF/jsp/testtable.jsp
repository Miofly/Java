<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@include file="common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8" />
    <style>
        /*能够根据浏览器高度table表格自适应*/
        html,body{/*height:100%; */margin-top: 0;}
        /*标题行颜色及边距*/
        .mini-panel-header-inner{background: white!important;padding: 0px 4px 5px 3px!important;}
        /*表头的标题位置*/
        .mini-panel-title{padding: 5px 0 0 5px}
        /*表头颜色*/
        .mini-grid-topRightCell,.mini-grid-headerCell{background: rgb(247,244,253)/*background: rgb(212,230,254)*/}
        /*去除标题头边框*/
        .mini-grid-headerCell{border: transparent;}
        /*调整分页栏的位置*/
        .mini-pager-left{float: right;}
        .mini-pager-right{float: left;margin-left: 8px;}
        /*当前页字体大小*/
        .mini-pager-num{font-size: 14px}
        .mini-pager-pages{font-size: 14px}
        /*表格边框的隐藏*/
        /*.mini-grid-border{border-left: transparent;border-top: transparent;}*/

    </style>
</head>
<body style="background: #eee">
<a href="/logout">logout</a>
<h3>欢迎当前用户：${activeUser.username}&nbsp;&nbsp;</h3>
<div style="margin: 30px auto;width:80%;height: 30%" >
    <%--搜索功能实现--%>
    <form id="sysuserqueryForm" class="mio-table-tool" style="height: 33px" action="/user/mytest">
        <input type="hidden" name="indexs" id="indexs" />
        <div class="mio-tabel-search" style="float: left">
            <input placeholder="请输入userid" name="sysuserCustom.userid" id="key" class="mio-inp-common" type="text"  style="height: 30px;width: 100px;">
            <input placeholder="请输入name" name="sysuserCustom.username"  id="key1" class="mio-inp-common" type="text" style="height: 30px;width: 100px;">
            <input placeholder="请输入sysmc" name="sysuserCustom.sysmc" id="key2" class="mio-inp-common" type="text" style="height: 30px;width: 100px;">
            <span class="glyphicon glyphicon-remove small mio-remove"></span>
            <div style="margin-top: -30px;margin-left: 311px">
                <select class="mio-sel" name="sysuserCustom.groupid" style="">
                 <%--
                    <option value="1">卫生局</option>
                    <option value="2">卫生院</option>
                    <option value="3">卫生室</option>
                    <option value="4">供货商</option>
                    <option value="0">系统管理员</option>--%>
                     <option value="" selected>请选择</option>
                     <c:forEach items="${groupList}" var="dictinfo">
                         <option value="${dictinfo.dictcode }">${dictinfo.info}</option>
                     </c:forEach>
                </select>
            </div>
            <div style="margin-left: 420px;margin-top: -30px;">
                <i class="fa fa-search" style="color: blue;margin-right: -23px"></i>
                <input style="" class="mio-btn-white" type="button" value="查询" onclick="search()">
            </div>
        </div>

        <div class="mio-table-other" style="float: right;margin-right: 2px">
            <input class="mio-btn-white" type="button" value="新增" id="add">
            <input class="mio-btn-white" type="button" value="修改" id="update">
            <input class="mio-btn-white" type="button" value="删除" id="mio-del" onclick="dels()">
        </div>
    </form>
    <%--datagrid--%>
    <div id="datagrid1" class="mini-datagrid" style="height: 500px"></div>
</div>

<%--删除表单--%>
<form id="sysuserdeleteform" action="/user/delsysuser" method="get">
    <input type="hidden" id="delete_id" name="id" />
</form>

<script type="text/javascript">
    mini.parse();/*将html标签解析为miniui控件。解析后，才能使用mini.get获取到控件对象。*/

    var grid = mini.get("datagrid1");/*根据ID获取*/

    /*表格列的定义*/
    var columns = [
        { type: "indexcolumn",width:20,headerAlign:'center'},
        { type: "checkcolumn"},
        { field: 'id',header: 'id',width:30,allowSort:true},
        { field: 'userid', header: 'userid', width: 50, headerAlign: 'center',allowSort:true,align:"center"},
        { field: 'username', header: 'username', width: 100, headerAlign: 'center',allowSort:true,align:"center"},
        { field: 'groupname', header: 'groupname', width: 30, headerAlign: 'center',allowSort:true,align:"center"/*,renderer:"onGroupid"*/},
        { field: 'userstate', header: 'userstate', width: 100, headerAlign: 'center',allowSort:true,align:"center",renderer:"onUserstate"},
        { field: 'sysmc', header: 'sysmc', width: 100, headerAlign: 'center',allowSort:true,align:"center"},
        { field: 'sc', header: '操作', width: 30, headerAlign: 'center',allowSort:true,align:"center",renderer:"onDel"},
        { field: 'sc1', header: '操作', width: 30, headerAlign: 'center',allowSort:true,align:"center",renderer:"onUp"}
    ];
    /*id,url*/
    datagrid('/user/yy');

/*$('#mio-del').click(function () {
       var rows = grid.getSelecteds();
       if (rows.length > 0) {
               var idss = [];
               for (var i = 0, l = rows.length; i < l; i++) {
                   var r = rows[i];
                   idss.push(r.id);
               }
               var ids = idss.join(',');
               console.log(ids);
           deleteusers(ids);
       }
   })*/

    function onUp() {
        return "<a onclick='edituser(grid.getSelected().id)'>修改</a>";
    }
    /*自定义删除列*/
    function onDel() {
        return "<a onclick='deleteuser(grid.getSelected().id)'>删除</a>";
    }
    /*验证框*/
    function _confirm(question,method_cancel,method_ok){
        mini.confirm(question, '系统提示', function(r) {
            console.log(r);
            if(r=='ok'){
                method_ok();
            }
        });

    };
    function edituser(id) {
        console.log(id);
        add('/user/editsysuser?id='+id,"修改信息",1000,600);
    }
    /*删除用户方法*/
    function deleteuser(id){
        _confirm('您确认删除吗？',null,function (){
            //将要删除的id赋值给deleteid，deleteid在sysuserdeleteform中
            $("#delete_id").val(id);
            //使用ajax的from提交执行删除
            //sysuserdeleteform：form的id，userdel_callback：删除回调函数，
            //第三个参数是url的参数
            //第四个参数是datatype，表示服务器返回的类型
            jquerySubByFId('sysuserdeleteform',userdel_callback,null,"json");
        });
    }
    /*回调函数*/
    function userdel_callback(data){
        console.log(data);
        //刷新 页面
        //在提交成功后重新加载 datagrid
        //取出提交结果
        var type=data.resultInfo.type;
        if(type==1){
            grid.load();
        }
    }





    /*根据数据库值变化*/
  /*
    function onGroupid(e) {
        var groupid = [{ id: 0, text: '系统管理员' },
            { id: 1, text: '卫生局' }, { id: 2, text: '卫生院'},
            { id: 3, text: '卫生室'}, { id: 4, text: '供货商'}];
        for (var i = 0, l = groupid.length; i < l; i++) {
            var g = groupid[i];
            if (g.id == e.value) return g.text;
        }
        return "";
    }
   */

    function onUserstate(e) {
        var userstate = [{ id: 0, text: '禁用' },
            { id: 1, text: '使用' }];
        for (var i = 0, l = userstate.length; i < l; i++) {
            var g = userstate[i];
            if (g.id == e.value) return g.text;
        }
        return "";
    }
    /*搜索设置*/
    function search() {
        /*把form表单的所有值转换成json数据*/
        var formdata = $("#sysuserqueryForm").serializeJson();
        console.log(formdata);
        grid.load(formdata);
    }

    $('#add').click(function () {
        add('http://localhost:8080/addsysuser',"新增员工",1000,600);
    });
    /*弹出页面*/
    function add(url,title,width,height) {
        mini.open({
            targetWindow: window,//页面对象。默认是顶级页面。
            url: url,//页面地址
            title: title, //标题
            allowResize:true,//允许尺寸调节
            allowDrag: true,         //允许拖拽位置
            showCloseButton: true,   //显示关闭按钮
            showMaxButton: true,     //显示最大化按钮
            showModal: true,        //显示遮罩
            width: width, height: height,
            onload: function () {   //弹出页面加载完成

            },
            ondestroy: function (action) {

                grid.reload();
            }
        });
    }
    function dels(){
        var indexs = [];//定义一个数组准备存放删除记录的序号
        var rows = grid.getSelecteds();
        //循环遍历选中行
        for (var i = 0; i < rows.length; i++) {
            var r = rows[i];
            indexs.push(r.id);
        }
        if (rows.length > 0) {
            $("#indexs").val(indexs.join(','));
            console.log($("#indexs").val());
            jquerySubByFId('sysuserqueryForm', gysypmladd_callback, null);
        }else{
            alert("请选择要删除的药品");
        }
    }
    function gysypmladd_callback(data) {
        var result = getCallbackData(data);
        console.log(result.message);
        _alert(result);//输出信息
    }
</script>
</body>
</html>