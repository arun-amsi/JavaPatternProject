package com.arun.pattern.impl.creationaldesignpattern.factorypattern.example1;

public abstract class Plan {
	public double rate;

	abstract void getRate();

	public void calculateBill(int units) {
		System.out.println("Units :" + (units * rate));

	}

}
