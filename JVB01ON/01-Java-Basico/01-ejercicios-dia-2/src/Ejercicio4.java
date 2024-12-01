import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

            // Variables
        int numero1, numero2, suma, resta, multiplicacion, division;
        Scanner input = new Scanner(System.in);

            // Inicializar variables
        System.out.print("Introduce el numero 1: ");
            numero1 = input.nextInt();
        System.out.print("Introduce el numero 2: ");
            numero2 = input.nextInt();

            // Operaciones
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multiplicacion = numero1 * numero2;
        division = numero1 / numero2;

            // Resultado
        System.out.println("-----Resultados-----");
        System.out.println(numero1 + " + " + numero2 + " = " + suma);
        System.out.println(numero1 + " - " + numero2 + " = " + resta);
        System.out.println(numero1 + " x " + numero2 + " = " + multiplicacion);
        System.out.println(numero1 + " / " + numero2 + " = " + division);
    }
}
