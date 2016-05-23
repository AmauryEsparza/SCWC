package webcert.ch04.ex0403;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by AmauryEsparza on 5/18/16.
 */
public class SetContextAttributes extends HttpServlet {

    @Override
    public void init(){
        System.out.println("Init method called from the SetContextAttribute Servlet");
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response){
        ServletContext context = getServletContext();

        context.setAttribute("Attribute1", "Adding a first attribute to test the listener");
        context.setAttribute("Attribute2", "Adding a second attribute to test the listener");
        context.removeAttribute("Attribute1");
        context.setAttribute("Attribute2", "Modifying a second attribute to test the listener");


    }
}
