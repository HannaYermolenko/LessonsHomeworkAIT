package lessons06;

import java.util.Locale;
import java.util.Scanner;


// Scannery varianty obcheniya s monitorom
public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.GERMANY);// menyaem lokaalizaciu
        scanner.useLocale(Locale.US);
        System.out.println("vvedite imy");
        String name = scanner.nextLine(); // chitaet stroky vvoda
        System.out.println("imy: " + name);

        System.out.println("vvedite vosrast: " + name);
        int age = scanner.nextInt(); // shituvaet chislo
        // scanner.nextLine()
        System.out.println("vvedite s zapatoi");
        double abl = scanner.nextDouble();

        System.out.println("poluch imu: " + name);
        System.out.println("vosrast: " + age);
        System.out.println("double: " + abl);





    }
}
