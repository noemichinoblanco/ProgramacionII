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

    public void aumentarPrecio(double incremento) {
        this.precio += incremento;
    }

    @Override
    public String toString() {
        return "Anuncio{" + "numero=" + numero + ", precio=" + precio + '}';
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

    public Artista getA1() {
        return a1;
    }

    public Artista getA2() {
        return a2;
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
        return "Pintura{" + "titulo=" + titulo + ", genero=" + genero + ", anuncio=" + anuncio + '}';
    }
}

public class Main {
    public static void main(String[] args) {
      
        Artista ar1 = new Artista("Luis", "123", 7);
        Artista ar2 = new Artista("Ana", "456", 10);
        Artista ar3 = new Artista("Mario", "789", 3);
        Artista ar4 = new Artista("Luis", "321", 5);

        Anuncio an1 = new Anuncio(1, 1500);
        Anuncio an2 = new Anuncio(2, 2000);

        Pintura p1 = new Pintura("Montaña", "Oleo", ar1, ar2, an1, "Paisaje");
        Pintura p2 = new Pintura("Mar", "Acrílico", ar3, ar4, an2, "Marino");

        System.out.println("Pintura 1: " + p1);
        System.out.println("Pintura 2: " + p2);

        double promedio = (ar1.getAñosExperiencia() + ar2.getAñosExperiencia() +
                           ar3.getAñosExperiencia() + ar4.getAñosExperiencia()) / 4.0;
        System.out.println("Promedio de años de experiencia: " + promedio);

        double incremento = 500;
        if (p1.getA1().getNombre().equals("Luis") || p1.getA2().getNombre().equals("Luis")) {
            p1.getAnuncio().aumentarPrecio(incremento);
        }
        if (p2.getA1().getNombre().equals("Luis") || p2.getA2().getNombre().equals("Luis")) {
            p2.getAnuncio().aumentarPrecio(incremento);
        }

        System.out.println("Pinturas con precio actualizado:");
        System.out.println("Pintura 1: " + p1);
        System.out.println("Pintura 2: " + p2);
    }
}

