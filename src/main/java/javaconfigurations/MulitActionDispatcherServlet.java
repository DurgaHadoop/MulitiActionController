package javaconfigurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
@Configuration
@ComponentScan("controller")
@EnableWebMvc
public class MulitActionDispatcherServlet extends WebMvcConfigurerAdapter
{
	   @Bean
       public InternalResourceViewResolver viewResolver()
       {
    	   InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
    	   viewResolver.setSuffix(".jsp");
    	   viewResolver.setPrefix("/WEB-INF/views/");
    	   return viewResolver;
       }
}
