<%@ page import="java.text.DecimalFormat" %><%--
  Created by IntelliJ IDEA.
  User: AmauryEsparza
  Date: 5/23/16
  Time: 8:55 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%!
    public String convert(int miles){
        DecimalFormat kmsFormated = new DecimalFormat("0.00");
        return kmsFormated.format(miles* 1.6);
    }
%>
<%
    int milesArray[] = {1, 15, 70, 23, 85, 2, 11, 45, 98, 0};
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table>
        <tr>
            <td>Miles</td>
            <td>Kms</td>
        </tr>
        <% for(int i = 0; i < milesArray.length; i++){ %>
            <tr>
                <td><%= milesArray[i] %></td>
                <td><%= convert(milesArray[i]) %></td>
            </tr>
        <% } %>

    </table>
</body>
</html>
