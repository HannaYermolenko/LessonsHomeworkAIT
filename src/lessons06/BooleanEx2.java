package lessons06;

public class BooleanEx2 {
    public static void main(String[] args) {
        // xor ^ logicheskoe
        // esli dve chasti rasnie to vidaet true

        boolean bl = true ^ false;
        System.out.println("true ^ false: " + bl);
        System.out.println("true ^ true: " + (false ^ true));
        System.out.println("true ^ true: " + (true ^ true));
        System.out.println("false ^ false: " + (false ^ false));

        // logicheskoe sokrashennoe I (and) - && - po vidavaevomy resultatu analigichno s &

        int a = 5;
        int b = 10;

        a = 1;

        boolean b2 = (a != 0) && (b / a > 5); // false & ()
        System.out.println("b/a>5  " + b2);

        // logicheskoe sokrachennoe ili || (or

        boolean b3 = (a == 0) && (b / a > 5); // a = 0 true|| ___
        System.out.println(" a == 0) && (b / a > 5)  " + b3);

        System.out.println("###########\n");

        System.out.println(true ^ true & false);
        System.out.println(true ^ false);
        System.out.println(true);

        // Poryadok vipolnenia logicheskisnoperacii

        /*
        1 = !; 2 - &; 3 - ^; 4 - |; 5 - &&; 6 - ||
         */
        System.out.println("##############\n");
        System.out.println(true ^ true && false);
        System.out.println(false && false);
        System.out.println(false);

        System.out.println("#############\n");
        boolean aa = true;
        boolean bb = false;
        int cc = 25;
        int gg = 2;

        //

        System.out.println(aa | bb | cc < 100 & !aa ^ gg ==5);
        System.out.println(true | false | 25 < 100 & !true ^ 2 ==5);
        System.out.println(true | false | true & !true ^ false);
        System.out.println(true | false | true & false ^ false);
        System.out.println(true | false | false);
        System.out.println(true | false);
        System.out.println(true );







    }
}
