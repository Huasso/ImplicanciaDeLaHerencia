// Archivo: src/main/java/com/tuproyecto/herencia/estructuras/Escuela.java
package com.tuproyecto.herencia.estructuras;

import Personas.Niño; // Importa Niño
import java.util.ArrayList;
import java.util.List;

public class Escuela {

    private String nombre;
    private List<Niño> estudiantes;

    public Escuela(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Niño estudiante) {
        this.estudiantes.add(estudiante);
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrarEstudiantes() {
        System.out.println("Lista de estudiantes de " + nombre + ":");
        for (Niño niño : estudiantes) {
            System.out.println("- " + niño.getNombre());
        }
    }
}
