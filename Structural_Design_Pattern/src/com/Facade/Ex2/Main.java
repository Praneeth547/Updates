package com.Facade.Ex2;

public class Main {

	public static void main(String[] args) {
		
		DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();
        SoundSystem soundSystem = new SoundSystem();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvdPlayer, projector, soundSystem);

        homeTheater.watchMovie(); // Simplified interface
        // After movie ends
        homeTheater.endMovie();

	}

}
