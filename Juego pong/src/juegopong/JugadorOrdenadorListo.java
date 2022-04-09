package juegopong;
// @author Jose Almiron
import java.awt.Color;
public class JugadorOrdenadorListo extends JugadorOrdenador {

    public JugadorOrdenadorListo(Color c, int x, Bola b) {
        super(c, x, b);
    }

    @Override
    public void realizarMovimiento() {
        int y = this.getBola().getY();
        //int rx= this.getRaqueta().getX();
        int ry = this.getRaqueta().getY();
        if (y > ry) {
            this.getRaqueta().moverAbajo();
        } else {
            if (y < ry) {
                this.getRaqueta().moverArriba();
            }
        }
    }
    
}