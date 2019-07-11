<%--
  Created by IntelliJ IDEA.
  User: hathienvan
  Date: 2019-07-04
  Time: 09:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Currency Converter</title>
    <style type="text/css">
      input[type=text] {
        width: 300px;
        font-size: 16px;
        border: 2px solid #ccc;
        border-radius: 4px;
        padding: 12px 10px 12px 10px;
      }
      #submit {
        border-radius: 2px;
        padding: 10px 32px;
        font-size: 16px;
      }
    </style>
  </head>
  <body>
    <h2>Currency Converter</h2>
    <form method="post" action="/CurrencyConverter">
      <lable>Rate : </lable>
      <br>
      <input type="text" name="rate" placeholder="RATE" value="22000">
      <br>
      <lable>USD : </lable>
      <br>
      <input type="text" name="usd" placeholder="USD" value="0">
      <br>
      <input type="submit" id="submit" value="Converter">
    </form>
  </body>
</html>
