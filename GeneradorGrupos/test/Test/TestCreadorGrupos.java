package Test;
import generadorgrupos.*;
import java.util.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
// * @author jose almiron
public class TestCreadorGrupos {
    
    @Test
    public void test1() {
        List<Alumno> a = new ArrayList<>();
        a.add(new Alumno("Manuel"));
        a.add(new Alumno("Pedro"));
        a.add(new Alumno("Ana"));
        a.add(new Alumno("Maria"));
        a.add(new Alumno("Joaquin"));
        a.add(new Alumno("Paco"));
        a.add(new Alumno("Angel"));
        a.add(new Alumno("Luis"));
        a.add(new Alumno("Pepe"));
        a.add(new Alumno("Luisa"));
        a.add(new Alumno("Mac"));
        CreadorGrupos c = new CreadorGrupos(a);
        c.formarGrupos(3);
        assertEquals(4, c.formarGrupos(3).size());
        assertEquals(1, c.formarGrupos(3).get(0).getNumero());
        assertEquals(2, c.formarGrupos(3).get(1).getNumero());
        assertEquals(3, c.formarGrupos(3).get(2).getNumero());
        assertEquals(4, c.formarGrupos(3).get(3).getNumero());
        for (int i = 0; i < c.formarGrupos(3).size(); i++) {
            System.out.println("Grupo " + c.formarGrupos(3).get(i).getNumero());
            for (int j = 0; j < c.formarGrupos(3).get(i).getNumeroAlumnos(); j++) {
                System.out.println("        " + c.formarGrupos(3).get(i).getAlumno(j).getNombre());
            }
        }
    }
    
}