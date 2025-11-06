package Organizaciones;

import Estructuras.Departamento;

import java.util.ArrayList;
import java.util.List;


public class Empresa extends Organizacion {

    private List<Departamento> departamentos;

    public Empresa(String nombre) {
        super(nombre);
        this.departamentos = new ArrayList<>();
    }

    public void agregarDepartamento(Departamento depto) {
        this.departamentos.add(depto);
    }
}