package lessons04;

public class Les04 {
    public static void main(String[] args) {
        char a = 'A'; // tolko 1 simbol
        char a1 = 65; // peremennaya bukva A
        char a2 = 0x0041; //
        a2 = 0x41;
        char a3 = '\u0041';


        System.out.println("a: " + a);
        System.out.println("a1: " + a1);
        System.out.println("a2: " + a2);
        System.out.println("a3: " + a3);

        char digit0 = 48;
        System.out.println("didgit0  " + digit0);
        digit0++;
        digit0 += 4;
        System.out.println("didgit0 " + digit0);

        char symbolZ = 90;
        System.out.println("symbolZ  " + --symbolZ);

        char smallA = 97;
        System.out.println("smallA  " + smallA);

        smallA = (char) (smallA + 10);
        System.out.println("smallA  " + smallA);

        char ch = 65455; // int v diapazone ot 0 do 65535 castiruutsa v tip char
        System.out.println(ch);


        // perepolnenie tipa dannux

        // byte -128..127
        byte bt = 127;
        System.out.println("bt  " + bt);
        bt += 10; // -128 + 9 = -119
        System.out.println("bt " + bt);

        bt = -128;
        bt--;
        System.out.println("bt " + bt);

        short sh = 32767;
        sh++;
        System.out.println("sh " + sh);

        bt = 127;
        bt += 200;
        System.out.println(bt);








    }




    }

