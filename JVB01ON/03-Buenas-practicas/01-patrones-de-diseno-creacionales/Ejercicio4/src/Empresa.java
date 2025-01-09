import java.util.ArrayList;
import java.util.List;

public class Empresa {

        // Variables
    private String razonSocial;
    private List<Empleado> empleados;

        // Constructor vacio
    public Empresa() {}

        // Llamada al factory de empleados, para su creacion
    public void crearEmpleados(){
        empleados = new ArrayList<>();

        EmpleadoRelacionDependencia emp1 = (EmpleadoRelacionDependencia) EmpleadoFactory.crearEmpleado("EMP-INT");
        emp1.setNombre("Juan");
        emp1.setApellido("Rodriguez");
        emp1.setSueldoMensual(1000);

        EmpleadoContratado emp2 = (EmpleadoContratado) EmpleadoFactory.crearEmpleado("EMP-EXT");
        emp2.setNombre("Jose");
        emp2.setApellido("Garcia");
        emp2.setImportePorHora(7);
        emp2.setRetencionImpuestos(14);

        empleados.add(emp1);
        empleados.add(emp2);
    }

    public double calcularSueldosTotal(int dias) {
        return empleados.stream()
                .mapToDouble(e -> e.calcularSueldo(dias))
                .sum();
    }

        // Getters methods
    public String getRazonSocial() {
        return razonSocial;
    }

        // Setters methods
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
}
