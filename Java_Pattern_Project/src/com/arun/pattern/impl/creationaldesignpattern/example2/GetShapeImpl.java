package com.arun.pattern.impl.creationaldesignpattern.example2;

public class GetShapeImpl {

	public static void main(String a[]) {
		GetShapeFactory factory = new GetShapeFactory();
		factory.getShape("Circle").draw();
		
		factory.getShape("Square").draw();
		
		factory.getShape("Rectangle").draw();
	}

}
