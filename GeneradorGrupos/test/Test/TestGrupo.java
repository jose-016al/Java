package Test;
import generadorgrupos.*;
import org.junit.Test;
import static org.junit.Assert.*;
// @author jose almiron
public class TestGrupo {
    
        /* Crea un grupo con el número 1 y comprueba que el método getNumero devuelve 1 y que el
        método getNumeroAlumnots devuelve 0. 
        Dentro del mismo test, añade al grupo anterior al alumno “Pérez Pérez, Manuel” y “López
        López, Ana”. Comprueba que ahora hay 2 alumnos.
        Dentro del mismo test, extrae el alumno de la posición 0 y comprueba que se llama “Pérez
        Pérez, Manuel” */
    @Test
    public void Test1() {
        Grupo g = new Grupo(1);
        Alumno a1 = new Alumno("Pérez Pérez, Manuel");
        Alumno a2 = new Alumno("López López, Ana");
        assertEquals(1, g.getNumero());
        assertEquals(0, g.getNumeroAlumnos());
        g.add(a2);
        assertEquals(2, g.getNumeroAlumnos());
        // g.add(a2);
        assertEquals("Pérez Pérez, Manuel", g.getAlumno(0).getNombre());
    }
    
        /* Haz un nuevo test que cree un grupo con el número 2 e intenta acceder al alumno con
        posición -1. Comprueba que se lanza una IllegalArgumentException */
    @Test
    public void test2() {
        Grupo g = new Grupo(2);
        assertEquals("Pérez Pérez, Manuel", g.getAlumno(-1).getNombre());
    }
    
        /*  Haz un nuevo test que cree un grupo con el número 3 y añade a “Pérez Pérez, Ana”. Intenta
        acceder al alumno con posición 2 y comprueba que se lanza una IllegalArgumentException. */
    @Test
    public void test3() {
        Grupo g = new Grupo(3);
        g.add(new Alumno("Pérez Pérez, Ana"));
        assertEquals("Pérez Pérez, Manuel", g.getAlumno(2).getNombre());
    }
    
}