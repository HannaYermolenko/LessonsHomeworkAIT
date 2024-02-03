package homework05;

public class HomeworkBol5 {

    public static void main(String[] args) {
        //Создайте переменную типа int.
        //Инициализируйте переменную произвольным значением
        //Выведите строку в формате:
        // Aufgabe 4

       int x = 6;
       int y = 3;
        boolean bol1;
        bol1 = true;
        bol1 = false;
        bol1 = x%2==0;
        System.out.println("6 chetnoe chislo: " + bol1);
        bol1 = x%3== 0;
        System.out.println("6 delitsya na 3: " + bol1);
        bol1 = (x%2== 0) & (x%3== 0);
        System.out.println("Dva usloviya: " + bol1);

        boolean bol2;
        bol2 = true;
        bol2  = false;
        bol2 = y%2==0;
        System.out.println("3 chetnoe chislo: " + bol2);
        bol2 = y%3==0;
        System.out.println("3 delitsya na 3: " + bol2);
        bol2 = (y%2==0) & (y%3==0);
        System.out.println("Dva usloviya: " + bol2);

        // rand = 0
     // boolean isEven = (rand != 0) & (rand % 2 == 0) - 0 ne schitaetsa
     //



    }
}
