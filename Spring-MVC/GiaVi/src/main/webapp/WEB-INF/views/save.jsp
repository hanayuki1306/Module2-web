<%--
  Created by IntelliJ IDEA.
  User: hanayuki
  Date: 15/06/2020
  Time: 17:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = 'http://java.sun.com/jsp/jstl/core' prefix = 'c' %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>This is save page</h1>
<c:forEach items="${element}" var="giavi">
    <p>${giavi}</p>
</c:forEach>
</body>
</html>
