package lesson2;

public class Main6 {
    public static void main(String[] args) {
        // 100 - 150 : делятся на 3 и на 5

        for (int i = 100; i <= 150; i++) {
            if (i % 3 == 0 && (i % 5) == 0){
                System.out.println(i);
            }
        }
    }
}
