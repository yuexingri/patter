package com.patter.status;

/**
 * 糖果机未投币状态
 * @author Administrator
 *
 */
public class NoQuarterStatus implements Status {

	GumballMachine gumballMachine;
	
	public NoQuarterStatus(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("you insert a quarter...");
		gumballMachine.setStatus(gumballMachine.getHasQuarterStatus());
	}

	@Override
	public void rejectQuarter() {
		System.out.println("you haven't insert a quarter...");
	}

	@Override
	public void trunCrank() {
		System.out.println("you trun, but there is no a quarter...");
	}

	@Override
	public void dispense() {
		System.out.println("you need to pay first...");
	}

}
