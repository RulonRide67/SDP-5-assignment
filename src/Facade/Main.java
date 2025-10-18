package Facade;

public class Main {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier();
        DvdPlayer dvd = new DvdPlayer();
        HomeTheaterFacade facade = new HomeTheaterFacade(amp, dvd);
        facade.watchMovie();
    }
}
