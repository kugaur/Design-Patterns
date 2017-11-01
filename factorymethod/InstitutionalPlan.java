package com.designpatterns.factorymethod;

/**
 * Implementation class for Institutional Plan
 */
public class InstitutionalPlan extends Plan {

	private static final double RATE = 5.5;
	
	@Override
	double getRate() {
		return RATE;
	}

}
