// Ejercicio 1: Calculo de IMC
public class Ejercicio1 {
    public static void main(String[] args) {

            //Variables
        double peso = 63;
        double altura = 1.80;

            // Formula
        double resultado = peso / (altura*altura);

            //Resultado
        System.out.println("El IMC es " + resultado);
    }
}
