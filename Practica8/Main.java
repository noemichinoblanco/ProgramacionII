
package Practica8;
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

    public D(int x, int y, int z) {
        a = new A(x, z);
        b = new B(y, z);
    }

    public void incrementaXYZ() {
        a.x++;
        b.y++;
        a.z++;
        b.z++; 
    }
}}
