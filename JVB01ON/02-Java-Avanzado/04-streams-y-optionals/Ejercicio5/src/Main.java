import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
 /*
Ejercicio Nº 5: Streams y Optionals
Crear una clase Cliente con el atributo: apellido, luego crear 10 objetos del tipo cliente
y cargarlos al listado. Una vez cargado el listado, mediante programación funcional (utilizando: Stream, Lambdas y optionals) realizar lo siguiente:
•	Obtener el primer cliente cuyo apellido coincida con uno buscado, en la búsqueda NO debe tener en cuenta las mayúsculas/minúsculas.
•	El item anterior devuelve un Optional, debe tratarlo de las siguientes formas:
1.	Obtenerlo directamente con el método: get()
2.	Si está presente(isPresent) el cliente, muestre: “Un cliente encontrado” caso contrario muestre: “No se encontró ningún cliente”.
3.	Si encontró devolver el cliente correspondiente y si no encontró, crear uno nuevo con el apellido buscado.
4.	Si encontró, devolver el apellido y si no encontró, devolver “Cliente no encontrado”.
*/
        List<Cliente> clientes = List.of(
                new Cliente("Juan"),
                new Cliente("Jose"),
                new Cliente("Laura"),
                new Cliente("Ramón"),
                new Cliente("Jorge"),
                new Cliente("Maria"),
                new Cliente("Fernando")
        );

        String busqueda = "laura";
        Optional<Cliente> optionalCliente = clientes.stream()
                .filter(c -> c.getApellido().equalsIgnoreCase(busqueda))
                .findFirst();

        //2- Usar isPresent()
        if (optionalCliente.isPresent()){
            System.out.println("Un cliente encontrado");
        }else{
            System.out.println("No se encontró ningún cliente");
        }

        //3- Devolver un cliente
        Cliente clienteBuscado = clientes.stream()
                .filter(c -> c.getApellido().equalsIgnoreCase(busqueda))
                .findFirst()
                .orElse(new Cliente(busqueda));
        System.out.println(clienteBuscado);

        //4- Devolver un String
        clientes.stream()
                .filter(c -> c.getApellido().equalsIgnoreCase(busqueda))
                .findFirst()
                .ifPresentOrElse(value -> System.out.println(value.getApellido()),
                        () -> System.out.printf("Cliente no encontrado"));




    }
}