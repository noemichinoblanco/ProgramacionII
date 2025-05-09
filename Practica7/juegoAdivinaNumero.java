package Practica7;
import java.util.Scanner;

public class juegoAdivinaNumero extends Juego {
    Scanner te = new Scanner(System.in);
    private int nroAdivinar;

    public juegoAdivinaNumero(int nroVidas){
        super(nroVidas);
    }
    public void juega(){
        super.reiniciarPartida();
        this.nroAdivinar = (int)(Math.random() * 11); 
        
        while (true) {
            System.out.print("Ingresa un numero del 0 al 10: ");
            int numero = te.nextInt();

            if (numero == this.nroAdivinar) {
                System.out.println("Acertaste! (Record = " + this.record + ")");
                super.actualizaRecord();
                break;
            } else {
                if (numero > this.nroAdivinar) {
                    System.out.println("El número a adivinar es menor, vidas restantes: " + (this.nroVidas - 1));
                } else {
                    System.out.println("El número a adivinar es mayor, vidas restantes: " + (this.nroVidas - 1));
                }

                if (!super.quitaVida()) {
                    System.out.println("Te has quedado sin vidas. Juego terminado.");
                    break;
                }
                super.actualizaRecord();
            }
        }

        System.out.println("---------------------------");
        System.out.println("Juego Terminado \n Record: " + this.record);
    }

    public int getNroAdivinar() {
        return nroAdivinar;
    }

    public void setNro(int x){
        this.nroAdivinar = x;
    }
}
