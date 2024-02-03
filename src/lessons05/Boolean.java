package lessons05;

public class Boolean {
    public static void main(String[] args) {

        int x = 10;
        int y = 5;

        boolean bol1;
        bol1 = true;
        bol1 = false;

        // sravnenie na ravenstvo ==
        bol1 = x == y; // x = y ytvergdenie neverno
        System.out.println("x=y  " + bol1);

        bol1 = x == 10; // x raven 10
        System.out.println("x=10  " + bol1);

        // sravnenie na neravenstvo

        boolean bol2 = x != y;
        System.out.println("x ne raven y " + bol2);

        bol2 = 10 != x; // 10 ne raven 10
        System.out.println("x ne raven 10  " + bol2);

        // sravnenie na velicheny
        boolean bol3 = x > y;
        System.out.println("x > y " + bol3);

        bol3 = x > 10;
        System.out.println("x>10  " + bol3);

        // bolshe  ili ravno >=
        boolean bol4 = x >= y;
        System.out.println("x >= y  " + bol4);
        bol4 = x >= 10;
        System.out.println("x >= 10  " + bol4);

        // mensche chem <
        boolean bol5 = x < y;
        System.out.println("x < y " + bol5);

        // mensche ili ravno <=
         boolean bol6 = x <= 10;
        System.out.println("x <= 10 " + bol6);

        // Logicheskie operacii
        // ! logicheskoe otricanie
        boolean bol7 = true;
        System.out.println("true " + bol7);
        bol7 = !true;
        System.out.println("!true " + bol7);
        System.out.println("!false " + !false);

        System.out.println("! (4=5) " + !(4==5)); // 4 ravno 5 - false - invertiruem !false - true

        // logicheskoe I and &
        // berlin germaniya i rim franciya - true i false - false
        //  berlin germaniya i rim italiya - true i true - true

        boolean bol8 = (2 < 5) & (11 == 10);
        System.out.println("(2 < 5) & (11 = 10) " + bol8);

        bol8 = (2 < 5) & (11 != 10);
        System.out.println(bol8);

        // logicheskoe Ili (or) vosvrashaet true esli xotyabi odna true
        // berlin germaniya ili rim franciya - true i false - true
        //  berlin germaniya ili rim italiya - true i true - true
        // false ili false = false

        boolean bol9 = (2 < 5) | (11 == 10); // true | false = true
        System.out.println("(2 < 5) | (11 == 10) " + bol9);

        bol9 = (2 > 5) | (11 == 10); // false | false = false
        System.out.println("(2 > 5) | (11 == 10) " + bol9);














    }
}
