package webcert.ch03.ex0304;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by AmauryEsparza on 5/12/16.
 */
public class MicroPaymentServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String reffererName = (String) request.getAttribute("refferer");
        response.getWriter().println("Request param refferer: " + reffererName);
    }
}
