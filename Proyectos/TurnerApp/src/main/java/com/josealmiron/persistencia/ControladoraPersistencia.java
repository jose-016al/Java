package com.josealmiron.persistencia;

import com.josealmiron.logica.Citizen;
import com.josealmiron.logica.Appointment;
import com.josealmiron.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    CitizenJpaController citizenJPA = new CitizenJpaController();
    AppointmentJpaController appointmentJPA = new AppointmentJpaController();

    public void createCitizen(Citizen citizen) {
        citizenJPA.create(citizen);
    }

    public void deleteCitizen(Long id) {
        try {
            citizenJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Citizen> getCitizens() {
        return citizenJPA.findCitizenEntities();
    }

    public void editCitizen(Citizen citizen) {
        try {
            citizenJPA.edit(citizen);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Citizen getCitizen(Long id) {
        return citizenJPA.findCitizen(id);
    }
    
    public boolean validateCitizen(String name, String surname, String email, String phone) {
        return CitizenValidator.validateCitizen(name, surname, email, phone);
    }

    public void createAppointment(Appointment appointment) {
        appointmentJPA.create(appointment);
    }

    public void deleteAppointment(Long id) {
        try {
            appointmentJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Appointment> getAppointments() {
        return appointmentJPA.findAppointmentEntities();
    }

    public void editAppointment(Appointment appointment) {
        try {
            appointmentJPA.edit(appointment);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Appointment getAppointment(Long id) {
        return appointmentJPA.findAppointment(id);
    }
    
}
