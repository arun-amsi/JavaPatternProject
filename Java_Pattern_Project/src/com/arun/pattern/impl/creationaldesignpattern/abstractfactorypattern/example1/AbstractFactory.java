package com.arun.pattern.impl.creationaldesignpattern.abstractfactorypattern.example1;

import com.arun.pattern.impl.creationaldesignpattern.factorypattern.example1.Plan;
import com.arun.pattern.impl.creationaldesignpattern.factorypattern.example2.Draw;

public abstract class AbstractFactory {
	
	public abstract Plan getPlan(String planType);
	public abstract Draw getShape(String shapeType);
}
