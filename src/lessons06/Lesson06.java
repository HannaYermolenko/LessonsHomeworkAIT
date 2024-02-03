package lessons06;

public class Lesson06 {
    public static void main(String[] args) {
// delenie na 0

        //int resalt = 100 / 0; // oshibka
        //System.out.println(resalt);

        double result = 100.0 / 0;
        double result1 = 1000.0 / 0;
        double result3 = result / result1;

        System.out.println(result);
        System.out.println(result > result1);
        System.out.println(result3); // neopredelennost



    }
}
