import java.util.ArrayList;
import java.util.List;

public class Inventario<T extends Producto> {

        // Variables
    private List<T> productos;

        // Constructor
    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(T producto) {
        productos.add(producto);
        System.out.println("Producto añadido: " + producto.getNombre());
    }

    public void mostrarInventario() {
        System.out.println("Inventario");
        for (T producto : productos)
            System.out.println(producto.getNombre() + " - " + producto.getPrecio());
    }

}
