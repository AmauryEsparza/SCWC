package webcert.ch01.ex0105;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by AmauryEsparza on 4/30/16.
 */
public class LifeCycle extends HttpServlet {

    static{
        System.out.println("static");
    }
    public LifeCycle(){

    }

    @Override
    public void init() throws ServletException {
        System.out.println("init");
    }

    @Override
    public void destroy(){
        System.out.println("destroy");
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response){
        System.out.println("doget");
    }
}
