<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>register page</title>
    <link rel="stylesheet" type="text/css" href="../CSS/css.css"/>
</head>
<body>
<div class="Div">
    <form action="servlet/studentController?flag=studentRegister" method="post">
        <br />
        账号：<input name="username" id="username" type="text">
        <br />
        密码：<input name="password" id="password" type="password">
        <br />
        <input type="submit" value="register">
    </form>
</div>
</body>
</html>
