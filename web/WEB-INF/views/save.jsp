<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/12/13 0013
  Time: 下午 1:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增一名员工</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/save" method="post">
    <table>
        <tr>
            <td>id</td>
            <td>
                ${sys.id}
                <input type="text" name="id" value="${sys.id}"></td>
        </tr>
        <tr>
            <td>pid</td>
            <td><input type="text" name="pid" value="${sys.pid}"></td>
        </tr>
        <tr>
            <td>title</td>
            <td><input type="text" name="title" value="${sys.title}"></td>
        </tr>
        <tr>
            <td>spread</td>
            <td><input type="text" name="spread" value="${sys.spread}"></td>
        </tr>
        <tr>
            <td>url</td>
            <td><input type="text" name="url" value="${sys.url}"></td>
        </tr>
        <tr>
            <td>icon</td>
            <td><input type="text" name="icon" value="${sys.icon}"></td>
        </tr>
        <tr>
            <td>available</td>
            <td><input type="text" name="available" value="${sys.available}"></td>
        </tr>
        <tr>
            <td><input type="submit" value="添加"></td>
            <td><input type="reset" value="重置"> </td>
        </tr>
    </table>
</form>
</body>
</html>
