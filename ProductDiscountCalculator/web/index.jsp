<%--
  Created by IntelliJ IDEA.
  User: hanayuki
  Date: 07/06/2020
  Time: 18:37
  To change this template use File | Settings | File Templates.
--%>
<%--Product Description: Mô tả của sản phẩm--%>
<%--List Price: Giá niêm yết của sản phẩm--%>
<%--Discount Percent: Tỷ lệ chiết khấu (phần trăm)--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title> Product Discount Calculator </title>
  </head>
  <body>
    <form method="post" action="/calculate">
      <div class="CalculateDiscount">
      <input type="text" name="PD" placeholder="Product Description">
      <input type="text" name="LP" placeholder="List Price">
      <input type="text" name="DP" placeholder="Discount Percent">
      <input type="submit" id="summit" value="Calculate">
      </div>
    </form>
  </body>
</html>
