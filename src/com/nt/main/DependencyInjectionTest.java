package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;
import com.nt.sbeans.WishMessageGenerator;
public class DependencyInjectionTest {
	
public static void main (String [] args) {
	 FileSystemXmlApplicationContext ctx= new FileSystemXmlApplicationContext("src\\com\\nt\\cfgs\\applicationContent.xml");
	 Object obj= ctx.getBean("wmg");
	 
	 	WishMessageGenerator generator= (WishMessageGenerator)obj;
	 	String result=generator.generatorWishMessage("Priyanka");
	 	System.out.println(result);
	 	ctx.close();
	 
}
}
