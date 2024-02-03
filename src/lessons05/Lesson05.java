package lessons05;

public class Lesson05 {
    public static void main(String[] args) {
        String str1 = "One";
        String str2 = " ";
        String str3 = "hello";
        String str4 = "str4";

        // raslichniy variant conkatenazii
        String concstStr = str1 + str2 + str3;
        System.out.println(concstStr);
        concstStr = str1 + "  " + str2 + " " + "String";
        System.out.println(concstStr);

        // 2 metod concat

        String concatStr2 = str1.concat(str3);
        System.out.println(concatStr2);
        concatStr2 = str1.concat(str3).toUpperCase();
        System.out.println(concatStr2);
        concatStr2 = str1.concat(str3);
        System.out.println(concatStr2);

        String concatStr3 = str1.concat(str2).concat(str3).concat(" ").concat(str4);
        System.out.println(concatStr3);

       // str1.concat(str1 + str2 + str3)

        // 3 metod join

        String concatStrJoin = String.join("Abc", str1, str3, str4);
        System.out.println(concatStrJoin);
        concatStrJoin = String.join(" 0 ", str1, str3, str4);
        System.out.println(concatStrJoin);

        int int1 = 1;
        int int2 = 2;
        double ab1 = 20.5;
        System.out.println(int1 + int2);
        System.out.println("result " + int1 + int2);
        System.out.println("result " + (int1 + int2));
        System.out.println(int1 + int2 + "- summa" + ab1 + int1 + int2);

        int age = 2;
        System.out.println("My age  " + age);

        System.out.println("##############\n");

        String digit = "0123456789";
        int len = digit.length();
        System.out.println("dlina stroki " + len);
        char firstChar = digit.charAt(0);
        digit = "ertrdhfdjrdgf";
        digit = "0123456789";
        System.out.println("firstChar  " + firstChar);
        char lastChar = digit.charAt(digit.length() - 3); // poslednyaya bukva (lengt - 1)
        System.out.println("lastChar  " + lastChar);

        // System.out.println(digit.charAt(50)); oshibka issa nomera indeksa; avariinoe zavershenie programmi

        System.out.println("end of programm");

        // videllenie is stroki
        String substring = digit.substring(5);
        System.out.println(substring); // videlyaetsa s 5go do konza
        System.out.println(digit); // digit neismennniy
        substring = digit.substring(5, 8); // do 8go indeksa. 8 ne vkluchaetsa. mojno vkluchat formulu
        System.out.println("substring 5 i 8 eto " + substring );

        // ishet vhogdenie
        digit = "012345-01-67hjhfjhfjhf89-101";
        int index = digit.indexOf('4');
        System.out.println(index);
        index = digit.indexOf("79"); // ne sushestv indeks -1
        System.out.println("index " + index);
        index = digit.indexOf("1");
        System.out.println("indexOf1  " + index);
        index = digit.lastIndexOf("1");
        System.out.println("lastindexOf1  " + index);
        System.out.println(digit.indexOf("jh")); // nomer s nachala
        System.out.println(digit.lastIndexOf("jh")); // nomer po porzadku s konza
        System.out.println(digit.length()); // dlina stroki

        System.out.println("############3\n");

        String target = "abcabeabd";
        // zamena podstroky
        String cutput = target.replace("ab", "   ");
        System.out.println("cutput  " + cutput);

        cutput = target.replaceFirst("ab", "AB"); // zamena pervoi bukvi
        System.out.println("cutput  " + cutput);

        cutput = target.replaceAll("ab", "AB"); // regulyarnie zamena
        System.out.println("cutput  " + cutput);

































    }



}
