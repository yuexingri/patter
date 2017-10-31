package com.patter.iterator;

import java.util.Iterator;
import java.util.ArrayList;

public class PancakeHouseMenu implements Menu{
	ArrayList<MenuItem> menuItems;
	
	public PancakeHouseMenu() {
		menuItems = new ArrayList<MenuItem>();
		addItem("Egg", "Egg_D", true, 2.99);
		addItem("Regular", "Regular_D", false, 2.99);
		addItem("BlueBerry", "BlueBerry_D", true, 3.49);
		addItem("Waffles", "Waffles_D", true, 3.59);
	}
	
	public void addItem(String name, String description, boolean vegetarain, double price){
		MenuItem menuItem = new MenuItem(name, description, vegetarain, price);
		menuItems.add(menuItem);
	}

	@Override
	public Iterator<MenuItem> createIterator() {
		return new PancakeHouseMenuItem(menuItems);
	}
}
