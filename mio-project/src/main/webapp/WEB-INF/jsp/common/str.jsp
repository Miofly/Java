<%--
  Created by IntelliJ IDEA.
  User: MIO
  Date: 2019/2/27
  Time: 23:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@include file="../common.jsp"%>
</head>
<body>
<script>
    var str1 = "mioflylo灬veZxx";
    var str2 = "wfd";
    console.log(str1.charAt(1)); // i 返回指定索引处的字符串
    console.log(str1.concat(str2,str1)); // mioflylo灬veZxxwfdmioflylo灬veZxx 连接多个字符串，返回连接后的字符串的副本
    console.log(str1.indexOf("o")); // 2 返回str在父串中第一次出现的位置，若没有则返回-1
    console.log(str1.lastIndexOf('o')); // 7 返回str在父串中最后一次出现的位置，若没有则返回-1
    console.log(str1.match(/x/g)); //  搜索字符串，并返回正则表达式的所有匹配
    console.log(str1.replace('x','y')); // mioflylo灬veZyx   str1也可以为正则表达式，用str2替换str1
    console.log(str1.replace(/x/g,'y')); // mioflylo灬veZyy  str1也可以为正则表达式，用str2替换str1
    console.log(str1.search(/d+/g)); // -1  基于正则表达式搜索字符串，并返回第一个匹配的位置
    console.log(str1.slice(4,5)); // l  返回字符索引在start和end（不含）之间的子串
    console.log(str1.split('o')); // ["mi", "flyl", "灬veZxx"]   将字符串分割为字符数组，limit为从头开始执行分割的最大数量
    console.log(str1.split('o',1)); // ["mi"] 将字符串分割为字符数组，limit为从头开始执行分割的最大数量
    console.log(str1.split('o',4)); // ["mi", "flyl", "灬veZxx"] 将字符串分割为字符数组，limit为从头开始执行分割的最大数量
    console.log(str1.substr(2,1)); // o 从字符索引start的位置开始，返回长度为length的子串
    console.log(str1.substring(2,4)); // of 返回字符索引在from和to（不含）之间的子串
    console.log(str1.toLowerCase()); // mioflylo灬vezxx 将字符串转换为小写
    console.log(str1.toUpperCase()); // MIOFLYLO灬VEZXX 将字符串转换为大写
    console.log(str1.valueOf()); // mioflylo灬veZxx 返回原始字符串值
</script>

</body>
</html>
