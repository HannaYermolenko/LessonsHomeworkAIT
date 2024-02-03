package lessons09;

import java.util.Random;

public class Zadacha {
    public static void main(String[] args) {

        /// Создать массив случайной длины (от 5 до 15)
        // целых случайных чисел;
        //// Заполнить массив случайными числами в
        // диапазоне от -50 до 50;
        Random random = new Random();
        int[] nums = new int[random.nextInt(11) + 5];
        System.out.println("razner massiva  " + nums.length);

        System.out.println(" [ ");

        for (int i = 0; i < nums.length; i++){
            nums[i] = random.nextInt(101)-50;
            System.out.print(nums[i] + ((i < nums.length - 1) ? " , " : " ]\n" ));
        }








    }


}
