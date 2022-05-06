package com.programacion.paint.clases;
// Jose Almiron
import java.awt.*;

public interface Pincel {
 
        public String getNombre();
        
        public void dibujar(Graphics g, Point p);
        
        public void resetar();
        
}