<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<%@include file="../common.jsp"%>
	<script src="${basePath}js/other/custom.box.main.js"></script>
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
		/*.mini-grid-headerCell{border: transparent;}*/
		/*标题头字体设置*/
		.mini-grid-headerCell-inner{font-weight: bold}
		/*调整分页栏的位置*/
		.mini-pager-left{float: right;}
		.mini-pager-right{float: left;margin-left: 8px;}
		/*分页栏当前{1}字体大小*/
		.mini-pager-num{font-size: 14px}
		/*Ie浏览器可能出现的BUG*/
		.mini-pager-num{line-height: 16px}
		.mini-pager-pages{font-size: 14px}
		/*表格边框的隐藏*/
		/*.mini-grid-border{border-left: transparent;border-top: transparent;}*/
		.disable{pointer-events: none;}
	</style>
	<script>
        $(function () {

            test222();
            $('.logout').click(function () {
                $.ajax({
                    url: "/user/logout",//请求路径
                    type: "POST",//请求方式
                    async:true,/*异步*/
                    dataType: "json",//数据类型可以为 text xml json  script  jsonp
                    success: function(result){//返回的参数就是 action里面所有的有get和set方法的参数
                        console.log(result);
                        if(result.commonResultInfo.message=='操作成功'){
                            $(location).attr('href', '${basePath}login');
                        }
                    },
                    error: function (result) {
                        console.log(result);
                        mntip('操作失败','danger');
                        grid.reload();
                    }
                });
            })
        })
        function test222() {
            var _ticket = $.cookie("userToken");
            if(!_ticket){
                return ;
            }
            $.ajax({
                url : "http://localhost:8080/user/token/" + _ticket,
                dataType : "jsonp",
                type : "GET",
                success : function(data){
                    $('.name').html(data.username)
                }
            });
        }



	</script>

