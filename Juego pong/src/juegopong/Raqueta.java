package juegopong;
import java.awt.*;
// @ author Jose Almiron
public class Raqueta extends ObjetoGrafico { 

    private int velocidad;
    
    public Raqueta(int x, Color color) {
        super(x, 540, (int) (50 + (200 - 50) * Math.random()), 50, color);
        this.velocidad = (int) (3 + (15 - 3) * Math.random());
    }

    public void moverArriba() {
        y -= velocidad;
    }
    
    public void moverAbajo() {
        y += velocidad;
    }
    
    @Override
    public void dibujar(Graphics g) {
        g.fillRect(getX(), getY(), getAnchura(), getAltura());
    }
    
}