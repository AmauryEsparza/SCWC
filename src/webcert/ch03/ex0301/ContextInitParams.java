package webcert.ch03.ex0301;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

/**
 * Created by AmauryEsparza on 5/2/16.
 */
public class ContextInitParams extends HttpServlet {

    @Override
    public void init(){
        String ctxtParam1 = getServletContext().getInitParameter("propsFileName");
        String ctxtParam2 = getServletContext().getInitParameter("propsFile");

        String propFilePath = getServletContext().getRealPath(ctxtParam1 + "/" + ctxtParam2);
        System.out.println("Real Path " + propFilePath);

        try {
            FileInputStream inputStream = new FileInputStream(propFilePath);
            Properties propertiesFile = new Properties();
            propertiesFile.load(inputStream);
            getServletContext().setAttribute("properties", propertiesFile);
        } catch(IOException ex){
            ex.printStackTrace();
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        PrintWriter out = response.getWriter();
        Properties propertiesFile = (Properties) getServletContext().getAttribute("properties");
        String appName = propertiesFile.getProperty("application_name");

        out.println("Application Name " + appName);

    }

}
