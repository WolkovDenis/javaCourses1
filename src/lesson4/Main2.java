package lesson4;

public class Main2 {
    public static void main(String[] args) {
        String text = "";
        for (int i = 0; i < 10000; i++) {
            text = text + i;
        }
        System.out.println(text);
    }
}
