public class Cuenta {

    private int id;
    private String numero;
    private Double saldo;

    public Cuenta(int id, String numero, Double saldo) {
        this.id = id;
        this.numero = numero;
        this.saldo = saldo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void retirar(Double monto) throws TransaccionInvalidaException {
        if (monto > this.saldo){
            throw new TransaccionInvalidaException("El monto es mayor al saldo actual!");
        }
        if (monto < 0){
            throw new TransaccionInvalidaException("El monto no puede ser negativo!");
        }
        this.saldo-= monto;
    }
}
