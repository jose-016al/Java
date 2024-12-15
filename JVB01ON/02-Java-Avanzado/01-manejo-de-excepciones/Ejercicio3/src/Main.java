import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Reserva reserva = new Reserva("Jose", "Londres", new Date(), 5);

        try {
            reserva.reservar("Jose",2);
        } catch (ReservaInvalidaException e) {
            throw new RuntimeException(e);
        }
    }
}