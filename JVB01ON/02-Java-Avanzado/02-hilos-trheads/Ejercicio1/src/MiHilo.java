public class MiHilo extends Thread {

    private String nombre;
    private int cantidad;

    public MiHilo(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    @Override
    public void run() {
        for (int i = 0; i < this.cantidad; i++) {
            System.out.println(nombre + ": Contador " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
