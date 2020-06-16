<%--
  Created by IntelliJ IDEA.
  User: hanayuki
  Date: 15/06/2020
  Time: 16:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <form method="POST" action="/save">
      <h1>This is home page</h1>
      <h1>Chọn gia vị phía bên dưới cho món sanswich nào</h1>
      <input type="checkbox" id="mam" name="giavi" value="Mắm">
      <label for="mam"> Mắm nè</label><br>
      <input type="checkbox" id="muoi" name="giavi" value="Muối">
      <label for="muoi"> Muối nè</label><br>
      <input type="checkbox" id="duong" name="giavi" value="Đường">
      <label for="duong"> Đường nè</label><br>
      <input type="checkbox" id="kem" name="giavi" value="Kem">
      <label for="kem"> Kem nè</label><br>

      <input type="submit" value="Save">
    </form>
  </body>
</html>
