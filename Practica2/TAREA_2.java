
package Practica2;


public class TAREA_2 {

   
    public static void main(String[] args) {
        Punto p1 = new Punto(0, 3);
        Punto p2 = new Punto(4, 0);
        Linea linea = new Linea(p1, p2);
        Circulo circulo = new Circulo(p1, 5);

        System.out.println(p1);
        System.out.println(linea);
        System.out.println(circulo);
    }
    }
