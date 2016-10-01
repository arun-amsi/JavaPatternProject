package com.arun.pattern.impl.creationaldesignpattern.example2;

public class GetShapeFactory {

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

}
