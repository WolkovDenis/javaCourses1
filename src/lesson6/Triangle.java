package lesson6;

public class Triangle {
    int a;
    int b;
    int c;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int perimetrTriangle() {
        if (a > b + c || b > a + c || c > b + a) {
            System.out.println("Такого треугольника не существует");
            return 0;
        }
        return this.a + this.b + this.c;
    }

    public double areaTriangle() {
        int p = this.perimetrTriangle() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
