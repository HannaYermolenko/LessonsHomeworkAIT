package homework04;

public class HomeWork4 {
    public static void main(String[] args) {

        char ch1 = 'h';
        char ch2 = 'a';
        char ch3 = 'n';
        char ch4 = 'n';
        char ch5 = 'a';
        String name = ("" + ch1 + ch2 + ch3 + ch4 + ch5);
        System.out.println(name);
        System.out.println(name.toUpperCase());

        String name2 = new String("" + ((int) ch1 - 'h' + 'H') + ((int) ch2 - 'a' + 'A') + ((int) ch3 - 'n' + 'N') + ((int) ch4 - 'n' + 'N') + ((int) ch5 - 'a' + 'A'));
        System.out.println(name2);

        String name3 = new String("" + (char) (ch1 - 'h' + 'H')+ (char) (ch2 - 'a' + 'A') + (char) (ch3 - 'n' + 'N') + (char) (ch4 - 'n' + 'N') + (char) (ch5 - 'a' + 'A'));
        System.out.println(name3);

        //ch1 = (char) (ch1 - 32);
        ch1 -= 32; // samaya korptkaya zapis
        System.out.println("posle  " + ch1);
        ch2 -= 32;
        ch3 -= 32;
        ch4 -= 32;
        ch5 -= 32;
        System.out.println("" + ch1 + ch2 + ch3 + ch4 + ch5);
        System.out.print(ch1);
        System.out.print(ch2);














    }
}
