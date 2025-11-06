package Personas;

import Estructuras.Departamento;
import Vehiculos.Vehiculo;

public class Empleado extends Persona {


    private Departamento departamento;
    private Vehiculo vehiculo;

    public Empleado(String nombre, int edad) {
        super(nombre, edad);
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public void describirRol() {
        System.out.println(nombre + " es un empleado de " + edad + " años");
    }
}
