public class EmpleadoContratado extends Empleado {

    private double importePorHora;
    private double retencionImpuestos;

    @Override
    public double calcularSueldo(int dias) {
        return importePorHora * 8 * dias;
    }

        // Getters methods
    public double getImportePorHora() {
        return importePorHora;
    }

    public double getRetencionImpuestos() {
        return retencionImpuestos;
    }

        // Setters methods
    public void setImportePorHora(double importePorHora) {
        this.importePorHora = importePorHora;
    }

    public void setRetencionImpuestos(double retencionImpuestos) {
        this.retencionImpuestos = retencionImpuestos;
    }
}
