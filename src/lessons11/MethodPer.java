package lessons11;

public class MethodPer {

    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        sumNumbers(x, y);

        int sum = sumNumbersReturn(x, y);
        System.out.println("sum " + sum);
        System.out.println(sumNumbersReturn(10, 45));

        int[] testArray = {11, 55, 34, 65, 43};
        int findMe = 100;

        boolean isExist = zadaCha(testArray, findMe);
        System.out.println(isExist);




    }

        public static boolean zadaCha(int[] numbers, int searchMe){
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] == searchMe){
                return true;
            }
        }

            return false;
        }




    public static void sumNumbers(int i, int k){
        int result = i + k;
        System.out.println(result);
    }

    public static int sumNumbersReturn(int i, int k){
        int result = i + k;

        return result;
        }


}


