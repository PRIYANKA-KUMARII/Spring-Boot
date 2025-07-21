package com.nt.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.Vechile;
public class VechileDemo {
	public static void main(String [] args) {
		 ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
			Vechile bean = ctx.getBean(Vechile.class);
			System.out.println(bean.getVechile());
		
	}

	
	
}