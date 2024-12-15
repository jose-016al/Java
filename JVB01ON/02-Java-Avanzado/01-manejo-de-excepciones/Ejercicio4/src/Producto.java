public class Producto {

    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public void add() throws ProductoInvalidoException {
        if (this.nombre.isBlank()) {
            throw new ProductoInvalidoException("El producto debe tener un nombre");
        }
        if (this.precio < 0) {
            throw new ProductoInvalidoException("El producto debe tener un precio");
        }
        if (this.stock < 0) {
            throw new ProductoInvalidoException("No hay stock de este producto");
        }
        System.out.println("Producto añadidio correctamente");
    }
}
