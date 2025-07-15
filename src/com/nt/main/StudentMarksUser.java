package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.Student;

public class StudentMarksUser {
	public static void main(String [] args) {
		FileSystemXmlApplicationContext ctx= new FileSystemXmlApplicationContext("src/com/nt/cfgs/applictionContext.xml");
		Student student=ctx.getBean("student",Student.class);
		System.out.println("Student:"+student.getName());
		double result= student.getResult();
		if(student.isExamAttended()) {
			 System.out.println("Average marks:"+result);
		}
         
	}
}

