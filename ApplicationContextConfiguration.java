package com.niit.ShoppingCart.Config;


import java.util.Properties;
import java.util.function.Supplier;

import javax.sql.DataSource;

import org.hibernate.SessionBuilder;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
//import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.ShoppingCart.Model.Category;
import com.niit.ShoppingCart.Model.Product;
import com.niit.ShoppingCart.Model.UserDetails;
 
@Configuration
@EnableTransactionManagement
@ComponentScan("com.niit.ShoppingCart")


public class ApplicationContextConfiguration { 

    
    @Bean(name="dataSource")
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.h2.Driver");
        dataSource.setUrl("jdbc:h2:tcp://localhost/~/test");
        dataSource.setUsername("sa");
        dataSource.setPassword("");
        return dataSource;
    }
    
    
    
    private Properties gethibernateProperties() {
        Properties properties = new Properties();
        properties.put("hibernate.show_sql","true");
        properties.put("hibernate.dialect","org.hibernate.dialect.H2Dialect");
        properties.put("hibernate.hbm2ddl.auto","create");
        return properties;        
    }
    
    
    @Autowired
    @Bean(name="sessionFactory")
    public SessionFactory  getsessionFactory(DataSource dataSource) {
        LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
        sessionBuilder.addProperties(gethibernateProperties());
      //  sessionBuilder.addAnnotatedClass(Category.class);
        sessionBuilder.addAnnotatedClass(Product.class);
        sessionBuilder.addAnnotatedClass(UserDetails.class);
        sessionBuilder.addAnnotatedClass(com.niit.ShoppingCart.Model.Supplier.class);
        sessionBuilder.addAnnotatedClass(com.niit.ShoppingCart.Model.Category.class);
        return sessionBuilder.buildSessionFactory();
     }
     
   
  
     @Autowired
    @Bean(name="transactionManager")
    public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
    	
       HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
      
       return transactionManager;
    }
}