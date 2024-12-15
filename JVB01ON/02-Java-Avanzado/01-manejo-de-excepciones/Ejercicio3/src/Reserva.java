import java.util.Date;

public class Reserva {

    private String nombre;
    private String destino;
    private Date fechaViaje;
    private int numeroAsientos;

    public Reserva(String nombre, String destino, Date fechaViaje, int numeroAsientos) {
        this.nombre = nombre;
        this.destino = destino;
        this.fechaViaje = fechaViaje;
        this.numeroAsientos = numeroAsientos;
    }

    public int getNumeroAsientos() {
        return numeroAsientos;
    }

    public void reservar(String nombre, int numeroAsientos) throws ReservaInvalidaException {
        if (nombre.isBlank()) {
            throw new ReservaInvalidaException("El nombre es obligatorio");
        }
        if (numeroAsientos > this.numeroAsientos) {
            throw new ReservaInvalidaException("No hay suficientes asientos dispinibles");
        }
        if (numeroAsientos < 0) {
            throw new ReservaInvalidaException("Debes seleccioanr un minimo de un asiento");
        }
        System.out.println("Reserva realizada con exito");
    }
}
