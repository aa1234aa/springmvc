<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2019/12/24
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <%--<h3>入门程序</h3>
  <a href="sayHi">requestmapping注解</a>
  <a href="user/testString">testString</a>
  <a href="user/testVoid">testVoid</a>
  <a href="user/testModelAndView">testModelAndView</a>
  <a href="user/fileupload">testVoid</a>--%>
 <%-- <form action="user/fileupload" method="post" enctype="multipart/form-data">
    选择文件：<input type="file" name="upload"><br/>
              <input type="submit" value="上传">
      </form>--%>
  <form action="user/fileupload1" method="post" enctype="multipart/form-data">
    选择文件：<input type="file" name="upload"><br/>
    <input type="submit" value="上传">
  </form>
 </body>
</html>
