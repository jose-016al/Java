import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            // Recoger información
        System.out.println("Introduce el primer numero");
        int number1 = input.nextInt();
        System.out.println("Introduce el segundo numero");
        int number2 = input.nextInt();
        System.out.println("Introduce el tercer numero");
        int number3 = input.nextInt();
        System.out.println("Introduce el cuarto numero");
        int number4 = input.nextInt();
        System.out.println("Introduce el quinto numero");
        int number5 = input.nextInt();

            // Operaciones
        double suma = number1 + number2 + number3 + number4 + number5;
        double promedio = suma / 5;

            // Resultado
        System.out.println("La suma de los numeros es: " + suma + " y su promedio es: " + promedio);
    }
}
