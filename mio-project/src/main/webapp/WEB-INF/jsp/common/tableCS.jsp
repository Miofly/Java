<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8" />
    <%@include file="../common.jsp"%>
    <style>
        /*能够根据浏览器高度table表格自适应*/
        html,body{height:500px; margin-top: 0;}
        /*能够根据浏览器高度table表格自适应*/
        /*标题行颜色及边距*/
        .mini-panel-header-inner{background: red!important;}
        /*表头的标题位置/大小/颜色*/
        .mini-panel-title{padding: 10px 0 10px 5px;font-size: 30px;color: #00b7ee;height: 50px}

        /*标题头的边框*/
        .mini-grid-headerCell{border-top: 5px solid blueviolet!important;height: 50px}
        .mini-grid-headerCell{border-left: 5px solid lightpink!important}
        .mini-grid-headerCell{border-right: 5px solid greenyellow!important}
        .mini-grid-headerCell{border-bottom: 5px solid palegoldenrod!important}
        /*标题头文字*/
        .mini-grid-headerCell-nowrap{font-size: 20px;color: pink}
        /*表头颜色*/
        .mini-grid-topRightCell,.mini-grid-headerCell{background:aliceblue/*background: rgb(212,230,254)*/}


        /*表格内文字*/
        .mini-grid-cell-inner{font-size: 10px;/*color: #516372*/color: #90ee7e}

        /*调整分页栏的位置*/
        .mini-pager-left{float: right;}
        .mini-pager-right{float: left;margin-left: 8px;}
        /*分页栏当前{1}字体大小*/
        .mini-pager-num{font-size: 14px}
        /*Ie浏览器可能出现的BUG*/
        .mini-pager-num{line-height: 16px}
        .mini-pager-pages{font-size: 14px}



        /*表格整体边框*/
        .mini-grid-border{border-left:5px solid lightblue;border-top:5px solid yellow;
            border-right:5px solid cornflowerblue;border-bottom:5px solid blueviolet;}
        /*选中行以及划过时的颜色*/
        .mini-grid-row-selected{background:rgb(245,250,252)!important;}
        .mini-grid-row-hover{background: rgb(245,220,255)!important;
        .mini-grid-cell-selected{background: rosybrown}
        /*tr的高度*/
        .mini-grid-row{height: 50px!important;}


        /*标题头上部边框颜色*/
        /*.mini-panel-header{border-color: darkmagenta!important;}*/
        /*表格右侧边框*/
        /*.mini-panel-border{border: aquamarine;}*/
        /*.disable{pointer-events: none;}*/

    </style>
</head>
<body style="background: #eee;width: 100%;height: 100%">
<div style="margin: 30px 30px 0 30px;display: block">
    <div id="pager1" class="mini-pager"
         style="width:1245px;height: 30px;border: 1px solid rgb(197, 197, 197);border-bottom: none" sizeList=[30,60,90,700] pageSizeWidth=58 ></div>
    <div id="datagrid1" class="mini-datagrid"
         style="display: block;width:95%;height:610px;"
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

<script type="text/javascript">
    mini.parse();
    var grid = mini.get("datagrid1");
    grid.load();

</script>
</body>
</html>