public class Recursividad {

    private int numero;

    public void imprimir(int numero) {
        System.out.println(numero);
        if (numero < 5) {
            imprimir(++numero);
        }
    }

    public int sumar(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumar(n - 1);
    }
}
