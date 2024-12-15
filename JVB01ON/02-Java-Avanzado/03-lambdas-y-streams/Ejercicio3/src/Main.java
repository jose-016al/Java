import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        /*
        Ejercicio Nº 3: Funciones Lamda
        Realizar una interface funcional con un método que reciba un String y devuelva un String llamado: emitirMensaje.
        Luego se deben realizar la implementación del método anterior de la siguiente forma que retorne lo siguiente:
            “Recibí el siguiente parámetro: “+parametro
        Implementar de las siguientes formas:
        1.	Usando una clase regular
        2.	Usando una clase anónima
        3.	Usando una expresión lamda compleja
        4.	Usando una expresión lamda simple
        5.	Usando una interface funcional ya existente
    */
        // Implementación 1 -> POO (Clase regular)
        MiClaseConcreta miClase = new MiClaseConcreta();
        System.out.println(miClase.emitirMensaje("Clase concreta"));

        // Implementación 2 -> Clase anonima usando la interface funcional creada
        MiInterfaceFuncional miInterface1 = new MiInterfaceFuncional() {
            @Override
            public String emitirMensaje(String parametro) {
                return "Recibí el siguiente parámetro: "+parametro;
            }
        };
        System.out.println(miInterface1.emitirMensaje("Clase Anónima"));

        // Implementación 3 -> Con una función lambda COMPLEJA
        MiInterfaceFuncional miInterface2 = (String p) -> {
            return "Recibí el siguiente parámetro: "+p;
        };
        System.out.println(miInterface2.emitirMensaje("Lambda Compleja"));

        // Implementación 4 -> Con una función lambda SIMPLE
        MiInterfaceFuncional miInterface3 = p -> "Recibí el siguiente parámetro: "+p;
        System.out.println(miInterface3.emitirMensaje("Lambda Simple"));

        // Implementación 5 -> Usando la interface funcional "Function" de JAVA
        Function<String, String> function = p -> "Recibí el siguiente parámetro: "+p;
        System.out.println(function.apply("Usando Function"));

    }
}