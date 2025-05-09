package Practica7;

public class Juego {
    protected int nroVidas;
    protected int record;
    
    public Juego(int vidas){
        this.nroVidas = vidas;
        this.record = vidas;
    }
    public void reiniciarPartida(){
        this.record = this.nroVidas;
    }

    public void actualizaRecord(){
        this.record = this.record - 1;
    }

    public boolean quitaVida(){
        this.nroVidas = this.nroVidas - 1;
        return this.nroVidas > 0;
    }
    public int getNroVidas() {
        return nroVidas;
    }
    public int getRecord() {
        return record;
    }
    public void setNroVidas(int nroVidas) {
        this.nroVidas = nroVidas;
    }

    public void setRecord(int record) {
        this.record = record;
    }
}
