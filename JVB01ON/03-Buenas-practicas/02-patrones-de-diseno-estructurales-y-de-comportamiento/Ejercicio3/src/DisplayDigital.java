public class DisplayDigital implements Observer {

    private String identifier;

    public DisplayDigital(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("DisplayDigital notificado!!");
    }
}
