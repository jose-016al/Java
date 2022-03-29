package generadorgrupos;
// @author jose almiron 
import java.util.*;
public class Grupo {
 
    private int numero;
    private List<Alumno> miembros;

        /* El constructor crea un grupo con el número pasado como argumento, e inicializa la lista de
        miembros con una lista vacía. */
    public Grupo(int n) {
        this.numero = n;
        this.miembros = new ArrayList<>();
    }
    
        /* El método add añade un alumno al grupo. Si el alumno ya existía en el grupo, se lanzará una
        IllegalArgumentException con el mensaje “El alumno (nombre del alumno) ya está en el
        grupo (número del grupo)” */
    public void add(Alumno a) {
        if (!this.miembros.contains(a)) {
            this.miembros.add(a);
        } else {
            throw new IllegalArgumentException("El alumno " + a.getNombre() + " ya esta en el grupo " + this.numero);
        }
    }
    
        // Devuelve el numero del grupo
    public int getNumero() {
        return this.numero;
    }
    
        // El método getNumeroAlumnos devuelve el número de alumnos que hay en el grupo
    public int getNumeroAlumnos() {
        return this.miembros.size();
    }
    
        /* El método getAlumno devuelve el objeto Alumno cuya posición se pasa como parámetro. Si
        la posición es incorrecta (negativa o superior al total de miembros) se lanzará una
        IllegalArgumentException con el mensaje “No se puede acceder a la posición (posición
        buscada) del grupo (número de grupo)” */
    public Alumno getAlumno(int posicion) {
        if (posicion < 0 || posicion > this.miembros.size()) {
            throw new IllegalArgumentException("No se puede acceder a la posición " + posicion + " del grupo " + numero);
        } else {
            return this.miembros.get(posicion);
        }
    }
    
}