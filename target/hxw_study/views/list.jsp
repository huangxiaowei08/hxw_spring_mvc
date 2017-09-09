<%--
  Created by IntelliJ IDEA.
  User: huangxiaowei
  Date: 17/9/9
  Time: 下午8:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %> <%--坑啊，就因为这个引用卡了一个小时。。。--%>
<html>
<head>
    <title>Show Page</title>
</head>
<body>
<table border="1" cellspacing="0" cellpadding="10">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Age</th>
    </tr>

    <c:forEach items="${userList}" var="user">
        <tr>
            <th>${user.id}</th>
            <th>${user.name}</th>
            <th>${user.age}</th>
        </tr>
    </c:forEach>
</table>
</body>
</html>
