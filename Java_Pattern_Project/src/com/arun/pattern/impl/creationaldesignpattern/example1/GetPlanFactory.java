package com.arun.pattern.impl.creationaldesignpattern.example1;

public class GetPlanFactory {
	public Plan getPlan(String planType) {

		if (null == planType) {
			return null;
		} else if ("Domestic".equalsIgnoreCase(planType)) {
			return new DomesticPlan();
		} else if ("Commercial".equalsIgnoreCase(planType)) {
			return new CommercialPlan();
		} else if ("Institute".equalsIgnoreCase(planType)) {
			return new InstitutionalPlan();
		}
		return null;
	}

}
