package com.mycompany.servlet.logica;

public class Usuario {
    
    private String dni;
    private String nombre;
    private String apellido;
    private String telefono;

    public Usuario(String dni, String nombre, String apeliido, String telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apeliido;
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apeliido) {
        this.apellido = apeliido;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}
