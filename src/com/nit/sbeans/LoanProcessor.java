package com.nit.sbeans;

public class LoanProcessor  {
	 private final InterestCalculator interestCalculator;

	public LoanProcessor(InterestCalculator interestCalculator) {
		this.interestCalculator=interestCalculator;
	}
	public void processLoan(double principle) {
		 double interest= interestCalculator.calculatorInterest(principle);
		 double total= principle +interest;
		 System.out.println("Principle amount:"+principle);
		 System.out.println("Calcualted interest:"+interest);
		 System.out.println("Total payable:"+total);
		 
		 
	}
	}