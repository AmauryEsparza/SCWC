package webcert.ch04.ex0403;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by AmauryEsparza on 5/18/16.
 */
public class MyContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("Context Listener initialized");
        servletContextEvent.getServletContext().setAttribute("ListenerParameter", "Adding a context parameter inside the listener");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("Context Listener destroyed");
        servletContextEvent.getServletContext().removeAttribute("ListenerParameter");
    }
}
