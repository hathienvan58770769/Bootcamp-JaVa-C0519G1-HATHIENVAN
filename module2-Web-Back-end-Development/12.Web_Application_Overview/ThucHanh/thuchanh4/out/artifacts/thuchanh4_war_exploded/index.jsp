<%--
  Created by IntelliJ IDEA.
  User: hathienvan
  Date: 2019-07-04
  Time: 09:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
      <title>Simple Dictionary</title>
  </head>
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
  <body>
      <h2>Simple Dictionary</h2>
      <form method="post" action="/translate">
          <input type="text" name="txtSearch" placeholder="Enter your word: ">
          <br>
          <input type="submit" id="submit" value="Search" >
      </form>
  </body>
</html>
