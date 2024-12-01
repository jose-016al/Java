public class Ejercicio4 {
    public static void main(String[] args) {

            // Variables
        double peso, altura, imc;

            // Declarar el scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Por favor ingrese su peso:");
        peso = input.nextDouble();

        System.out.println("Por favor ingrese su altura (en metros):");
        altura = input.nextDouble();

        imc = peso / (altura * altura);

        //Mostrar el IMC calculado
        System.out.println("El IMC calculado opción 1 es: " + imc);

        //EXTRA: Formatear el imc para que muestre 2 decimales
        DecimalFormat decimalFormat = new DecimalFormat("###,###.##");
        String imcFormateado = decimalFormat.format(imc);
        System.out.println("El IMC calculado opción 2 es: " + imcFormateado);

        System.out.printf("El IMC calculado opción 3 es: %.2f ", imc);

    }
}
