<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@include file="common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Title</title>
</head>
<body>
<ul id="leftTree" class="mini-tree" url="/users/list1" style="width:100%;height:100%;"
    showTreeIcon="true" textField="text" idField="id" resultAsTree="false"
    <%--onnodeselect="onNodeSelect"--%>
    expandOnNodeClick="true"<%--单机展开节点--%>
    allowLeafDropIn="true" allowDrag="true" allowDrop="true" <%--拖拽节点--%>
>
</ul>
</body>
</html>
