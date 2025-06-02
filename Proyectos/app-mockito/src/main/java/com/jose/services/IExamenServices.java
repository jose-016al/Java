package com.jose.services;

import com.jose.models.Examen;

import java.util.Optional;

public interface IExamenServices {
    Optional<Examen> findExamenPorNombre(String nombre);
    Examen findExamenPorNombreConPreguntas(String nombre);
    Examen guardar(Examen examen);
}
