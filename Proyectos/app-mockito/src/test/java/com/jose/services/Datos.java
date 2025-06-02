package com.jose.services;

import com.jose.models.Examen;

import java.util.Arrays;
import java.util.List;

public class Datos {
    public final static List<Examen> EXAMENES = Arrays.asList(
            new Examen(5L, "Matematicas"),
            new Examen(6L, "Lenguaje"),
            new Examen(7L, "Historia")
    );

    public final static List<Examen> EXAMENES_ID_NULL = Arrays.asList(
            new Examen(null, "Matematicas"),
            new Examen(null, "Lenguaje"),
            new Examen(null, "Historia")
    );

    public final static List<Examen> EXAMENES_ID_NEGATIVOS = Arrays.asList(
            new Examen(-5L, "Matematicas"),
            new Examen(-6L, "Lenguaje"),
            new Examen(null, "Historia")
    );

    public final static List<String> PREGUNTAS = Arrays.asList(
        "aritmetica", "integrales", "derivadas", "trigonometria", "geometria"
    );

    public final static Examen EXAMEN = new Examen(null, "Fisica");
}
