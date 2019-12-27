<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2019/12/25
  Time: 16:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<a href="anno/testRequestParam?name=anan">你好</a>--%>
<form action="anno/testRequestBody" method="post">
    用户姓名：<input type="text" name="username"/><br/>
    用户年龄：<input type="text" name="age"/><br/>
    <input type="submit" name="提交"/><br/>
</form>
<a href="anno/testPathVariable/10">你好</a><br/>
<a href="anno/testReauestHeader">testReauestHeader</a><br/>
<a href="anno/testCookieValue">testCookieValue</a><br/>
<a href="anno/testModelAttribute">testModelAttribute</a><br/>
<form action="anno/testModelAttribute" method="post">
    用户姓名：<input type="text" name="username"/><br/>
    用户年龄：<input type="text" name="age"/><br/>
    <input type="submit" name="提交"/><br/>
</form>
<a href="anno/testSessionAttributes">你好</a><br/>
<a href="anno/getSessionAttributes">getSessionAttributes</a><br/>
<a href="anno/delSessionAttributes">delSessionAttributes</a><br/>
</body>
</html>
