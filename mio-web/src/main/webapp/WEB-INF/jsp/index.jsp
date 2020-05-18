<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>系统界面</title>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8" />
    <style type="text/css">
        /*除去右侧tab框的padding值*/.mini-tabs-bodys{padding: 0;}
    </style>
</head>
<body>
<!--Layout-->
<div id="layout1" class="mini-layout" style="width:100%;height:100%;">
    <%--头部设置--%>
    <div class="app-header" region="north" height="70"
         showSplit="true" <%--是否可以使用拉伸条--%> showSplitIcon="true" <%--是否显示分割条按钮--%>
         showHeader="false" <%--是否显示头部--%> showCollapseButton="true" <%--是否显示折叠按钮--%>
         showCloseButton="true" <%--是否显示关闭按钮--%> splitSize="6" <%--分隔条尺寸--%>
         minHeight="0" maxHeight="100" <%--minWidth="" maxWidth=""--%>
         >
        <div style="position:absolute;top:12px;right:10px;">
            <a class="mini-button mini-button-iconTop" iconCls="icon-add" onclick="onQuickClick" plain="true">快捷</a>
        </div>
    </div>
    <%--内容区设置--%>
    <div title="center" region="center" bodyStyle="overflow:hidden;" style="border:0;">
        <!--Splitter-->
        <div class="mini-splitter" style="width:100%;height:100%;" borderStyle="border:0;">
            <%--左侧树形目录--%>
            <div size="180" maxSize="250" minSize="0"
                 expanded="true" <%--是否折叠--%>
                 showCollapseButton="true" style="border-width:1px;">
                <!--Tree-->
                <ul id="leftTree" class="mini-tree" url="/list" style="width:100%;height:100%;"
                    showTreeIcon="true" textField="text" idField="id" resultAsTree="false"
                    onnodeselect="onNodeSelect"
                    expandOnNodeClick="true"<%--单机展开节点--%>
                    allowLeafDropIn="true" allowDrag="true" allowDrop="true" <%--拖拽节点--%>
                >
                </ul>
            </div>
            <%--右侧内容--%>
            <div id="mytest11"  showCollapseButton="false" style="z-index: 1000;border:0px;" >
                <!--Tabs-->
                <div id="mainTabs" class="mini-tabs" activeIndex="0" style="width:100%;height:100%;"
                     plain="false"
                >
                <%--<div title="首页" url="/datagrid" ></div>--%>

                </div>
              <%--  <ul id="contextMenu" class="mini-contextmenu" >
                    <li class="mio-tz" onclick="">进入大屏</li>
                    <li onclick=>刷新</li>
                </ul>--%>
            </div>
        </div>
    </div>
</div>

<script type="text/javascript">
    mini.parse();

    var tree = mini.get("leftTree");

    function showTab(node) {
        var tabs = mini.get("mainTabs");

        var id = "tab$" + node.id;
        var tab = tabs.getTab(id);
        console.log(tab);

        if (!tab) {
            tab = {};
            tab._nodeid = node.id;
            tab.name = id;
            tab.title = node.text;
            tab.showCloseButton = true;
            //这里拼接了url，实际项目，应该从后台直接获得完整的url地址
            tab.url = node.attributes;
            tabs.addTab(tab);
        }
        tabs.activeTab(tab);
    }

    function onNodeSelect(e) {
        var node = e.node;
        // console.log(node);
        var isLeaf = e.isLeaf;
        if (isLeaf) {
            showTab(node);
        }
    }






    // $('.ul-context-menu').css({'color': 'red'});
    /*页面嵌入时设置根据width判断（右键菜单的显示以及各个模块的大小问题）*/
    // if($('#treeDiv').width()>1200){
    //     $('#contextMenu').hide();
    // }else{
    //     window.onload = function () {
    //         $("#treeDiv").bind("contextmenu", function (e) {
    //             var menu = mini.get("contextMenu");
    //             menu.showAtPos(e.pageX, e.pageY);
    //             return false;
    //         });
    //     }
    //     $('.mio-btn-curd').css({"margin-left": '728px'});
    //     $('#sysuserqueryForm').css({"margin-left": '110px'});
    // }




</script>

</body>
</html>