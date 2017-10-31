package com.patter.status;

public class WinnerStatus implements Status {

	GumballMachine gumballMachine;
	
	public WinnerStatus(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("please wait, wo have already giving you a gumball...");
	}

	@Override
	public void rejectQuarter() {
		System.out.println("sorry, you had trun...");
	}

	@Override
	public void trunCrank() {
		System.out.println("trun twice doesn't get you another gumball...");
	}

	@Override
	public void dispense() {
		gumballMachine.releaseBall();
		if(gumballMachine.getCount() == 0){
			gumballMachine.setStatus(gumballMachine.getSoldOutStatus());
		}else{
			gumballMachine.releaseBall();
			if(gumballMachine.getCount() > 0){
				gumballMachine.setStatus(gumballMachine.getNoQuarterStatus());
			}else{
				System.out.println("oop, gumball sold out");
				gumballMachine.setStatus(gumballMachine.getSoldOutStatus());
			}
		}
	}

}
