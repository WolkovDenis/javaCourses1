package lesson4;

public class Main5 {
    public static void main(String[] args) {
        String email = "ertgasd@gmail.com";

        if (email.indexOf("@") == -1) {
            System.out.println("Нет символа:@!");
            return;
        }
        if (email.indexOf(".") == -1) {
            System.out.println("Нет символа '.'!");
            return;
        }
        if (email.endsWith(".com") || email.endsWith(".ru")) {
        } else {
            System.out.println("Не содержит домен!");
        }
        if (email.startsWith(" ")) {
            System.out.println("Уберите пробел в начале email!");
        }
        if (email.endsWith(" ")) {
            System.out.println("Уберите пробел в конце email!");
        }
        System.out.println("Email введен правильно!");

    }
}
