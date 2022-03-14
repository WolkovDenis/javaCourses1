package lesson1;

public class MyFirstProgramm {
    public static void main(String[] args) {
        int sum = 1000;
        int pizza = 230;
        int gum = 25;
        double candy = 2.5;

        int vsegoPizza = sum / pizza;
        int zdacha = sum % pizza;

        int vsegoGum = (zdacha) / gum;
        double vsegoCandy = (sum - (pizza * vsegoPizza + gum * vsegoGum));
        double sdacha = (sum - (vsegoPizza * pizza + vsegoGum * gum));
        System.out.println("На" + " " + sum + " " + "рублей мы можем купить:" + vsegoPizza + "пиццы," + vsegoGum + "жвачки," + Math.floor(vsegoCandy) + "конфет");
        System.out.println("Ваша сдача с магазина:" + sdacha + "рубля");
    }
}
