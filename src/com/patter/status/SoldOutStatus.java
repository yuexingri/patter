package com.patter.status;

public class SoldOutStatus implements Status {

	GumballMachine gumballMachine;
	
	public SoldOutStatus(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("sorry, out of gumballs...");
	}

	@Override
	public void rejectQuarter() {
		System.out.println("sorry, out of gumballs...");
	}

	@Override
	public void trunCrank() {
		System.out.println("sorry, out of gumballs...");
	}

	@Override
	public void dispense() {
		System.out.println("sorry, out of gumballs...");
	}

}
