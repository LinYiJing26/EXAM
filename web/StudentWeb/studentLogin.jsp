<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login page</title>
    <link rel="stylesheet" type="text/css" href="../CSS/css.css"/>
</head>
<body>
<div class="Div">
    <form action="servlet/studentController?flag=studentLogin" method="post">
        <br/>
        账号：<input name="studentLoginID" id="studentLoginID" type="text">
        <br/>
        密码：<input name="studentLoginPassword" id="studentLoginPassword" type="password">
        <br/>
        <input type="submit" value="login">
    </form>
</div>
<div class="Div">
    <form action="servlet/studentController?flag=studentRegister" method="post">
        <br/>
        账号：<input name="studentRegisterID" id="studentRegisterID" type="text">
        <br/>
        密码：<input name="studentRegisterPassword" id="studentRegisterPassword" type="password">
        <br/>
        <input type="submit" value="register">
    </form>
</div>
</body>
</html>
