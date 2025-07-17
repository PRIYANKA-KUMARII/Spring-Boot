package com.nt.main;

import com.nt.sbeans.SpringConfigureFile;
import com.nt.sbeans.Student;

public class Main {

	public static void main(String [] args) {
		 ApplicationContext context= new AnnotationApplicationContext(SpringConfigureFile.class);
		 Student std= context.getBean(Student.class);
		 std.display();
		 
	}
}
