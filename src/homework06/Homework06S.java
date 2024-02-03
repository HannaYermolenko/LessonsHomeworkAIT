package homework06;
//task 0
import java.util.Scanner;

public class Homework06S {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vvedite chislo 1 2    ");
        int input = scanner.nextInt(); // poluvhilimot polsovatelya

        if (input == 1){
            System.out.println("Vi vveli chislo 1");
        }else if (input == 2) {
            System.out.println("Vi vveli chislo 2" );
        }

    }
}
