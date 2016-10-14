package com.arun.pattern.impl.creationaldesignpattern.singletonpattern.example1;

public class SingleObject {

	/**
	 * @param args
	 */
	
	private static SingleObject instance = new SingleObject();
	
	static SingleObject getInstance() {
		return instance;
	}
	
	void sayHello(String myName){
		System.out.println("Hello "+myName);
	}
	
}
