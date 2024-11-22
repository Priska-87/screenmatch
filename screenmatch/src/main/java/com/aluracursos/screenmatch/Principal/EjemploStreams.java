package com.aluracursos.screenmatch.Principal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class EjemploStreams {

    public void muestraEjemplo(){
        List<String> certificaciones = Arrays.asList("Data Analyst", "Proyect Manager", "Java Developer");

        certificaciones.stream()
                .sorted()
                .filter(n -> n.startsWith("P"))
                .map(n -> n.toUpperCase())
                .forEach(System.out::println);

    }
}
