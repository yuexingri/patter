package com.patter.decorator;

/**
 * 饮料类:具体组件
 * @author Administrator
 *
 */
public class Espresso extends Beverage{

	public Espresso(){
		description = "Espresso";
	}
	
	@Override
	public double cost() {
		return 1.99;
	}

}
