import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

            // variables
        int numero1, numero2;
        Scanner input = new Scanner(System.in);

            // Inicializar variables
        System.out.print("Introduce el numero 1: ");
            numero1 = input.nextInt();
        System.out.print("Introduce el numero 2: ");
            numero2 = input.nextInt();

            // Comprobar cual es el mayor
        if (numero1 > numero2) {
            System.out.println("El numero mayor es el " + numero1);
        } else if (numero1 < numero2) {
            System.out.println("El numero mayor es el " + numero2);
        } else {
            System.out.println("Ambos numeros son iguales");
        }
    }
}
