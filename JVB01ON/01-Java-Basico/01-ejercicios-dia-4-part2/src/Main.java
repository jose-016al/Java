public class Main {
    public static void main(String[] args) {

            // Objetos
        Socio socio = new Socio(1, "Juan Pérez", 500.0, "Natación");
        SocioHabilitado socioHabilitado = new SocioHabilitado(socio.getNumeroSocio(), socio.getNombre(), socio.getCuotaMensual(), socio.getActivida(), 150.0, true);

            // Resultado
        System.out.println("La cuota mensual es: " + socio.costoMensual());
        System.out.println("Cuota mensual del socio habilitado: " + socioHabilitado.costoMensual());
    }
}
