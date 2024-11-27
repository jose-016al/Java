import java.time.LocalDate;

public class Impresora {

        // Variables
    private String modelo;
    private String tipo;
    private String fecha_fabricacion;
    private int hojas_disponibles;

    public Impresora(String modelo, String tipo, String fecha_fabricacion, int hojas_disponibles) {
        this.modelo = modelo;
        this.tipo = tipo;
        this.fecha_fabricacion = fecha_fabricacion;
        this.hojas_disponibles = hojas_disponibles;
    }

    public String getModelo() {
        return modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getFecha_fabricacion() {
        return fecha_fabricacion;
    }

    public int getHojas_disponibles() {
        return hojas_disponibles;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setFecha_fabricacion(String fecha_fabricacion) {
        this.fecha_fabricacion = fecha_fabricacion;
    }

    public void setHojas_disponibles(int hojas_disponibles) {
        this.hojas_disponibles = hojas_disponibles;
    }
}
