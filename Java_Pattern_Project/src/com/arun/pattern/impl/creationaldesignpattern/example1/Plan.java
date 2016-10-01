package com.arun.pattern.impl.creationaldesignpattern.example1;

public abstract class Plan {
	protected double rate;

	abstract void getRate();

	public void calculateBill(int units) {
		System.out.println("Units :" + (units * rate));

	}

}
