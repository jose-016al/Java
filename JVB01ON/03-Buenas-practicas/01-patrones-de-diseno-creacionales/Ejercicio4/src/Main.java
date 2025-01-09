public class Main {
    public static void main(String[] args) {

        Empresa empresa = new Empresa();
        empresa.setRazonSocial("Empresa 1");
        empresa.crearEmpleados();
        double totalSueldo = empresa.calcularSueldosTotal(10);

        System.out.println("Total de Sueldos abonados: " + totalSueldo);

    }
}