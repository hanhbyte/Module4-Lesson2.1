<%--
  Created by IntelliJ IDEA.
  User: Dsquared
  Date: 10/12/2021
  Time: 17:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Success</title>
</head>
<body>
<h1>HOME</h1>
<h3 style="color: red">${message}</h3>
<form action="/validate" method="post">
    <input type="text" name="email"><br>
    <input type="submit" value="Validate">
</form>
</body>
</html>
