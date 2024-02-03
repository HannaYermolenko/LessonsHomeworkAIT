package homework09;

import java.util.Random;

public class Home9T2 {

    public static void main(String[] args){



        Random random = new Random();
        int[] mas = new int[50];

      //  long start = System.currentTimeMillis(); // izmeryaet potrachennoe vremya



        System.out.println("Slychainie chisla: ");
        int i =0;
        for (i=0; i< mas.length; i++){
            mas [i] = random.nextInt(100);
            System.out.print(mas[i] + ", ");
        }
        System.out.println();

        System.out.println("Prostie chisla v amassive:");
        int numbers = 0;
        int j =0;
        for (j=0; j< mas.length; j++){
            if (Prime(mas[j])) {
                System.out.print(mas[j] + ", ");
                numbers++;
            }
        }
        System.out.println();
        System.out.println("Kolichestvo; " + numbers);

        }
    public static boolean Prime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <=Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;

            }
        }
        return true;





    }
















}











