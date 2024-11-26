public class Ejercicio3 {
    public static void main(String[] args) {

            // Variables
        int num1, num2, num3, num4, num5, total;
        double promedio;

            // Declarar un scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un número:");
        num1 = input.nextInt();
        System.out.println("Ingrese otro número:");
        num2 = input.nextInt();
        System.out.println("Ingrese otro número:");
        num3 = input.nextInt();
        System.out.println("Ingrese otro número:");
        num4 = input.nextInt();
        System.out.println("Ingrese otro número:");
        num5 = input.nextInt();

        total = num1+num2+num3+num4+num5;
        promedio = (double) total / 5;

        System.out.println("La suma total es: "+total);
        System.out.println("El promedio es: "+promedio);
    }
}
