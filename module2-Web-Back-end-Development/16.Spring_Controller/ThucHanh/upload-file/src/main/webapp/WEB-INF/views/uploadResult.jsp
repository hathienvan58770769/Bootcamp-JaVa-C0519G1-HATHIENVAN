<%--
  Created by IntelliJ IDEA.
  User: hathienvan
  Date: 2019-07-10
  Time: 15:28
  To change this template use File | Settings | File Templates.
--%>

<html>

<head>

    <meta charset="UTF-8">

    <title>Upload Result</title>

</head>

<body>

<jsp:include page="menu.jsp"/>

<h3>Uploaded Files:</h3>

Description: ${description}

<br/>

<c:forEach items="${uploadedFiles}" var="file">

    - ${file} <br>

</c:forEach>

</body>

</html>
