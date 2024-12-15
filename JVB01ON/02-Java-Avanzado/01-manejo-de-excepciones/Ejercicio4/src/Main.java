public class Main {
    public static void main(String[] args) {
        Producto producto = new Producto("Cola", 100, 50);

        try {
            producto.add();
        } catch (ProductoInvalidoException e) {
            throw new RuntimeException(e);
        }
    }
}