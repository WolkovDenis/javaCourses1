package lesson6;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("Выберите фигуру которую хотите посчитать");
        System.out.println("1-треугольник");
        System.out.println("2-круг");
        System.out.println("3-прямоугольный параллепипед");
        System.out.println("4-овал");
        System.out.println("5-конус");
        Scanner scanner = new Scanner(System.in);
        int selectedFigura = scanner.nextInt();
        switch (selectedFigura) {
            case 1:
                System.out.println("Введите сторону A:");
                int a = scanner.nextInt();
                System.out.println("Введите сторону B:");
                int b = scanner.nextInt();
                System.out.println("Введите сторону C:");
                int c = scanner.nextInt();
                Triangle triangle = new Triangle();
                triangle.setA(a);
                triangle.setB(b);
                triangle.setC(c);
                if (triangle.areaTriangle() != -1) {
                    System.out.println("Площадь треугольника =" + triangle.areaTriangle());
                    System.out.println("Периметр треугольника =" + triangle.perimetrTriangle());
                }
                break;
            case 2:
                System.out.println("Введите радиус");
                int radius = scanner.nextInt();
                Circle circle = new Circle();
                circle.setRadius(radius);
                System.out.println("Площадь круга =" + circle.areaCircle());
                System.out.println("Периметр круга =" + circle.perimetrCircle());
                break;

            case 3:
                System.out.println("Введите ребро A:");
                int a1 = scanner.nextInt();
                System.out.println("Введите ребро B:");
                int b1 = scanner.nextInt();
                System.out.println("Введите ребро C:");
                int c1 = scanner.nextInt();
                Parallelepiped parallelepiped = new Parallelepiped();
                parallelepiped.setA(a1);
                parallelepiped.setB(b1);
                parallelepiped.setC(c1);
                System.out.println("Объем параллепипеда =" + parallelepiped.volumeParallelepiped());
                System.out.println("Площадь поверхности параллепипеда =" + parallelepiped.areaParallelepiped());
                break;
            case 4:
                System.out.println("Введите малую полуось:");
                double radiusOval = scanner.nextInt();
                System.out.println("Введите большую полуось:");
                double radiusOval2 = scanner.nextInt();
                Oval oval = new Oval();
                oval.setRadiusOval(radiusOval);
                oval.setRadiusOval2(radiusOval2);
                System.out.println("Площадь овала =" + oval.areaOval());
                break;
            case 5:
                System.out.println("Введите радиус конуса:");
                double radiusCone = scanner.nextInt();
                System.out.println("Введите высоту конуса:");
                double h = scanner.nextInt();
                Cone cone = new Cone();
                cone.setRadiusCone(radiusCone);
                cone.setH(h);
                System.out.println("Площадь основания конуса =" + cone.areaBaseCone());
                System.out.println("Образующая конуса =" + cone.generatrixCone());
                System.out.println("Площадь боковой поверхности конуса =" + cone.lateralSurfaceAreaCone());
                System.out.println("Площадь конуса =" + cone.areaCone());
                break;
            default:
                System.out.println("такой фигуры нет");
        }
    }
}