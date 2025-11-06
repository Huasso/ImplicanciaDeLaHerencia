package Vehiculos;

public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String marca, String modelo, int cilindrada) {
        super(marca, modelo);
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Moto " + marca + " " + modelo + " (" + cilindrada + "cc)";
    }
}