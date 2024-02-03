package homework06;

import java.util.Scanner;

public class HwTask03 {
    public static void main(String[] args) {
        // task2 ili 3

        Scanner scanner = new Scanner(System.in);

        System.out.println("vvedite 4zn chislo ");
        String number = scanner.nextLine();
        System.out.println(number);

        if (number.length() == 4) {
            // kod obrabotki stroki v 4 simvola

           // char ch0 = number.charAt(0);

            int leftSun = number.charAt(0) + number.charAt(1);
            int rithtSun = number.charAt(2) + number.charAt(3);
            System.out.println(leftSun);
            System.out.println(rithtSun);
            if (leftSun == rithtSun) {
                System.out.println("yra chislo sch");
            }else {
                System.out.println("net");
            }

        }else{
            System.out.println("vi vveli ne 4zn chislo");

        }

        // variant 2

        if (number.length() == 4){
            int digit = Integer.parseInt(number); // vitaskivaet is stroki chislo i sapisat
            System.out.println("poluchili chisli is stroki " + digit);

            // otkysit po 1 cifre
            // 1234

            int digit0 = digit % 10;
            digit = digit /10;

            // 123

            int digit1 = digit % 10;
            digit /=10;

            // 12
            int digit2 = digit % 10;
            int digit3 = digit / 10;

            System.out.println(digit0 + "|" + digit1 + "|" + digit2);

            if (digit0 + digit1 == digit2 + digit3){
                System.out.println("yra chislo schastl ");
            }



             }else {
            System.out.println("vi vveli ne 4x znachnoe chislo " );
        }
}

}
