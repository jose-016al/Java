public class HomeTheaterFacade {

    private TV tv;
    private SoundSystem soundSystem;
    private Lights lights;

    public HomeTheaterFacade(TV tv, SoundSystem soundSystem, Lights lights) {
        this.tv = tv;
        this.soundSystem = soundSystem;
        this.lights = lights;
    }

    public void watchMovie() {
        System.out.println("Preparando para ver una película...");
        tv.turnOn();
        soundSystem.turnOn();
        lights.turnOff();
    }

    public void endMovie() {
        System.out.println("Finalizando la película...");
        tv.turnOff();
        soundSystem.turnOff();
        lights.turnOn();
    }
}
