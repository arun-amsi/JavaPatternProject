package com.arun.pattern.impl.creationaldesignpattern.builderpattern.example1;

public class Burger implements Item {

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Wrapper();
	}

}
