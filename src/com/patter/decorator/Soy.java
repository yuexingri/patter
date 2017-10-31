package com.patter.decorator;

/**
 * 调料类:具体装饰者
 * @author Administrator
 *
 */
public class Soy extends CondimentDecorator {

	Beverage beverage;
	
	public Soy(Beverage beverage){
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		return 0.2 + beverage.cost();
	}

}
