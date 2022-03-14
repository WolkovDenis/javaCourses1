package lesson2;

public class HomeWork23112021 {
    public static void main(String[] args) {
        System.out.println("четные от 50 до 100");
        for (int i = 50; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("сумма четных чисел от 20 до 40");
        int summa = 0;
        for (int i = 20; i <= 40; i++) {
            if (i % 2 == 0) {
                summa += i;
            }
        }
        System.out.println(summa);

        System.out.println();
        System.out.println("вывести числа от 10 до 50,но не выводить от 20 до 25");
        for (int i = 10; i <= 50; i++) {
            if (i >= 20 && i <= 25) {
                continue;
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("вывести среднее значение всех нечетных чисел от 0 до 100");
        int rez = 0;
        int summa2 = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                summa2 += i;     // сумма нечетных чисел
                rez = summa2 % i;
            }
        }
        System.out.println(rez);
        System.out.println();
        System.out.println("вывести числа от -10 до - 40");
        for (int i = -10; i >= -40; i--) {
            System.out.print(i + " ");
        }
    }
}
