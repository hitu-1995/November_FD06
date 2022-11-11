package com.cjc.configuration;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.cjc.model.Student;

@Configuration
@ComponentScan(basePackages = "com.cjc")
@EnableWebMvc
public class AppConfigue {

	@Bean
	public InternalResourceViewResolver viewResolver() {
	
		InternalResourceViewResolver resolver = new
				  InternalResourceViewResolver();
		
		resolver.setPrefix("/views/");
		resolver.setSuffix(".jsp");
		
		return resolver;
	}
	
	@Bean
	public DriverManagerDataSource dataSource() {
		
		DriverManagerDataSource dataSource = new 
				DriverManagerDataSource();
		  dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		  dataSource.setUrl("jdbc:mysql://localhost:3306/test");
		  dataSource.setUsername("root");
		  dataSource.setPassword("root");
		
		   return dataSource;
	}
	
	@Bean
	public LocalSessionFactoryBean factoryBean() {
		
		LocalSessionFactoryBean sf = new 
				LocalSessionFactoryBean();
		  Properties properties = new Properties();
		  properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
		  properties.setProperty("hibernate.hbm2ddl.auto","update");
		  properties.setProperty("hibernate.show_sql","true");
		  
		  sf.setHibernateProperties(properties);
		  sf.setAnnotatedClasses(Student.class);
		  sf.setDataSource(dataSource());
		  
		return sf;
	}
}








