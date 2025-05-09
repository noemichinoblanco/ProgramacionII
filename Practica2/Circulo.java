
package Practica2;

public class Circulo {
    public Punto centro;
    public float radio;

    public Circulo(Punto centro, float radio) {
        this.centro = centro;
        this.radio = radio;
    }

    public String toString() {
        return "Circulo: Centro " + centro.toString() + ", Radio " + radio;
    }
}