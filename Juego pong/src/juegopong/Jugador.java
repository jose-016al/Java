package juegopong;
// @author Jose Almiron
import java.awt.Color;

public abstract class Jugador {
    private int puntos;
    private Raqueta raqueta;
    
   public Jugador(int x, Color c) {
       this.puntos = 0;
       this.raqueta = new Raqueta(x, c);
   }
   
   public int getPuntos() {
       return this.puntos;
   }
   
   public void sumarPunto() {
       this.puntos ++;
   }
   
   public Raqueta getRaqueta() {
       return this.raqueta;
   }
   
   public abstract void realizarMovimiento();
   
}