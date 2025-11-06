package Estructuras;

import Personas.Empleado;
import java.util.ArrayList;
import java.util.List;

public class Departamento {

    private String nombre;
    private List<Empleado> empleados;
    private List<GrupoProyecto> grupos;

    public Departamento(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
        this.grupos = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        this.empleados.add(empleado);
    }

    public void agregarGrupoProyecto(GrupoProyecto grupo) {
        this.grupos.add(grupo);
    }

    public String getNombre() {
        return nombre;
    }
}
