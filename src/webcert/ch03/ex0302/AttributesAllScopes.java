package webcert.ch03.ex0302;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Created by AmauryEsparza on 5/5/16.
 */
public class AttributesAllScopes extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        PrintWriter out = response.getWriter();
        Enumeration requestAttributeNames = request.getAttributeNames();
        while(requestAttributeNames.hasMoreElements()){
            String attributeName = requestAttributeNames.nextElement().toString();
            out.println("Request attribute: " + attributeName + "= " + request.getAttribute(attributeName));
        }

        HttpSession session = request.getSession();
        Enumeration sessionAttributeNames = session.getAttributeNames();
        while(sessionAttributeNames.hasMoreElements()){
            String attributeName = sessionAttributeNames.nextElement().toString();
            out.println("Session attribute: " + attributeName + "= " + session.getAttribute(attributeName));
        }

        ServletContext context = getServletContext();
        Enumeration contextAttributeNames = context.getAttributeNames();
        while(contextAttributeNames.hasMoreElements()){
            String attributeName = contextAttributeNames.nextElement().toString();
            out.println("Context attribute: " + attributeName + "= " + context.getAttribute(attributeName));
        }

    }

}
