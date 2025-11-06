package Animales;

public class Gato extends Animal {
    private String caracter;

    public Gato(String nombre, String caracter) {
        super(nombre);
        this.caracter = caracter;
    }


    @Override
    public void hacerSonido() {
        System.out.println(nombre + " (Gato) dice: Miau");
    }


    public void morder() {
        System.out.println(nombre + " esta mordiendo");
    }
}
