package webcert.ch03.ex0304;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by AmauryEsparza on 5/12/16.
 */
public class MicroPaymentFilter implements Filter{

    private FilterConfig filterConfig = null;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        request.setAttribute("referrer", request.getLocalAddr());
        filterChain.doFilter(request, response);
        response.getWriter().println("Micropayment completed");
    }

    @Override
    public void destroy() {
        this.filterConfig = null;
    }
}
