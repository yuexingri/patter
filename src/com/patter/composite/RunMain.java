package com.patter.composite;

public class RunMain {

	public static void main(String[] args) {
		MenuComponent pancakeHouseMenu = new Menu("pancake house menu", "breakfast");
		MenuComponent dinerMenu = new Menu("diner menu", "lunch");
		MenuComponent cafeMenu = new Menu("cafe menu", "cafe");
		MenuComponent dessertMenu = new Menu("dessert menu", "dessert");
		
		MenuComponent allMenu = new Menu("ALL MENU", "menu");
		allMenu.add(pancakeHouseMenu);
		allMenu.add(dinerMenu);
		allMenu.add(cafeMenu);
		
		pancakeHouseMenu.add(new MenuItem("pacake_name", "pancake_desc", false, 3.99));
		
		dinerMenu.add(new MenuItem("diner_name", "diner_desc", true, 1.22));
		dinerMenu.add(dessertMenu);
		
		dessertMenu.add(new MenuItem("dessert_name", "desset_desc", false, 2.99));

		cafeMenu.add(new MenuItem("cafe_name", "cafe_desc", false, 2.99));
		
		Waitress waitress = new Waitress(allMenu);
		waitress.print();
	}

}
