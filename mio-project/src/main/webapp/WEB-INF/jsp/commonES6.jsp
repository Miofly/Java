<%-- 加入jsp标签库 --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--获取当前项目访问路径 --%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<c:set var="basePath" value="<%=basePath%>" />

<%--jsp输出的html时去除多余的空行--%>
<%@ page trimDirectiveWhitespaces="true" %>
<%--
    common
    bootstrap
    miniui
    font-awesome
    tip
    laydate
    contextMenu
    echart
    swiper
--%>
<%--网页图标--%>

<link rel="shortcut icon" href="${basePath}images/favicon.ico" type="image/x-icon" />
<link rel="stylesheet" href="${basePath}js/common/miniui/res/font-awesome/css/font-awesome.css">
<link rel="stylesheet" href="${basePath}js/common/layui/css/layui.css">
<link rel="stylesheet" href="${basePath}js/common/miniui/themes/default/miniui.css">
<link rel="stylesheet" href="${basePath}js/common/miniui/themes/metro/skin.css">
<link rel="stylesheet" href="${basePath}css/common/common.css">
<%--<link rel="stylesheet" href="${basePath}js/common/bootstrap/css/bootstrap.css">--%>
<link rel="stylesheet" href="${basePath}css/common/tip.css">
<link rel="stylesheet" href="${basePath}css/common/contextMenu.css">
<link rel="stylesheet" href="${basePath}js/common/swiper/swiper.min.css">
<link rel="stylesheet" href="${basePath}css/common/search-form.css">
<link rel="stylesheet" href="${basePath}css/common/chosen.css">
<link rel="stylesheet" href="${basePath}js/common/webuploader-0.1.5/webuploader.css">

<script src="${basePath}js/common/browser.js"></script>
<script src="${basePath}js/common/browser-polyfill.js"></script>
<script src="${basePath}js/common/jquery-3.3.1.min.js"></script>

<%--<script src="${basePath}js/common/jquery.form.min.js"></script>--%>
<script src="${basePath}js/common/miniui/miniui.js"></script>
<script src="${basePath}js/common/miniui/locale/en_US.js" type="text/javascript"></script>
<%--<script src="${basePath}js/common/common.js"></script>--%>
<script src="${basePath}js/common/laydate/laydate.js"></script>
<%--<script src="${basePath}js/common/bootstrap/js/bootstrap.js"></script>--%>
<%--<script src="${basePath}js/common/jquery.contextMenu.min.js"></script>--%>
<%--<script src="${basePath}js/common/tip.js"></script>--%>
<%--<script src="${basePath}js/common/echarts.js"></script>--%>
<%--<script src="${basePath}js/common/swiper/swiper.min.js"></script>--%>
<%--<script src="${basePath}js/common/public.js"></script>--%>
<%--<script src="${basePath}js/common/Highcharts-6.2.0/code/highcharts.js"></script>--%>
<%--<script src="${basePath}js/common/Highcharts-6.2.0/code/highcharts-3d.js"></script>--%>
<%--<script src="${basePath}js/common/Highcharts-6.2.0/code/modules/exporting.js"></script>--%>
<%--<script src="${basePath}js/common/Highcharts-6.2.0/code/modules/export-data.js"></script>--%>
<%--<script src="${basePath}js/common/chosen.jquery.js"></script>--%>
<%--<script src="${basePath}js/common/webuploader-0.1.5/webuploader.js"></script>--%>
<%--<script src="${basePath}js/common/doT.min.js"></script>--%>
<%--<script src="${basePath}js/common/jquery.cookie.js"></script>--%>
<%--<script src="${basePath}js/common/email.js"></script>--%>



