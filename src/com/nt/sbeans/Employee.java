package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component
public class Employee  {
	private int id;
	private String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public void printDetails() {
		  System.out.println("Employee ID:"+id);
		  System.out.println("Employee Name:"+name);
	}
}
	