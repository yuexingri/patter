package com.patter.decorator;

/**
 * 调料类:具体装饰者
 * @author Administrator
 *
 */
public class Mocha extends CondimentDecorator {

	Beverage beverage;
	
	public Mocha(Beverage beverage){
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		return 0.5 + beverage.cost();
	}

}
