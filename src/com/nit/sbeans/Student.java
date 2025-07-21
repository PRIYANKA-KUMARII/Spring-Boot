package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	private University university;
	public Student(@Qualifier("delhiUniversity")University university) {
		 this.university= university;
	}
	public void printUniversityName() {
		 System.out.println("University :"+university.getName());
	}

}
