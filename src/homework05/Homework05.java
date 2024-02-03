package homework05;

public class Homework05 {


    public static void main(String[] args) {

        // Aufgabe 1
        String name = "Annan";
        System.out.println("My name is: " + name);
        System.out.println("Numbers in my name: " + (name.length()));

        char first = name.charAt(0);
        char second = name.charAt(name.length()-1);
        System.out.println("first: " + first);
        System.out.println("last: " + second);
        System.out.println("First: " + (int) first);
        System.out.println("last: " + (int) second);


        // Aufgabe 2
        /* Создайте строки:
        "Java"
        "is"
        "a"
        "powerful"
        "language"
        Из созданных строк склейте двумя разными с
        пособами строку: "Java is a powerful language"
         Распечатать эту строку и ее длину*/

        String w1 = "Java";
        String w2 = "is";
        String w3 = "a";
        String w4 = "powerful";
        String w5 = "lenguage";
        String sen1 = w1 + " " + w2 + " " + w3 + " " + w4 + " " + w5;
        System.out.println("Perviy sposob: " + sen1);

        String sen2 = w1.concat(w2).concat(" ").concat(w3).concat(" ").concat(w4).concat(" ").concat(w5);
        System.out.println("Vtoroi sposob: " + sen2);

        String sen3 = String.join(" ", w1, w2, w3, w4, w5);
        System.out.println("tretiy sposob " + sen3);

        int length = sen1.length();
        System.out.println("Dlina stroki: " + length);

        // Aufgabe 02
       // Заменить в результирующей строке слово
        // "powerful" на "super" Содержит ли строка
        // подстроку "age"? Создайте переменную boolean
        // типа c ответом

        String phrase = "Java is a powerful lenguage";
        String cutput = phrase.replace("powerful", "super");
        System.out.println("New phrase: " + cutput);
        boolean iscontanage = phrase.contains("age");// proverit na nalishie chegoto vo frase
        System.out.println("coggfs " + iscontanage);






        // Aufgabe 3
        // "string"
        //"code"
        //"Practice"

        String name1 = "string";
        String name2 = "code";
        String name3 = "Practice";

       // int len1 = name1.length();
        //System.out.println("dlina stroki String: " + len1);
         int middel = name1.length() / 2;
        System.out.println(name1.charAt(middel));




        //name1 = "string";
        // char firstChar = name1.charAt(name1.length()-3);
        //System.out.println("firstChar: " + firstChar);
        //char lastChar = name1.charAt(name1.length()-4);
        //System.out.println("lastChar: " + lastChar);
        //System.out.println("middle:" + lastChar + firstChar);








        //String middle = name1.substring(2, 4);
        //System.out.println("name1: " + middle);
        //String middle2 = name2.substring(1, 3);
        //System.out.println("name2: " + middle2);
        //String middle3 = name3.substring(3, 5);
        //System.out.println("name3: " + middle3);

















    }
}
