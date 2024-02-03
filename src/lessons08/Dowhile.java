package lessons08;

public class Dowhile {
    public static void main(String[] args) {

        int i = 1;
        while (i <= 5) {// cikle s predusloviem
            System.out.println(i);
            i++;
        }
        System.out.println(" =============== ");
        int j = 6;
        do {  // Цикл с постусловием. Т.е. тело цикла ГАРАНТИРОВАННО выполнится один раз (НЕ зависит от условия)
            System.out.println(j);
            j++;
        } while (j <= 5); // а вот выполнится ли второй раз тело цикла - зависит от условия
    }
}
