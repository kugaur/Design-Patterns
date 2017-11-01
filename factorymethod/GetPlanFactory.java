package com.designpatterns.factorymethod;

/**
 * Factory class to get the Plan
 */
public class GetPlanFactory {

	public Plan getPlan(String planType) 
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		return (Plan) Class.forName(PlanType.valueOf(planType).getPlanType()).newInstance();
	}
}
