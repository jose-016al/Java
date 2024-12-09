public class Main {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta(1, "112233", 10000.00);
        System.out.println("El saldo de cuenta1 es: "+cuenta1.getSaldo());

        try{
            // Código que puede generar una excepción
            cuenta1.retirar(9500.00);
            //cuenta1.retirar(-1000.00);
        }catch (TransaccionInvalidaException e){
            // Manejar la excepción
            System.out.println("No se ha podido realizar el retiro -> "+e.getMessage());
        }finally {
            System.out.println("El nuevo saldo de cuenta1 es: "+cuenta1.getSaldo());
        }

    }
}