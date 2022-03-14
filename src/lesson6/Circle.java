package lesson6;

public class Circle {
    private int radius;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double perimetrCircle() {
        return 2 * Math.PI * radius;
    }

    public double areaCircle() {
        return Math.PI * (radius * radius);
    }
}
