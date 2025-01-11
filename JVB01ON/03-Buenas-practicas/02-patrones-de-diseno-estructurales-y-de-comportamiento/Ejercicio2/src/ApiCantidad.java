public class ApiCantidad {

    public int descuento(int cantidad) {
        if (cantidad > 12) {
            return 15;
        }
        return 0;
    }

}
