<%--
  Created by IntelliJ IDEA.
  User: Huge666
  Date: 2019/5/24
  Time: 15:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login page</title>
    <link rel="stylesheet" type="text/css" href="../CSS/css.css"/>
</head>
<body>
<div class="Div">
<form action="/servlet/userController?flag=login" method="post">
    <br />
    账号：<input name="username" id="username" type="text">
    <br />
    密码：<input name="password" id="password" type="password">
    <br />
    <input type="submit" value="login">
</form>
</div>
</body>
</html>
