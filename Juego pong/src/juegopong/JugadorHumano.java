package juegopong;
// @author Jose Almiron
import java.awt.Color;
import bpc.daw.consola.*;
public class JugadorHumano extends Jugador {

    private int teclaArriba;
    private int teclaAbajo;
    private Teclado teclado;

    public JugadorHumano(Teclado t, Color c, int x, int tAr, int tAb) {
        super(x, c);
        this.teclado = t;
        this.teclaArriba = tAr;
        this.teclaAbajo = tAb;
    }

    public int getTeclaArriba() {
        return this.teclaArriba;
    }

    public int getTeclaAbajo() {
        return this.teclaAbajo;
    }

    public Teclado getTeclado() {
        return this.teclado;
    }

    @Override
    public void realizarMovimiento() {
        if (this.teclado.teclaPulsada(teclaArriba)) {
            getRaqueta().moverArriba();
        } else if (this.teclado.teclaPulsada(teclaAbajo)) {
            getRaqueta().moverAbajo();
        }
    }

}

