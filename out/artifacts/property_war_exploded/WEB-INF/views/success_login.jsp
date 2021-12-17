<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/12/16
  Time: 14:46
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SUCCESS</title>
</head>
<body>
<div>
    <div name="q1">
        <a href="" >...系统</a>
    </div>
   <div name="q2">
       <c:if test="${current_user.pri>=2}">
           <a href="${pageContext.request.contextPath}/findAll">...系统</a>
       </c:if>
       <c:if test="${current_user.pri<2}">

       </c:if>
   </div>

</div>

</body>

</html>
