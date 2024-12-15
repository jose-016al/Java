public class GestionDatos {

    private String[] datos;

    public GestionDatos(int tamano) {
        datos = new String[tamano];
    }

    public void almacenarDatos(int indice, String dato) {
        try {
            // Intentamos almacenar el dato en el índice dado
            datos[indice] = dato;
        } catch (ArrayIndexOutOfBoundsException e) {
            // Capturamos la excepción si el índice está fuera del rango
            System.out.println("Error: Intento de almacenar en una posición inválida del arreglo.");
        }
    }

    public String accederDatos(int indice) {
        try {
            // Intentamos acceder al dato en el índice dado
            return datos[indice];
        } catch (ArrayIndexOutOfBoundsException e) {
            // Capturamos la excepción si el índice está fuera del rango
            return "Error: Intento de acceso a una posición inválida en el arreglo.";
        }
    }
}
