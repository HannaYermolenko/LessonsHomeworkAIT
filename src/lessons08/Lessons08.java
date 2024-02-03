package lessons08;

public class Lessons08 {
    public static void main(String[] args) {

        //obyavlenie massiva
        int [] array;
        int numbers []; // ne recomendyemiy

        // inicializaciya massiva
        array = new int[5]; // massiv sosdayotsa v pamyati. Ykazat rasmer massiva
        // 5 - rasmer massiva (kol-vo yacheek)

        String[] strings = new String[7]; // obyavlenie inicialisacii massiva
        // peremennaya kotoraya budet (v Stack
        // obekt v Heap
        //


        // dla chislovix - 0 (0.0) i char
        // dla boolean = false
        // dla ssilochnix = null (nichego)

        // yavnaya inicializacia massiva
        int[] digits = new int [] {56, -98, 14, 1004, 1443};
        String[] strings1 = {"Str", "hello", "Java", "JS", "Orange"};

        // dostup
        int value = digits[0]; // v peremennyy zapisano znachenie s n0
        System.out.println("value " + value);

        System.out.println("v yacheike 2 string1  " + strings1[2].toUpperCase());
        System.out.println("v yacheike 3 digits  " + digits[3]);
        System.out.println("mi mogem proisvodit  " + (digits[3] /2 - 15));

        // rasmer massiva

        System.out.println(digits);
        int length = digits.length;
        int i = 0;
        while (i < length){
            System.out.print(digits[i++] + ", "); // dugits
        }
        System.out.println();

        //ismananie  v yacheike
        digits[2] = 5000;
        i = 0;
        while (i < digits.length){
            System.out.print(digits[i] + ", ");
            i++;
        }

        System.out.println(array[2]); // proveryaem znachenie v yacheikax
        System.out.println("string[5]   " + strings[5]);

        strings[5] = "Pascal "; // izmenenie v yach

        System.out.println("string5 " + strings[5]);

        //






    }
}
