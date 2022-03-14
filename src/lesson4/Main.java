package lesson4;

public class Main {
    public static void main(String[] args) {
        int[][] mass = new int[8][8];
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                if (i <= j) {
                    System.out.print(mass[i][j] + " ");
                } else {
                    System.out.println(" " + " ");
                }
            }
            System.out.println();
        }
    }
}
