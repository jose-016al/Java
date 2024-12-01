import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

            // Variables
        int valor;
        Scanner input = new Scanner(System.in);

            // Inicilaizr variables
        System.out.print("Introduce un numero: ");
            valor = input.nextInt();

            // Swtich condicional
        switch (valor) {
            case 1:
                System.out.println("FACTURAS A");
                break;
            case 2:
                System.out.println("NOTAS DE DEBITO A");
                break;
            case 3:
                System.out.println("NOTAS DE CREDITO A");
                break;
            case 4:
                System.out.println("RECIBOS A");
                break;
            case 5:
                System.out.println("NOTAS DE VENTA AL CONTADO A");
                break;
            case 6:
                System.out.println("FACTURAS B");
                break;
            case 7:
                System.out.println("NOTAS DE DEBITO B");
                break;
            case 8:
                System.out.println("NOTAS DE CREDITO B");
                break;
            case 9:
                System.out.println("RECIBOS B");
                break;
            case 10:
                System.out.println("NOTAS DE VENTAS AL CONTADO B");
                break;
            default:
                System.out.println("Indefinido");

        }
    }
}
