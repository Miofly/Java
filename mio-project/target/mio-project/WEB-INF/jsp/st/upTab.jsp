<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
	<title>软件信息修改</title>
	<%@include file="../common.jsp"%>
	<style>
		/*a  upload */
		.a-upload {
			padding: 0px 10px;
			height: 30px;
			line-height: 30px;
			position: relative;
			cursor: pointer;
			color: #888;
			background: white;
			border: 1px solid #ddd;
			border-radius: 4px;
			overflow: hidden;
			display: inline-block;
			*display: inline;
			*zoom: 1;
			margin: 0px auto 20px ;
			text-align: center;
		}

		.a-upload  input {
			position: absolute;
			font-size: 100px;
			right: 0;
			top: 0;
			opacity: 0;
			filter: alpha(opacity=0);
			cursor: pointer
		}

		.a-upload:hover {
			color: #444;
			background: #eee;
			border-color: #ccc;
			text-decoration: none
		}
		.chosen-container{box-shadow: none}
	</style>
</head>
<body style="width: 100%;background: url(${basePath}images/detail/bgs/11.jpg) center center;
		background-size: 100% 100%;">

	<div style="margin: 30px auto 0">

		<div style="height: 50px;width: 345px;margin-bottom: 1%;margin-left: 160px">
			<%--<img src="${basePath}images/zylogo6.png"--%>
				 <%--&lt;%&ndash;style="width: 170px;height: 50px" &ndash;%&gt;alt="">--%>
			<%--<span style="font-size: 40px;display: block;--%>
      <%--margin-left: 15%;margin-top: -14.5%">SoftWare Admin</span>--%>
		</div>
		<form id="upSoft" method="post" enctype="multipart/form-data" onsubmit="return false;" class="mio-frame"
		style="border-radius: 5px;box-shadow: none">

			<div style="border-bottom: 1px solid black;height: 30px;margin-bottom: 10px;width: 300px">
				<span style="font-size: 26px;padding-bottom: 5px;line-height: 10px">分类信息修改</span>
			</div>
			<span>分类名称：</span>
			<input value='' id="uname" name="name" class="mio-inp upName" placeholder="请输入文件名称" style="
			box-shadow: none;margin-bottom: 20px;margin-top: 20px;width: 226px"  type="text">

			<span class="glyphicon glyphicon-remove small mio-remove" style="z-index: 1000"></span><br>

			<span>分类描述：</span>
			<input value='' id="udesc" name="desc" class="mio-inp upName" placeholder="请输入文件描述" style="
			box-shadow: none;margin-bottom: 20px;width: 226px"  type="text">


			<%--select框--%>
			<span>分类状态：</span>
			<select name="tabStatus" id="ustatus" class="selectBox" style="
			width: 226px;margin-bottom: 20px!important;box-shadow: none;"  data-placeholder="Select Your Options">
				<%--<option value="">请选择</option>--%>
				<option value="1">使用中</option>
				<option value="0">禁用</option>
			</select>
			<%--<span>分类状态：</span>--%>
			<%--<input value='' id="ustatus" name="name" class="mio-inp upName" placeholder="请输入文件名称" style="--%>
			<%--box-shadow: none;margin-bottom: 20px;width: 226px"  type="text">--%>
			<span>分类排序：</span>
			<input value='' id="uorder" name="name" class="mio-inp upName" placeholder="请输入文件名称" style="
			box-shadow: none;margin-bottom: 20px;margin-top: 20px;width: 226px"  type="text">


			<input type="button" value="修改" class="mio-regLogin" id="uPSoftbtn" style="
			box-shadow: none;margin-bottom: 10px;border-radius: 5px" />
		</form>


	</div>
	<script>
		$('#uname').val(JSON.parse('${softwareBaseinfo}')[0].tabName)
		$('#udesc').val(JSON.parse('${softwareBaseinfo}')[0].tabDesc)
		$('#ustatus').val(JSON.parse('${softwareBaseinfo}')[0].tabStatus)
		$('#uorder').val(JSON.parse('${softwareBaseinfo}')[0].tabOrder)
		// remove($('.upName'));
		// remove($('.upDesc'));
        inputBorder($('.mio-inp'));

        /*select框*/
        selectChosen($('.selectBox'));
        selectChosen($('.selectBox1'));



        enter($('#uPSoftbtn'));
        $('#uPSoftbtn').click(function () {
            if($('#uname').val()==''||$('#uname').val()==null){
                checkTip($('#uname'),'必须填写','right','center');
                $('#uname').focus()
            }else if($('#udesc').val()==''||$('#udesc').val()==null){
                checkTip($('#udesc'),'必须填写','right','center');
                $('#udesc').focus()
            }
        })
	</script>
</body>
</html>