<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>用户订单列表</h2>
<form action="${pageContext.request.contextPath}/showOrders" method="post">
    <input type="hidden" name="username" value="张三"/>
    <input type="hidden" name="id" value="1" />
    <table width="300" border="1">
        <tr>
            <td>订单号</td>
            <td>商品名称</td>
            <td>配送地址</td>
        </tr>
        <tr>
            <td><input name="orders[0].orderId" value="1"/></td>
            <td><input name="orders[0].goodsName" value="Java基础教程"/></td>
            <td><input name="orders[0].address" value="北京海淀"/></td>
        </tr>
        <tr>
            <td><input name="orders[1].orderId" value="2"/></td>
            <td><input name="orders[1].goodsName" value="JavaEE企业开发教程"/></td>
            <td><input name="orders[1].address" value="北京昌平"/></td>
        </tr>
        <tr>
            <td><input name="orders[2].orderId" value="3"/></td>
            <td><input name="orders[2].goodsName" value="Android基础开发"/></td>
            <td><input name="orders[2].address" value="北京朝阳"/></td>
        </tr>
    </table>
    <input type="submit" value="提交订单信息" />
</form>
</body>
</html>
