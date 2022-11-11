package com.cjc.configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class ApplicationIntializer  implements WebApplicationInitializer{

	public void onStartup(ServletContext servletContext) throws ServletException {
		
		AnnotationConfigWebApplicationContext context = new 
		  
			      AnnotationConfigWebApplicationContext();
		
		   context.setServletContext(servletContext);
		   context.register(AppConfigue.class);
		 ServletRegistration.Dynamic regitration =  servletContext.addServlet("dispatcher", new DispatcherServlet(context));
		    regitration.addMapping("/");
		   
	}

}
