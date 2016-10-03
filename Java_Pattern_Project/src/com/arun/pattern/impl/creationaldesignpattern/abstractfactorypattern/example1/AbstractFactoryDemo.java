package com.arun.pattern.impl.creationaldesignpattern.abstractfactorypattern.example1;

import com.arun.pattern.impl.creationaldesignpattern.factorypattern.example1.Plan;
import com.arun.pattern.impl.creationaldesignpattern.factorypattern.example2.Draw;


public class AbstractFactoryDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractFactory factory1 = FactoryProducer.getFactory("Shape");
		Draw shape = factory1.getShape("Circle");
		shape.draw();
		
		AbstractFactory factory2 = FactoryProducer.getFactory("Plan");
		Plan plan = factory2.getPlan("Domestic");
		plan.rate= 10;
		plan.calculateBill(150);
		
	}

}
