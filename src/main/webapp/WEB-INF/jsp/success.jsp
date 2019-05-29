<%--
  Created by IntelliJ IDEA.
  User: BCool
  Date: 2017/9/25
  Time: 20:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>hello world</title>
</head>
<body>
<button id="btn" onclick="test()">测试</button>
<script src="../../js/jquery-3.2.1.min.js"></script>
<script>
    function test(){
        $.ajax({
        url: "test.do",
        type: "POST",
        dataType: "text",
        contentType:"application/json",
        success: function(data) {
            alert("后台返回"+data);
        },
        error: function() {
            alert("error");
        }
    });
    }
</script>
</body>
</html>
