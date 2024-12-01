import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

            // Variables
        int entero = 40;
        double decimal = 34.5;
        boolean booleano = true;
        String texto = "Jose";
        Scanner input = new Scanner(System.in);

            // Apartado A: Mostrar los valores de las variables
        System.out.println("El valor del entero es: " + entero);
        System.out.println("El valor del decimal es: " + decimal);
        System.out.println("El valor del booleano es: " + booleano);
        System.out.println("El valor del texto es: " + texto);

            // Apartado B: Comprobación de errores
        System.out.print("Introduce un entero: ");
            input.nextInt();
        System.out.println("El valor del entero es: " + entero);

        System.out.print("Introduce un decimal: ");
            input.nextDouble();
        System.out.println("El valor del decimal es: " + decimal);

        System.out.print("Introduce un boolean: ");
            input.hasNextBoolean();
        System.out.println("El valor del booleano es: " + booleano);

        System.out.print("Introduce un string: ");
            input.nextLine();
        System.out.println("El valor del texto es: " + texto);
    }
}
