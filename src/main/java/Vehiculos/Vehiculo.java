package Vehiculos;

import Personas.Persona;

public class Vehiculo {
    protected String marca;
    protected String modelo;
    private Persona propietario;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }
}
