<%--
  Created by IntelliJ IDEA.
  User: hanayuki
  Date: 08/06/2020
  Time: 14:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>CustomerInfo</title>
</head>
<body>
<form method="get" action ="/infoCustomer">
  <h1> Danh sách khách hàng </h1>
  <br>
<%--  <input type="submit" name="Detail" value="ClickToShowDetail">--%>
  <table>
    <tr>
      <th>Tên</th>
      <th>Tuổi</th>
      <th>Địa Chỉ</th>
      <th>Hình ảnh</th>
    </tr>

    <c:forEach items="${requestScope.customer}" var="customer">
      <tr>
        <td>${customer.name}</td>
        <td>${customer.birthday}</td>
        <td>${customer.address}</td>
        <td><img width=100px height=100px src="${customer.urlImage}" alt="image"></td>
      </tr>
    </c:forEach>
  </table>
</form>


</body>
</html>
