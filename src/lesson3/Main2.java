package lesson3;

public class Main2 {
    public static void main(String[] args) {
        char[] abcd = {'a', 'b', 'c', 'd'};
        char[] qwer = {'q', 'w', 'e', 'r'};

         char[] abcdqwer = new char[abcd.length + qwer.length];

        for (int i = 0; i < abcdqwer.length; i++) {
            if (i < abcd.length) {
                abcdqwer[i] = abcd[i];
            } else {
                abcdqwer[i] = qwer[i - abcd.length];
            }
            System.out.print(abcdqwer[i] + " ");
        }
    }
}