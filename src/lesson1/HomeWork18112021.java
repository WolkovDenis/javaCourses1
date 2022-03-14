package lesson1;

public class HomeWork18112021 {
    public static void main(String[] args) {
        int money = 1000;
        int pizzaPrize = 230;
        int gumPrize = 26;
        double prizeCandy = 2.5;

        System.out.println("На эти деньги мы можем купить:");

        int amountOfPizza = money / pizzaPrize;
        System.out.println(amountOfPizza + "-Пиццы ");
        int change1 = money - (pizzaPrize * (money / pizzaPrize));

        int amountOfGum = change1 / gumPrize;
        System.out.println(amountOfGum + "-Жвачки");
        int change2 = change1 - (gumPrize * (change1 / gumPrize));

        double amountOfCandy = change2 / prizeCandy;
        System.out.println(amountOfCandy + "-конфет");

        int change3 = change1 - (gumPrize * (change1 / gumPrize));
        System.out.println("Сдача с магазина:" + change3 + "рубля.");
    }

}
