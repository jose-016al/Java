package com.josealmiron.logica;

import com.josealmiron.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void createCitizen(Citizen citizen) {
        controlPersis.createCitizen(citizen);
    }

    public void deleteCitizen(Long id) {
        controlPersis.deleteCitizen(id);
    }

    public List<Citizen> getCitizens() {
        return controlPersis.getCitizens();
    }

    public void editCitizen(Citizen citizen) {
        controlPersis.editCitizen(citizen);
    }
    
    public Citizen getCitizen(Long id) {
        return controlPersis.getCitizen(id);
    }
    
    public boolean validateCitizen(String name, String surname, String email, String phone) {
        return controlPersis.validateCitizen(name, surname, email, phone);
    }
    
    public void createAppointment(Appointment appointment, Long idCitizen) {
        Citizen citizen = controlPersis.getCitizen(idCitizen);
        appointment.setCitizen(citizen);
        controlPersis.createAppointment(appointment);
    }

    public void deleteAppointment(Long id) {
        controlPersis.deleteAppointment(id);
    }

    public List<Appointment> getAppointments() {
        return controlPersis.getAppointments();
    }

    public void editAppointment(Appointment appointment) {
        controlPersis.editAppointment(appointment);
    }
    
    public Appointment getAppointment(Long id) {
        return controlPersis.getAppointment(id);
    }

}
