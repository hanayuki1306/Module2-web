<%--
  Created by IntelliJ IDEA.
  User: hanayuki
  Date: 07/06/2020
  Time: 20:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Simple Calculator</title>
  </head>
  <body>
    <form method="post" action ="/calculator">
      <div class="SimpleCalculator">

      <h1>Simple Calculator</h1>
        <input type="nuber" name="FirstOperand" size="30" placeholder="FirstOperand">
          <br>
<%--        <input type="checkbox" id="FO1" name="FirstOperand" value="PhepCong">--%>
<%--        <label for="FO1"> Phep Cong</label><br>--%>
<%--        <input type="checkbox" id="FO2" name="FirstOperand" value="PhepTru">--%>
<%--        <label for="FO2"> Phep Tru</label><br>--%>
<%--        <input type="checkbox" id="FO3" name="FirstOperand" value="PhepNhan">--%>
<%--        <label for="FO3"> Phep Nhan</label><br>--%>
<%--        <input type="checkbox" id="FO4" name="FirstOperand" value="PhepChia">--%>
<%--        <label for="FO4"> Phep Chia</label><br>--%>
          <label for="pheptinh">Chọn phép tính:</label>
          <select name="pheptinh" id="pheptinh">
              <option value="PhepCong">Phep Cong</option>
              <option value="PhepTru">Phep Tru</option>
              <option value="PhepNhan">Phep Nhan</option>
              <option value="PhepChia">Phep Chia</option>
          </select>
        <br>
        <input type="nuber" name="SecondOperand" size="30" placeholder="SecondOperand">
        <br>
        <input type="submit" value="Calculate">
      </div>
    </form>

  </body>
</html>
