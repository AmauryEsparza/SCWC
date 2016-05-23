package webcert.ch04.ex0403;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

/**
 * Created by AmauryEsparza on 5/18/16.
 */
public class MyContextAttributeListener implements ServletContextAttributeListener {

    @Override
    public void attributeAdded(ServletContextAttributeEvent servletContextAttributeEvent) {
        System.out.println("Attribute added " + servletContextAttributeEvent.getName() + " value " + servletContextAttributeEvent.getValue());
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent servletContextAttributeEvent) {
        System.out.println("Attribute removed " + servletContextAttributeEvent.getName() + " value " + servletContextAttributeEvent.getValue());
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent servletContextAttributeEvent) {
        System.out.println("Attribute replaced " + servletContextAttributeEvent.getName() + " value " + servletContextAttributeEvent.getValue());
        System.out.println("New Attribute " + servletContextAttributeEvent.getName() + " value " + servletContextAttributeEvent.getServletContext().getAttribute(servletContextAttributeEvent.getName()));
    }
}
