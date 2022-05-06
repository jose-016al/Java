package com.programacion.paint.clases;
// Jose Almiron
import java.awt.Graphics;
import java.awt.Point;

public class PincelCirculo implements Pincel {
 
        private int radio;

        public PincelCirculo(int radio)  {
                this.radio = radio;
        }

        protected int getRadio() {
                return radio;
        }

        @Override
        public String getNombre() {
                return "Pincel con pluma circular de " + this.radio;
        }

        @Override
        public void dibujar(Graphics g, Point p) {
                int x = (int) p.getX();
                int y = (int) p.getY();
                g.drawOval(x, y, radio, radio);
        }

        @Override
        public void resetar() {
                
        }

        @Override
        public String toString() {
                return getNombre();
        }
        
}