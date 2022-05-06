package com.programacion.paint.clases;
// Jose Almiron
import java.awt.Graphics;
import java.awt.Point;

public class PincelRectangulo implements Pincel {

        public PincelRectangulo() {
        
        }

        @Override
        public String getNombre() {
                return "Pincel de pluma rectangular";
        }

        @Override
        public void dibujar(Graphics g, Point p) {
                int x = (int) p.getX();
                int y = (int) p.getY();
                g.drawRect(x, y, 15, 15);
        }

        @Override
        public void resetar() {
                
        }

        @Override
        public String toString() {
                return getNombre();
        }
        
}