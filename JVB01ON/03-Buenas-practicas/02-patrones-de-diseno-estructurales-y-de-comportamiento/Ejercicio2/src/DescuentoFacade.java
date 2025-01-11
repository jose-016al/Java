public class DescuentoFacade {

    private ApiTarjeta apiTarjeta;
    private ApiProducto apiProducto;
    private ApiCantidad apiCantidad;

    public DescuentoFacade() {
        this.apiTarjeta = new ApiTarjeta();
        this.apiProducto = new ApiProducto();
        this.apiCantidad = new ApiCantidad();
    }

    public int calcularDescuento(Tarjeta tarjeta, Producto producto, int cantidad) {
        int descuentoTarjeta = apiTarjeta.descuento(tarjeta);
        int descuentoProducto = apiProducto.descuento(producto);
        int descuentoCantidad = apiCantidad.descuento(cantidad);

        // Suma acumulada de los porcentajes de descuento
        return descuentoTarjeta + descuentoProducto + descuentoCantidad;
    }

}
