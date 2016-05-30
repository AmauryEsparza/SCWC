<%--
  Created by IntelliJ IDEA.
  User: AmauryEsparza
  Date: 5/28/16
  Time: 11:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="webcert.ch06.ex0604.Reflector" %>
<%@ page import="java.util.Iterator" %>
<%
    String[] implicitMethodsNames = {"request", "response", "application", "config", "session", "out", "pageContext", "page"};
    Object[] implicitMethodsInstances = {request, response, application, config, session, out, pageContext, page};
    int counter = 0;
%>
<html>
<head>
    <title>Implicit Methods using reflection</title>
</head>
<body>
    <table>
        <tr>
            <td>Implicit object name</td>
            <td>Class Name</td>
            <td>Interface Implemented</td>
            <td>Methods Available</td>
        </tr>
        <%
            for(Object implicitMethod: implicitMethodsInstances){
            Reflector mReflector = new Reflector(implicitMethod);
        %>
            <tr>
                <td><%= implicitMethodsNames[counter] %></td>
                <td><%= mReflector.getClassName() %></td>
                <td>
                    <%
                        String interfaceName = "";
                        Iterator iterator = mReflector.getInterfaces().iterator();
                        while(iterator.hasNext()){
                            interfaceName = interfaceName.concat(iterator.next().toString().concat("\n"));
                        }
                    %>
                    <%= interfaceName %>
                </td>
                <td>
                    <%
                        String methodsName = "";
                        Iterator iterator2 = mReflector.getMethods().iterator();
                        while(iterator2.hasNext()){
                            methodsName = methodsName.concat(iterator2.next().toString().concat("\n"));
                        }
                    %>
                    <%= methodsName %>
                </td>
            </tr>
        <%
                counter++;
            }
        %>
    </table>

</body>
</html>
