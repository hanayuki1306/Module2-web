<%--
  Created by IntelliJ IDEA.
  User: hanayuki
  Date: 07/06/2020
  Time: 20:02
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
    <input type="submit" name="Detail" value="ClickToShowDetail">
    <table>
      <tr>
        <th>Tên</th>
        <th>Tuổi</th>
        <th>Địa Chỉ</th>
        <th>Hình ảnh</th>
      </tr>
      <tr>
        <th>c: ${}</th>
      </tr>
    </table>
  </form>


  </body>
</html>
