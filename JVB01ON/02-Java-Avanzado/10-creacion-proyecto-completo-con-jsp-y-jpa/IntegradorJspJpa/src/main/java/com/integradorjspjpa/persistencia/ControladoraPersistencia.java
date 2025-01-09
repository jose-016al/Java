package com.integradorjspjpa.persistencia;

import com.integradorjspjpa.logica.Equipo;
import com.integradorjspjpa.logica.Partido;
import com.integradorjspjpa.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Roque
 */
public class ControladoraPersistencia {
    
    EquipoJpaController equipoJPA = new EquipoJpaController();
    PartidoJpaController partidoJPA = new PartidoJpaController();
    
    /*PARA EQUIPO*/
    public void crearEquipo(Equipo equipo) {
        equipoJPA.create(equipo);
    }
    
    public void eliminarEquipo(Long id) {
        try {
            equipoJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Equipo> traerEquipos() {
        return equipoJPA.findEquipoEntities();
    }
    
    public void editarEquipo(Equipo equipo) {
        try {
            equipoJPA.edit(equipo);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    
    
    public Equipo ObtenerEquipo(Long id) {
        return equipoJPA.findEquipo(id);
    }    
    
    
    
    /*PARA PARTIDO*/
    public void crearPartido(Partido partido) {
        partidoJPA.create(partido);
    }
    
    public void eliminarPartido(Long id) {
        try {
            partidoJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Partido> traerPartidos() {
        return partidoJPA.findPartidoEntities();
    }
    
    public void editarPartido(Partido partido) {
        try {
            partidoJPA.edit(partido);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    
}
