import java.time.LocalDate;

public class Impresora {

        // Variables
    private String modelo;
    private String tipoConexion;
    private LocalDate fechaFabricacion;
    private int hojasDisponibles;
    private int porcentajeTinta;

        // Constructor
    public Impresora(String modelo, String tipoConexion, LocalDate fechaFabricacion, int hojasDisponibles, int porcentajeTinta) {
        this.modelo = modelo;
        this.tipoConexion = tipoConexion;
        this.fechaFabricacion = fechaFabricacion;
        this.hojasDisponibles = hojasDisponibles;
        this.porcentajeTinta = porcentajeTinta;
    }

        // Getter Methods
    public String getModelo() {
        return modelo;
    }

    public String getTipoConexion() {
        return tipoConexion;
    }

    public LocalDate getFechaFabricacion() {
        return fechaFabricacion;
    }

    public int getHojasDisponibles() {
        return hojasDisponibles;
    }

    public int getPorcentajeTinta() {
        return porcentajeTinta;
    }

        // Setters Methods
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setTipoConexion(String tipoConexion) {
        this.tipoConexion = tipoConexion;
    }

    public void setFechaFabricacion(LocalDate fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public void setHojasDisponibles(int hojasDisponibles) {
        this.hojasDisponibles = hojasDisponibles;
    }

    public void setPorcentajeTinta(int porcentajeTinta) {
        this.porcentajeTinta = porcentajeTinta;
    }

    public void imprimir() {
        System.out.println("Impriminedo en impresora generica");
    }
}
