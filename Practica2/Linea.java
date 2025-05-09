
package Practica2;

public class Linea {
    public Punto p1;
    public Punto p2;

    public Linea(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public String toString() {
        return "Linea: " + p1.toString() + " -> " + p2.toString();
    }
}