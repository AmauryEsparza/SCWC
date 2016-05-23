<%--
  Created by IntelliJ IDEA.
  User: AmauryEsparza
  Date: 5/22/16
  Time: 3:46 PM
  To change this template use File | Settings | File Templates.
--%>
<html>
    <%!
        public void jspDestroy(){
            System.out.println("jspDestroy method called");
        }

        public void jspInit(){
            System.out.println("jspInit " + this.getClass().getName());
            System.out.println("jspInit " + this.getClass().getSuperclass());
            System.out.println("jspInit method called");

        }
    %>
    <head>
        <title>JavaServer Page Lifecycle</title>
    </head>
    <body bgcolor="#FFFFFF">
        <h1>To illustrate JavaServer Page lifecycle</h1>
    </body>
</html>

<%
    System.out.println("Inside the _jspService method");
%>