import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Antonio", "Jose", "Alberto", "Jorge", "Paula", "Ana", "Marta", "Paco", "Alfredo");

        // Convertir a mayusculas
        List<String> lista1 = names.stream()
                .map(String::toUpperCase)
                .filter(n -> n.startsWith("A"))
                .collect(Collectors.toList());
        lista1.forEach(System.out::println);

        System.out.println("-----");

        lista1.stream()
                .filter(n -> n.length() > 5)
                .sorted()
                .toList()
                .forEach(System.out::println);
    }
}