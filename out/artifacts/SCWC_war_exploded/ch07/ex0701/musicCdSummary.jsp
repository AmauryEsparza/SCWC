<%--
  Created by IntelliJ IDEA.
  User: AmauryEsparza
  Date: 6/2/16
  Time: 8:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="musicCDBean" scope="request" class="webcert.ch07.ex0701.MusicCD"/>
<jsp:setProperty name="musicCDBean" property="title" value="<%= request.getParameter("title") %>"/>
<jsp:setProperty name="musicCDBean" property="artist" value="<%= request.getParameter("artist") %>"/>
<jsp:setProperty name="musicCDBean" property="yearRelease" value="<%= Integer.parseInt(request.getParameter("yearRelease")) %>" />
<jsp:setProperty name="musicCDBean" property="favoriteTrack" value="<%= request.getParameter("favoriteTrack") %>"/>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2> Music CD Summary</h2>
    <table>
        <tr>
            <td>Param</td>
            <td>Value</td>
        </tr>
        <tr>
            <td>Title</td>
            <td><jsp:getProperty name="musicCDBean" property="title"/></td>
        </tr>
        <tr>
            <td>Artist</td>
            <td><jsp:getProperty name="musicCDBean" property="artist"/></td>
        </tr>
        <tr>
            <td>Year of release</td>
            <td><jsp:getProperty name="musicCDBean" property="yearRelease"/></td>
        </tr>
        <tr>
            <td>Favorite Track</td>
            <td><jsp:getProperty name="musicCDBean" property="favoriteTrack"/></td>
        </tr>
    </table>
</body>
</html>
