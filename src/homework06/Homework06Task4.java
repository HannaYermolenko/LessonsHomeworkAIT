package homework06;

public class Homework06Task4 {
    public static void main(String[] args) {

        System.out.println((true | false) | (45 < 70) & !(true) ^ (6 == 5));
        System.out.println(true | (45 < 70) & !(true) ^ (6 == 5));
        System.out.println(true | true & !(true) ^ (6 == 5));
        System.out.println(true | true & !(true) ^ false);
        System.out.println(true | true & false ^ false);
        System.out.println(true | true & false ^ false);
        System.out.println(true | false);
        System.out.println(true);


    }
}
