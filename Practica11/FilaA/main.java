package main;
class Anuncio {
    private int numero;
    private double precio;

    public Anuncio(int numero, double precio) {
        this.numero = numero;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Anuncio [numero=" + numero + ", precio=" + precio + "]";
    }
}

class Artista {
    private String nombre;
    private String ci;
    private int añosExperiencia;

    public Artista(String nombre, String ci, int añosExperiencia) {
        this.nombre = nombre;
        this.ci = ci;
        this.añosExperiencia = añosExperiencia;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public String getNombre() {
        return nombre;
    }
}

class Obra {
    protected String titulo;
    protected String material;
    protected Artista a1;
    protected Artista a2;
    protected Anuncio anuncio;

    public Obra(String titulo, String material, Artista a1, Artista a2, Anuncio anuncio) {
        this.titulo = titulo;
        this.material = material;
        this.a1 = a1;
        this.a2 = a2;
        this.anuncio = anuncio;
    }

    public Anuncio getAnuncio() {
        return anuncio;
    }

    public void setAnuncio(Anuncio anuncio) {
        this.anuncio = anuncio;
    }

    public Artista getArtistaMasExperiencia() {
        return (a1.getAñosExperiencia() > a2.getAñosExperiencia()) ? a1 : a2;
    }

    public double getPrecioVenta() {
        return (anuncio != null) ? anuncio.getPrecio() : 0;
    }
}

class Pintura extends Obra {
    private String genero;

    public Pintura(String titulo, String material, Artista a1, Artista a2, Anuncio anuncio, String genero) {
        super(titulo, material, a1, a2, anuncio);
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Pintura [titulo=" + titulo + ", genero=" + genero + "]";
    }
}

public class Main {
    public static void main(String[] args) {

        Artista art1 = new Artista("Carl", "123", 5);
        Artista art2 = new Artista("Ana", "456", 10);
        Artista art3 = new Artista("Luis", "789", 8);
        Artista art4 = new Artista("Sofí", "101", 3);

        
        Anuncio anuncio1 = new Anuncio(1, 1500.0);

        Pintura pinturaConAnuncio = new Pintura("Atardecer", "Oleo", art1, art2, anuncio1, "Paisaje");
        Pintura pinturaSinAnuncio = new Pintura("Retrato", "Acrílico", art3, art4, null, "Retrato");

        System.out.println("Pintura con anuncio: " + pinturaConAnuncio);
        System.out.println("Pintura sin anuncio: " + pinturaSinAnuncio);

        
        Artista masExperto1 = pinturaConAnuncio.getArtistaMasExperiencia();
        Artista masExperto2 = pinturaSinAnuncio.getArtistaMasExperiencia();

        System.out.println("Artista con más experiencia en pintura 1: " + masExperto1.getNombre());
        System.out.println("Artista con más experiencia en pintura 2: " + masExperto2.getNombre());

        
        Anuncio anuncio2 = new Anuncio(2, 2000.0);
        pinturaSinAnuncio.setAnuncio(anuncio2);

        double total = pinturaConAnuncio.getPrecioVenta() + pinturaSinAnuncio.getPrecioVenta();
        System.out.println("Total de venta de ambas pinturas: $" + total);
    }
}
