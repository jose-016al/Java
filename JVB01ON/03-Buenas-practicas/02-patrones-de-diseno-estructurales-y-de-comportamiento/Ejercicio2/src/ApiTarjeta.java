public class ApiTarjeta {

    public int descuento(Tarjeta tarjeta) {
        if ("Star Bank".equalsIgnoreCase(tarjeta.getBanco())) {
            return 20;
        }
        return 0;
    }

}
