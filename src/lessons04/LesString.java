package lessons04;

public class LesString {
    public static void main(String[] args) {
        String name = "Sigismund";
        System.out.println(name);

        String name2 = new String("Hello");
        System.out.println(name2);

        name.length(); // poluchit dliny stroki
        System.out.println(name.length());

        int length = name.length();
        System.out.println(length);

        // bolshie bukvi

        System.out.println(name.toUpperCase());

        // malenkie bukvi

        System.out.println(name.toLowerCase());
        System.out.println(name);




    }
}
