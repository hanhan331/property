<%--
  Created by IntelliJ IDEA.
  User: 10323
  Date: 2021/12/17
  Time: 8:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>更新</title>
</head>
<body>
<form action ="${pageContext.request.contextPath}/updata" method="post" onsubmit="return confirm('确认修改吗?')">
    <table>
        <tr>
            <td>id</td>
            <td>
                ${sys.id}
                <input type="hidden" name="id" value="${sys.id}"></td>
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
            <td><input type="submit" value="修改"></td>
            <td><input type="reset" value="重置"> </td>
        </tr>
    </table>
</form>
</body>
</html>
