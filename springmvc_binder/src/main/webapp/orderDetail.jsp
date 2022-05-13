<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/orderInfo" method="post">
    <label>订单号:</label><input name="orderId" value="2" />
    <table width="300" border="1">
        <tr>
            <td>商品ID</td>
            <td>商品名称</td>
        </tr>
        <tr>
            <td><input name="productInfo['生鲜'].proId" value="1"></td>
            <td><input name="productInfo['生鲜'].proName" value="三文鱼"></td>
        </tr>
        <tr>
            <td><input name="productInfo['酒水'].proId" value="2"></td>
            <td><input name="productInfo['酒水'].proName" value="红牛"></td>
        </tr>
    </table>
    <input type="submit" value="提交" />
</form>
</body>
</html>
