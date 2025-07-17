package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.A;
import com.nt.sbeans.B;

public class CyclicInjectionTest {
	public static void  main(String [] args) {
		 try(FileSystemXmlApplicationContext ctx= new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");){
			 A a=(A)ctx.getBean("a1");
			 System.out.println("a="+a);
			 B b=(B)ctx.getBean("b1");
			 System.out.println("b="+b);
		 }
		 catch(Exception e) {
			  e.printStackTrace();
		 
			 
		 }
	}

}
