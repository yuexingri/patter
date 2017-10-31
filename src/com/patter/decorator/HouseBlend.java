package com.patter.decorator;

/**
 * 饮料类:具体组件
 * @author Administrator
 *
 */
public class HouseBlend extends Beverage {
	
	public HouseBlend(){
		description = "HouseBlend";
	}

	@Override
	public double cost() {
		return 0.89;
	}

}