</head>
<body style="background: #eee">
<h1>欢迎用户：</h1>
<span class="name"></span>
<br>
<a class="logout">退出</a>
<div style="width: 1045px;height: 500px">
	<%--查询--%>
	<div style="width: 1045px;height: 40px;margin-top: 20px">

		<%--form表单的提交URL根据搜索与导出设置不同的提交方式--%>
		<%--搜索、导出条件设置--%>
		<form id="queryForm" style="margin-left: 110px;height: 40px" <%--action="/user/treeList" --%> method="get" >
			<div  style="float: left">
				<%--搜索条件输入框--%>
				<input style="width: 80px;" type="text" class="mio-inp-common search1" name="departNames">
				<span class="glyphicon glyphicon-remove small mio-remove"></span>

				<%--搜索条件输入框--%>
				<%--<input style="width: 80px;margin-left: 7px" type="text" class="mio-inp-common search2" name="mioLeftListCustom.status">--%>
				<%--<span class="glyphicon glyphicon-remove small mio-remove"></span>--%>

				<%--多余搜索条件添加--%>
				<%--对于select设置css position: relative;top:-0.5px;--%>
				<select  style="padding-top: 3px;margin-left: 8px"  class="mio-sel browserCss2" name="" >
					<option value="" selected>请选择</option>
					<option value="1">使用</option>
					<option value="0">禁用</option>
				</select>

				<%--<input type="hidden" name="ids" id="rowIds">--%>
			</div>



			<%--导入导出查询--%>
			<div class="browserCss" style="float: left;margin-left: 5px;margin-top: 3px">
				<%--查询按钮--%>
				<div style="display: inline;" onclick="searchTable();">
					<i class="fa fa-search" style="color: white;margin-right: -23px"></i>
					<input style="width: 60px;padding-left: 15px" type="button" value="查询"  class="mio-btn-blue">
				</div>
				<%--导入--%>
				<div style="display: inline;margin-left: 9px">
					<i class="fa fa-arrow-circle-o-up" style="color: white;margin-right: -23px"></i>
					<input style="width: 60px;padding-left: 15px;" type="button" value="导入"  class="mio-btn-blue">
				</div>
				<%--导出--%>
				<div style="display: inline;margin-left: 9px" onclick="excelExport()">
					<i class="fa fa-arrow-circle-o-down" style="color: white;margin-right: -23px"></i>
					<input style="width: 60px;padding-left: 15px;" type="button" value="导出"  class="mio-btn-blue">
				</div>

			</div>
		</form>

		<%--增删改加保存--%>
		<div class="mio-btn-curd browserCss1" style="height: 40px;width: 400px;margin-left: 903px;margin-top: -38px">
			<%--修改--%>
			<div class="mio-upt" style="display: inline">
				<i class="fa fa-pencil" style="color: white;margin-right: -23px"></i>
				<input style="width: 85px;padding-left: 15px;cursor: pointer" type="button" value="开启编辑"  class="mio-btn-blue">
			</div>
			<%--新增--%>
			<div class="addrow" style="display: inline;margin-left: 10px" onclick="addRow()" >
				<i class="fa fa-plus" style="color: white;margin-right: -23px"></i>
				<input style="width: 60px;padding-left: 15px;cursor: pointer" type="button" value="添加"  class="mio-btn-blue">
			</div>
			<%--删除--%>
			<div style="display: inline;margin-left: 10px" onclick="delRows()">
				<i class="fa fa-times" style="color: white;margin-right: -23px"></i>
				<input style="width: 60px;padding-left: 15px;cursor: pointer" type="button" value="删除"  class="mio-btn-blue">
			</div>
			<%--保存--%>
			<div style="display: inline;margin-left: 10px" onclick="saveData()">
				<i class="fa fa-save" style="color: white;margin-right: -23px"></i>
				<input style="width: 60px;padding-left: 15px;cursor: pointer" type="button" value="保存"  class="mio-btn-blue">
			</div>
			<%--保存--%>
			<div style="display: inline;margin-left: 10px" class="qxbj">
				<i class="fa fa-save" style="color: white;margin-right: -23px"></i>
				<input style="width: 60px;padding-left: 15px;cursor: pointer" type="button" value="取消"  class="mio-btn-blue">
			</div>
		</div>
	</div>

	<%--datagrid表格设置（可编辑）--%>
	<div class="mio-shadow" style="z-index: 1000;margin: 0 auto;width: 1045px;margin-left: 110px" >

		<div id="pager1" class="mini-pager" style="width:1045px;height: 30px;border: 1px solid rgb(197, 197, 197);border-bottom: none" sizeList=[30,60,90,700] pageSizeWidth=58 ></div>
		<%--datagrid--%>
		<div id="datagrid1" class="mini-datagrid" style="height: 500px"
			 url='/common/infosss' ajaxType="get" showHeader=false title="MIO" <%--显示表头以及表头命名--%>
			 columns= columns <%--列的集合--%> pager="#pager1"
			 pageSize=30 sizeList=[30,60,90,700] <%--显示条数|页尺寸集合--%>
		<%--virtualScroll=true --%><%--虚拟滚动。当显示的数据超过500以上时，请设置此属性，能极大提升性能--%>
			 virtualColumns=false <%--虚拟滚动列，在列较多时有用，提高性能--%>
			 sortField=id sortOrder="asc" sortMode="client" <%--排序字段 排序方向 排序模式设置为"client"后则时客户端排序--%>
			 showColumns=true <%--显示表头--%>
			 showPagerButtonText=false <%--显示分页按钮文本--%>
			 showHGridLines=true showVGridLines=false <%--显示横/竖向表格线条--%>
			 showCellTip=true <%--允许单元格提示框（当宽度变小有省略号时）--%>
			 allowCellWrap=false <%--允许单元格换行--%>
			 allowSortColumn=true allowMoveColumn=true allowResizeColumn=true <%--允许列排序 允许移动列 允许拖拽调节列宽度--%>
			 allowCellSelect=true <%--允许选中单个单元格--%>
			 multiSelect=true <%--多选框--%>
			 allowAlternating=true <%--显示斑马纹--%> allowResize=true <%--是否拖拽调节表头列宽度--%>
			 pageSizeWidth=58 <%--分页控件pageSize选择框的宽度--%>
			 allowCellEdit="false" editNextOnEnterKey="false"  editNextRowCell="false"<%--编辑单元格--%>
			 pageIndexField="pageIndex" <%--分页索引字段名--%>
			 pageSizeField="pageSize" <%--分页条数字段名--%>
			 sortFieldField="sortField" <%--排序字段的字段名--%>
			 sortOrderField="sortOrder" <%--排序方向字段名--%>
			 totalField="total" dataField="data" <%--数据字段名--%>
			 showColumnsMenu=true<%--显示列菜单。实现显示、隐藏列。--%>
			 skipReadOnlyCell="true"<%--tab导航编辑时非编辑直接跳过--%>
			 showSortIcon="false"<%--显示可派序列的提示图标。--%>
		>
			<%--列定义--%>
			<div property="columns">
				<div type="indexcolumn" width="15" headerAlign="center" >序号</div>
				<div type="checkcolumn"></div>
				<div field="area" width="30" allowSort="true"  align="center" headerAlign="center" >area
					<input  property="editor" class="mini-textbox" style="width:100%;" minWidth="100" />
				</div>
				<div field="cityName" name="New Name" width="50" allowSort="true"  headerAlign="center" requiredErrorText="帐号不能为空" align="center">cityName
					<input  property="editor" class="mini-textbox" style="width:100%;" minWidth="100" />
				</div>
				<div field="city" <%--renderer="onisParent"--%>  width="60" allowSort="true"  align="center" headerAlign="center" >city</div>
				<%--autoShowPopup="true"编辑时是否自动显示下拉框--%>
				<div field="departName" autoShowPopup="true" width="40" headerAlign="center"
					 align="center" allowSort="true"  class="test11">departName
					<input property="editor" class="mini-combobox"
						   style="width:100%;" minWidth="100"
						   renderer="onStatus"
					/>
				</div>

				<div field="longitude" width="50" headerAlign="center" align="center" allowSort="true">longitude
					<input property="editor"  class="mini-textbox" style="width:100%;" minWidth="100" />
				</div>
				<div field="latitude" width="50" headerAlign="center" align="center" allowSort="true">latitude</div>
			</div>
		</div>


	</div>

	<%--错误信息div--%>
	<div class="mio-tipDiv browserCss4" style="display: none">
		<div style="">
			<em style="margin-left: 125px;">提示</em>
			<span title="关闭" style="visibility: visible;margin-left: 265px;margin-top: -15px;display: block" class="browserCss5 glyphicon glyphicon-remove small mio-remove" onclick="$('.mio-tipDiv').slideUp();$('#mask').remove();"></span>
		</div>
		<br>
		<ul style="cursor: pointer;margin-top: -20px" class="mio-errCon"></ul>
		<input title="关闭" style="width: 40px;height: 20px;margin-left: 120px;margin-top: -10px" type="button" class="mio-btn-white closeDiv" onclick="$('.mio-tipDiv').slideUp();$('#mask').remove();" value="close">
	</div>
