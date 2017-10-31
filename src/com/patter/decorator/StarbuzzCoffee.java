package com.patter.decorator;

public class StarbuzzCoffee {

	public static void main(String[] args) {
		/**
		 * 不加调料
		 */
		Beverage beverage = new Espresso();
		System.out.println("desc:" + beverage.getDescription() + "; price:" + beverage.cost());
		
		Beverage houseBlend = new HouseBlend();
		houseBlend = new Mocha(houseBlend);
		houseBlend = new Soy(houseBlend);
		houseBlend = new Whip(houseBlend);
		System.out.println("desc:" + houseBlend.getDescription() + "; price:" + houseBlend.cost());
	}

}
