package Animales;

public class Perro extends Animal {
    private String color;

    public Perro(String nombre, String color) {
        super(nombre);
        this.color = color;
    }


    @Override
    public void hacerSonido() {
        System.out.println(nombre + " (Perro) dice: Guau");
    }


    public void ladrar() {
        hacerSonido();
    }
}
