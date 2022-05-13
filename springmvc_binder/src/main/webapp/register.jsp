<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>用户注册页面</h1>
<!--显示对象数据-->
${username}您好<br/>
您的密码是：${password}<br/><br/><br/>
${user.username}您好<br/>
您的密码是：${user.password}<br/><br/><br/>
<!--显示数组， item表示数组名称，var表示数组中的每一项的名称-->
<c:forEach items="${course}" var="c">
    ${c}<br/>
</c:forEach>
</body>
</html>
