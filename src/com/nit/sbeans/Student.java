package com.nit.sbeans;

public class Student {
private University university;
public Student(University university) {
	 this.university=university;
}
public void printUniversityName() {
	 System.out.println("Student belong to:"+university .getName());
}
}
