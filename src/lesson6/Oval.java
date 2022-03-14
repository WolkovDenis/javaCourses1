package lesson6;

public class Oval {
    private double radiusOval;
    private double radiusOval2;

    public void setRadiusOval(double radiusOval) {
        this.radiusOval = radiusOval;
    }

    public void setRadiusOval2(double radiusOval2) {
        this.radiusOval2 = radiusOval2;
    }
    public double areaOval(){
        return Math.PI * (radiusOval * radiusOval2);
    }
}
