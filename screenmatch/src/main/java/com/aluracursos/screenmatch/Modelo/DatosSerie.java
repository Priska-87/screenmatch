package com.aluracursos.screenmatch.Modelo;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public record DatosSerie(
        @JsonAlias("Title") String titulo,

        @JsonAlias("totalSeasons") Integer totalDeTemporadas,

        @JsonAlias("Genre") String genero,

        @JsonAlias("imdbRating") String evaluacion,

        @JsonAlias("Plot") String sinopsis,

        @JsonAlias("Actors") String elenco,

        @JsonAlias("Poster") String poster

        ) {
}
