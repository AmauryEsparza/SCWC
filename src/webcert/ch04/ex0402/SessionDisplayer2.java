package webcert.ch04.ex0402;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by AmauryEsparza on 5/17/16.
 */
public class SessionDisplayer2 extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if(request.getParameter("getSession") != null && request.getParameter("getSession").equals("true")) {
            HttpSession session = request.getSession();
            if (session.isNew()) {
                session.setAttribute("accesses", 1);
            } else {
                int accessesCounter = (int) session.getAttribute("accesses");
                session.setAttribute("accesses", ++accessesCounter);
            }
            out.println("JSESSIONID " + request.getParameter("JSESSIONID"));

            out.println("Number of accessed sessions " + session.getAttribute("accesses") + " Length " + (System.currentTimeMillis() - session.getCreationTime()));
        }else{
            out.println("No gSetSessionParameter found");
        }

    }
}
