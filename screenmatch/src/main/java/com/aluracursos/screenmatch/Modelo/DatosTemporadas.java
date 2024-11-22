package com.aluracursos.screenmatch.Modelo;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosTemporadas(

        @JsonAlias("Season") Integer numero,

        @JsonAlias("Episodes") List<DatosEpisodio> episodio
) {
}
