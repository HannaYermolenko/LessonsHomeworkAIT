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

    public static int binarySearch(int[] array, int searchValue) {

        int startIndex = 0;
        int endIndex = array.length - 1;
        int middleIndex;

        int counter = 0; // счетчик шагов


        // проверяем можно ли разделить массив пополам
        while (startIndex <= endIndex) {
            counter++;

            // вычислить индекс середины
            // 0, 12 -> 0 +  (12-0) / 2 -> 6 |||  7..12 -> 7 + (12-7)/2 -> 9
            middleIndex = startIndex + (endIndex - startIndex) / 2;

            // сравниваем на равенство значение "в середине" с искомым
            if (array[middleIndex] == searchValue) {
                System.out.println("Элемент найден! Шагов затрачено: " + counter);
                return middleIndex;
            }

            //надо понять в какой массива может быть искомое значение
            // отбросить не нужную половину массива
            // сместить индексы (указатели)

            if (array[middleIndex] > searchValue) {
                // мы должны отбросить правую часть (то, что справа от "середины"
                endIndex = middleIndex - 1;
            } else {
                // отбрасывает левую часть
                startIndex = middleIndex + 1;
            }
        }

//        System.out.println("Элемент отсутствует. Шагов затрачено: " + counter);
        return -1;

    }
















}
