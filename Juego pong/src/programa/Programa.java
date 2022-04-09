package programa;
// @author Jose Almiron
import bpc.daw.consola.CapaCanvas;
import bpc.daw.consola.CapaTexto;
import bpc.daw.consola.Consola;
import bpc.daw.consola.Teclado;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;
import juegopong.*;
public class Programa {

    public static void main(String[] args) {

        Consola c = new Consola();
        CapaTexto ct = c.getCapaTexto();

        Jugador jg = null; //new JugadorHumano(t,c1,50,39,40);
        Jugador jg1 = null; //new JugadorHumano(t,c1,100,87,83);

        ct.println("1. Jugador contra ordenador --> las teclas serán los cursores.");
        ct.println("2. Jugador contra jugador --> El jugador izquierdo usará los cursores y el derecho las teclas W,S para ir arriba ya abajo.");
        ct.println("3. Ordenador contra ordenador.");
        Teclado t = c.getTeclado();
        //Teclado t1 = c.getTeclado();

        int tipoJuego = t.leerNumeroEntero();

        ct.cls();

        Color c1 = Color.red;
        Color c2 = Color.blue;
        Bola b = new Bola();
        CapaCanvas cv = c.getCapaCanvas();
        if (tipoJuego == 1) {

            jg = new JugadorHumano(t, c1, 100, 38, 40);
            jg1 = new JugadorOrdenadorTonto(c2, 1300, b);

        }

        if (tipoJuego == 2) {

            jg = new JugadorHumano(t, c1, 100, 38, 40);
            jg1 = new JugadorHumano(t, c1, 1300, 87, 83);

        }

        if (tipoJuego == 3) {

            jg = new JugadorOrdenadorListo(c1, 100, b);
            jg1 = new JugadorOrdenadorTonto(c2, 1300, b);

        }

        ObjetoGrafico o1 = null;
        ObjetoGrafico o2 = null;
        boolean repetir = true;
        Graphics lapiz = cv.getGraphics();

        b = new Bola();
        while (!t.teclaPulsada(27)) {
            cv.cls();

            int a = jg.getPuntos();
            int b1 = jg1.getPuntos();

            String a1 = a + "";
            String b2 = b1 + "";

            lapiz.drawString("resultado", 960, 100);

            lapiz.drawString(a1, 384, 100);
            lapiz.drawString(b2, 683, 100);

            o1 = jg.getRaqueta();
            o2 = jg1.getRaqueta();

            //int c4 = b.getY();
            //int c5 = o1.getY();
            //String c6 = c4 + "";
            //String c7 = c5 + "";
            //lapiz.drawString(c6, 384, 200);
            //lapiz.drawString(c7, 683, 200);
            o1.dibujar(lapiz);
            o2.dibujar(lapiz);

            jg.realizarMovimiento();
            jg1.realizarMovimiento();

            b.dibujar(lapiz);

            b.mover();

            if (b.colisionaCon(o1) || b.colisionaCon(o2)) {

                b.rebotarRaqueta();

            }

            if (b.getX() < 0) {

                jg1.sumarPunto();
                b = new Bola();

            }

            if (b.getX() > 768) {

                jg.sumarPunto();
                b = new Bola();
            }

            c.esperarSiguienteFrame();

        }

        System.out.println("Fin del juego");
    }

}
