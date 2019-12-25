<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2019/12/25
  Time: 9:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--  请求参数绑定
 <a href="param/testParam?username=anan&password=bnbn">请求参数绑定</a>--%>
<%--<form action="param/saveAccount" method="post">
    姓名：<input type="text" name="username"/><br/>
    密码：<input type="text" name="password"/><br/>
    金额：<input type="text" name="money"/><br/>
    用户姓名：<input type="text" name="user.username"/><br/>
    用户年龄：<input type="text" name="user.age"/><br/>
    <input type="submit" name="提交"/><br/>
</form>--%>
<%--把数据放在Account--%>
<%--<form action="param/saveAccount" method="post">
    姓名：<input type="text" name="username"/><br/>
    密码：<input type="text" name="password"/><br/>
    金额：<input type="text" name="money"/><br/>

    用户姓名：<input type="text" name="list[0].username"/><br/>
    用户年龄：<input type="text" name="list[0].password"/><br/>

    用户姓名：<input type="text" name="map['one'].username"/><br/>
    用户年龄：<input type="text" name="map['one'].password"/><br/>

    <input type="submit" name="提交"/><br/>
</form>--%>
<%--<form action="param/saveUser" method="post">

    用户姓名：<input type="text" name="username"/><br/>
    用户年龄：<input type="text" name="age"/><br/>
        生日:<input type="text" name="date"/><br/>
    <input type="submit" name="提交"/><br/>
</form>--%>
<a href="param/testServlet">原生</a>
</body>
</html>
