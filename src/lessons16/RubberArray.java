package lessons16;

public class RubberArray {
    int[] array;
    int cursor;

    public RubberArray() {
        array = new int[10];

    }

    void add(int number) {
        if (cursor > array.length * 0.9) {
            expantArray();
            array[cursor] = number;
        }
        array[cursor] = number;
        cursor++;
    }

    void add(int... ints) {
        for (int i = 0; i < ints.length; i++) {
            add(ints[i]);
        }

    }


    void expantArray() {
        int[] newArray = new int[array.length * 2];
        for (int i = 0; i < cursor; i++) {
            newArray[i] = array[i];
        }

        array = newArray;
        System.out.println("Extended array");
    }

    public String toString() {
        if (cursor == 0) return "[]";
        String result = "[";
        for (int i = 1; i < cursor; i++) {
            result += array[i] + ((i < cursor - 1) ? " , " : ")");
        }
        return result;

    }



    public int binarySearch(int[] array, int searchValue) {
        int startIndex = 0;
        int endIndex = array.length - 1;
        int middleIndex;

        while (startIndex <= endIndex) {

            middleIndex = startIndex + (endIndex - startIndex) / 2;

            if (array[middleIndex] == searchValue) {
                System.out.println("found ");
                return middleIndex;
            }
            if (array[middleIndex] > searchValue) {
                endIndex = middleIndex - 1;
            } else {
                startIndex = middleIndex + 1;
            }

        }
        System.out.println("not found");

        return -1;


    }


    public int binaryIndexSearch(int[] array, int searchValue) {
        int startIndex = 0;
        int endIndex = array.length - 1;
        int middleIndex;

        while (startIndex <= endIndex) {

            middleIndex = startIndex + (endIndex - startIndex) / 2;

            if (array[middleIndex] == searchValue) {
                System.out.println("found ");
                return array[middleIndex];
            }
            if (array[middleIndex] > searchValue) {
                endIndex = middleIndex - 1;
            } else {
                startIndex = middleIndex + 1;
            }

        }
        System.out.println("not found");

        return -1;


    }




}








