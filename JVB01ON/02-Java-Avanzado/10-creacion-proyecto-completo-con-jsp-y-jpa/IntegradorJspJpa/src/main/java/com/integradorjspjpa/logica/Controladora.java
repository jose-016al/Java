package com.integradorjspjpa.logica;

import com.integradorjspjpa.persistencia.ControladoraPersistencia;
import java.util.List;

/**
 *
 * @author Roque
 */
public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    
    /* EQUIPOS */
    public void crearEquipo(Equipo equipo) {
        controlPersis.crearEquipo(equipo);
    }    
    
    public void eliminarEquipo(Long id) {
        controlPersis.eliminarEquipo(id);
    }
    
    public List<Equipo> traerEquipos() {
        return controlPersis.traerEquipos();
    }
    
    public void editarEquipo(Equipo equipo) {
        controlPersis.editarEquipo(equipo);
    }


    
    
    /* PARTIDOS */
    public void crearPartido(Partido partido, Long idEquipo1, Long idEquipo2) {
        //Obtener EQUIPOS a partir de los IDs
        Equipo equipo1 = controlPersis.ObtenerEquipo(idEquipo1);
        Equipo equipo2 = controlPersis.ObtenerEquipo(idEquipo2);
        //Setear los EQUIPOS en el PARTIDO antes de persistir
        partido.setEquipo1(equipo1);
        partido.setEquipo2(equipo2);
        
        controlPersis.crearPartido(partido);
    }    
    
    public void eliminarPartido(Long id) {
        controlPersis.eliminarPartido(id);
    }
    
    public List<Partido> traerPartidos() {
        return controlPersis.traerPartidos();
    }
    
    public void editarPartido(Partido partido) {
        controlPersis.editarPartido(partido);
    }  
    
}
