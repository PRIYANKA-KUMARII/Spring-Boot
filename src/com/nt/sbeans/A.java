package com.nt.sbeans;

public class A {
	
	private B b;//Has a realtion
	
	public A()
	{
		System.out.println("A::0-param constructor");
	}
	public void setB(B b) {
		 System.out.println("A.setB()");
		 this.b= b;
	}
	public String toString() {
		return "From A";
	}
}
