public class MiClaseConcreta implements MiInterfaceFuncional {
    @Override
    public String emitirMensaje(String parametro) {
        return "Recibe el siguiente parametro: " + parametro;
    }
}
