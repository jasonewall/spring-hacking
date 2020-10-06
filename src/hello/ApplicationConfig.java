package hello;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.DispatcherServlet; 

@Configuration
public class ApplicationConfig {
    @Bean
    public DispatcherServlet dispatcherServlet() {
        DispatcherServlet dispatcherServlet = new CustomDispatcherServlet();
        return dispatcherServlet;
    }
}