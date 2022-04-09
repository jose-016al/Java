package juegopong;
// @author Jose Almiron
import java.awt.Color;
public abstract class JugadorOrdenador extends Jugador {
    
    private Bola bola;
    
    public JugadorOrdenador(Color c, int x, Bola b) {
        super(x, c);
        this. bola=b;    
    }
    
    public Bola getBola() {
        return this. bola;
    }
    
}