package com.arun.pattern.impl.creationaldesignpattern.singletonpattern.example1;

public class SingletonDemo {

	/**
	 * @param args
	 */
	SingleObject obj = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleObject object = SingleObject.getInstance();
		object.sayHello("Arun");
	}
	
	public SingleObject getA(){  
		   if (obj == null){  
		      synchronized(SingleObject.class){  
		        if (obj == null){  
		            obj = new SingleObject();//instance will be created at request time  
		        }  
		    }              
		    }  
		  return obj;  
		 }  

}
