package generadorgrupos;
// @author jose almiron
import java.io.*;
import java.util.*;
public class CargadorAlumnos {
 
    private String ruta;

        /* El método constructor inicializa la propiedad ruta con la ruta que se le pasa como
        parámetro. Si no existe la ruta, lanzará una IllegalArgumentException con el mensaje “No
        existe la ruta (y se pone la ruta)” */
    public CargadorAlumnos(String r) {
        File archivo = new File(r);
        if (archivo.exists() == true) {
            this.ruta = r;
        } else {
            this.ruta = r;
            throw new IllegalArgumentException("“No existe la ruta: " + ruta);
        }
    }
    
        /* El método getAlumnos crea una lista vacía. A continuación abre el archivo cuya ruta está en
        la propiedad ruta y lee de él todos los alumnos. Durante la lectura del archivo, por cada
        línea, creará un objeto Alumno con el nombre del alumno leído en esa línea y lo añadirá a la
        lista. Finalmente, terminará devolviendo la lista de alumnos. */
    public List<Alumno> getAlumnos() throws FileNotFoundException, IOException {
        List<Alumno> alumnos = new ArrayList<>();
        BufferedReader cadena = new BufferedReader(new FileReader(ruta));
        while (cadena.ready()) {
            alumnos.add(new Alumno(cadena.readLine()));
        }
        return alumnos;
    }
    
}