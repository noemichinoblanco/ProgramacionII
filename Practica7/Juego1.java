package Practica7;

public class Juego1 {
    public static void main(String[] args) {
        System.out.println("Juego de adivinar el numero");
        juegoAdivinaNumero game = new juegoAdivinaNumero(3);
        game.juega();
    }
}

