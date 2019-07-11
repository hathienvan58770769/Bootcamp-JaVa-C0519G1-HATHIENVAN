<%--
  Created by IntelliJ IDEA.
  User: hathienvan
  Date: 2019-07-10
  Time: 09:38
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Sandwich Condiments</title>
  </head>
  <body>
  <c:forEach var="list" items="${condiment}">
      <p>${list}</p>
  </c:forEach>

  <h1>Sandwich Condiments</h1>
  <form action="/save" method="get">
    <input type="checkbox" name="condiment" value="Lettuce">Lettuce
    <input type="checkbox" name="condiment" value="Tomato">Tomato
    <input type="checkbox" name="condiment" value="Mustard">Mustard
    <input type="checkbox" name="condiment" value="Sprouts">Sprouts
    <br>
    <hr style="float: left;width: 300px;">
    <br>
    <input type="submit" value="Save">

  </form>
  </body>
</html>
