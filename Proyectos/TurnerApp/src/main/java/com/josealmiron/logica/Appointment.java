package com.josealmiron.logica;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Appointment implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime assignedDate;
    private String description;
    private String status;

    @ManyToOne
    private Citizen citizen;

    public Appointment() {
    }

    public Appointment(Long id, LocalDateTime assignedDate, String description, String status, Citizen citizen) {
        this.id = id;
        this.assignedDate = assignedDate;
        this.description = description;
        this.status = status;
        this.citizen = citizen;
    }

    public Long getId() {
        return id;
    }

    public LocalDateTime getAssignedDate() {
        return assignedDate;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public Citizen getCitizen() {
        return citizen;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAssignedDate(LocalDateTime assignedDate) {
        this.assignedDate = assignedDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCitizen(Citizen citizen) {
        this.citizen = citizen;
    }

    public String[] getAssignedDateFormatted() {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yy");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        DateTimeFormatter dateFormatterEdit = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        String formattedDate = assignedDate.format(dateFormatter);
        String formattedTime = assignedDate.format(timeFormatter);
        String formattedDateEdit = assignedDate.format(dateFormatterEdit);

        return new String[]{formattedDate, formattedTime, formattedDateEdit};
    }

}
