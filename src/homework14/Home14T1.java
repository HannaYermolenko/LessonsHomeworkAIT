package homework14;

public class Home14T1 {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
       swap(original, 2, 8);

        String[] origin = {"banana", "cherry", "date", "oranges"};
        swap(origin, 3, 1);





    }

    public static void swap(int[] array, int searchValue1, int searchValue2) {

        if (searchValue1 < 0 || searchValue1 > array.length || searchValue2 < 0 || searchValue2 > array.length) {
            System.out.println("Wrong index");
            return;
        }
        for (int i = 0; i < array.length; i++){
            int temp = array[searchValue1];
            array[searchValue1] = array[searchValue2];
            array[searchValue2] = temp;
        }
        System.out.println(" Villeicht alles gut");





    }
    public static void swap(String[] arr, int searchVal1, int searchVal2) {


        if (searchVal1 < 0 || searchVal1 >= arr.length || searchVal2 < 0 || searchVal2 >= arr.length) {
            System.out.println("Wrong index");
            return;
        }
        String temp = arr[searchVal1];
        arr[searchVal1] = arr[searchVal2];
        arr[searchVal2] = temp;
        System.out.println("Alles gut");

    }






}
















