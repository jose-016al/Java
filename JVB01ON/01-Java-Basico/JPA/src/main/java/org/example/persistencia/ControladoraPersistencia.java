package org.example.persistencia;

import org.example.logica.Persona;
import org.example.logica.Proyecto;
import org.example.persistencia.exceptions.NonexistentEntityException;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    PersonaJpaController persoJPA = new PersonaJpaController();

    public void crearPersona(Persona pers) {
        persoJPA.create(pers);
    }

    public void borrarPersona(Long id) {
        try {
            persoJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Persona> traerPersonas () {
        return persoJPA.findPersonaEntities();
    }

    public void modificarPersona (Persona pers) {

        try {
            persoJPA.edit(pers);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    ProyectoJpaController projJPA = new ProyectoJpaController();

    public void crearProyecto(Proyecto proj) {
        projJPA.create(proj);
    }

    public void borrarProyecto(Long id) {
        try {
            projJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Proyecto> traerProyectos () {
        return projJPA.findProyectoEntities();
    }

    public List<Proyecto> traerProyectosPorTipo(String tipo) {
        List<Proyecto> all = projJPA.findProyectoEntities();
        List<Proyecto> search = new ArrayList<>();
        for (Proyecto proyecto : all)
            if (proyecto.getTipo().equalsIgnoreCase(tipo)) {
                search.add(proyecto);
            }
        return search;
    }

    public void modificarProyecto (Proyecto proj) {
        try {
            projJPA.edit(proj);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
