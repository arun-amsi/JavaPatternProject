package com.arun.pattern.impl.creationaldesignpattern.factorypattern.example2;

import com.arun.pattern.impl.creationaldesignpattern.abstractfactorypattern.example1.AbstractFactory;
import com.arun.pattern.impl.creationaldesignpattern.factorypattern.example1.Plan;

public class GetShapeFactory extends AbstractFactory{

	public Draw getShape(String shapeType) {
		if(null == shapeType){
			return null;
		}else if("Circle".equalsIgnoreCase(shapeType)){
			return new Circle();
		}else if("Square".equalsIgnoreCase(shapeType)){
			return new Square();
		}else if("Rectangle".equalsIgnoreCase(shapeType)){
			return new Rectangle();
		}
		return null;
	}

	@Override
	public Plan getPlan(String planType) {
		// TODO Auto-generated method stub
		return null;
	}

}
