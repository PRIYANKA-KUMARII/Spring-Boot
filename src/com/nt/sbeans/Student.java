package com.nt.sbeans;

public class Student {
	private String name;
	private int rollNo;
	private int math_Marks;
	private int physic_Marks;
	private float chemistry_Marks;
	private double english_Marks;
	private double physicalEduMarks;
	private boolean isExamAttended;
	private double average;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int getMath_Marks() {
		return math_Marks;
	}
	public void setMath_Marks(int math_Marks) {
		this.math_Marks = math_Marks;
	}
	public int getPhysic_Marks() {
		return physic_Marks;
	}
	public void setPhysic_Marks(int physic_Marks) {
		this.physic_Marks = physic_Marks;
	}
	public float getChemistry_Marks() {
		return chemistry_Marks;
	}
	public void setChemistry_Marks(float chemistry_Marks) {
		this.chemistry_Marks = chemistry_Marks;
	}
	public double getEnglish_Marks() {
		return english_Marks;
	}
	public void setEnglish_Marks(double english_Marks) {
		this.english_Marks = english_Marks;
	}
	public double getPhysicalEduMarks() {
		return physicalEduMarks;
	}
	public void setPhysicalEduMarks(double physicalEduMarks) {
		this.physicalEduMarks = physicalEduMarks;
	}
	public boolean isExamAttended() {
		return isExamAttended;
	}
	public void setExamAttended(boolean isExamAttended) {
		this.isExamAttended = isExamAttended;
	}
	public double getAverage() {
		return average;
	}
	public void setAverage(double average) {
		this.average = average;
	}
	public double getResult() {
		 if(!isExamAttended()) {
			 System.out.println("Exam not attended !");
			 return 0;
			 
		 }
		 double total= math_Marks+physic_Marks+chemistry_Marks+english_Marks+physicalEduMarks;
		 average=total/5.0;
		 return average;
	
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", math_Marks=" + math_Marks + ", physic_Marks="
				+ physic_Marks + ", chemistry_Marks=" + chemistry_Marks + ", english_Marks=" + english_Marks
				+ ", physicalEduMarks=" + physicalEduMarks + ", isExamAttended=" + isExamAttended + ", average="
				+ average + "]";
	}
	
}
