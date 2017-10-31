package com.patter.adapter;

public class RunMain {

	public static void main(String[] args) {
		Turkey turkey = new WildTurkey();
		Duck duck = new TurkeyAdapter(turkey);
		duck.quack();
		duck.fly();
	}

}
