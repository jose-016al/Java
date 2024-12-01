public class Cliente {

        // Variables
    private String numero_cliente;
    private String nombre;
    private double deuda;

        // Constructor vacio
    public Cliente() {}

        // Constructor
    public Cliente(String numero_cliente, String nombre, double deuda) {
        this.numero_cliente = numero_cliente;
        this.nombre = nombre;
        this.deuda = deuda;
    }

    // Getters methods
    public String getNumero_cliente() {
        return numero_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public double getDeuda() {
        return deuda;
    }

        // Setter methods
    public void setNumero_cliente(String numero_cliente) {
        this.numero_cliente = numero_cliente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDeuda(double deuda) {
        this.deuda = deuda;
    }

}
