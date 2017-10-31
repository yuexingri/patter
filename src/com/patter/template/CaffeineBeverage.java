package com.patter.template;

public abstract class CaffeineBeverage {
	final void prepareRecipe(){
		boilWater();
		brew();
		pourInCup();
		if(customerWantsConditions()){
			addCondiments();
		}
	}
	
	abstract void brew();
	
	abstract void addCondiments();
	
	public final void boilWater(){
		System.out.println("boil water");
	}
	
	public final void pourInCup(){
		System.out.println("pour in cup");
	}
	
	public boolean customerWantsConditions(){
		return true;
	}
}
