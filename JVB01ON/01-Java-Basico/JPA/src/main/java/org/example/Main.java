package org.example;

import org.example.logica.Persona;
import org.example.logica.Proyecto;
import org.example.persistencia.ControladoraPersistencia;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Crear objeto en memoria
        ControladoraPersistencia controlPersis = new ControladoraPersistencia();

            // Añadir registro
        Persona persona1  = new Persona (1L, "Luisina", 32);
        Proyecto proyecto1 = new Proyecto(new Date(), "Tecnología", "Desarrollo de aplicación móvil");
        Proyecto proyecto2 = new Proyecto(new Date(), "Investigación", "Optimización de procesos");
        Proyecto proyecto3 = new Proyecto(new Date(), "Consultoría", "Implementación de sistema de gestión");

        // controlPersis.crearPersona(persona1);
        // controlPersis.crearProyecto(proyecto2);

            // Borrar un registro por su id
        //controlPersis.borrarPersona(2L);

            // Modificar registro
        // persona1.setEdad(31);
        // controlPersis.modificarPersona(persona1);

        // Recorrer registros
        List<Persona> listaPersonas = controlPersis.traerPersonas();
        for (Persona per:listaPersonas) {
            System.out.println(per.toString());
        }

        List<Proyecto> proyectos = controlPersis.traerProyectosPorTipo("Tecnología");

        for (Proyecto proyecto : proyectos) {
            System.out.println(proyecto.getId() + " - " + proyecto.getTipo());
        }

    }
}