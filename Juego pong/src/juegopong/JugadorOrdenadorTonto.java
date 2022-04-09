package juegopong;
// @author Jose Almiron
import java.awt.Color;
public class JugadorOrdenadorTonto extends JugadorOrdenador {

    private boolean subir;

    public JugadorOrdenadorTonto(Color c, int x, Bola b) {
        super(c, x, b);
        this.subir = true;
    }

    @Override
    public void realizarMovimiento() {
        if (this.getRaqueta().getY() < 15) {
            //this.getRaqueta().moverAbajo();
            this.subir = false;
        } else {
            if (this.getRaqueta().getY() + this.getRaqueta().getAltura() > 736) {
                this.subir = true;
            }
        }
        if (this.subir == true) {
            this.getRaqueta().moverArriba();
        } else {
            if (this.subir == false) {
                this.getRaqueta().moverAbajo();
            }
        }
    }

}