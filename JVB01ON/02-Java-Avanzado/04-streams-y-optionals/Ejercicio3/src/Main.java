import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        Ejercicio Nº 3: Streams
        Crear una lista de Integers con de 10 notas de alumnos. Una vez cargado el listado,
        mediante programación funcional (utilizando: Stream y Lambdas) realizar lo siguiente:
        •	Calcular el promedio de las notas de los alumnos.
        •	Probar que ocurre cuando el listado no tiene ninguna nota.
    */

        List<Integer> notas = Arrays.asList(3,9,5,4,3,10,9,8,5,7,4,2,9);

        int suma = notas.stream()
                .mapToInt(n -> n)
                .sum();
        double promedio = (double) suma / notas.stream().count();
        System.out.println("El promedio es: " + promedio);

        double prom = notas.stream()
                .mapToInt(n -> n)
                .sum() / notas.size();
        System.out.println("El promedio es: " + prom);

    }
}