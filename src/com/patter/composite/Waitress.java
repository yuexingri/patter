package com.patter.composite;

public class Waitress {
	private MenuComponent menuComponent;
	
	public Waitress(MenuComponent menuComponent) {
		this.menuComponent = menuComponent;
	}
	
	public void print(){
		menuComponent.print();
	}
}
