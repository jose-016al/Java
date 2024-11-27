public class Main {
    public static void main(String[] args) {

            // Apartado A
        Cliente cliente1 = new Cliente("847573", "Jose", 1500);
        Cliente cliente2 = new Cliente("982345", "Maria", 2300);
        Cliente cliente3 = new Cliente("435678", "Luis", 3200);

            // Apartado B
        Cliente cliente_vacio = new Cliente();

            // Apartado C
        cliente_vacio.setNumero_cliente("749375");
        cliente_vacio.setNombre("Cliente nuevo");
        cliente_vacio.setDeuda(2579);

            // Apartado D
        Cliente[] clientes = {cliente1, cliente2, cliente3};

        for (int i = 0; i < clientes.length; i++) {
            System.out.println("-----Cliente " + (i + 1) + "-----");
            System.out.println(clientes[i].getNumero_cliente());
            System.out.println(clientes[i].getNombre());
            System.out.println(clientes[i].getDeuda());
        }
    }
}
