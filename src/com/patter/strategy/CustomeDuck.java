package com.patter.strategy;

public class CustomeDuck extends Duck{
	public CustomeDuck() {
		CustomeDuck(null, null);
	}
	
	public CustomeDuck(FlyBehavior flyBehavior) {
		CustomeDuck(flyBehavior, null);
	}
	
	public CustomeDuck(QuackBehavior quackBehavior) {
		CustomeDuck(null, quackBehavior);
	}
	
	public void CustomeDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
		if(flyBehavior != null){
			this.flyBehavior = flyBehavior;
		}
		if(quackBehavior != null){
			this.quackBehavior = quackBehavior;
		}
	}
}
