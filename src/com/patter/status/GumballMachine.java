package com.patter.status;

public class GumballMachine {
	
	Status soldStatus;
	Status soldOutStatus;
	Status noQuarterStatus;
	Status hasQuarterStatus;
	Status winnerQuarterStatus;
	
	Status status = soldOutStatus;
	int count = 0;
	
	public GumballMachine(int numberGumballs) {
		soldOutStatus = new SoldOutStatus(this);
		noQuarterStatus = new NoQuarterStatus(this);
		hasQuarterStatus = new HasQuarterStatus(this);
		soldStatus = new SoldStatus(this);
		count = numberGumballs;
		if(count > 0){
			status = noQuarterStatus;
		}
	}
	
	public void insertQuarter() {
		status.insertQuarter();
	}

	public void rejectQuarter() {
		status.rejectQuarter();
	}

	public void trunCrank() {
		status.trunCrank();
		status.dispense();
	}
	
	public void setStatus(Status status) {
		this.status = status;
	}
	
	public Status getSoldStatus() {
		return soldStatus;
	}

	public Status getSoldOutStatus() {
		return soldOutStatus;
	}

	public Status getNoQuarterStatus() {
		return noQuarterStatus;
	}

	public Status getHasQuarterStatus() {
		return hasQuarterStatus;
	}
	
	public Status getWinnerQuarterStatus() {
		return winnerQuarterStatus;
	}
	
	public int getCount() {
		return count;
	}

	public void releaseBall(){
		System.out.println("A gumball comes rolling out the slot...");
		if(count != 0){
			count--;
		}
	}
}
