package org.example.persistencia;

import org.example.logica.Empleado;
import org.example.persistencia.exceptions.NonexistentEntityException;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    EmpleadoJpaController empJPA = new EmpleadoJpaController();

    public void createEmployee(Empleado proj) {
        empJPA.create(proj);
    }

    public void deleteEmployee(Long id) {
        try {
            empJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Empleado> getEmployee () {
        return empJPA.findEmpleadoEntities();
    }

    public List<Empleado> getEmployeeByPosition(String position) {
        List<Empleado> all = empJPA.findEmpleadoEntities();
        List<Empleado> search = new ArrayList<>();
        for (Empleado empleado : all)
            if (empleado.getPosition().equalsIgnoreCase(position)) {
                search.add(empleado);
            }
        return search;
    }

    public void modifyEmployee(Empleado empleado) {
        try {
            empJPA.edit(empleado);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}