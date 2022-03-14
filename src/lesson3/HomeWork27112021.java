package lesson3;

public class HomeWork27112021 {
    public static void main(String[] args) {
        System.out.println("Сумма четных чисел массива");
        int count = 0;
        int count1 = 0;
        int summa = 0;
        int[] nums = new int[]{4, 7, 36, 562, 543, 87, 98, 23, 9, 21,2};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                summa += nums[i];
            }
        }
        System.out.println("Сумма четных чисел:" + summa);
        System.out.println();
        System.out.println("Каких чисел больше в массиве?Четных или нечетных");
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                count1++;
            }
        }
        if (count > count1) {
            System.out.println("Четных чисел больше.Их кол-во:" + count);
        } else {
            System.out.println("Нечетных чисел больше.Их кол-во:" + count1);
        }
        System.out.println();
        System.out.println("Вывод через ячейку");
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > i || nums[i] < i) {
                System.out.print(nums[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Вывод гласных из массива");
        char[] symbol = {'о', 'м', 'ы', 'н', 'ю', 'и', 'д', 'у', 'а', 'р'};
        char[] vowels = {'а', 'у', 'о', 'ы', 'и', 'э', 'я', 'ю', 'е'};// Создал массив с глассными
        for (int i = 0; i < symbol.length; i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (symbol[i] == vowels[j]) {
                    System.out.print(symbol[i] + " ");
                }
            }
        }
    }
}

