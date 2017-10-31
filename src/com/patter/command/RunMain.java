package com.patter.command;

public class RunMain {

	public static void main(String[] args) {
		Light ligth = new Light();
		LightOnCommand lightOnCommand = new LightOnCommand(ligth);
		SimpleRemoteControl remoteControl = new SimpleRemoteControl();
		remoteControl.setCommand(lightOnCommand);
		remoteControl.buttonWasPress();
	}

}
