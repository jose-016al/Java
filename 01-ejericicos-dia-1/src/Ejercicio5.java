public class Ejercicio5 {
    public static void main(String[] args) {

            // Variables
        double base, altura, area;

            // Declarar el scanner
        Scanner input = new Scanner(System.in);
        //Solicitar al usuario que ingrese la base
        System.out.println("Por favor ingrese la base del rectangulo:");
        base = input.nextDouble();
        //Solicitar al usuario que ingrese la altura
        System.out.println("Por favor ingrese la base del rectangulo:");
        altura = input.nextDouble();

        //Calculo del AREA
        area = base * altura;

        //Mostrar el AREA calculada
        System.out.println("El AREA del rectangulo es: " + area);

    }
}
