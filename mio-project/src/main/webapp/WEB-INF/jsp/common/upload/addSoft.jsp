<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
	<title>软件上传</title>
	<%@include file="../../commonES6.jsp"%>
	<style>
		/*a  upload */
		.a-upload{padding: 0px 10px;height: 30px;line-height: 30px;position: relative;cursor: pointer;color: #888;background: white;border: 1px solid #ddd;border-radius: 4px;overflow: hidden;display: inline-block;*display: inline;*zoom: 1;margin-top: 20px ;text-align: center;}
		.a-upload input{position: absolute; font-size: 100px; right: 0; top: 0; opacity: 0; filter: alpha(opacity=0); cursor: pointer }
		.a-upload:hover{color: #444; background: #eee; border-color: #ccc; text-decoration: none}
	</style>
</head>
<body style="width: 100%;background: url(${basePath}images/detail/bgs/11.jpg) center center;
		background-size: 100% 100%;">

<div style="margin: 30px auto 0">
	<form id="addSoft" method="post" multiple enctype="multipart/form-data" onsubmit="return false;"
		  class="mio-frame" style="box-shadow: none;border-radius: 5px">
		<%--可设置 type="hidden"--%>
		<input name="size" class="mio-inp size" placeholder="文件大小" style="
			margin-top: 20px;margin-bottom: 20px;width: 300px">
		<input name="packageId" class="mio-inp packageId" placeholder="文件名称" style="margin-bottom: 20px;width: 300px">

		<%--上传选择文件框--%>
		<a href="javascript:;" class="a-upload">
			<input type="file" name="file" id="selFile"/><span class="fileName">请选择文件</span>
		</a>
		<input type="button" value="上传" class="mio-regLogin" id="addSoftbtn" style="
			margin-top: 20px;margin-bottom: 15px;box-shadow: none;border-radius: 5px" />
	</form>
</div>


<script src="${basePath}js/common/common_newsES6.js"></script>
<script type="text/babel">
<%--<%@include file="../../common/commonEs6Js.jsp"%>--%>

    /*file选择文件框选择文字事件*/
    $('#selFile').change( () => {
        console.log('文件名称：'+$("#selFile")[0].files[0].name);
        console.log('文件大小(b)：'+$("#selFile")[0].files[0].size);
        console.log('文件大小(Kb)：'+$("#selFile")[0].files[0].size/1024);
        console.log('文件大小(Mb)：'+$("#selFile")[0].files[0].size/1024/1024);
        console.log('文件类型：'+$("#selFile")[0].files[0].type);

        let fileSize = Math.ceil($("#selFile")[0].files[0].size/1024/1024);
        let filename = $("#selFile")[0].files[0].name;
        $('.size').val(fileSize);
        $('.packageId').val(filename);
        $('.fileName').html(filename);
    });

    $("#addSoftbtn").click(() => {
        let formData = new FormData(); // 通过append方法添加数据
        formData.append("file", document.getElementById("selFile").files[0]);
        // console.log(formData.get("file")); formData get用法
        ajaxFn("${basePath}upload", (data) => {
            tip(data.resultInfo.message);
        }, 'post', formData, false, false);
    });

</script>
</body>
</html>
