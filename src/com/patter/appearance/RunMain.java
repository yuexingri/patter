package com.patter.appearance;

public class RunMain {

	public static void main(String[] args) {
		Popper popper = new Popper();
		DvdPlayer dvdPlayer = new DvdPlayer();
		HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(popper, dvdPlayer);
		homeTheaterFacade.watchMovie("可怕");
		homeTheaterFacade.endWatchMovie("可怕");
	}

}
