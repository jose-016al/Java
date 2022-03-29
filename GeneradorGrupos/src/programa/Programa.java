package programa;
// @author jose almiron
import generadorgrupos.*;
import java.io.IOException;
import java.util.*;
public class Programa {
 
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        
            // VARIABLES
        String ruta;
        int numero;
        CargadorAlumnos cargar;
        List<Alumno> a;
        CreadorGrupos creador;
        List<Grupo> g;
        int total;
        
            // PROGRAMA
        System.out.println("-------------------------------------------------");
        System.out.println("| Programa generador de grupos de alumnos aleatorios |");
        System.out.println("|                       (C) 2022 Jose Almiron                         |");
        System.out.println("-------------------------------------------------");
        
        System.out.print("Introduzca la ruta del archivo de alumnos: ");
            ruta = entrada.next();
        System.out.print("Introduzca el numero de alumnos por grupo: ");
            numero = entrada.nextInt();
                
        cargar = new CargadorAlumnos(ruta);
        a = cargar.getAlumnos();
        creador = new CreadorGrupos(cargar.getAlumnos());
        g = creador.formarGrupos(numero);
                
        System.out.println("Los grupos formados son: ");
        for (int i = 0; i < g.size(); i++) {
            System.out.println("Grupo " + g.get(i).getNumero() + ": ");
            total = g.get(i).getNumeroAlumnos();
            for (int j = 0; j < total; j++) {
                System.out.println("        " + g.get(i).getAlumno(j).getNombre());
            }
        }
        
    }
    
}