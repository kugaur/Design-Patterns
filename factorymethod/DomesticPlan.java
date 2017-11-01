package com.designpatterns.factorymethod;

/**
 * Implementation class for Domestic Plan
 */
public class DomesticPlan extends Plan {

	private static final double RATE = 3.5;
	
	@Override
	double getRate() {
		return RATE;
	}

}
