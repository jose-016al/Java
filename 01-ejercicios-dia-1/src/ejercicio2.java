import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            // Obtener información
        System.out.println("Ingresa tu nombre: ");
        String name =  input.nextLine();
        System.out.println("Ingresa tus apellidos: ");
        String surname =  input.nextLine();
        System.out.println("Ingresa tu edad: ");
        int age = input.nextInt();

            // Mostrar información obtenida
        System.out.println("Su nombre es: " + name + " " + surname + " y tiene " + age + " años");
    }
}
