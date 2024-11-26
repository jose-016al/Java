import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

            // Variables
        int[] numeros = new int[8];
        int suma = 0, contador = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa 8 numeros:");

            // Rellenar array de numeros
        while (contador < 8) {
            System.out.print("Numero: ");
            numeros[contador] = input.nextInt();
            contador++;
        }

        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        System.out.println("La suma de los numeros da " + suma);
    }
}
