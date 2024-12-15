import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Agenda> agenda = Arrays.asList(
                new Agenda("Reunión de equipo", LocalDate.of(2024, 12, 15), "Reunión"),
                new Agenda("Conferencia sobre Java", LocalDate.of(2024, 12, 16), "Conferencia"),
                new Agenda("Taller de programación funcional", LocalDate.of(2024, 12, 17), "Taller"),
                new Agenda("Reunión con clientes", LocalDate.of(2024, 12, 18), "Reunión"),
                new Agenda("Taller de bases de datos", LocalDate.of(2024, 12, 15), "Conferencia"),
                new Agenda("Conferencia sobre IA", LocalDate.of(2024, 12, 20), "Conferencia")
        );

        // Filtra los eventos que están programados para una fecha específica.
        agenda.stream()
                .filter(a -> a.getFecha().equals(LocalDate.of(2024, 12, 15)))
                .forEach(System.out::println);

        System.out.println("-----");

        // Agrupa los eventos por categoría y cuenta cuántos eventos hay en cada categoría.
        Map<String, List<Agenda>> eventsForCategory = agenda.stream()
                .collect(Collectors.groupingBy(Agenda::getCategoria));

        eventsForCategory.forEach((categoria, list) -> {
            System.out.println(categoria + ": " + list.size());
        });

        System.out.println("-----");

        // Encuentra el evento más próximo en el tiempo utilizando Optionals.
        Optional<Agenda> masActual =  agenda.stream()
                        .max(Comparator.comparing(Agenda::getFecha));

        masActual.ifPresent(System.out::println);

    }
}