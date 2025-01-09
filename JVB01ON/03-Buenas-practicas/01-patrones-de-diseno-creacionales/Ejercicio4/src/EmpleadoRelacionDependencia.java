public class EmpleadoRelacionDependencia extends Empleado {

    private double sueldoMensual;

    @Override
    public double calcularSueldo(int dias) {
        return dias * sueldoMensual / 30;
    }

        // Getters methods
    public double getSueldoMensual() {
        return sueldoMensual;
    }

        // Setters methods
    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }
}
