<%--
  Created by IntelliJ IDEA.
  User: AmauryEsparza
  Date: 6/4/16
  Time: 7:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <jsp:include page="<%= request.getParameter("poem")%>"/>
</body>
</html>
