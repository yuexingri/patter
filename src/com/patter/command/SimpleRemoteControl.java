package com.patter.command;

public class SimpleRemoteControl {
	Command solt;
	
	public void setCommand(Command command){
		solt = command;
	}
	
	public void buttonWasPress(){
		solt.execute();
	}
}
