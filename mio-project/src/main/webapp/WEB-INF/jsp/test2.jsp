<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Swiper demo</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1">
    <%@include file="common.jsp"%>

<body>

</body>
<script>
    var funUrl="/common/sqlStr";  // 每个请求地址相同的部分
    var params = {sql:"select lan_name,x,y,dist_sroce from lan_info li,alarm_dist ad " +
        "where li.lan_id_sd = ad.in_id_sd"};
    queryData(funUrl,params,success);
    function queryData(url,params,success,error){

        // url=funUrl+url;// 拼接请求地址
        // var success = arguments[2]?arguments[2]:function(){};// 成功执行的函数
        // var error = arguments[3]?arguments[3]:function(){};// 失败执行的函数
        $.ajax({
            url:url,
            type:"get",
            dataType:"json",
            data:params,//参数
            success: function (res) {
                if(res.success==true){
                    success(res.data.data);
                }
            },
            error: function (res) {
                error(res);
            }
        })
    }
</script>
</html>
