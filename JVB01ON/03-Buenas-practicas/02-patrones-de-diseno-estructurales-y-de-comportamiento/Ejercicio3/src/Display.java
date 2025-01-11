public class Display implements Observer {

    private String name;

    public Display(String name) {
        this.name = name;
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println(name + " - Temperature: " + temperature +
                " Humidity: " + humidity + " Pressure: " + pressure);
    }
}
