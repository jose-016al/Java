package com.josealmiron.persistencia;

import com.josealmiron.logica.Appointment;
import com.josealmiron.persistencia.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class AppointmentJpaController implements Serializable {
    
    public AppointmentJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    private EntityManagerFactory emf = null;

    public AppointmentJpaController() {
        emf = Persistence.createEntityManagerFactory("TurnerPU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Appointment appointment) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(appointment);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Appointment appointment) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            appointment = em.merge(appointment);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = appointment.getId();
                if (findAppointment(id) == null) {
                    throw new NonexistentEntityException("The appointment with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Long id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Appointment appointment;
            try {
                appointment = em.getReference(Appointment.class, id);
                appointment.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The appointment with id " + id + " no longer exists.", enfe);
            }
            em.remove(appointment);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Appointment> findAppointmentEntities() {
        return findAppointmentEntities(true, -1, -1);
    }

    public List<Appointment> findAppointmentEntities(int maxResults, int firstResult) {
        return findAppointmentEntities(false, maxResults, firstResult);
    }

    private List<Appointment> findAppointmentEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Appointment.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Appointment findAppointment(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Appointment.class, id);
        } finally {
            em.close();
        }
    }

    public int getAppointmentCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Appointment> rt = cq.from(Appointment.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
}
