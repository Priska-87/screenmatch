package com.aluracursos.screenmatch.dto;

import com.aluracursos.screenmatch.Modelo.Categoria;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public record SerieDTO(
         Long id,
         String titulo,
         Integer totalDeTemporadas,
         Categoria genero,
         Double evaluacion,
         String sinopsis,
         String actores,
         String poster) {
}
