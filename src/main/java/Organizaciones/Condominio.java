package Organizaciones;

import Estructuras.Casa;

import java.util.ArrayList;
import java.util.List;

public class Condominio extends Organizacion {

    private List<Casa> casas;

    public Condominio(String nombre) {
        super(nombre);
        this.casas = new ArrayList<>();
    }
}
