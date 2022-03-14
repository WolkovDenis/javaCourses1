package lesson6;

public class Cone {
    private double radiusCone;
    private double h;

    public void setRadiusCone(double radiusCone) {
        this.radiusCone = radiusCone;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double areaBaseCone() {
        return Math.PI * (radiusCone * radiusCone);
    }

    public double generatrixCone() {
        return 2 * (h * h + radiusCone * radiusCone);
    }

    public double lateralSurfaceAreaCone() {
        return Math.PI * radiusCone * this.generatrixCone();
    }

    public double areaCone() {
        return this.areaBaseCone() + this.lateralSurfaceAreaCone();
    }
}
