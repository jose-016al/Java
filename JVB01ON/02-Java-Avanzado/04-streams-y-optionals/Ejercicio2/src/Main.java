import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(2,3,30,38,3,200,8394,23,828,2,30);

        Integer suma1 =  numeros.stream()
                .filter(n -> n > 10)
                .mapToInt(n -> n)
                .sum();
        System.out.println("La suma es: " + suma1);

        System.out.println("------");

        BinaryOperator<Integer> binaryOperator = (acum, nro) -> acum+nro;
        Integer suma2 = numeros.stream()
                .filter(n -> n > 10)
                .reduce(0, (acum, nro) -> acum+nro);
        System.out.println("Suma es: " + suma2);


    }
}