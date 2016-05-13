package webcert.ch01.ex0104;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by AmauryEsparza on 4/28/16.
 */
public class Redirector extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response){

        String location = request.getParameter("location");
        System.out.println("PARAMETROS " + location);
        try {
            //The sendRedirect doesn't change the URL != forward
            response.sendRedirect(location);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
