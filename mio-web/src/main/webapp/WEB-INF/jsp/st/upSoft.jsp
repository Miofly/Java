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
				<span style="font-size: 26px;padding-bottom: 5px;line-height: 10px">软件信息修改</span>
			</div>
			<span>文件名称：</span>
			<input value="${softwareBaseinfo.name}" name="name" class="mio-inp upName" placeholder="请输入文件名称" style="
			box-shadow: none;margin-bottom: 20px;margin-top: 20px;width: 226px"  type="text">
			<span class="glyphicon glyphicon-remove small mio-remove" style="z-index: 1000"></span><br>
			<span>文件描述：</span>
			<input value="${softwareBaseinfo.desc}" name="desc" class="mio-inp upDesc" placeholder="请输入文件描述" style="
			box-shadow: none;margin-bottom: 20px;width: 226px"  type="text">
			<span class="glyphicon glyphicon-remove small mio-remove" style="z-index: 1000"></span>

			<input value="${softwareBaseinfo.id}" name="id" class="mio-inp" type="hidden"><br>
			<span>文件类型：</span>
			<%--select框--%>
			<select name="useType" class="selectBox" style="width: 226px;margin-bottom: 20px!important;"  >
				<option id="baseOpt" selected="selected" value="${softwareBaseinfo.useType}"></option>
			</select>
			<br>
			<br>
			<%--文件状态--%>
			<span>文件状态：</span>
			<select name="status" class="selectBox1" style="width: 226px;margin-bottom: 20px!important;"  data-placeholder="Select Your Options">
				<option id="use"  value="1">使用</option>
				<option id="nuse"  value="0">禁用</option>
			</select>

			<%--<input type="file" name="myfiles"/><br/>--%>
			<input name="size" value="${softwareBaseinfo.size}" class="mio-inp size" placeholder="文件大小" style="
			margin-top: 20px;margin-bottom: 20px;width: 300px"  type="hidden">
			<input name="packageId" value="${softwareBaseinfo.packageId}" class="mio-inp packageId" placeholder="文件名称" style="margin-bottom: 20px;width: 300px"  type="hidden">

			<a href="javascript:;" class="a-upload" style="margin-top: 20px">
				<input type="file" name="file" id="selFile"/><span class="fileName">请选择文件</span>
			</a>
			<input type="button" value="修改" class="mio-regLogin" id="uPSoftbtn" style="
			box-shadow: none;margin-bottom: 15px;border-radius: 5px" />
		</form>


	</div>
	<script>
		remove($('.upName'));
		remove($('.upDesc'));
        inputBorder($('.mio-inp'));
        /*文件选择获取文件大小和名称*/
        $('#selFile').change(function () {
            var mysize = Math.ceil($("#selFile")[0].files[0].size/1024/1024);
            var name = $("#selFile")[0].files[0].name;
            $('.size').val(mysize)
            $('.packageId').val(name)
            $('.fileName').html(name)
        })

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

        enter($('#uPSoftbtn'));
        $('#uPSoftbtn').click(function () {
			console.log($('#upSoft').serializeJson());

            if($('.upName').val()==''||$('.upName').val()==null){
                checkTip($('.upName'),'必须填写','right','center');
                $('.upName').focus()
            }else if($('.upDesc').val()==''||$('.upDesc').val()==null){
                checkTip($('.upDesc'),'必须填写','right','center');
                $('.upDesc').focus()
            }else if($('#selFile').get(0).files[0]=='undefined'||$('#selFile').get(0).files[0]==''||$('#selFile').get(0).files[0]==null){
                uppsoft();
            }else{
                uploadfile()
			}


        })


		function uploadfile() {
            var formData = new FormData();
            formData.append("file", document.getElementById("selFile").files[0]);

            $.ajax({
                url: "${basePath}upload",
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
                beforeSend: function () {
                    mini.loading("正在上传...请等待", "文件上传");
                },
                complete: function () {
                    $('.mini-modal').fadeOut(500);
                    $('.mini-messagebox').fadeOut(500);
                    $('.mini-window').fadeOut(500)
                },
                success: function (result) {
                    if(result.commonResultInfo.message=='操作成功'){
                        uppsoft()
                    }else{
                        mntip(result.commonResultInfo.message,'info');
                    }

                },
                error: function () {
                    alert("上传失败！");
                }
            });
        }

		function uppsoft(){
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

        }

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

	</script>
</body>
</html>
