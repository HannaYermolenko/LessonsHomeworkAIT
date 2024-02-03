package homework12;

public class Home12T3 {
    public static void main(String[] args) {
        int[] testAr = {0, 1, 2, 3, 4, 5, 6};

      //  copyOfArray(testAr);
    }

    public static void copyOfArray(int[] ints, int newlengt){

        int[] result = new int[newlengt];
        System.out.println("[");

        for (int i = 0; i < ints.length && i < ints.length; i++){
            result[i] = ints[i];
            System.out.println(result[i] + ", ");
        }
        System.out.println("]");


    }
















}
