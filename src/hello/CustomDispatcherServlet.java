package hello;

import org.springframework.web.servlet.DispatcherServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CustomDispatcherServlet extends DispatcherServlet {
    @Override
    protected void doDispatch(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("CustomDispatcherServlet successfully configured.");
        super.doDispatch(request, response);
    }
}