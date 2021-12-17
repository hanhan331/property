<%--
  Created by IntelliJ IDEA.
  User: 10323
  Date: 2021/12/17
  Time: 10:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>复杂查询</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/query" method="post">
    <table>

        <tr>
            <td>pid</td>
            <td><input type="text" name="pid"></td>
        </tr>
        <tr>
            <td>available</td>
            <td><input type="text" name="available"></td>
        </tr>
        <tr>
            <td>title</td>
            <td><input type="text" name="title"></td>
        </tr>
        <tr>
            <td><input type="submit" value="查询"></td>
            <td><input type="reset" value="重置"></td>
        </tr>

    </table>


</form>
</body>
</html>
