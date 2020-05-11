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
	</style>
</head>
<body style="width: 100%;background: url(${basePath}images/login.jpg) center center;
		background-size: 100% 100%;">

	<div style="margin: 30px auto 0">

		<div style="margin: 0 auto;height: 50px;width: 345px;margin-bottom: 1%">
			<img src="${basePath}images/zgyd.png"
				 style="width: 50px;height: 50px" alt="">
			<span style="font-size: 40px;display: block;
      margin-left: 15%;margin-top: -14.5%">SoftWare Admin</span>
		</div>
		<form id="upSoft" method="post" enctype="multipart/form-data" onsubmit="return false;" class="mio-frame">

			<div style="border-bottom: 1px solid black;height: 30px;margin-bottom: 10px;width: 300px">
				<span style="font-size: 26px;padding-bottom: 5px;line-height: 10px">软件信息修改</span>
			</div>
			<input value="${softwareBaseinfo.name}" name="name" class="mio-inp upName" placeholder="请输入文件名称" style="margin-bottom: 20px;margin-top: 20px;width: 300px"  type="text">
			<span class="glyphicon glyphicon-remove small mio-remove" style="z-index: 1000"></span>

			<input value="${softwareBaseinfo.desc}" name="desc" class="mio-inp upDesc" placeholder="请输入文件描述" style="margin-bottom: 20px;width: 300px"  type="text">
			<span class="glyphicon glyphicon-remove small mio-remove" style="z-index: 1000"></span>

			<input value="${softwareBaseinfo.id}" name="id" class="mio-inp" type="hidden">

			<%--select框--%>
			<select name="useType" class="selectBox" style="width: 300px;margin-bottom: 20px!important;"  >
				<option id="baseOpt" selected="selected" value="${softwareBaseinfo.useType}"></option>
			</select>
			<br>
			<h1></h1>
			<select name="status" class="selectBox1" style="width: 300px;margin-bottom: 20px!important;"  data-placeholder="Select Your Options">
				<option id="use"  value="1">使用</option>
				<option id="nuse"  value="0">禁用</option>
			</select>


			<input type="button" value="修改" class="mio-regLogin" id="uPSoftbtn" style="margin-top: 20px;margin-bottom: 15px" />
		</form>


	</div>
	<script>
		remove($('.upName'));
		remove($('.upDesc'));
        inputBorder($('.mio-inp'));

        /*判断select框默认状态*/
        if(${softwareBaseinfo.status}==1){
            $(".selectBox1 #use").attr("selected","selected");
        }else{
            $(".selectBox1 #nuse").attr("selected","selected");
		}

        /*select框*/
        selectChosen($('.selectBox'));
        selectChosen($('.selectBox1'));


        $.ajax({
            url: "${basePath}sts/tNameB?tabCode="+"${softwareBaseinfo.useType}"+" ",
            type: "POST",//请求方式
            dataType: "json",//数据类型可以为 text xml json  script  jsonp
            success: function(result){//返回的参数就是 action里面所有的有get和set方法的参数
                console.log(result);
                console.log(result[0].tabName);
                $('#baseOpt').html(result[0].tabName);
                $('#baseOpt').html($(".selectBox option:selected").html());
                $(".selectBox").trigger("chosen:updated");
            },
            error: function (result) {
                console.log(result);
                mntip('操作失败','danger');
            }
        });


   		$.ajax({
            url: "${basePath}sts/tNameC?tabCode="+"${softwareBaseinfo.useType}"+" ",
            type: "POST",//请求方式
            dataType: "json",//数据类型可以为 text xml json  script  jsonp
            success: function(result){//返回的参数就是 action里面所有的有get和set方法的参数
                $.each(result, function (i, data) {
                    $('.selectBox').append('<option value='+data.tabCode+' >'+data.tabName+'</option>')
                    $(".selectBox").trigger("chosen:updated");
                });
            },
            error: function (result) {
                console.log(result);
                mntip('操作失败','danger');
                grid.reload();
            }
        });


        $('#uPSoftbtn').click(function () {
            $.ajax({
                url: "${basePath}sts/upSoft",//请求路径
                type: "POST",//请求方式
                data:$('#upSoft').serializeJson(),
                async:false,/*同步*/
                dataType: "json",//数据类型可以为 text xml json  script  jsonp
                success: function(result){//返回的参数就是 action里面所有的有get和set方法的参数
                    /*数据返回成功调用函数*/
					mntip(result.commonResultInfo.message,'info');
					if (result.commonResultInfo.message=="操作成功"){
                        upSoftRel();
					}
                },
                error: function (result) {
                    console.log(result);
                    mntip('操作失败','danger');
                }
            });
			function upSoftRel(){
                $.ajax({
                    url: "${basePath}sts/upSoftRel?type="+$(".selectBox option:selected").val()+"&id="+${softwareBaseinfo.id}+"",//请求路径",//请求路径
                    type: "POST",//请求方式
                    async:false,/*同步*/
                    dataType: "json",//数据类型可以为 text xml json  script  jsonp
                    success: function(result){//返回的参数就是 action里面所有的有get和set方法的参数
                        /*数据返回成功调用函数*/
                        mntip(result.commonResultInfo.message,'info');
                        if (result.commonResultInfo.message=="操作成功"){
                            setInterval(function(){
                                window.CloseOwnerWindow();
							},1000);
                            /*关闭有父页面的窗口*/
                        }
                    },
                    error: function (result) {
                        console.log(result);
                        mntip('操作失败','danger');
                    }
                });
			}
        })


	</script>
</body>
</html>
