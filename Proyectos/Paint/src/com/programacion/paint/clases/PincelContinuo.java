package com.programacion.paint.clases;
// Jose Almiron
import java.awt.*;

public class PincelContinuo extends PincelBasico {
 
        private Point puntoPrevio;
    
        public PincelContinuo() {
                puntoPrevio = null;
        }
        
       public String getNombre() {
                return "Pincel continuo";
       }
       
        public void dibujar(Graphics g, Point p) {
                int x = (int) p.getX();
                int y = (int) p.getY();
                if(puntoPrevio==null){
                        g.drawLine(x, y, x, y);
                }
                if (puntoPrevio != null) {
                        int x1 = (int) puntoPrevio.getX();
                        int y1 = (int) puntoPrevio.getY();
                        g.drawLine(x1, y1, x, y);
                }  
                puntoPrevio = p;
        }
        
        public void resetear() {
                puntoPrevio = null;
        }
        
}