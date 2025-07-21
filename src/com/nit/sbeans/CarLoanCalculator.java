package com.nit.sbeans;

public class CarLoanCalculator implements InterestCalculator{
private final double  rateOfInterest=10.5;
 @Override
	public double calculatorInterest(double principle) {
		
		return principle* rateOfInterest/100;
	}

}
