package homework06;


public class Homework06 {
    public static void main(String[] args) {
        // Task 1
        //
        //Запишите в 4 переменные случайные числа от 0 до 100
        //Выведите все 4 на экран
        //Программа должна определить максимальное из этих четырех чисел
        //Результат вывести на экран

        int x = (int) (Math.random() * 100);
        int y = (int) (Math.random() * 100);
        int z = (int) (Math.random() * 100);
        int k = (int) (Math.random() * 100);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        System.out.println("k = " + k);

        if (x > y & x > z & x > k){
            System.out.println("maxNumber: " + x);
        }else if (y > x & y > z & y > k){
            System.out.println("maxNumber: " + y);
        }else if (z > x & z > y & z > k){
            System.out.println("maxNumber: " + z);
        }else if (k > x & k > y & k > z){
            System.out.println("maxNumber: " + k);
        }
        System.out.println("Konex programmi");


    }
}
