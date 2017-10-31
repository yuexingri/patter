package com.patter.iterator;

public class MenuItem {
	String name;
	String description;
	boolean vegetarain;
	double price;

	public MenuItem(String name, String description, boolean vegetarain,
			double price) {
		super();
		this.name = name;
		this.description = description;
		this.vegetarain = vegetarain;
		this.price = price;
	}

	public MenuItem() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isVegetarain() {
		return vegetarain;
	}

	public void setVegetarain(boolean vegetarain) {
		this.vegetarain = vegetarain;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "MenuItem [name=" + name + ", description=" + description
				+ ", vegetarain=" + vegetarain + ", price=" + price + "]";
	}

}
