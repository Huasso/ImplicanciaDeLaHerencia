import Personas.*;
import Animales.*;
import Vehiculos.*;
import Estructuras.*;
import Organizaciones.*;

public class APP {

    public void iniciar() {
        System.out.println("--- 🚀 INICIO CASO 1: NIÑOS Y MASCOTAS ---");
        this.ejecutarCaso1();
        System.out.println("--- 🏁 FIN CASO 1 ---");

        System.out.println("\n");

        System.out.println("--- 🚢 INICIO CASO 2: EMPLEADOS Y EMPRESA ---");
        this.ejecutarCaso2();
        System.out.println("--- 🏁 FIN CASO 2 ---");
    }

    private void ejecutarCaso1() {
        Niño sofia = new Niño("Sofia", 6);
        Niño pablo = new Niño("Pablo", 10);
        Perro firulais = new Perro("Firulais", "cafe");

        sofia.agregarMascota(firulais);
        pablo.agregarMascota(firulais);

        System.out.println("Mascotas de Sofia:");
        firulais.hacerSonido();
    }


    private void ejecutarCaso2() {
        EmpresaNaviera tesorosDelMar = new EmpresaNaviera("Tesoros del Mar S.A.");
        Departamento ventas = new Departamento("Ventas");
        tesorosDelMar.agregarDepartamento(ventas);
        tesorosDelMar.agregarBarco("El Perla Negra");

        tesorosDelMar.mostrarFlota();
    }
}
