<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>请输入用户名和密码</h1>
<form action="${pageContext.request.contextPath}/getUser" method="post">
    <table width="300" border="1">
        <tr>
            <td>用户名：</td>
            <td><input name="username"/></td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><input name="password"/></td>
        </tr>
    </table>
    <input type="submit" value="提交">
</form>
</body>
</html>
