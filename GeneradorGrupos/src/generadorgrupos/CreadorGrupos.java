package generadorgrupos;
// @author jose almiron

import java.util.*;

public class CreadorGrupos {

    public List<Alumno> alumnos;

    // El constructor inicializa la propiedad alumnos con la lista que recibe como parámetro.
    public CreadorGrupos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    /* El método mezclarAlumnos llama al método Collections.shuffle (ver la documentación de la
        clase Collections, que está en el pdf del Java Collections Framework). Esto lo que hace es
        “barajar” la lista de alumnos de forma aleatoria. */
    private void mezclarAlumno() {
        Collections.shuffle(alumnos);
    }

    /* El método formarGrupos llamará al método mezclarAlumnos y a continuación devolverá
        una lista de grupos de tam alumnos. O sea, tam es el tamaño que tendrá cada grupo. */
    public List<Grupo> formarGrupos(int tam) {
        List<Grupo> listaGrupos = new ArrayList<>();
        int numeroGrupo = 1;
        Grupo grupo = new Grupo(numeroGrupo);
        for (int i = 0; i < this.alumnos.size(); i++) {
            Alumno a = alumnos.get(i);
            grupo.add(a);
            if (grupo.getNumeroAlumnos() == tam) {
                listaGrupos.add(grupo);
                numeroGrupo++;
                grupo = new Grupo(numeroGrupo);
            }
        }
        if (grupo.getNumeroAlumnos() != 0) {
            listaGrupos.add(grupo);
        }
        return listaGrupos;
    }

}
