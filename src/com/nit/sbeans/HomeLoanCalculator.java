package com.nit.sbeans;

public class HomeLoanCalculator implements InterestCalculator {
private final double rateOfInterest=8.5;
	@Override
	public double calculatorInterest(double principle) {
		
		return  principle *rateOfInterest/100;
	}

}