</div>
<script>




    mini.parse();/*将html标签解析为miniui控件。解析后，才能使用mini.get获取到控件对象。*/
    var grid = mini.get("datagrid1");/*根据ID获取*/
    grid.load();
    <%--var Status = [{ id: ${tests.dictcode}, text: ${tests.info} }];--%>
    /*ie下CSS调整*/
    getBrowser();
    function ieCss() {
        $('.browserCss').css({'margin-left':15+'px'});
        $('.browserCss1').css({'margin-left':903+'px'});
        $('.browserCss2').css({'padding-top':2+'px'});
        $('.browserCss4').css({'width':310+'px'});
        $('.browserCss5').css({'margin-left':280+'px'});
    }
    tableControl();
    /*提示框*/
    /* $('.mio-upt').click(function () {
		 if($('.mio-upt input').val()=='开启编辑'){
			 tableControl();
			 // checkTip($('.mio-upt'),'开启编辑','right','center');
			 $('.addrow').addClass("disable");
			 $('.mio-upt input').val("取消编辑");
		 }else{
			 tableControlf();
			 // checkTip($('.mio-upt'),'取消编辑','right','center');
			 $('.mio-upt input').val("开启编辑")
			 $('.addrow').removeClass("disable");
		 }
	 });*/
    /*退出键关闭*/
    escHide($('.mio-tipDiv'));
    /*输入框X*/
    remove($('.search1'));
    remove($('.search2'));
    /*自定义右键菜单*/
    rightMenu('http://localhost:8080/treetable');
    /*有增删改的数据未保存*/
    beforeConfirm();

    /*根据值更改展示文字*/
    /*  var isParents = [{ id: 'true', text: '否' }, { id: 'false', text: '是'}];
	  function onisParent(e) {
		  for (var i = 0, l = isParents.length; i < l; i++) {
			  var g = isParents[i];
			  if (g.id == e.value) return g.text;
		  }
		  return "";
	  }
  */
    var Status = [{ id: 0, text: '禁用111' },{ id: 1, text: '使用222' }];
    function onStatus(e) {
        for (var i = 0, l = Status.length; i < l; i++) {
            var g = Status[i];
            if (g.id == e.value) return g.text;
        }
        return "";
    }

