package homework09;

import java.util.Scanner;

public class Home9Task1 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedite summu vklada:  ");
        float summa = scanner.nextFloat();
        System.out.println("Vvedite srok vklada: ");
        int mesyac = scanner.nextInt();


        if (summa > 0) {
            System.out.println("Summa vachego vklada: " + summa) ;
                     summa++;
        } else {
            System.out.println("Vi vveli nekorrektnuy summy");
        }
        System.out.println();


        if (mesyac > 0) {
            System.out.println("Srok vachego vklada: " + mesyac);
            mesyac++;
        } else {
            System.out.println("Vi vveli nekorektnyi srok: ");
        }



        for (int i = 0; i <= mesyac; i++){
            summa += summa * 0.07;
        }

        System.out.println("Summa vachego vklada k konzu sroka: " + summa);







    }











}









