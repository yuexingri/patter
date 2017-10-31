package com.patter.composite;

public class MenuItem extends MenuComponent {
	private String name;
	private String description;
	private boolean vegetarain;
	private double price;
	
	public MenuItem(String name, String description, boolean vegetarain, double price) {
		this.name = name;
		this.description = description;
		this.vegetarain = vegetarain;
		this.price = price;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public String getDescription() {
		return description;
	}
	
	@Override
	public boolean isVegetarain() {
		return vegetarain;
	}
	
	@Override
	public double getPrice() {
		return price;
	}
	
	@Override
	public void print() {
		System.out.println("------------");
		System.out.println("name:" + name);
		System.out.println("desc:" + description);
		System.out.println("vegetarain:" + vegetarain);
		System.out.println("price:" + price);
		System.out.println();
	}

}
