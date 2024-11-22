package com.aluracursos.screenmatch.service;

public interface IConvierteDatos {
   <T> T obtenerDatos(String Json, Class<T> clase );
}
