<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>软件详情</title>
    <%@include file="../common.jsp"%>
    
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	
    <!-- bootstrap -->
    <link href="${basePath}css/detail/bootstrap/bootstrap.css" rel="stylesheet" />
    <link href="${basePath}css/detail/bootstrap/bootstrap-responsive.css" rel="stylesheet" />
    <link href="${basePath}css/detail/bootstrap/bootstrap-overrides.css" type="text/css" rel="stylesheet" />

    <!-- global styles -->
    <link rel="stylesheet" type="text/css" href="${basePath}css/detail/layout.css" />
    <link rel="stylesheet" type="text/css" href="${basePath}css/detail/elements.css" />
    <link rel="stylesheet" type="text/css" href="${basePath}css/detail/icons.css" />

    <!-- libraries -->
    <link rel="stylesheet" type="text/css" href="${basePath}css/detail/lib/font-awesome.css" />
    
    <!-- this page specific styles -->
    <link rel="stylesheet" href="${basePath}css/detail/compiled/signup.css" type="text/css" media="screen" />

    <!-- open sans font 
    <link href='http://fonts.useso.com/css?family=Open+Sans:300italic,400italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css' />
-->
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" /></head>
<body>
    <div class="header">
        <a href="index.html">
            <img src="${basePath}images/detail/img/logo.png" class="logo" />
        </a>
    </div>
    <div class="row-fluid login-wrapper">
        <div class="box">
            <div class="content-wrap">
                <h6>注 册</h6>
                <input class="span12" type="text" placeholder="账 号" />
                <input class="span12" type="password" placeholder="密 码" />
                <input class="span12" type="password" placeholder="确认密码" />
                <div class="action">
                    <a class="btn-glow primary signup" href="index.html">注 册</a>
                </div>                
            </div>
        </div>

        <div class="span4 already">
            <p>已经有账号?</p>
            <a href="signin.html">登 录</a>
        </div> 
    </div>

	<!-- scripts -->
    <script src="${basePath}js/detail/jquery-latest.js"></script>
    <script src="${basePath}js/detail/bootstrap.min.js"></script>
    <script src="${basePath}js/detail/theme.js"></script>

</body>
</html>