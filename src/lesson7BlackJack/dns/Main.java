package lesson7BlackJack.dns;

public class Main {
    public static void main(String[] args) {

        Otziv otziv1 = new Otziv();
        otziv1.setRate(5);
        otziv1.setMainText("Очень хороший товар,рекомендую");
        otziv1.setUsername("qwerty_user");

        Otziv otziv2 = new Otziv();
        otziv2.setRate(4);
        otziv2.setMainText("Нет технической документации");
        otziv2.setUsername("papa_djony");

        Tovar elka = new Tovar();
        elka.setName("Елка 2 метра");
        elka.setFullPrice(2000);
        elka.setSalePrice(1400);
        elka.addOtziv(otziv1);
        elka.addOtziv(otziv2);
    }
}
