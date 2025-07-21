package com.nt.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.annotation.Order;

import com.nt.sbeans.OrderCake;

public class Tester {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfg/applicationContext.xml");
		OrderCake bean = ctx.getBean(OrderCake.class);
		System.out.println(bean.getOrderCake());
	
	}
}
