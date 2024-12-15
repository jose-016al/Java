import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listaMeses = Arrays.asList(
                "Enero", "Febrero", "Marzo",
                "Abril", "Mayo", "Junio",
                "Julio", "Agosto", "Septiembre",
                "Octubre", "Noviembre", "Diciembre");

        // listaMeses.forEach(mes -> System.out.println("El mes es: " + mes));
        listaMeses.forEach(System.out::println);


    }
}