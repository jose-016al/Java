package com.programacion.paint.clases;
// Jose Almiron
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import java.util.logging.*;
import javax.imageio.*;

public class PincelEstrella implements Pincel {
 
        private static Image ESTRELLA;
        static {
                File f = new File("src/com/programacion/paint/recursos/ESTRELLA.png");
                try {
                        BufferedImage imagen = ImageIO.read(f);
                        ESTRELLA = imagen;
                } catch (IOException ex) {
                        Logger.getLogger(PincelEstrella.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
    
        public PincelEstrella() {
        
        }
        
        @Override
        public String getNombre() {
            return "Pincel estrella";
        }

        @Override
        public void dibujar(Graphics g, Point p) {
                int x = (int)p.getX();
                int y = (int)p.getY();
                g.drawImage(ESTRELLA, x, y,null);
        }

        @Override
        public void resetar() {
                
        }

        @Override
        public String toString() {
                return getNombre();
        }
        
}