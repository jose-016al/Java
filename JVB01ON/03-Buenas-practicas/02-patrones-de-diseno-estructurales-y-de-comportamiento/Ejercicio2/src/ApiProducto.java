public class ApiProducto {

    public int descuento(Producto producto) {
        if ("lata".equalsIgnoreCase(producto.getTipo())) {
            return 10;
        }
        return 0;
    }

}
