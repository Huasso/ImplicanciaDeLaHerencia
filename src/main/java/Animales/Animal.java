package Animales;

import Personas.Persona;

public abstract class Animal {
    protected String nombre;
    private Persona dueño;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void setDueño(Persona dueño) {
        this.dueño = dueño;
    }

    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }


    public abstract void hacerSonido();
}