package lessons08;

import java.util.Random;

public class Massiv {
    public static void main(String[] args) {
        Random random = new Random();
        int[] nums = new int[10];

        int k = 0;
        System.out.print("[");

        while (k < nums.length){
            nums[k] = random.nextInt(101);
            System.out.print(nums[k] + ", ");
            k++;
        }
        System.out.println("]");


        // naiti minimum ili maksimum

        k = 1;
        int min = nums[0];
        while (k < nums.length){
            if (nums[k] < min){
                min = nums[k];
            }
            k++;
        }
        System.out.println("min " + min);






    }
}
