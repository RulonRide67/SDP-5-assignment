package Facade;

public class HomeTheaterFacade {
    Amplifier amp;
    DvdPlayer dvd;

    public HomeTheaterFacade(Amplifier a, DvdPlayer d) {
        this.amp = a;
        this.dvd = d;
    }

    public void watchMovie() {
        amp.on();
        dvd.on();
    }
}
