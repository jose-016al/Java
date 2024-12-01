import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

            // Variables
        int[] numeros = new int[8];
        int suma = 0, contador = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa 8 numeros:");

            // Rellenar array de numeros
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numero: ");
            numeros[i] = input.nextInt();
            suma += numeros[i];
        }

        System.out.println("La suma de los numeros da " + suma);
    }
}
