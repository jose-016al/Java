public class Ejercicio2 {
    public static void main(String[] args) {

            // Variables
        String nombre;
        String apellido;
        int edad;

        // Se declara un scanner para la entrada por teclado
        Scanner input = new Scanner(System.in);

        System.out.println("Por favor, ingrese su nombre:");
        nombre = input.nextLine();

        System.out.println("Por favor, ingrese su apellido:");
        apellido = input.nextLine();

        System.out.println("Por favor, ingrese su edad:");
        edad = input.nextInt();

        System.out.println("Su nombre y apellido es: "+nombre+" "+apellido+" y tiene: "+edad+" años.");

    }
}
