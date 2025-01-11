public class Main {
    public static void main(String[] args) {

        WeatherStation weatherStation = new WeatherStation();

        // Se crean dos displays como observadores
        Observer display1 = new Display("Display1");
        Observer display2 = new Display("Display2");
        Observer digitalDisplay = new DisplayDigital("DigitalDisplay1");

        // Se añaden los observadores al sujeto (WeatherStation)
        weatherStation.addObserver(display1);
        weatherStation.addObserver(display2);
        weatherStation.addObserver(digitalDisplay);

        // Se actualizan los datos meteorológicos, lo que notificará a los observadores
        weatherStation.setWeatherData(25.0f, 60.0f, 1012.0f);

        System.out.println("\nSegunda actualización de datos:");
        weatherStation.setWeatherData(22.5f, 55.0f, 1009.0f);

    }
}