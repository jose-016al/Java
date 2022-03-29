package generadorgrupos;
// @author jose almiron
public class Alumno  {
 
    private String nombre;
    
        // El constructor crea un alumno con el nombre pasado como parámetro
    public Alumno(String n) {
        this.nombre = n;
    }

    Alumno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

        // getNombre devuelve el nombre del alumno
    public String getNombre() {
        return this.nombre;
    }
    
}