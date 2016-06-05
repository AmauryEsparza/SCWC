<%--
  Created by IntelliJ IDEA.
  User: AmauryEsparza
  Date: 6/4/16
  Time: 7:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String[] htmlPageNames = {"poem1.html", "poem2.html", "poem3.html", "poem4.html"};
    int rndm = (int) (Math.random() * 4);
%>
<jsp:forward page="poemOfTheDay.jsp">
    <jsp:param name="poem" value="<%= htmlPageNames[rndm] %>"/>
</jsp:forward>
