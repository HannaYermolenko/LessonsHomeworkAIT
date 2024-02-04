package homework14;

import java.util.Random;

public class Home14T5 {
    public static void main(String[] args) {
       int[] origin = new int[] {50, 50 ,50 ,50 ,50};

       int suma = sumNumbers(origin);
        System.out.println(suma);


    }

    public static int sumNumbers(int[] array){
        int result = 0;
        for (int i = 0; i < array.length; i++){
            result += array[i];
        }
        return result;
    }




}
