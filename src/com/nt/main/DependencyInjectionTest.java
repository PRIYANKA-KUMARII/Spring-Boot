package com.nt.main;
import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.SeasonFinder;

public class DependencyInjectionTest {
	public static void main(String [] args) {
		System.out.println("DependencyInjectionTest.main() (start)");
		try(ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext 
				("com/nt/cfgs/applicationContext.xml")){
		SeasonFinder finder=ctx.getBean("sf",SeasonFinder.class);
		
	String msg=finder.showSeasonName();
		System.out.print(msg);	System.out.println("-------------------");
		System.out.println("Spring Beans count:: "+ctx.getBeanDefinitionCount());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("DependencyInjectionTest.main()(end)");
		
	}

}
