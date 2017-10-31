package com.patter.appearance;

public class HomeTheaterFacade {
	
	private Popper popper;
	private DvdPlayer dvdPlayer;
	
	public HomeTheaterFacade(Popper popper, DvdPlayer dvdPlayer){
		this.popper = popper;
		this.dvdPlayer = dvdPlayer;
	}
	
	public void watchMovie(String movie){
		System.out.println("start to watch movie...");
		popper.on();
		dvdPlayer.on();
	}
	
	public void endWatchMovie(String movie){
		System.out.println("end to watch moive...");
		dvdPlayer.off();
		popper.off();
	}
}
