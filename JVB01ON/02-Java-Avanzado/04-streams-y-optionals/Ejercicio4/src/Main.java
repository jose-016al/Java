import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        /*
        Ejercicio Nº 4: Streams (filter, map y collect)
        Crear una clase Persona con los atributos: nombre y edad, luego crear 10 objetos del tipo persona
        y cargarlos al listado. Una vez cargado el listado, mediante programación funcional (utilizando: Stream y Lambdas) realizar lo siguiente:
        •	Filtrar aquellas personas que sean mayores a 18 años
        •	Convertir el nombre de la persona a mayúsculas
        •	Colectar en una nueva lista
        •	Ordenar por edad
        •	Mostrar el nombre y la edad de las personas de la nueva lista
    */

        List<Persona> personas = List.of(
                new Persona("Jose", 25),
                new Persona("Paco", 28),
                new Persona("Maria", 15),
                new Persona("Paula", 23),
                new Persona("Armando", 50),
                new Persona("Hugo", 30)
        );

        List<Persona> filtradas = personas.stream()
                .filter(p -> p.getEdad() > 18)
                .map(p -> new Persona(p.getNombre().toLowerCase(), p.getEdad()))
                .toList();
        filtradas.forEach(System.out::println);
        System.out.println("........................");


        //Ordenar por nombre de la persona (tomando el compareTo de Persona)
        filtradas.stream()
                .sorted()
                .toList()
                .forEach(System.out::println);
        System.out.println("------------------------");


        //Ordenar por edad de la persona (definiendo el compare)
        filtradas.stream()
                .sorted(Comparator.comparingInt(Persona::getEdad))
                .toList()
                .forEach(System.out::println);


    }
}