package com.patter.template;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Coffee extends CaffeineBeverage {

	@Override
	void brew() {
		System.out.println("coffee brew");
	}

	@Override
	void addCondiments() {
		System.out.println("coffee add condiments");
	}

	@Override
	public boolean customerWantsConditions() {
		String answer = getUserInput();
		if(answer.toLowerCase().startsWith("y")){
			return true;
		}else{
			return false;
		}
	}
	
	private String getUserInput(){
		String answer = null;
		System.out.println("咖啡要不要加牛奶或者糖？y/n");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = in.readLine();
		} catch (Exception e) {
			System.out.println("IO Exception");
		}
		if(answer == null){
			answer = "n";
		}
		return answer;
	}
}
