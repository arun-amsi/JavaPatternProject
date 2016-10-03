package com.arun.pattern.impl.creationaldesignpattern.abstractfactorypattern.example1;

import com.arun.pattern.impl.creationaldesignpattern.factorypattern.example1.GetPlanFactory;
import com.arun.pattern.impl.creationaldesignpattern.factorypattern.example2.GetShapeFactory;

public class FactoryProducer {

	public static AbstractFactory getFactory(String factoryType) {
		
		if(null == factoryType){
			return null;
		}
		
		if("Shape".equalsIgnoreCase(factoryType)){
			return new GetShapeFactory();
		}else if("Plan".equalsIgnoreCase(factoryType)){
			return new GetPlanFactory();
		}
		return null;
	}

}
