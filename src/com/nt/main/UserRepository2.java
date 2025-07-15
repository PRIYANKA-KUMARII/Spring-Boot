package com.nt.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.UserService;

public class UserRepository2 {
	public static void main(String [] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		UserService bean= ctx.getBean(UserService.class);
		
		System.err.println(bean);
	}

}
