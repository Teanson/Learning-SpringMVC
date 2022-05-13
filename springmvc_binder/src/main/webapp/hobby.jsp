<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>您的爱好</title>
</head>
<body>
<h2>请选择您的爱好</h2>
<form action="${pageContext.request.contextPath}/getHobby" method="post">
    <label>爱好：</label>
    <input type="checkbox" name="hobby" value="Java"/>Java
    <input type="checkbox" name="hobby" value="Html5"/>Html5
    <input type="checkbox" name="hobby" value="Python"/>Python
    <input type="checkbox" name="hobby" value="Ruby"/>Ruby
    <input type="checkbox" name="hobby" value="Go"/>Go
    <input type="checkbox" name="hobby" value="C++"/>C++
    <input type="submit" value="提交"/>
</form>
</body>
</html>
