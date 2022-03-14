package lesson6;

public class Main {
    public static void main(String[] args) {
        Triangle treugolnik1 = new Triangle();
        Triangle treugolnik2 = new Triangle();

        treugolnik1.setA(12);
        treugolnik1.setB(10);
        treugolnik1.setC(12);

        treugolnik2.setA(5);
        treugolnik2.setB(6);
        treugolnik2.setC(7);

        System.out.println(treugolnik1.areaTriangle());
        System.out.println(treugolnik2.areaTriangle());
    }
}
