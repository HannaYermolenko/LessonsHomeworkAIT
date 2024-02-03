package lessons06;

public class StringComparison {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");
        String str4 = new String("Java");

        System.out.println("str1 " + str1);
        System.out.println("str3" + str3);

        System.out.println(str1 == str2); // sravneniya peremennix. a v peremen
        System.out.println(str1 == str3);

        // String pool //
        System.out.println("str1 i str2 " + str1.equals(str2)); // sravnenie po znachenia obekta
        System.out.println("str1.eguals(str3) " + str1.equals(str3));
        System.out.println("str1.eguals(str4) " + str1.equals(str4));



    }
}
