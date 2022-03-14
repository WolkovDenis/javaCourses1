package lesson8.figurs;

public class Krug extends Figura {
    private int radius;

    public Krug() {
    }

    public Krug(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void printPerimetr() {
        System.out.println("Периметр круга:" + " " + (2 * Math.PI * radius));
    }

    @Override
    public void printPlochad() {
        System.out.println("Площадь круга:" + " " + (Math.PI * (radius * radius)));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Krug krug = (Krug) o;

        return radius == krug.radius;
    }

    @Override
    public int hashCode() {
        return radius;
    }

    @Override
    public String toString() {
        return "Krug{" +
                "radius=" + radius +
                '}';
    }
}
