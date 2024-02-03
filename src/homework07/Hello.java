package homework07;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("vvedite Hello");

        String hello = scanner.nextLine();

        while (!hello.equalsIgnoreCase("Hello")){

            System.out.println("Vvedite Hello (iz cikla)");
            hello = scanner.nextLine();
        }
        System.out.println("Spasibo");

        // option_02

        String hellooDo;
        do {
            System.out.println("Vvedite hello (do-while)");
            hellooDo = scanner.nextLine();
        }while (!hellooDo.equalsIgnoreCase("Hello"));

        System.out.println("Spasibo do svidaniya");
    }
}
