<%--
  Created by IntelliJ IDEA.
  User: AmauryEsparza
  Date: 5/27/16
  Time: 8:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.TreeMap" %>
<%
    TreeMap<String, String> citiesByCapital = new TreeMap<String, String>();
    citiesByCapital.put("Mexico City", "Mexico");
    citiesByCapital.put("Quebec", "Canada");
    citiesByCapital.put("Washington", "USA");
    citiesByCapital.put("Reykjavik", "Iceland");
%>
<html>
<body>
    <% application.setAttribute("cities", citiesByCapital); %>
</body>
</html>
