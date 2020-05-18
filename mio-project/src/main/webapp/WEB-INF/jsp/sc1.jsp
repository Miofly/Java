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
    <form role="form" action="javascript:void(0)" enctype="multipart/form-data">
    	<div class="form-group">
    		<input id="selFile" name="file" type="file" multiple="multiple">
    	</div>
    	<div class="progress progress-striped active" style="display: none">
    		<div id="progressBar" class="progress-bar progress-bar-info"
    			 role="progressbar" aria-valuemin="0" aria-valuenow="0"
    			 aria-valuemax="100" style="width: 0%"></div>
    	</div>

    	<div class="form-group">
    		<button id="uploadBtn" type="submit" class="btn btn-success">上传文件</button>
    	</div>
    </form>
</body>
<script type="text/javascript">
    $(function() {

        $("#uploadBtn").click(function() {
            // 进度条归零
            $("#progressBar").width("0%");
            // 上传按钮禁用
            $("#uploadBtn").attr("disabled", true);
            // 进度条显示
            $("#progressBar").parent().show();
            $("#progressBar").parent().addClass("active");
            upload("带进度条的文件上传");
        });
        function refreshBtn(){
            setTimeout(function() {
                $("#uploadBtn").text("上传文件");
                $("#uploadBtn").removeAttr("disabled");
            }, 1500);
        }
        function upload(name) {

            let formData = new FormData(); // 通过append方法添加数据
            for(let i=0;i < $("#selFile")[0].files.length;i++){
                formData.append("file", document.getElementById("selFile").files[i]);
            }
            function onprogress(evt) {
                // 写要实现的内容
                var progressBar = $("#progressBar");
                if (evt.lengthComputable) {
                    var completePercent = Math.round(evt.loaded / evt.total * 100);
                    progressBar.width(completePercent + "%");
                    $("#progressBar").text(completePercent + "%");
                }
            }
            var xhr_provider = function() {
                var xhr = jQuery.ajaxSettings.xhr();
                if (onprogress && xhr.upload) {
                    xhr.upload.addEventListener('progress', onprogress, false);
                }
                return xhr;
            };
            $.ajax({
                url : '${basePath}/uploads',
                type : 'POST',
                cache : false,
                data : formData,
                processData : false,
                contentType : false,
                xhr : xhr_provider,
                success : function(data) {
                    console.log(data);
                 /*   result = $.parseJSON(data);
                    if (result.code == "0") {
                        $("#uploadBtn").text("上传成功");
                        $("#imageUpload").attr("src",result.data);
                        setTimeout(function() {
                            $("#uploadBtn").text("上传文件");
                        }, 1000);
                    } else if(result.code=="-4"){
                        $("#uploadBtn").text("不支持的文件类型");
                        ShowFailure("操作失败：" + result.data);
                    } else {
                        $("#uploadBtn").text(result.data);
                        ShowFailure("操作失败：" + result.data);
                    }*/
                    // 进度条隐藏
                    $("#progressBar").parent().hide();
                    refreshBtn();
                },
                error : function(data) {
                    console.info(data);
                    // ShowFailure("操作失败：" + data);
                    refreshBtn();
                }
            })
        }
    })
</script>

</body>
</html>