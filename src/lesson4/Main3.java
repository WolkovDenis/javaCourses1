package lesson4;

public class Main3 {
    public static void main(String[] args) {
        String password = "qwerty";

        int countChars = password.length();
        if (countChars < 8) {
            System.out.println("Символов меньше 8");
            return;
        }
        String alfabetUpper = "abcdefghijklmnopqrstuvwxyz".toLowerCase();
        int countUpperLetter = 0;
        for (int i = 0; i < password.length(); i++) {
            char currentCharFromPassword = password.charAt(i);
            if (alfabetUpper.contains(currentCharFromPassword + "")) {
                countUpperLetter++;
            }
        }
        if (countUpperLetter == 0) {
            System.out.println("Пароль не содержит заглавную букву");
            return;
        }
    }
}
