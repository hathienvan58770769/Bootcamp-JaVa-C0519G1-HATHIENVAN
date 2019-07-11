<%--
  Created by IntelliJ IDEA.
  User: hathienvan
  Date: 2019-07-10
  Time: 10:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Calculator</title>
  </head>
  <body>
  <h1>Calculator</h1>
  <form action="/calculator" method="get">
    <input type="text" name="firstNumber"  placeholder="first number">
    <input type="text" name="secondNumber" placeholder="second number">
    <br>
    <input type="submit" name="cal" value="Addition(+)">
    <input type="submit" name="cal" value="Subtraction(-)">
    <input type="submit" name="cal" value="Multiplication(*)">
    <input type="submit" name="cal" value="Division(/)">
    <br>
    <p>Result ${cal}:${result} </p>
  </form>
  </body>
</html>
