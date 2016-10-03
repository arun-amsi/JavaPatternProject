package com.arun.pattern.impl.creationaldesignpattern.factorypattern.example1;

import com.arun.pattern.impl.creationaldesignpattern.abstractfactorypattern.example1.AbstractFactory;
import com.arun.pattern.impl.creationaldesignpattern.factorypattern.example2.Draw;

public class GetPlanFactory extends AbstractFactory{
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

	@Override
	public Draw getShape(String shapeType) {
		// TODO Auto-generated method stub
		return null;
	}

}
