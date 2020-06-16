<%--
  Created by IntelliJ IDEA.
  User: hanayuki
  Date: 14/06/2020
  Time: 14:58
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1> This is Login page</h1>

    <form:form action="/home/login" method="post" modelAttribute="login">
        <%--Thuộc tính modelAttribute của thẻ <form:form> được liên kết tới thuộc tính login của ModelAndView trả về từ phương thức home().--%>
        <fieldset>
            <legend>Login</legend>
            <table>
                <tr>
                    <td><form:label path="account">Account:</form:label></td>
                    <td><form:input path="account"  /></td>
                </tr>
                <tr>
                    <td><form:label path="password">Password:</form:label></td>
                    <td><form:input path="password"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><form:button>Login</form:button></td>
                </tr>
            </table>
        </fieldset>
    </form:form>
</body>
</html>
