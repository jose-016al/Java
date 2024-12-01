import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

            // Variables
        String nombre;
        Scanner input = new Scanner(System.in);

            // Apartado A: Mensaje de bienvenida
        System.out.println("Hola, Bienvenido al sistema");

            // Apartado B: Mensaje de bienvenida con nombre
        System.out.print("Introduce tu nombre: ");
            nombre = input.nextLine();
        System.out.println("Hola, " +nombre+ " Bienvenido al sistema");
    }
}
