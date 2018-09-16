package com.my.datasource;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDaoDemo {

	public static void main(String[] args) throws SQLException {
			ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
			
			DataSource ds=(DataSource)context.getBean("dataSource1");
			System.out.println("connection from dataSource: " + ds.getConnection());

	        DataSource ds2 = (DataSource)context.getBean("dataSource2");
	        System.out.println("connection from datasource2: " + ds2.getConnection());
	        
	        DataSource ds3 = (DataSource)context.getBean("dataSource3");
	        System.out.println("connection from datasource3: " + ds3.getConnection());
	        
	        ((ClassPathXmlApplicationContext)context).close();
	    }

}
