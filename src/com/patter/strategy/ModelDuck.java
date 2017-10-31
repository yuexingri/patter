package com.patter.strategy;

public class ModelDuck extends Duck{
	public ModelDuck() {
		this.flyBehavior = new FlyNoWay();
		this.quackBehavior = new Quack();
	}
}
