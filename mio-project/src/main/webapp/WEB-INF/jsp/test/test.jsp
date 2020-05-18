<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@include file="../common.jsp" %>
</head>
<body>
<script>
    var sql = 'select * from software_baseinfo where name like \'%映美%\''
    $.ajax({
        url: "http://localhost:8081/soft/common/sqlStr",
        type: 'get',
        data: {sql: sql},
        dataType: 'json',
        //processData: false,   用FormData传fd时需有这两项
        //contentType: false,
        success: function (data) {
            console.log('返回的数据：' + JSON.stringify(data))
        }
    })
</script>

<div class="container">

</div>

<script>

</script>
</body>
</html>
