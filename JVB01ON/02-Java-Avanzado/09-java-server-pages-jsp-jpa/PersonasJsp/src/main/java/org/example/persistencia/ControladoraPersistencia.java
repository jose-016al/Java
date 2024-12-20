package org.example.persistencia;

import org.example.logica.Persona;
import org.example.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    PersonaJpaController persoJPA = new PersonaJpaController();
    
    public void crearPersona (Persona perso) {
        persoJPA.create(perso);
    }
    
    public void eliminarPersona (Long id) {
        try {
            persoJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Persona> traerPersonas () {
    return persoJPA.findPersonaEntities();
    }
    
    public void editarPersona (Persona perso) {
        try {
            persoJPA.edit(perso);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
