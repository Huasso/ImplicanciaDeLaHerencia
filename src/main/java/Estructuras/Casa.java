package Estructuras;

import Personas.Persona;
import java.util.ArrayList;
import java.util.List;

public class Casa {

    private String direccion;
    private List<Persona> residentes;

    public Casa(String direccion) {
        this.direccion = direccion;
        this.residentes = new ArrayList<>();
    }

    public void agregarResidente(Persona persona) {
        this.residentes.add(persona);
    }

    public String getDireccion() {
        return direccion;
    }
}
