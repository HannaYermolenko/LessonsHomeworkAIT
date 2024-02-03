package homework06;

import java.util.Scanner;

public class homework06Pr {
    public static void main(String[] args) {

        //Task 0
        //
        //Необходимо написать программу,
        // где бы пользователю предлагалось
        // ввести число на выбор: 1, 2 или 3,
        // а программа должна сказать, какое число ввёл пользователь:
        // 1, 2, или 3

        Scanner tasko = new Scanner(System.in);
        System.out.println("Veedite na vibor: 1, 2 ili 3:  ");
        String vibor = tasko.nextLine();
        System.out.println("Vash vibor: " + vibor);




    }
}
