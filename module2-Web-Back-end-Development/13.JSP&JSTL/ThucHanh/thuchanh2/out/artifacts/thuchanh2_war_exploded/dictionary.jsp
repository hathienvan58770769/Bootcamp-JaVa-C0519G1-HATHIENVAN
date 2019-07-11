<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: hathienvan
  Date: 2019-07-05
  Time: 08:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple Dictionary</title>
</head>
<body>
<%!
    Map<String, String> dictionary = new HashMap<>();
%>
<%
    dictionary.put("hello", "Xin chào");
    dictionary.put("how", "Thế nào");
    dictionary.put("book", "Sách");
    dictionary.put("computer", "Máy tính");

    String search = request.getParameter("txtSearch");

    String result = dictionary.get(search);
    if (result != null) {
        out.println("Word: " + search);
        out.println("Result: " + result);
    }else {
        out.println("Not found");
    }
%>
</body>
</html>
