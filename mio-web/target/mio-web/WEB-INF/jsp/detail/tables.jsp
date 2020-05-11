<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html class="login-bg">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>软件详情</title>
    <%@include file="../common.jsp"%>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <!-- bootstrap -->
    <link href="${basePath}css/detail/bootstrap/bootstrap.css" rel="stylesheet" />
    <link href="${basePath}css/detail/bootstrap/bootstrap-responsive.css" rel="stylesheet" />
    <link href="${basePath}css/detail/bootstrap/bootstrap-overrides.css" type="text/css" rel="stylesheet" />

    <!-- libraries -->
    <link href="${basePath}css/detail/lib/jquery-ui-1.10.2.custom.css" rel="stylesheet" type="text/css" />
    <link href="${basePath}css/detail/lib/font-awesome.css" type="text/css" rel="stylesheet" />

    <!-- global styles -->
    <link rel="stylesheet" type="text/css" href="${basePath}css/detail/layout.css" />
    <link rel="stylesheet" type="text/css" href="${basePath}css/detail/elements.css" />
    <link rel="stylesheet" type="text/css" href="${basePath}css/detail/icons.css" />

    <!-- this page specific styles -->
    <link rel="stylesheet" href="${basePath}css/detail/compiled/tables.css" type="text/css" media="screen" />

    <!-- open sans font
    <link href='http://fonts.useso.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css' />-->

    <!-- lato font
    <link href='http://fonts.useso.com/css?family=Lato:300,400,700,900,300italic,400italic,700italic,900italic' rel='stylesheet' type='text/css' />
	-->
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" /></head>
<style>
    /*能够根据浏览器高度table表格自适应*/
    /*标题行颜色及边距*/
    .mini-panel-header-inner{background: white!important;padding: 0px 4px 5px 3px!important;}
    /*表头的标题位置*/
    .mini-panel-title{padding: 5px 0 0 5px}
    /*标题头文字*/
    .mini-grid-headerCell-nowrap{font-size: 14px}
    /*表格内文字*/
    .mini-grid-cell-inner{font-size: 12px;color: #516372}
    /*表头颜色*/
    .mini-grid-topRightCell,.mini-grid-headerCell{background:white/*background: rgb(212,230,254)*/}
    /*去除标题头边框*/
    .mini-grid-headerCell{border: red;}
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
    /*表格右侧边框*/
    .mini-panel-border{border: none!important;}


    input[disabled], select[disabled], textarea[disabled], input[readonly], select[readonly], textarea[readonly]{
        background-color:transparent;
    }
    textarea, input[type="text"], input[type="password"], input[type="datetime"], input[type="datetime-local"], input[type="date"], input[type="month"], input[type="time"], input[type="week"], input[type="number"], input[type="email"], input[type="url"], input[type="search"], input[type="tel"], input[type="color"], .uneditable-input{
        border:transparent;
    }
    select, textarea, input[type="text"], input[type="password"], input[type="datetime"], input[type="datetime-local"], input[type="date"], input[type="month"], input[type="time"], input[type="week"], input[type="number"], input[type="email"], input[type="url"], input[type="search"], input[type="tel"], input[type="color"], .uneditable-input{
        padding: 0;padding-top: 5px;
    }
    .mini-pager-size{margin-top: 0px}
    .mini-buttonedit-input{margin-top: -4px}
    input[type="text"]:focus, input[type="password"]:focus, textarea:focus{outline: none;border: none!important;}
    .mini-buttonedit{height: 30px!important;}
    .mini-pager-num{margin-top: 4px!important;}
    .mini-grid-pager{border: none;}
    .mini-pager {height: 50px}

    /*内容区margin-top*/
    #pad-wrapper{margin-top: 10px}
    .content{min-height: 500px!important;height: 590px;margin-bottom:0px;padding-bottom:0}
    .mini-panel-header{height: 23px}
    .pull-right {margin-right: -30px}
    .table-wrapper .filter-block{margin-bottom: 5px}

    /*.softType li{cursor: pointer;height: 30px;width: 100px;text-align: center;border-bottom: 1px dotted rgb(222, 227, 234);line-height: 30px}
    .softType li:first-child{border-top: 1px dotted rgb(222, 227, 234); }
    .softType li:hover{background: rgb(245,250,252);color: black}*/

    /*class="mini-panel mini-window mini-window-drag mini-messagebox"*/
    /*mini-panel mini-window mini-window-drag*/
    .mini-panel-header{position: relative!important;width: 40px!important;right: -470px;
        z-index: 1000;top: 20px;background: transparent!important;border:none}
    .mini-panel-header-inner{background: transparent!important;}
    .mini-panel-title{display: none}
    .mini-panel-border{margin-top:-20px;}
    .mini-window-drag{top: 80px;width: 510px!important;}
    .mini-popup, .mini-window, .mini-menu-open{box-shadow: none}

    .mini-messagebox .mini-panel-header{
        position: relative!important;width: auto!important;right: 0;top:0;
        background: #fff!important;border-bottom: solid 1px #bbb;!important;}
    .mini-messagebox .mini-panel-header-inner{background: white!important;}
    .mini-messagebox .mini-panel-title{display: block!important;}
    .mini-messagebox .mini-panel-border{margin-top:0px!important;}
    .mini-messagebox{top:274px!important;width: 264px!important;box-shadow: 0 3px 6px rgba(0, 0, 0, 0.3)!important;}
</style>
<body>


<!-- 要显示的区域 -->
<div id="header"></div>

<div id="left"></div>
	<!-- main container -->
    <div class="content">
        
        <div class="container-fluid">
            <div id="pad-wrapper">
                
                <!-- products table-->
                <!-- the script for the toggle all checkboxes from header is located in js/theme.js -->
                <div class="table-wrapper products-table section">
                    <div class="row-fluid head">
                        <div class="span12">
                            <h4>全部软件</h4>
                        </div>
                    </div>

                    <div class="row-fluid filter-block">
                        <div class="pull-right">
                            <div class="ui-select">
                                <select class="softType">
                                </select>
                            </div>
                            <a class="addrow btn-flat primary new-product">+ 新增 </a>
                        </div>
                    </div>
                    <div id="datagrid1" class="mini-datagrid"
                            style="display: block;width:105%;height:510px;
                            margin-top: -100px!important;margin-left: 0px"
                            url="${basePath}sts/softs"
                            ajaxType="get" showHeader=true <%--title="全部软件"--%> <%--显示表头以及表头命名--%>
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
                            multiSelect=true <%--多选框--%>
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
                               <%--<div type="indexcolumn" width="50" headerAlign="center" >序号</div>--%>
                               <%--显示checkbox   checkcolumn--%>
                               <div type="checkcolumn"></div>
                               <div field="id" width="100" allowSort="true"  align="center" visible="false" >软件类型</div>
                               <div field="name" width="120" headerAlign="center"  align="center" allowSort="true">软件名称</div>
                               <div field="desc" width="100" allowSort="true"  align="center" headerAlign="center">软件描述</div>
                               <div field="size" width="100" allowSort="true"  headerAlign="center"  align="center" >软件大小（M）</div>
                               <div field="useType" width="100" allowSort="true" headerAlign="center"  align="center">软件类型</div>
                               <div name="action" width="120" headerAlign="center" align="center"
                                        renderer="onActionRenderer" cellStyle="padding:0;"></div>
                           </div>
                        </div>
                </div>
            </div>
        </div>
    </div>
    <!-- end main container -->

	<!-- scripts -->
<%@include file="detailCm.jsp"%>
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
                $('.softType').append('<option type='+data.tabCode+'>'+data.tabName+'</option>')
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
        $('.softType').change(function () {
            var type= $('.softType option:selected').attr("type");
            console.log(type);
            if(type!='all'){
                $('.span12 h4').html($('.softType option:selected').html())
                grid.set({
                    url:"${basePath}sts/softs?type="+$('.softType option:selected').attr("type"),
                    // title:$(this).html()
                });
            }else{
                $('.span12 h4').html($('.softType option:selected').html())
                grid.set({
                    url:"${basePath}sts/softs",
                    // title:$(this).html()
                });
            }
            grid.load();
        })
    }

    /*新增*/
    $('.addrow').click(function () {


        addPage('${basePath}st/addSoft',"",500,600);
    });

    /*修改*/
    function show() {
        var row = grid.getSelected();
        if(row!=null&&row!=undefined&&row!=''){
            addPage('${basePath}sts/queryByid?id='+row.id,'',500,630);
        }else {
            mntip("请选择修改对象",'info');
        }
    }


    function delbyid() {
        var row = grid.getSelected();
        console.log(row);
        mini.confirm('确认删除'+row.name+'？','系统提示',function (r){
            if(r=='ok'){
                grid.loading("操作中，请稍后......");
                var row = grid.getSelected();
                $.ajax({
                    url: '${basePath}sts/delSoft?id='+row.id,//请求路径
                    type: "POST",//请求方式
                    async:true,/*同步*/
                    dataType: "json",//数据类型可以为 text xml json  script  jsonp
                    success: function(result){//返回的参数就是 action里面所有的有get和set方法的参数
                        mntip(result.resultInfo.message,'info');
                        if (result.resultInfo.message=='操作成功'){
                            grid.load()
                        }
                    },
                    error: function (result) {
                        console.log(result);
                        mntip('操作失败','danger');
                    }
                });
            }
        })
    }
    $(document).keydown(function (event) {

        if (event.keyCode == 27) {
            $('.mini-modal').fadeOut(500);
            $('.mini-messagebox').fadeOut(500);
            $('.mini-window').fadeOut(500);
        }
    });

    function onActionRenderer(e) {
        var grid = e.sender;
        var record = e.record;
        var uid = record._uid;
        var rowIndex = e.rowIndex;

        var s = ' <a class="Edit_Button" onclick="show()" >修改</a>'+'&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;'
            + ' <a class="Delete_Button" onclick="delbyid()">删除</a>';
        return s;
    }
</script>
</body>
</html>