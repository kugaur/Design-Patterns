package com.designpatterns.factorymethod;

/**
 * Class to generate Bill
 */
public class GenerateBill {

	public static void main(String args[]) 
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		GetPlanFactory planFactory = new GetPlanFactory(); 
		
		// Domestic 
		Plan domesticPlan = planFactory.getPlan("DOMESTIC");
		domesticPlan.calculateBill(123);
		
		// Commercial
		Plan commercialPlan = planFactory.getPlan("COMMERCIAL");
		commercialPlan.calculateBill(123);
		
		// Commercial
        Plan institutionalPlan = planFactory.getPlan("INSTITUTIONAL");
        institutionalPlan.calculateBill(123);
	}
}
