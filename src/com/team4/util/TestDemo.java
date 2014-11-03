package com.team4.util;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestDemo {
	
	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("J:\\project\\trunk\\code\\src\\com\\ace\\edu\\applicationContext-edu-service.xml");
		DataSource dataSource= (DataSource) context.getBean("edu_dataSource");
		System.out.println(dataSource);
	}

}
