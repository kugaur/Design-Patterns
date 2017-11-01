package com.designpatterns.factorymethod;

/**
 * Enum for Plan Types
 */
public enum PlanType {

	DOMESTIC("com.designpatterns.factorymethod.DomesticPlan"),
	COMMERCIAL("com.designpatterns.factorymethod.CommercialPlan"),
	INSTITUTIONAL("com.designpatterns.factorymethod.InstitutionalPlan");
	
	private String planType;
	
	private PlanType(String planType) {
		this.planType = planType;
	}
	
	public String getPlanType() {
		return planType;
	}
}
