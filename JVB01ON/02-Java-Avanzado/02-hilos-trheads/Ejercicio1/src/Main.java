public class Main {
    public static void main(String[] args) {

        MiHilo hilo1 = new MiHilo("Hilo 1", 5);
        MiHilo hilo2 = new MiHilo("Hilo 2", 10);

        hilo1.start();
        hilo2.start();
    }
}