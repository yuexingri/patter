package com.patter.iterator;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class PancakeHouseMenuItem implements Iterator<MenuItem> {

	List<MenuItem> menuItems;
	int index = 0;
	
	public PancakeHouseMenuItem(ArrayList<MenuItem> menuItems) {
		this.menuItems = menuItems;
	}
	
	@Override
	public boolean hasNext() {
		if(menuItems == null || index >= menuItems.size() || menuItems.get(index) == null){
			return false;
		}else{
			return true;
		}
	}

	@Override
	public MenuItem next() {
		MenuItem menuItem = menuItems.get(index);
		index++;
		return menuItem;
	}

	@Override
	public void remove() {
		System.out.println("do nothing");
	}

}
