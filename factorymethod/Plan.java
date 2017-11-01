package com.designpatterns.factorymethod;

/**
 * Abstract Class for Plan
 */
public abstract class Plan {
	
	/**
	 * Getter for rate
	 */
	abstract double getRate();
	
	/**
	 * Method to calculate Bill.
	 * 
	 * @param units Units consumed
	 */
	public void calculateBill(int units) {
		System.out.println("Bill: " + units*getRate());
	}
}
