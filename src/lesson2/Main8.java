package lesson2;

public class Main8 {
    public static void main(String[] args) {
        int money = 100000;
        int prozent = 7;
        int year = 5;

        for (int month = 0; month <= year * 12; month++) {
            money = money + ((money / 100 * prozent) / 12);
        }
        System.out.println(money);
    }
}
