<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>用户登录</title>
    <%@include file="../common.jsp"%>
</head>
<script>
    function execClick(){
        document.execCommand("copy");
    }

    function execCopy(event,textDiv){
        var thisDiv = document.getElementById(textDiv);
        if(isIE()){
            if(window.clipboardData){
                window.clipboardData.setData("Text", thisDiv.textContent);
                alert(window.clipboardData.getData("Text"));
            }
        }else{
            event.preventDefault();
            if (event.clipboardData) {
                event.clipboardData.setData("text/plain", thisDiv.textContent);
                alert(event.clipboardData.getData("text"));
            }
        }
    }

    function isIE(){
        var input = window.document.createElement ("input");
        if (window.ActiveXObject === undefined) return null;
        if (!window.XMLHttpRequest) return 6;
        if (!window.document.querySelector) return 7;
        if (!window.document.addEventListener) return 8;
        if (!window.atob) return 9;
        if (!input.dataset) return 10;
        return 11;
    }
</script>
<body>
    <div id="textDiv1" onclick="execClick();" oncopy="execCopy(event,'textDiv1');">
        这里是要复制的文字1
    </div>
    <div id="textDiv2">这里是要复制的文字2</div>
    <a onclick="execClick();" oncopy="execCopy(event,'textDiv2');">复制</a>
    <textarea></textarea>
</body>


</html>