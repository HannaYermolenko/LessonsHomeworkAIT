package homework03;

public class HomeWork03 {
    // aufgabe 1
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 2;
        int d = 3;
        int e = 4;
        int f = 5;
        int g = 6;
        int h = 7;
        int k = 8;
        int l = 9;
        int result;
        result = a + b + c + d + e + f + g + h + k + l;
        System.out.println(result / 10);
        System.out.println("resultRest: " + result % 10);

        int numb =  a + b + c + d + e + f + g + h + k + l;
        int numb2 = 10;
        double resultat;
        resultat = numb / (double) numb2;
        System.out.println("Srednee arifmet: " + resultat);


        System.out.println("################\n");

        // aufgabe 2

        double pans = 1000;
        double shirt = 500;
        double zus = pans + shirt;
        int disc = 10;
        System.out.println("Prise with discount: " + (zus - (zus * disc / 100)));
        System.out.println("Diskount is: " + (zus * disc / 100));

        System.out.println("################\n");

        // Aufgabe 3

        int tM = 2;
        int tT = 0;
        int tW = - 2;
        int tTh = - 3;
        int tF = 2;
        int tS = 1;
        int tSun = 0;
        double middle = ((double) tM + tT + tW + tTh + tF + tS + tSun) / 7;

        System.out.println("The middle temperature in Wiesbaden:  " + middle);

        System.out.println("################\n");

        // aufgabe 4

        System.out.println("Delenie 5 na 2: " + 5 / 2);
        System.out.println("Ostatok: " + 5 % 2);

        System.out.println("Delenie 47 na 3: " + 47 / 3);
        System.out.println("Ostatok: " + 47 % 3);

        System.out.println("Delenie 999 na 2: " + 999 / 2);
        System.out.println("Ostatok: " + 999 % 2);

        System.out.println("Delenie 875 na 3: " + 875 / 3);
        System.out.println("Ostatok: " + 875 % 3);

        System.out.println("################\n");

        // aufgabe 5

        int x = 3;
        System.out.println(x += x++);







    }
}
