<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2019/12/27
  Time: 15:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>

<head>
    <title>Title</title>
    <script type="text/javascript" src="./js/jquery-3.4.1.min.js"></script>
    <script type="text/javascript">

        $(function(){
            $("#btn").click(function () {
                $.ajax({
                    type: "POST",
                    url: "user/testAjax",
                    data: '{"username":"安安","age":30,"password":"123"}',
                    dataType:"json",
                    contentType:"application/json;charset:UTF-8",
                    success: function(data){
                        alert(data);
                        alert(data.username);
                        alert(data.password)
                        alert(data.dateTime)
                    }
                });
            });
        });

    </script>

</head>
<body>
   <button id="btn">按钮</button>
</body>
</html>
