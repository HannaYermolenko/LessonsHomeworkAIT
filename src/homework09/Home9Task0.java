package homework09;

import java.util.Random;

public class Home9Task0 {

    public static void main(String[] args) {

        //Заполните массив 20 случайными целыми числами.
        // Программа должна вывести на экран массив,
        // количество четных чисел в массиве и сумму всех четных чисел.

        Random random = new Random();
        int[] mas = new int[20];
        int i = 0;

        for (i = 0; i < mas.length; i++){
            mas[i] = random.nextInt(100);
            System.out.print(mas[i] + ", ");
        }
        System.out.println();

        int numbInteger = 0;
        int sumInteger = 0;
        int j = 0;
         for ( j = 0; j < mas.length; j++){
            if (mas[j]%2==0){
                numbInteger++;
                sumInteger += mas[j];
            }
        }
        System.out.println();
        System.out.println("Chetnie chisla: " + numbInteger);
        System.out.println("Summa chisel: " + sumInteger);






























    }






















}








