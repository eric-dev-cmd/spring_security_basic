/**
 * 
 */
package com.secutity.zing.config;

import java.beans.PropertyVetoException;
import java.util.Properties;

import javax.management.RuntimeErrorException;
import javax.sql.DataSource;

import org.hibernate.PropertyValueException;
import org.hibernate.SessionFactory;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.secutity.zing")
public class DemoAppConfig {
//	@Autowired
//	private Environment env;
	
//	private Logger
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
//	@Bean
//	public DataSource myDataSource() {
////		Create connection bool
//		ComboPooledDataSource myDataSource = new ComboPooledDataSource();
////		Set the jdbc driver
//		try {
//			myDataSource.setDriverClass("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//		} catch (PropertyVetoException exc) {
//			throw new RuntimeException(exc);
//		}
////		set database connection props
//		myDataSource.setJdbcUrl(env.getProperty("jdbc.url"));
//		myDataSource.setUser(env.getProperty("jdbc.user"));
//		myDataSource.setPassword(env.getProperty("jdbc.password"));
////		set connection pool props
//		myDataSource.setInitialPoolSize(getIntProperty("connection.pool.initialPoolSize"));
//		myDataSource.setMinPoolSize(getIntProperty("connection.pool.minPoolSize"));
//		myDataSource.setMaxPoolSize(getIntProperty("connection.pool.maxPoolSize"));
//		myDataSource.setMaxIdleTime(getIntProperty("connection.pool.maxIdleTime"));
//
//		return myDataSource;
//	}
////	Need a helper method
//	private int getIntProperty(String propName) {
//		String propVal = env.getProperty(propName);
//		int intPropVal = Integer.parseInt(propVal);
//		return intPropVal;
//	}
//
//	private Properties getHibernateProperties() {
////		Set hibernate properties
//		Properties props = new Properties();
//		props.setProperty("hibernate.dialect", env.getProperty("hibernate.dialect"));
//		props.setProperty("hibernate.show_sql", env.getProperty("hibernate.show_sql"));
////		props.setProperty("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));
//		return props;
//	}
//
//	@Bean
//	public LocalSessionFactoryBean sessionFactory() {
////		Create session factorys
//		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
////		Set the propreties
//		sessionFactory.setDataSource(myDataSource());
//		sessionFactory.setPackagesToScan(env.getProperty("hiberante.packagesToScan"));
//		sessionFactory.setHibernateProperties(getHibernateProperties());
//
//		return sessionFactory;
//	}
//
//	@Bean
//	@Autowired
//	public HibernateTransactionManager transactionManager(SessionFactory sessionFactory) {
//		HibernateTransactionManager txManager = new HibernateTransactionManager();
//		txManager.setSessionFactory(sessionFactory);
//
//		return txManager;
//	}
//
//	public void addResourceHandlers(ResourceHandlerRegistry registry) {
//		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
//	}

}