</script>
<script type="text/javascript">



    /*导出条件设置*/
    function excelExport(){
        /*导出时form表单的url*/
        $('#queryForm').attr('action','/common/tableLists');
        $("#rowIds").val('');
        var indexs = [];//定义一个数组准备存放删除记录的序号
        var rows = grid.getSelecteds();//选中的行
        //循环遍历选中行,把选中行的ID加到所需input内
        for (var i = 0; i < rows.length; i++) {
            var r = rows[i];
            indexs.push(r.id);
        }
        if (rows.length > 0) {
            $("#rowIds").val(indexs.join(','));
        }
        if( $("#rowIds").val()==''){
            mini.confirm('确认导出全部数据？','系统提示',function (r){
                if(r=='ok'){
                    jquerySubByFId('queryForm',excelExport_callback,null,"json");
                }else{

                }
            })
        }
        if( $("#rowIds").val()!=''){
            mini.confirm('确认导出选中数据？','系统提示',function (r){
                if(r=='ok'){
                    jquerySubByFId('queryForm',excelExport_callback,null,"json");
                }else{

                }
            })
        }
    }
    /*搜索设置*/
    function searchTable() {

        $('#queryForm').attr('action','/common/infosss');
        formsearch($('#queryForm'));
    }

    function excelExport_callback(data){
        //在这里提示信息中有文件下载链接
        message_alert(data);

    }
    $('.qxbj').click(function () {
        // grid.cancelEdit();
        grid.load();
        // var newRow = { name: "New Name" ,status:"1"};
        // grid.cancelEditRow(grid.getSelected())
        // grid.addRows(newRow, 0 )
    });
    function onActionRenderer(e) {
        var grid = e.sender;
        var record = e.record;
        var uid = record._uid;
        var rowIndex = e.rowIndex;

        var s = '<a class="New_Button" href="javascript:newRow()">New</a>'
            + ' <a class="Edit_Button" onclick="show()" >Edit</a>'
            + ' <a class="Delete_Button" onclick="delRow()">Delete</a>';

        // if (grid.isEditingRow(record)) {
        //     s = '<a class="Update_Button" href="javascript:updateRow(\'' + uid + '\')">Update</a>'
        //         + '<a class="Cancel_Button" href="javascript:cancelRow(\'' + uid + '\')">Cancel</a>'
        // }
        return s;
    }
    function newRow() {
        var row = { name: "New Name" ,status:"1"};
        grid.addRow(row, 0);

        // grid.cancelEdit();
        grid.beginEditRow(row);
    }
    /*添加数据*/
    function addRow() {
        tableControl();
        /*添加新行的默认值*/
        var newRow = { parentId:'请输入',name: "请输入" ,status:"1",url:''};
        /*新增行的位置*/
        grid.addRow(newRow, 0);
        /*新增行默认编辑的单元格*/
        grid.beginEditCell(newRow);
        /*选中新增的行*/
        grid.select(newRow);
    }

    /*保存数据（新增，修改）*/
    function saveData() {
        /*提交修改的数据*/
        var data = grid.getChanges();
        /*把JS对象序列化为字符串*/
        console.log(data);
        var json = mini.encode(data);
        // dataArr1=null;
        var dataArr = [];
        for(i=0;i<data.length;i++){
            if(data[i].name==''){
                dataArr.push('第'+(i+1)+'行'+'<em style="color:red">名称</em>'+'不能为空');
            }
            if(data[i].parentId==''||data[i].parentId==null){
                dataArr.push('第'+(i+1)+'行'+'<em style="color:red">父id</em>'+'不能为空');
            }
        }

        /*数组转成字符串*/
        dataArr1 = dataArr.join(',');
        /*替换*/
        // dataArr1 = dataArr1.replace(/,/g,'');

        var url;

        if(data!=null&&data!=''){
            if(data[0]._state=='modified'){
                url='/user/uptrees'
            }
            if(data[0]._state=='added'){
                url='/user/myadds'
            }
        }
        console.log(json);
        if(data.length!=0){
            /*如果没有空数据则保存*/
            if(dataArr1==''||dataArr1==null){
                grid.loading("保存中，请稍后......");
                $.ajax({
                    url: url,
                    data: { data: json },
                    type: "post",
                    success: function (text) {
                        mntip("保存成功！",'info');
                        /*关闭编辑*/
                        tableControlf();
                        grid.reload();
                    },
                    error: function (jqXHR, textStatus, errorThrown) {
                        alert(jqXHR.responseText);
                    }
                });
            }else{
                $('.mio-errCon').html('');
                for(var i=0;i<dataArr.length;i++){
                    console.log(dataArr[i]);
                    $('.mio-errCon').html($('.mio-errCon').html()+'<li style="float: left;">'+dataArr[i]+'&nbsp;&nbsp;'+'</li>');
                }
                addScroll($('.mio-errCon'),200);
                $('.mio-tipDiv').slideDown();
                /*开启遮罩*/
                mask();
                /*开启编辑*/
                tableControl();
                mntip("保存失败！",'danger')
            }
        }
    }


    /*根据id查询用户信息*/
    function show() {
        var row = grid.getSelected();
        addPage('/user/showTreebyId?mioLeftListCustom.id='+row.id,'编辑',1000,500);
    }


    /*单个删除*/
    function delRow() {
        /*获取当前行的数据*/
        var row = grid.getSelected();
        mini.confirm('确认删除？','系统提示',function (r){
            if(r=='ok'){
                grid.loading("操作中，请稍后......");
                $.ajax({
                    url: "/user/delRow",//请求路径
                    type: "POST",//请求方式
                    data:{id:row.id},
                    async:false,/*同步*/
                    dataType: "json",//数据类型可以为 text xml json  script  jsonp
                    success: function(result){//返回的参数就是 action里面所有的有get和set方法的参数
                        grid.reload();
                        /*提示后台返回信息result.commonResultInfo.message*/
                        mntip(result.commonResultInfo.message,'info');
                    },
                    error: function (result) {
                        console.log(result);
                        mntip('操作失败','danger');
                    }
                });
            }else{

            }
        })
    }

    /*批量单个删除*/
    function delRows() {
        /*把选中行的ID加到字符串中*/
        var rows = grid.getSelecteds();
        var ids = [];
        for (var i = 0;i < rows.length; i++) {
            var r = rows[i];
            ids.push(r.id);
        }
        var id = ids.join(',');

        if (rows.length > 0) {

            mini.confirm('确认删除？','系统提示',function (r){
                if(r=='ok'){
                    grid.loading("操作中，请稍后......");
                    $.ajax({
                        url: '/user/delRows?id='+id,
                        success: function (result) {
                            mntip(result.commonResultInfo.message,'info');
                            grid.reload();

                        },
                        error: function (result) {
                            console.log(result);
                            mntip('操作失败','danger');
                            grid.reload();
                        }
                    });
                }else{

                }
            })
        } else {
            mntip("请选中一条记录!","danger");
        }
    }
</script>
</body>
</html>