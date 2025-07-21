package com.nit.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.nit.config.AppConfig;
import com.nit.sbeans.PersonInfo;

public class PropertiesFileTest {
	public static void main(String [] args) {
		 AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		 PersonInfo info= ctx.getBean("pInfo", PersonInfo.class);
		 System.out.println(info);
		
	
	}

}
