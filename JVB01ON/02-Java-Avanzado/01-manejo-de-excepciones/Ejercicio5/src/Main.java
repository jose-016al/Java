public class Main {
    public static void main(String[] args) {

        GestionDatos gestionDatos = new GestionDatos(3);

            // Almacenamos algunos datos en el arreglo
        gestionDatos.almacenarDatos(0, "Dato 1");
        gestionDatos.almacenarDatos(1, "Dato 2");
        gestionDatos.almacenarDatos(2, "Dato 3");

            // Intentamos acceder a datos en índices válidos e inválidos
        System.out.println(gestionDatos.accederDatos(1)); // Accede al índice 1
        System.out.println(gestionDatos.accederDatos(5)); // Intento de acceder a un índice fuera de rango

            // Intentamos almacenar un dato en un índice fuera de rango
        gestionDatos.almacenarDatos(5, "Dato 4"); // Intento de almacenar en un índice fuera de rango
    }
}