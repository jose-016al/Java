public abstract class Empleado {

        // Variables
    private String nombre;
    private String apellido;
    private int legajo;

    public abstract double calcularSueldo(int dias);

        // Getters methods
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getLegajo() {
        return legajo;
    }

        // Setters methods
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }
}
