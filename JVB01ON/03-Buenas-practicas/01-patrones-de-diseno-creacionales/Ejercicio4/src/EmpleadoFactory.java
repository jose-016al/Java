public class EmpleadoFactory {

    private static EmpleadoFactory instance;

    private EmpleadoFactory() {}

    public static EmpleadoFactory getInstance() {
        if (instance == null) {
            instance = new EmpleadoFactory();
        }
        return instance;
    }

    public static Empleado crearEmpleado(String cod) {
        Empleado resultado = switch (cod) {
            case "EMP-INT" -> new EmpleadoRelacionDependencia();
            case "EMP-EXT" -> new EmpleadoContratado();
            default -> null;
        };
        return resultado;
    }
}