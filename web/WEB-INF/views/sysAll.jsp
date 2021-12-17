<%--
  Created by IntelliJ IDEA.
  User: 10323
  Date: 2021/12/16
  Time: 16:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>sysAll</title>
    <form action="/findAll" method="post">
        <table>
            <tr>
                <td>id</td>
                <td>pid</td>
                <td>title</td>
                <td>spread</td>
                <td>url</td>
                <td>icon</td>
                <td>available</td>
                <td>操作</td>
            </tr>
            <c:forEach items="${sys}" var="sys">


            <tr>
                <td>${sys.id}</td>
                <td>${sys.pid}</td>
                <td>${sys.title}</td>
                <td>${sys.spread}</td>
                <td>${sys.url}</td>
                <td>${sys.icon}</td>
                <td>${sys.available}</td>
                <td>
                    <a href="${pageContext.request.contextPath}/delete?id=${sys.id}" onclick="return confirm('确认删除吗')">删除</a>
                    <a href="${pageContext.request.contextPath}/findById?id=${sys.id}">更新</a>
                </td>
            </tr>
            </c:forEach>
        </table>
        <a href="${pageContext.request.contextPath}/findAll?page=1">首页</a>
        <c:if test="${page.page==1}">
            <a>上一页</a>
        </c:if>
        <c:if test="${page.page>1}">
            <a href="${pageContext.request.contextPath}/findAll?page=${page.page-1}">上一页</a>

        </c:if>
        <c:if test="${page.page==page.totalPages}">
            <a>下一页</a>
        </c:if>
        <c:if test="${page.page<page.totalPages}">
            <a href="${pageContext.request.contextPath}/findAll?page=${page.page+1}">下一页</a>

        </c:if>


        <a href="${pageContext.request.contextPath}/findAll?page=${page.totalPages}">尾页</a>

        <a href="${pageContext.request.contextPath}/router?path=save">添加</a>
    </form>
    <a href="${pageContext.request.contextPath}/router?path=query">复杂查询</a>
</head>
<body>

</body>
</html>
