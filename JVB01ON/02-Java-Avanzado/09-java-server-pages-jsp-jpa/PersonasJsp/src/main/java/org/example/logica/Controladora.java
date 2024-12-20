/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.logica;

import java.util.List;
import org.example.persistencia.ControladoraPersistencia;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
     public void crearPersona (Persona perso) {
        controlPersis.crearPersona(perso);
    }
    
    public void eliminarPersona (Long id) {
        controlPersis.eliminarPersona(id);
    }
    
    public List<Persona> traerPersonas () {
        return controlPersis.traerPersonas();
    }
    
    public void editarPersona (Persona perso) {
        controlPersis.editarPersona(perso);
    }
    
}