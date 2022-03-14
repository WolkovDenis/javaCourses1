package lesson2;

public class Main1 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = 2;

        if (a == b && b == c && a == c){
            System.out.println("Это равносторонний треугольник");
        }
        if (a != b && b != c && a != c){
            System.out.println("Это разносторонний треугольник");
        }else {
            System.out.println("Это равнобедренный треугольник");
        }
    }
}
