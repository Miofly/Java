<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
	<title>用户登录</title>
	<%@include file="common.jsp"%>
</head>
<body>
<form id="scc"  enctype="multipart/form-data">
	文件1: <input type="file" name="file" multiple="multiple" id="file1"/><br/>
	<%--文件2: <input type="file" name="myfiles"/><br/>--%>
	<%--文件3: <input type="file" name="myfiles"/><br/>--%>
	<input type="button" value="上传" id="sc"/>
</form>

<script>
    $("#sc").click(function () {
        var formData = new FormData();
        formData.append("file", document.getElementById("file1").files[0]);
        $.ajax({
            url: "/upload",
            type: "POST",
            data: formData,
            /**
             *必须false才会自动加上正确的Content-Type
             */
            contentType: false,
            /**
             * 必须false才会避开jQuery对 formdata 的默认处理
             * XMLHttpRequest会对 formdata 进行正确的处理
             */
            processData: false,
            success: function (data) {
                console.log(data);
                if (data.status == "true") {
                    alert("上传成功！");
                }
                if (data.status == "error") {
                    alert(data.msg);
                }
                $("#imgWait").hide();
            },
            error: function () {
                alert("上传失败！");
                $("#imgWait").hide();
            }
        });
    });
</script>
</body>
</html>