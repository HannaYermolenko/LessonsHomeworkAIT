package homework08;

import java.util.Scanner;

public class Home8T2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedite proisvolnoe vhislo ot 0+ ");

        int input = (int) scanner.nextLong();
         int sumOfdigits = 0;




         while (input>0){
             sumOfdigits += input % 10;
             input/=10;
         }
        System.out.println("Summa chisel " + sumOfdigits);

      /*  int nam = 10;
        String result;

        if (nam >= 0){
            result = "Polojitelnoe";
        }else {
            result = "Otrizatelnoe";
        }
        //result = (nam >= 10) ? "Polojitelnoe" : "Otrizatelnoe"
        //System.out.println("Nashe chislo " + result);

       */
















    }
}
