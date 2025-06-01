package org.example.logica;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
public class Empleado implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String surname;
    private String position;
    private double salary;
    private Date startDate;

    public Empleado() {}

    public Empleado(String name, String surname, String position, double salary, Date startDate) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.salary = salary;
        this.startDate = startDate;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = dateFormat.format(startDate);

        return "Empleado{" +
                "ID: " + id +
                ", Nombre: " + name +
                ", Apellido: " + surname +
                ", Cargo: " + position +
                ", Salario: " + salary +
                ", Fecha de inicio: " + formattedDate +
                '}';
    }
}
