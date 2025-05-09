package Practica8;

public class MultipleHerencia {   
}

class A {
    protected int x, z;

    public A(int x, int z) {
        this.x = x;
        this.z = z;
    }

    public void incrementaXZ() {
        x++;
        z++;
    }

    public void incrementaZ() {
        z++;
    }
}

class B {
    protected int y, z;

    public B(int y, int z) {
        this.y = y;
        this.z = z;
    }

    public void incrementaYZ() {
        y++;
        z++;
    }

    public void incrementaZ() {
        z++;
    }
}

class D {
    private A a;
    private B b;
    private int z;

    public D(int x, int y, int z) {
        a = new A(x, z);
        b = new B(y, z);
        this.z = z;
    }

    public void incrementaXYZ() {
        a.x++;
        b.y++;
        z++;
        a.incrementaZ(); // Llamada al método de una clase "heredada" (A)
    }

    public void incrementaXZ() {
        a.incrementaXZ();
        z++;
    }

    public void incrementaYZ() {
        b.incrementaYZ();
        z++;
    }

    public void mostrar() {
        System.out.println("x = " + a.x + ", y = " + b.y + ", z = " + z);
    }

    public static void main(String[] args) {
        System.out.println("noemi chino blanco");

        D va = new D(1, 2, 3);
        va.mostrar();            
        va.incrementaXYZ();
        va.mostrar();            
        va.incrementaXZ();
        va.mostrar();            
        va.incrementaYZ();
        va.mostrar();       
    }
}
