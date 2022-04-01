package juegopong;
import java.awt.*;
// @author jose Almiron
public abstract class ObjetoGrafico  {
 
    private int x;
    private int y;
    private int altura;
    private int anchura;
    private Color color;

    public ObjetoGrafico(int x, int y, int altura, int anchura, Color color) {
        this.x = x;
        this.y = y;
        this.altura = altura;
        this.anchura = anchura;
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getAltura() {
        return altura;
    }

    public int getAnchura() {
        return anchura;
    }

    public Color getColor() {
        return color;
    }
    
    public abstract void dibujar(Graphics g);
         
    public boolean colisionaCon(ObjetoGrafico o){
         if (this.x > o.getX() + o.getAnchura()) {
             return false;
         } else if (this.x + this.anchura < o.getX()) {
             return false;
         } else if (this.y > o.getY() + o.getAltura()) {
             return false;
         } else if (this.y + this.altura < o.getY()) {
             return false;
         } else {
             return true;
         }
    }
    
    protected void incrementarX(int x) {
        if (x <= 1980) {
            this.x += x;
        } else if (x >= 0) {
            this.x -= x;
        }
    }
    
    protected void incrementarY(int y) {
         if (y <= 1080) {
             this.y += y;
         } else if (y >= 0) {
             this.y -= y;
         } 
    }
    
}