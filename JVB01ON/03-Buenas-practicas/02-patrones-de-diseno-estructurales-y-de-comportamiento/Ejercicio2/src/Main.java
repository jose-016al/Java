public class Main {
    public static void main(String[] args) {

        // Crear instancias de producto, tarjeta y cantidad
        Tarjeta tarjeta = new Tarjeta("123456789", "Star Bank");
        Producto producto = new Producto("Coca-Cola", "lata");
        int cantidad = 15;

        // Crear la fachada y calcular el descuento
        DescuentoFacade descuentoFacade = new DescuentoFacade();
        int descuentoTotal = descuentoFacade.calcularDescuento(tarjeta, producto, cantidad);

        // Mostrar el descuento total
        System.out.println("El descuento total es: " + descuentoTotal + "%");

    }
}