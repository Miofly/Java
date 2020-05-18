<%--
  Created by IntelliJ IDEA.
  User: MIO
  Date: 2019/2/28
  Time: 9:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Title</title>
	<%@include file="../common.jsp" %>
</head>
<body>

<script>
	var a = 11;
	var b = 66.66;
	console.log(Math.abs(-11.123)); // 11.123 绝对值
  	console.log(Math.ceil(-11.123),Math.ceil(11.123)); // -11 12 大于等于x的最小整数
  	console.log(Math.floor(-11.123),Math.floor(11.123)); // -11 12 小于等于x的最大整数
	console.log(Math.round(11.123),Math.round(11.523)); // 11 12	四舍五入取整
	console.log(Math.max(1,313213,123213,12213)); // 313213	求一组数中的最大的数
	console.log(Math.min(1,313213,123213,12213)); // 1	求一组数中的最小的数
	console.log(6%2,6%4); // 0 2 求余数
	console.log(1231.1121.toFixed(1)); // "1231.1" 转换成指定长度的小数
	console.log(parseInt("213213"),parseInt("-213213.3213")); // 213213 -213213 将字符串转换成整数
	console.log(parseFloat("213213"),parseFloat("-213213.3213")); // 213213 -213213.3213 将字符串转换成浮点数
	console.log(Math.random()); // 返回 0 ~ 1 之间的随机数。
	console.log(isNaN("11"),isNaN("1大"),isNaN("12312"),isNaN(1)); // false true false false 判断是否是数字
</script>
</body>
</html>
