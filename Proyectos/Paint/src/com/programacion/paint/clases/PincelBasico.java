package com.programacion.paint.clases;
// Jose Almiron
public class PincelBasico extends PincelCirculo {

        public PincelBasico() {
                super(1);
        }

        @Override
        public String getNombre() {
                return "Pincel basico";
        }

        @Override
        public String toString() {
                return getNombre();
        }
        
}