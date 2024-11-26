import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

            // Variables
        int nota, contador = 0, suma = 0;
        boolean bandera = true;
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese las notas del alumno. Introduzca -1 para finalizar:");

        while (bandera) {
            System.out.print("Nota: ");
                nota = input.nextInt();

                // Finalizar programa
            if (nota == -1) {
                bandera = false;
                break;
            }

            suma += nota;
            contador++;
        }

            // Calculo del promedio
        if (contador > 0) {
            double promedio = (double) suma / contador;
            System.out.printf("El promedio de las notas ingresadas es: %.2f%n", promedio);
        } else {
            System.out.println("No se ingresaron notas.");
        }

    }
}
