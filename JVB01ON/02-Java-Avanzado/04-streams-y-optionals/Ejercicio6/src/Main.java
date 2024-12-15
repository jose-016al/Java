import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Empleado> empleados = List.of(
                new Empleado("Jose", 1500, "Desarrollador"),
                new Empleado("Laura", 1600, "Desarrollador"),
                new Empleado("Paco", 1300, "Analista"),
                new Empleado("Sofia", 1400, "Analista"),
                new Empleado("Paula", 1800, "Gerente"),
                new Empleado("Andrés", 2000, "Gerente")
        );

        // Filtra los empleados cuyo salario sea mayor a cierto valor específico.
        empleados.stream()
                .filter(s -> s.getSalario() > 1500)
                .forEach(System.out::println);

        // Agrupa los empleados por categoría y calcula el salario promedio para cada categoría.
        Map<String, Double> promedioPorCategoria = empleados.stream()
                .collect(Collectors.groupingBy(
                        Empleado::getCategoria,
                        Collectors.averagingDouble(Empleado::getSalario)
                ));

        promedioPorCategoria.forEach((categoria, promedio) -> {
            System.out.println("Categoria: " + categoria  + " su promedio es de: " + promedio);
        });

        // Encuentra al empleado con el salario más alto utilizando Optionals.
        Optional<Empleado> empleadoConMayorSalario = empleados.stream()
                .max(Comparator.comparingDouble(Empleado::getSalario));

        empleadoConMayorSalario.ifPresent(e ->
            System.out.println("El empleado con mayor salario es: " + e.getNombre())
        );


    }
}