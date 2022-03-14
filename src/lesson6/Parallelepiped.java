package lesson6;

public class Parallelepiped {
    private int a1;
    private int b1;
    private int c1;

    public void setA(int a1) {
        this.a1 = a1;
    }

    public void setB(int b1) {
        this.b1 = b1;
    }

    public void setC(int c1) {
        this.c1 = c1;
    }

    public double volumeParallelepiped() {
        return this.a1 * this.b1 * this.c1;
    }

    public double areaParallelepiped() {
        return 2 * (a1 * b1 + b1 * c1 + a1 * c1);
    }
}
