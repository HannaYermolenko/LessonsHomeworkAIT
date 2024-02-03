package homework07;

import java.util.Scanner;

public class Homework07t2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Vvedite na vibor chislo ot 1 do 7..");
       int number = scanner.nextInt();

        switch (number){
            case 1:
                System.out.println("Ponedelnik(( ");
                break;
            case 2:
                System.out.println("Vtornik( ");
                break;
            case 3:
                System.out.println("Sreda |   ");
                break;
            case 4:
                System.out.println("Chetverg * ");
                break;
            case 5:
                System.out.println("Pyatniza *** ");
                break;
            case 6:
            case 7:
                System.out.println("Vihodnoy ))) ");
                break;
            default:
                System.out.println("Vi vveli nepravilnii kod.. vzriv cheres 3.2.1...");



        }


    }
}
