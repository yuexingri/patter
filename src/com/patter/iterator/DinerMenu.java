package com.patter.iterator;

import java.util.Iterator;

public class DinerMenu implements Menu{
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;
	
	public DinerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];
		addItem("V_BLT", "BLT_D", true, 2.99);
		addItem("BLT", "BLT_D", false, 2.99);
		addItem("Soup", "Soup_D", false, 3.29);
		addItem("HotDog", "HotDog_D", false, 3.05);
	}
	
	public void addItem(String name, String description, boolean vegetarain, double price){
		MenuItem menuItem = new MenuItem(name, description, vegetarain, price);
		if(numberOfItems >= MAX_ITEMS){
			System.out.println("diner menu id full");
		}else{
			menuItems[numberOfItems] = menuItem;
			numberOfItems++;
		}
	}

	@Override
	public Iterator<MenuItem> createIterator() {
		return new DinerMenuIterator(menuItems);
	}
}
