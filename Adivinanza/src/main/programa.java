package main;
import adivinanza.Adivinanza;
import adivinanza.AdivinanzaException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class programa {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        Adivinanza a = new Adivinanza("enunciado", "respuesta");
        System.out.println(a.getEnunciado());
            String respuesta =  entrada.next();
        try {
            a.comprobar(respuesta);
        } catch (AdivinanzaException ex) {
            ex.printStackTrace();
        }
    }
    
}
