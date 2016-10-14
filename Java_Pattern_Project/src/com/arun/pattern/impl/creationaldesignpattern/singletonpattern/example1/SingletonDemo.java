package com.arun.pattern.impl.creationaldesignpattern.singletonpattern.example1;

public class SingletonDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleObject object = SingleObject.getInstance();
		object.sayHello("Arun");
	}

}
