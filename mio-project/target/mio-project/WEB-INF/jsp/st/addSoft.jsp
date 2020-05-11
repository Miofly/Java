<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
	<title>软件新增</title>
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
			margin-top: 20px ;
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
		<%--<img src="${basePath}images/zylogo.png"--%>
			 <%--&lt;%&ndash;style="width: 170px;height: 50px" &ndash;%&gt;alt="">--%>
		<%--<span style="font-size: 40px;display: block;--%>
		<%--margin-left: 15%;margin-top: -14.5%">SoftWare Admin</span>--%>
	</div>
		<form id="addSoft" method="post" enctype="multipart/form-data" onsubmit="return false;"
			  class="mio-frame" style="box-shadow: none;border-radius: 5px">

			<div style="border-bottom: 1px solid black;height: 30px;margin-bottom: 20px;width: 300px">
				<span style="font-size: 26px;padding-bottom: 5px;line-height: 10px">软件新增</span>
			</div>
			<div style="position: relative;">
				<span style="position: absolute;top: 20px;left: 0px">文件名称：</span>
				<input name="name" class="mio-inp addName" placeholder="请输入文件名称"  style="
				position: absolute;top: 10px;left: 63px;
			margin-bottom: 20px;width: 226px;box-shadow: none"  type="text">
			</div>

			<%--<span class="glyphicon glyphicon-remove small mio-remove" style="z-index: 1000"></span>--%>

			<div style="position: relative;margin-bottom: 130px">
				<span style="position: absolute;top: 80px;left: 0px">文件描述：</span>
				<input name="desc" class="mio-inp addDesc" placeholder="请输入文件描述" style="
				margin-bottom: 20px;width: 226px;box-shadow: none;
				position: absolute;top: 70px;left: 63px;"  type="text">
				<span class="glyphicon glyphicon-remove small mio-remove" style="z-index: 1000"></span>
			</div>
			<%--select框--%>
			<span>文件类型：</span>
			<select name="useType" class="selectBox" style="
			width: 226px;margin-bottom: 20px!important;box-shadow: none;"  data-placeholder="Select Your Options">
				<option value="">请选择</option>
			</select>

			<%--<input type="file" name="myfiles"/><br/>--%>
			<input name="size" class="mio-inp size" placeholder="文件大小" style="
			margin-top: 20px;margin-bottom: 20px;width: 300px"  type="hidden">
			<input name="packageId" class="mio-inp packageId" placeholder="文件名称" style="margin-bottom: 20px;width: 300px"  type="hidden">

			<a href="javascript:;" class="a-upload">
				<input type="file" name="file" id="selFile"/><span class="fileName">请选择文件</span>
			</a>

			<input type="button" value="上传" class="mio-regLogin" id="addSoftbtn" style="
			margin-top: 20px;margin-bottom: 15px;box-shadow: none;border-radius: 5px" />

		</form>


	</div>
	<script>
		inputBorder($('.mio-inp'));
		remove($('.addName'))
		remove($('.addDesc'))
        /*文件选择获取文件大小和名称*/
        $('#selFile').change(function () {
            var mysize = Math.ceil($("#selFile")[0].files[0].size/1024/1024);
            var name = $("#selFile")[0].files[0].name;
            $('.size').val(mysize)
            $('.packageId').val(name)
            $('.fileName').html(name)
        })

        /*select框*/selectChosen($('.selectBox'));

        /*select框数据*/
        $.ajax({
            url: "${basePath}sts/tNameA",//请求路径
            // type: "POST",//请求方式
            // data:{sql:softType},
            // async:false,/*异步*/
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

        enter($("#addSoftbtn"))
		$("#addSoftbtn").click(function () {

			if($('.addName').val()==''||$('.addName').val()==null){
				checkTip($('.addName'),'必须填写','right','center');
				$('.addName').focus()
			}else if($('.addDesc').val()==''||$('.addDesc').val()==null){
				checkTip($('.addDesc'),'必须填写','right','center');
				$('.addDesc').focus()
			}else if($(".selectBox option:selected").val()==null||$(".selectBox option:selected").val()==''){
				mntip("请选择文件类型",'info');
				$('.selectBox').focus()
			}else if($('#selFile').get(0).files[0]=='undefined'||$('#selFile').get(0).files[0]==''||$('#selFile').get(0).files[0]==null){
				mntip("请选择文件",'info');
			}else{
				var formData = new FormData();
				formData.append("file", document.getElementById("selFile").files[0]);
                console.log(formData);

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
                        mini.showTips({
                            content:'正在上传.....请等待',
                            state: 'info',
                            x: 'center',
                            y: 'center',
                            timeout: '111115000'
                        });
					},
					complete: function () {
                        $('.mini-modal').fadeOut(500);
                        $('.mini-messagebox').fadeOut(500);
                        $('.mini-window').fadeOut(500);
                        // window.CloseOwnerWindow();
					},
					success: function (result) {
						if(result.commonResultInfo.message=='文件上传成功'){
							addData();
						}else{
							mntip(result.commonResultInfo.message,'info');
						}

					},
					error: function () {
						alert("上传失败！");
					}
				});
			}
		});



        function addData() {
            $.ajax({
                url: "${basePath}sts/addSoft",//请求路径
                type: "POST",//请求方式
                data:$('#addSoft').serializeJson(),
                async:false,/*同步*/
                dataType: "json",//数据类型可以为 text xml json  script  jsonp
                success: function(result){//返回的参数就是 action里面所有的有get和set方法的参数
                    /*数据返回成功调用函数*/
                    console.log(result);
                    if (result.commonResultInfo.message=="操作成功"){
                        maxId()
                    }else{
                        mntip(result.commonResultInfo.message,'info');
                    }
                },
                error: function (result) {
                    console.log(result);
                    mntip('操作失败','danger');
                }
            });

        }

		/*获取最大ID值*/
        function maxId(){
            $.ajax({
                url: "${basePath}sts/maxId",//请求路径
                type: "POST",//请求方式
                // data:{sql:maxIdSql},
                dataType: "json",//数据类型可以为 text xml json  script  jsonp
                success: function(result){//返回的参数就是 action里面所有的有get和set方法的参数
                    maxId = result;
                    addRel();
                },
                error: function (result) {
                    console.log(result);
                    mntip('操作失败','danger');
                    grid.reload();
                }
            });
        }


        function addRel(){
            $.ajax({
                // url: "/sts/addSoft?type="+$(".selectBox option:selected").val()+"&id=maxId",//请求路径
                url: "${basePath}sts/addRel?type="+$(".selectBox option:selected").val()+"&id="+maxId+"",//请求路径
                type: "POST",//请求方式
                data:$('#addSoft').serializeJson(),
                async:false,/*同步*/
                dataType: "json",//数据类型可以为 text xml json  script  jsonp
                success: function(result){//返回的参数就是 action里面所有的有get和set方法的参数
                    /*数据返回成功调用函数*/
                    if (result.commonResultInfo.message=="操作成功"){
                        mntip("上传成功",'info');
                        setInterval(function(){
                            window.CloseOwnerWindow();
                        },1000);
                    }else{
                        mntip(result.commonResultInfo.message,'info');
                    }
                },
                error: function (result) {
                    console.log(result);
                    mntip('操作失败','danger');
                }
            });
        }
        $(document).keydown(function (event) {

            if (event.keyCode == 27) {
                $('.mini-modal').fadeOut(500);
                $('.mini-messagebox').fadeOut(500);
                $('.mini-window').fadeOut(500);
            }
        });

	</script>
</body>
</html>
