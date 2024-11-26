import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

            // Variables
        int numero, suma = 0, contador = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa 8 numeros:");

        while (contador < 8) {
            System.out.print("Numero: ");
            numero = input.nextInt();

            suma += numero;
            contador++;
        }

        System.out.println("La suma de los numeros da " + suma);
    }
}
