package homework08;

import java.util.Random;

public class Home8T3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numb = new int[8];
        int j = 0;

        while (j < numb.length){
            numb[j] = random.nextInt(100);
            System.out.print(numb[j] + ", ");
            j++;
        }

        System.out.print("##########\n");

        j = 0;
        int min = numb[0];
        while (j < numb.length){
            if (numb[j]<min){
                min = numb[j];
            }
            j++;
        } System.out.println("Minimum = " + min);

        j = 0;
        int max = numb[0];
        while (j < numb.length){
            if (numb[j] > max){
                max = numb[j];
            }
            j++;

        }
        System.out.println("Maksimalno = " + max);

        j = 0;
        int sum = 0;
        while (j < numb.length){
            sum += numb[j];
            j++;
        }
        double srednee = (double) sum/numb.length;
        System.out.println("Srednee arifmeticheskoe = " + srednee);






    }
}
