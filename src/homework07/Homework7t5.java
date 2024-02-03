package homework07;

import java.util.Random;

public class Homework7t5 {
    public static void main(String[] args) {
        Random random = new Random();
        int count  = 0;


         // int
        // while (i <= 100 && count < 7){ true && true
        //



        while (count <= 7){
            int randomNamber = random.nextInt(100)+1;
            if (randomNamber % 5 == 0)
                System.out.println(randomNamber);
            count++;

        }
    }
}
