package com.patter.decorator;

/**
 * 饮料类:抽象组件
 * @author Administrator
 *
 */
public abstract class Beverage {
	String description = "unknown beverage";
	
	public String getDescription(){
		return description;
	}
	
	public abstract double cost();
}
