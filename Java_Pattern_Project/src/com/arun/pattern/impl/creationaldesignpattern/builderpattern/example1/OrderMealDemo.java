package com.arun.pattern.impl.creationaldesignpattern.builderpattern.example1;

public class OrderMealDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MealBuilder mb = new MealBuilder();

		Meal vegMeal = mb.vegMeal();
		System.out.println("Veg Meal");
		vegMeal.showItems();
		System.out.println("Total Cost: " + vegMeal.getCost());

		Meal nonVegMeal = mb.nonvegMeal();
		System.out.println("Non-Veg Meal");
		nonVegMeal.showItems();
		System.out.println("Total Cost: " + nonVegMeal.getCost());
	}

}
