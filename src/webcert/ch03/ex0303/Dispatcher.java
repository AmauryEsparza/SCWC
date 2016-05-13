package webcert.ch03.ex0303;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by AmauryEsparza on 5/11/16.
 */
public class Dispatcher extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String mode = request.getParameter("mode");
        RequestDispatcher dispatcher = request.getRequestDispatcher("/ex0303/Receiver?fruit=orange");

        if("forward".equals(mode)){
            dispatcher.forward(request, response);
        }else if("include".equals(mode)){
            dispatcher.include(request, response);
        }

        response.getWriter().println(mode + " processed");
    }
}
