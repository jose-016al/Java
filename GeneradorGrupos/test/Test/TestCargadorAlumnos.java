package Test;
import generadorgrupos.CargadorAlumnos;
import java.io.IOException;
import org.junit.Test;
import static org.junit.Assert.*;
// @author jose almiron 
public class TestCargadorAlumnos {
    
        /* Crea un CargadorAlumnos que lea todos los alumnos del archivo alumnos.txt. Comprueba
        que la lista devuelta tiene exactamente 5 alumnos. */
        /* Añade al test anterior una comprobación de que el primer alumno de la lista se llama “Pérez
        González, Manuel” y el último “Contreras Galeote, Daniel” */
    @Test
    public void Test2() throws IOException {
        CargadorAlumnos c = new CargadorAlumnos("./test/alumnos.txt");
        assertEquals(5, c.getAlumnos().size());
        assertEquals("Perez Gonzalez, Manuel", c.getAlumnos().get(0).getNombre());
        assertEquals("Contreras Galeote, Daniel", c.getAlumnos().get(c.getAlumnos().size() - 1).getNombre());
    }
    
        /* En un test diferente, crea un CargadorAlumnos que lea los alumnos del archivo (que no
        existe) alumnos2.txt. Comprueba que se lanza una IllegalArgumentException */
    @Test
    public void Test3() throws IOException {
        CargadorAlumnos c = new CargadorAlumnos("./test/alumnos.txt");
    }
    
}