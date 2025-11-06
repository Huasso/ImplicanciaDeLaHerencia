package Estructuras;

import Personas.Empleado;
import java.util.ArrayList;
import java.util.List;


public class GrupoProyecto {

    private String nombre;
    private List<Empleado> miembros;


    private static final int LIMITE_MIEMBROS = 5;

    public GrupoProyecto(String nombre) {
        this.nombre = nombre;
        this.miembros = new ArrayList<>();
    }


    public void agregarMiembro(Empleado empleado) {
        if (this.miembros.size() < LIMITE_MIEMBROS) {
            this.miembros.add(empleado);
            System.out.println(empleado.getNombre() + " se unio al grupo " + this.nombre);
        } else {
            System.out.println("El grupo " + this.nombre + " ya esta lleno ");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrarMiembros() {
        System.out.println(" Miembros del Grupo: " + this.nombre + " ");
        for (Empleado emp : this.miembros) {
            System.out.println("- " + emp.getNombre());
        }
    }
}
