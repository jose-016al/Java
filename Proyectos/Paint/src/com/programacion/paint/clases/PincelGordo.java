package com.programacion.paint.clases;
// Jose Almiron

import java.awt.Graphics;
import java.awt.Point;

public class PincelGordo extends PincelCirculo {

        public PincelGordo() {
                super(20);
        }

        @Override
        public String getNombre() {
                return "Pincel gordo";
        }

        @Override
        public void dibujar(Graphics g, Point p) {
                int x = (int) p.getX();
                int y = (int) p.getY();
                g.getColor();
                g.fillOval(x, y, this.getRadio(), this.getRadio());
        }   
        
        @Override
        public String toString() {
                return getNombre();
        }
        
}