package com.patter.iterator;

import java.util.Iterator;

public class Waitress {
	private Menu dinerMenu;
	private Menu pancakeHouseMenu;
	
	public Waitress(Menu dinerMenu, Menu pancakeHouseMenu) {
		this.dinerMenu = dinerMenu;
		this.pancakeHouseMenu = pancakeHouseMenu;
	}
	
	public void printMenu(){
		Iterator<MenuItem> dinerMenuIterator = dinerMenu.createIterator();
		Iterator<MenuItem> pancakeHouseMenuItems = pancakeHouseMenu.createIterator();
		System.out.println("********breakfast**************");
		printMenu(pancakeHouseMenuItems);
		System.out.println("********lunch**************");
		printMenu(dinerMenuIterator);
	}
	
	private void printMenu(Iterator<MenuItem> iterator){
		while (iterator.hasNext()) {
			MenuItem menuItem = iterator.next();
			System.out.println(menuItem);
		}
	}
}
