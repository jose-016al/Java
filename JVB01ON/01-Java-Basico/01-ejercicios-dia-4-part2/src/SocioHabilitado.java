public class SocioHabilitado extends Socio {

        // Variables
    private double costePiscina;
    private boolean habilitado;

        // Constructor
    public SocioHabilitado(int numeroSocio, String nombre, double cuotaMensual, String activida, double costePiscina, boolean habilitado) {
        super(numeroSocio, nombre, cuotaMensual, activida);
        this.costePiscina = costePiscina;
        this.habilitado = habilitado;
    }

    @Override
    public double costoMensual() {
        if (habilitado) {
            return super.costoMensual() + costePiscina;
        } else {
            return super.costoMensual();
        }
    }
}
