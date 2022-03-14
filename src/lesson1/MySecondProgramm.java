package lesson1;

public class MySecondProgramm {
    public static void main(String[] args) {
        int a = 8;
        int b = 8;
        int c = 8;

        boolean isRavnostoroniyTriangle = a == b && b == c && a == c;
        System.out.println(isRavnostoroniyTriangle);
    }
}
