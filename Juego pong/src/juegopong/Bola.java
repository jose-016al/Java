package juegopong;
import java.awt.*;
import java.util.Random;
// @author Jose Almiron
public class Bola extends ObjetoGrafico {

    private int velocidadX;
    private int velocidadY;
    
    public Bola() {
        super(990, 540, 30, 30, Color.WHITE);
        velocidadX =- 5;
        velocidadY = 5;
    }

    public void incrementarVelocidad() {
        velocidadX = velocidadX + 3;
        velocidadY = velocidadY + 3;
    }

    public void mover() {
        this.incrementarX(velocidadX);
        this.incrementarY(velocidadY);
        if (this.getY() < 1) {
            velocidadY = velocidadY *- 1;
        }
        if (this.getY() + this.getAltura() > 750) {
            velocidadY =- velocidadY;
        }   
    }
    
    public void rebotarRaqueta() {
        this.incrementarVelocidad();
        velocidadX = -velocidadX;
        Random r = new Random();
        int r2 = -3 + r.nextInt(7);
        velocidadY += r2;    
    }
    
    /*public void reset(){
        velocidadX=-5;
        velocidadY=5;
    }*/

    @Override
    public void dibujar(Graphics g) {
        g.setColor(this.getColor());
        g.drawOval(this.getX(), this.getY(), this.getAnchura(), this.getAltura());
    }
   
}