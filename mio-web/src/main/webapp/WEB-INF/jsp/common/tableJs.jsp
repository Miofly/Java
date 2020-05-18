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
        .mini-grid-row-hover{background: rgb(245,220,255)!important;}
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
    <div id="pager1" class="mini-pager" style="width:1245px;height: 30px;border: 1px solid rgb(197, 197, 197);border-bottom: none" sizeList=[30,60,90,700] pageSizeWidth=58 ></div>
    <div id="datagrid1"  style="display: block;width:95%;height:550px;" class="mini-datagrid"></div>
</div>

<script type="text/javascript">
    mini.parse();
    var grid = mini.get("datagrid1");

    var columns = [
        /*显示序号*/
        { type: "indexcolumn",width:20,headerAlign:'center'},
        /*显示checkbox*/
        { type: "checkcolumn"},
        { headerAlign:'center',allowSort:true,align:"center",width: 30,field: 'id',header: 'id',visible:false/*是否展示*/},
        { headerAlign:'center',allowSort:true,align:"center",width: 120,field:'name',header:'名称'},
        { headerAlign:'center',allowSort:true,align:"center",width: 120,field:'desc', header: '描述'},
        { headerAlign:'center',allowSort:true,align:"center",width: 120,field:'size', header: '大小'},
        { headerAlign:'center',allowSort:true,align:"center",width: 120,field:'useType', header: '类型'},
        { headerAlign:'center',allowSort:true,align:"center",width: 120,field:'useType', header: '操作',renderer:onActionRenderer},
    ];
/*    <div name="action" width="120" headerAlign="center" align="center"
    renderer="onActionRenderer" cellStyle="padding:0;">操作</div>*/
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
    datagrid("${basePath}sts/softs",'title',false,false)

</script>
</body>
</html>