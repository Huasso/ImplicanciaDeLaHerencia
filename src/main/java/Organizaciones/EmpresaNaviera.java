package Organizaciones;

import java.util.ArrayList;
import java.util.List;

public class EmpresaNaviera extends Empresa {

    private List<String> flotaDeBarcos;

    public EmpresaNaviera(String nombre) {
        super(nombre);

        this.flotaDeBarcos = new ArrayList<>();
    }

    public void agregarBarco(String nombreDelBarco) {
        this.flotaDeBarcos.add(nombreDelBarco);
        System.out.println("El barco '" + nombreDelBarco + "' se unio a la flota de " + this.nombre);
    }

    public void mostrarFlota() {
        System.out.println("Flota de: " + this.nombre);
        for (String barco : this.flotaDeBarcos) {
            System.out.println("- " + barco);
        }
    }
}