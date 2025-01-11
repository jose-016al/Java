public class Main {
    public static void main(String[] args) {
        // Crear subsistemas
        TV tv = new TV();
        SoundSystem soundSystem = new SoundSystem();
        Lights lights = new Lights();

        // Crear fachada
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(tv, soundSystem, lights);

        // Utilizar la fachada para ver una película
        homeTheater.watchMovie();

        // Utilizar la fachada para finalizar la película
        homeTheater.endMovie();

    }
}