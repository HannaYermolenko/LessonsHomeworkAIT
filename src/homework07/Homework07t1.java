package homework07;

import java.util.Scanner;

public class Homework07t1 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.println("Vvedite chislo 1 2 3");
        int input = scanner.nextInt();







       switch (input){
            case 1:
            System.out.println("Polsovatel vvel odin "  );
            break;
            case 2:
                System.out.println("Polsovatel vvel dva"  );
                break;
            case 3:
                System.out.println("Polsovatel vvel tri"  );
                break;
            default:
                System.out.println("Polsovatel vvel nepravilnie dannie");
        }

    }
}
