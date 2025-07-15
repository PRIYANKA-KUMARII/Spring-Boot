package com.nt.main;

import com.nt.maincom.nt.sbeans.WishMessageGenerator;


import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.main.*;
public class DependencyInjection {
	public  static void main(String [] args) {
		FileSystemXmlApplicationContext ctx= new FileSystemXmlApplicationContext("src\\com\\nt\\cfgs\\applicationContext.xml");
		 Object obj= ctx.getBean("wmg");
		 
		 	WishMessageGenerator generator= (WishMessageGenerator)obj;
//		 	
		 	ctx.close();
		 
	}
	}
