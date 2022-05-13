<%--
  Created by IntelliJ IDEA.
  User: 405
  Date: 2022/5/7
  Time: 8:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>简单数据类型</h1>
<form action="${pageContext.request.contextPath}/simpleparam" method="post">
    <label>int类型：</label><input name="param1"/><br/>
    <label>float类型：</label><input name="param2"/><br/>
    <label>double类型：</label><input name="param3"/><br/>
    <label>char类型：</label><input name="param4"/><br/>
    <label>boolean类型：</label><input name="param5"/><br/>
    <label>String类型：</label><input name="param6"/><br/>
    <input type="submit" value="提交">
</form>
</body>
</html>
