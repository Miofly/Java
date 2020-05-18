<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>软件详情</title>
    <%@include file="../common.jsp"%>
    <style>
        /*能够根据浏览器高度table表格自适应*/
        /*标题行颜色及边距*/
        .mini-panel-header-inner{background: white!important;padding: 0px 4px 5px 3px!important;}
        /*表头的标题位置*/
        .mini-panel-title{padding: 5px 0 0 5px}
        /*标题头文字*/
        .mini-grid-cell-inner, .mini-grid-headerCell-inner{font-size: 14px}
        /*表头颜色*/
        .mini-grid-topRightCell,.mini-grid-headerCell{background:white/*background: rgb(212,230,254)*/}
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
        .mini-grid-border{border-left: transparent;border-top: transparent;}
        /*选中行以及划过时的颜色*/
        .mini-grid-row-selected{background:rgb(245,250,252)!important;}
        .mini-grid-row-hover{background: rgb(245,250,252)!important;}
        /*tr的高度*/
        .mini-grid-row{height: 50px!important;}
        .disable{pointer-events: none;}
        /*标题头的边框*/
        .mini-grid-headerCell{border-color: rgb(222, 227, 234)!important}
        /*标题头上部边框颜色*/
        .mini-panel-header{border-color: rgb(222, 227, 234)!important;}


        .softType li{cursor: pointer;height: 30px;width: 100px;text-align: center;border-bottom: 1px dotted rgba(0,0,0,1);line-height: 30px}
        .softType li:first-child{border-top: 1px dotted rgba(0,0,0,1); }
        .softType li:hover{background: rgba(0,0,0,0.3);color: white}
    </style>
</head>
<body style="width: 100%;background: url(${basePath}images/login.jpg) center center;
        background-size: 100% 100%;">
<div style="width: 100%;height: 600px;">

    <div style="margin: 0 auto;width: 90%;margin-top: 30px;height: 600px;">
        <%--增删改加保存--%>
        <div class="mio-btn-curd browserCss1" style="height: 40px;width: 200px;margin-left: 1050px">
            <%--修改--%>
            <div class="mio-upt" style="display: inline" onclick="show()">
                <i class="fa fa-pencil" style="color: white;margin-right: -23px"></i>
                <input style="width: 60px;padding-left: 15px;cursor: pointer" type="button" value="修改"  class="mio-btn-blue">
            </div>
            <%--新增--%>
            <div class="addrow" style="display: inline;margin-left: 10px" >
                <i class="fa fa-plus" style="color: white;margin-right: -23px"></i>
                <input style="width: 60px;padding-left: 15px;cursor: pointer" type="button" value="添加"  class="mio-btn-blue">
            </div>

        </div>

        <ul class="softType" style="width: 100px;background: rgba(255,255,255,0.7);box-shadow: 5px 5px 5px rgba(0,0,0,0.7);
    border-radius: 10px;padding: 20px 0;margin-left: 60px">
        </ul>

        <%--<div id="pager1" class="mini-pager" style="width:1045px;height: 30px;border: 1px solid rgb(197, 197, 197);border-bottom: none" sizeList=[30,60,90,700] pageSizeWidth=58 ></div>--%>
        <div id="datagrid1" class="mini-datagrid"
             style="display: block;width:1000px;height:550px;
             margin-top: -260px;margin-left: 170px"
             url="${basePath}sts/softs"
             ajaxType="get" showHeader=true title="全部软件" <%--显示表头以及表头命名--%>
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
             <%--allowCellSelect=true &lt;%&ndash;允许选中单个单元格&ndash;%&gt;--%>
             multiSelect=false <%--多选框--%>
             allowAlternating=false <%--显示斑马纹--%> allowResize=true <%--是否拖拽调节表头列宽度--%>
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
            <div property="columns">
                <%--显示序号--%>
                <div type="indexcolumn" width="50" headerAlign="center" >序号</div>
                <%--显示checkbox--%>
                <div type="checkcolumn"></div>
                <div field="id" width="100" allowSort="true"  align="center" visible="false" >软件类型</div>
                <div field="name" width="120" headerAlign="center"  align="center" allowSort="true">软件名称</div>
                <div field="desc" width="100" allowSort="true"  align="center" headerAlign="center">软件描述</div>
                <div field="size" width="100" allowSort="true"  headerAlign="center"  align="center" >软件大小（M）</div>
                <div field="useType" width="100" allowSort="true" headerAlign="center"  align="center">软件类型</div>
            </div>
        </div>
    </div>


</div>

<script>

    /*列表加载*/
    mini.parse();
    var grid = mini.get("datagrid1");
    grid.load();

    /*左侧边栏*/
    // var softType="SELECT tab_code,tab_name FROM `software_tab` where tab_name!='关于'";
    $.ajax({
        url: "${basePath}/sts/tName",//请求路径
        type: "POST",//请求方式
        // data:{sql:softType},
        async:true,/*异步*/
        dataType: "json",//数据类型可以为 text xml json  script  jsonp
        success: function(result){//返回的参数就是 action里面所有的有get和set方法的参数
            $.each(result, function (i, data) {
                $('.softType').append('<li type='+data.tabCode+'>'+data.tabName+'</li>')
            });
            typeList();
        },
        error: function (result) {
            console.log(result);
            mntip('操作失败','danger');
            grid.reload();
        }
    });

    /*点击不同类型查看列表*/
    function typeList(){
        $('.softType li').click(function () {
            var type= $(this).attr("type");
            console.log(type);
            if(type!='all'){
                grid.set({
                    url:"${basePath}sts/softs?type="+$(this).attr("type"),
                    title:$(this).html()
                });
            }else{
                grid.set({
                    url:"${basePath}sts/softs",
                    title:$(this).html()
                });
            }
            grid.load();
        })
    }

    /*新增*/
    $('.addrow').click(function () {
        addPage('${basePath}st/addSoft',"新增软件",500,600);
    });

    /*修改*/
    function show() {
        var row = grid.getSelected();
        if(row!=null&&row!=undefined&&row!=''){
            addPage('${basePath}sts/queryByid?id='+row.id,'软件信息修改',500,630);
        }else {
            mntip("请选择修改对象",'info');
        }
    }

    $(document).keydown(function (event) {

        if (event.keyCode == 27) {
            console.log(event);
            window.CloseOwnerWindow();
        }
    });
</script>
</body>
</html>