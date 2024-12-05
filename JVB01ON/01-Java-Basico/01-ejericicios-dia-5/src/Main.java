import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            // Variables
        int id = 1;
        String nombre = "";
        double nota = 0, suma = 0;

            // Apartado A
        List<Estudiante> estudiantes = new ArrayList<>();

            // Apartado B
        while (true) {
            System.out.print("Introduce el nombre del estudiante (o fin para finalizar): ");
                nombre = input.nextLine();
                if (nombre.equalsIgnoreCase("fin")) {
                    break;
                }
            System.out.print("Introduce la nota de " + nombre + ": ");
                nota = input.nextDouble();
                input.nextLine();

                // añadir el object al array
            estudiantes.add(new Estudiante(id, nombre, nota));
            id++;
        }

            // Apartado C
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante);
            suma+= estudiante.getNota();
        }

        System.out.println("El promedio de la clase ha sido: " + suma / estudiantes.size());
    }
}
