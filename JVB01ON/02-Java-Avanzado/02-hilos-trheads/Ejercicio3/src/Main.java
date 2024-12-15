public class Main {
    public static void main(String[] args) {

        Sincronizar ejemplo = new Sincronizar();

        Thread hilo1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    ejemplo.incrementar();
                }
            }
        });

        Thread hilo2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    ejemplo.incrementar();
                }
            }
        });

        hilo1.start();
        hilo2.start();

        try {
            hilo1.join();
            hilo2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Valor del contador: " + ejemplo.obtenerContador());

    }
}