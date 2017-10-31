package com.patter.template;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tea extends CaffeineBeverage {

	@Override
	void brew() {
		System.out.println("tea brew...");
	}

	@Override
	void addCondiments() {
		System.out.println("tea add condiments...");
	}

}
