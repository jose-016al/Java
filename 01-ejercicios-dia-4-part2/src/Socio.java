public class Socio {

        // Variables
    private int numeroSocio;
    private String nombre;
    private double cuotaMensual;
    private String activida;

        // Constructor
    public Socio(int numeroSocio, String nombre, double cuotaMensual, String activida) {
        this.numeroSocio = numeroSocio;
        this.nombre = nombre;
        this.cuotaMensual = cuotaMensual;
        this.activida = activida;
    }

        // Getters Methods
    public int getNumeroSocio() {
        return numeroSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getCuotaMensual() {
        return cuotaMensual;
    }

    public String getActivida() {
        return activida;
    }

        // Setters Methods
    public void setNumeroSocio(int numeroSocio) {
        this.numeroSocio = numeroSocio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCuotaMensual(double cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }

    public void setActivida(String activida) {
        this.activida = activida;
    }

    public double costoMensual() {
        return cuotaMensual;
    }
}
