public class Empleado {
    private String nombre;
    private double salario;
    private String categoria;

    public Empleado(String nombre, double salario, String categoria) {
        this.nombre = nombre;
        this.salario = salario;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", salario=" + salario +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}
