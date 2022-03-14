package lesson8.figurs;

public class Main {
    public static void main(String[] args) {
        Kvadrat kvadrat1 = new Kvadrat(4);
        Kvadrat kvadrat2 = new Kvadrat(5);

        Krug krug1 = new Krug(3);
        Krug krug2 = new Krug(7);

        Figura[] figuras = new Figura[4];
        figuras[0] = kvadrat1;
        figuras[1] = krug1;
        figuras[2] = krug2;
        figuras[3] = kvadrat2;
        for (Figura figura : figuras) {
            figura.printPerimetr();
        }
    }
}
