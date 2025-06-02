package com.jose.services;

import com.jose.models.Examen;
import com.jose.repository.ExamenRepository;
import com.jose.repository.PreguntaRepository;

import java.util.Optional;

public class ExamenService implements IExamenServices {

    private ExamenRepository examenRepository;
    private PreguntaRepository preguntaRepository;

    public ExamenService(ExamenRepository examenRepository, PreguntaRepository preguntaRepository) {
        this.examenRepository = examenRepository;
        this.preguntaRepository = preguntaRepository;
    }

    @Override
    public Optional<Examen> findExamenPorNombre(String nombre) {
        return examenRepository.findAll().stream()
                .filter(e -> e.getNombre().equals(nombre))
                .findFirst();
    }

    @Override
    public Examen findExamenPorNombreConPreguntas(String nombre) {
        Examen examen = findExamenPorNombre(nombre).orElseThrow();
        examen.setPreguntas(preguntaRepository.findPreguntasPorExamenId(examen.getId()));
        return examen;
    }

    @Override
    public Examen guardar(Examen examen) {
        if (!examen.getPreguntas().isEmpty()) {
            preguntaRepository.guardarVarias(examen.getPreguntas());
        }
        return examenRepository.guardar(examen);
    }

}
