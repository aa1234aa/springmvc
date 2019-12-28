<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2019/12/24
  Time: 16:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <script type="text/javascript" src="./js/jquery-3.4.1.min.js"></script>
    <title>Title</title>
    <script type="text/javascript">
        $(function(){
            $("#btn").click(function () {
                alert("hello word");
            });
        });
    </script>
</head>
<body>
   <h3>访问成功了</h3>
    <%-- ${ msg }
     ${sessionScope}--%>
${user.age}<br/>
${user.date}<br/>
${user.username}<br/>

</body>
</html>
