package lesson3;

public class Main1 {
    public static void main(String[] args) {
        int[] nums = {3, 6, 4, 6, 7, 6, 4, 5};
        System.out.println(7);
        System.out.println(6);
        System.out.println(5);
        System.out.println(4);
        System.out.println(3);
        System.out.println(2);
        System.out.println(1);
        System.out.println(0);

        for (int i = nums.length - 1; i >= 0; i--){
            System.out.print(nums[i] + " ");
        }
    }
}
