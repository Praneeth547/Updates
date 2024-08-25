package com.Facade.Ex2;

// Facade Class
public class HomeTheaterFacade {
	private DVDPlayer dvdPlayer;
    private Projector projector;
    private SoundSystem soundSystem;

    public HomeTheaterFacade(DVDPlayer dvdPlayer, Projector projector, SoundSystem soundSystem) {
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.soundSystem = soundSystem;
    }

    public void watchMovie() {
        dvdPlayer.on();
        projector.on();
        projector.setInput("DVD");
        soundSystem.on();
        soundSystem.setVolume(10);
        dvdPlayer.play();
    }

    public void endMovie() {
        dvdPlayer.off();
        projector.off();
        soundSystem.off();
    }
}
