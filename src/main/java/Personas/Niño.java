package Personas;

import Organizaciones.Escuela;
import Animales.Animal;

import java.util.ArrayList;
import java.util.List;

public class Niño extends Persona {


    private Escuela escuela;
    private List<Animal> mascotas;

    public Niño(String nombre, int edad) {

        super(nombre, edad);
        this.mascotas = new ArrayList<>();
    }

    public void agregarMascota(Animal mascota) {
        this.mascotas.add(mascota);
        mascota.setDueño(this);
    }

    @Override
    public void describirRol() {
        System.out.println(nombre + " es un niño de " + edad + " años");
    }
}