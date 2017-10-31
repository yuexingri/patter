package com.patter.status;

import java.util.Random;

/**
 * 糖果机已投币状态
 * @author Administrator
 *
 */
public class HasQuarterStatus implements Status{
	Random winnerRandom = new Random(System.currentTimeMillis());

	GumballMachine gumballMachine;
	
	public HasQuarterStatus(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("you had inserted a quarter");
	}

	@Override
	public void rejectQuarter() {
		System.out.println("quarter return...");
		gumballMachine.setStatus(gumballMachine.getNoQuarterStatus());
	}

	@Override
	public void trunCrank() {
		System.out.println("you trun...");
		int winner = winnerRandom.nextInt(10);
		if((winner == 0) && gumballMachine.getCount() > 1){
			gumballMachine.setStatus(gumballMachine.getWinnerQuarterStatus());
		}else{
			gumballMachine.setStatus(gumballMachine.getSoldStatus());
		}
	}

	@Override
	public void dispense() {
		System.out.println("no gumball dispense");
	}

}
