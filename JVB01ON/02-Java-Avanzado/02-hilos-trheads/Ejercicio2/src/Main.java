public class Main {
    public static void main(String[] args) {

        Runnable runable = new MiHilo();
        Thread hilo1 = new Thread(runable);
        Thread hilo2 = new Thread(runable);

        hilo1.start();
        hilo2.start();
    }
}