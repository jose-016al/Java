package juegopong;
import java.awt.*;
// @author jose Almiron
public abstract class ObjetoGrafico {

    private int x;
    private int y;
    private int altura;
    private int anchura;
    private Color color;

    public ObjetoGrafico(int x, int y, int anchura, int altura, Color color) {
        this.x = x;
        this.y = y;
        this.anchura = anchura;
        this.altura = altura;
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

    public boolean colisionaCon(ObjetoGrafico o) {
        boolean t;
        if (this.y + this.altura > o.y || o.y + o.altura > this.y || this.x > o.x + o.anchura || o.x > this.x + this.anchura) {
            t = false;
        } else {
            t = true;
        }
        return t;
    }

    protected void incrementarX(int x) {
        if (this.x + this.anchura + x < 1366) {
            this.x = this.x + x;
        }
    }

    protected void incrementarY(int y) {
        if (this.y + this.altura + y < 768) {
            this.y = this.y + y;
        }
    }

    protected void desincrementarY(int y) {
        if (this.y - y > 0) {
            this.y = this.y - y;
        }
    }

}