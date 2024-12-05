import java.time.LocalDate;

public class Epson extends Impresora {

        // Constructor
    public Epson(String modelo, String tipoConexion, LocalDate fechaFabricacion, int hojasDisponibles, int porcentajeTinta) {
        super(modelo, tipoConexion, fechaFabricacion, hojasDisponibles, porcentajeTinta);
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimiendo en impresora Epson");
    }
}
