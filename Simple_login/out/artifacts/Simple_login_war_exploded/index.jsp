<%--
  Created by IntelliJ IDEA.
  User: hanayuki
  Date: 07/06/2020
  Time: 15:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<style type="text/css">
  .login {
    height:180px; width:230px;
    margin:0;
    padding:10px;
    border:1px #CCC solid;
  }
  .login input {
    padding:5px; margin:5px
  }
</style>
<body>
<%--change method get if use code in login doget()--%>
<form method="post" action="/login">
  <div class="login">
    <h2>Login</h2>
    <input type="text" name="username" size="20"  placeholder="username" />
    <input type="password" name="password" size="20" placeholder="password" />
    <input type="submit" value="Sign in"/>
    <% int a =3;%>
    <%! int b = 3;%>
  </div>
</form>
</body>
</html>