<%--
  Created by IntelliJ IDEA.
  User: AmauryEsparza
  Date: 5/27/16
  Time: 8:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.TreeMap" %>
<%@ include file="header.jsp" %>
<%@ include file="setup.jsp" %>
<%
    TreeMap<String, String> cities = (TreeMap<String, String>) application.getAttribute("cities");
%>
<html>
<body>
    <table>
        <tr>
            <td>Capital</td>
            <td>Country</td>
        </tr>
        <% for(String key : cities.keySet()){ %>
            <tr>
                <td><%= key %></td>
                <td><%= cities.get(key) %></td>
            </tr>
        <% } %>
    </table>
</body>
</html>

<%@ include file="footer.jsp" %>
