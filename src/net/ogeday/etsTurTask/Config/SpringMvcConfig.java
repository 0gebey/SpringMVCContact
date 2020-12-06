package net.ogeday.etsTurTask.Config;


import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import net.ogeday.etsTurTask.contacsDAO.ContactsDAO;
import net.ogeday.etsTurTask.contacsDAO.ContactsDAOImp;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = ".net.ogeday.etsTurTask")
public class SpringMvcConfig implements WebMvcConfigurer{

	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/etsturtask");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		
		return dataSource;
		
	}
	
	@Bean
	public ViewResolver getViewResolver() {
		
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/Views");
		resolver.setSuffix(".jsp");
		return resolver;
		}
	
	
	@Bean
	public ContactsDAO getContactsDAO() {
		return new ContactsDAOImp(getDataSource());
	}

}
