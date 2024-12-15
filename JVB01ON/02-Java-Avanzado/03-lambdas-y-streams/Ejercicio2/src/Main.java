import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(20, 30, 30, 10, 5, 2, 299, 9999, 784);

        // Predicate<Integer> esMayorA10 = n -> n > 10;
        // Long total = numeros.stream().filter(esMayorA10).count();

        Long total = numeros.stream().filter(n -> n > 10).count();
        System.out.println(total);


    }
}