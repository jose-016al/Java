package adivinanza;
import java.time.*;
// @author Jose Almiron
public class Adivinanza {

        // VARIABLES
    private String enunciado;
    private String respuestaCorrecta;
    private Instant inicio;

        // CONSTRUCTOR
    public Adivinanza(String e, String rc) {
        this.enunciado = e;
        this.respuestaCorrecta = rc;
        this.inicio = null;
    }

        // METODO QUE DEVUELVE ENUNCIADO
    public String getEnunciado() {
        this.inicio = Instant.now();
        // para comprobar si lanza la excepcion por tiempo sueprado
        // this.inicio = Instant.ofEpochSecond(35, 0);
        return this.enunciado;
    }

        // METODO QUE COMPARA LAS RESPUESTAS
    public void comprobar(String respuesta) throws AdivinanzaException {
        Instant actual = Instant.now();
        Duration duracion = Duration.between(inicio, actual);
        int segundos = (int) duracion.getSeconds();
        if (this.respuestaCorrecta.equalsIgnoreCase(respuesta)) {
            if (segundos > 30) {
                throw new TiempoSuperadoException();
            }
        } else {
            throw new AdivinanzaIncorrectaException();
        }
    }

}