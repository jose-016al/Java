package juegopong;
import java.awt.*;
// @author Jose Almiron
public class Bola extends ObjetoGrafico {

    private int velocidadX;
    private int velocidadY;
    
    public Bola() {
        super(990, 540, 30, 30, Color.WHITE);
    }

    
    
    public void reset() {
        int x = 990;
        int y = 540;
        Color color = Color.WHITE;
        this.velocidadX = -5;
        this.velocidadY = 5;
        int anchura = 30;
        int altura = 30;
    }
    
    @Override
    public void dibujar(Graphics g) {
        g.drawOval(getX(), getY(), 30, 30);
    }
   
}