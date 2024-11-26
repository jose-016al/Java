import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

            // Variables
        double base, altura, area;
        Scanner input = new Scanner(System.in);

            // Inicializar variables
        System.out.print("Introduce la base del triaungulo: ");
            base = input.nextDouble();
        System.out.print("Introduce la altura del triaungulo: ");
            altura = input.nextDouble();

            // Operación
        area = (base * altura) / 2;

            // Resultado
        System.out.println("El area del triaungulo es de: "+area);
    }
}
