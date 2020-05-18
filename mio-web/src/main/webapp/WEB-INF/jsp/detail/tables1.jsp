<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<head>
    <title>软件详情</title>
    <%@include file="../common.jsp"%>
<body>
     <div id="datagrid1" class="mini-datagrid"
          url="${basePath}sts/softs"
          ajaxType="get" showHeader=true
          columns= columns <%--列的集合--%>
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
<script>

    /*列表加载*/
    mini.parse();
    var grid = mini.get("datagrid1");
    grid.load();

</script>
</body>
</html>