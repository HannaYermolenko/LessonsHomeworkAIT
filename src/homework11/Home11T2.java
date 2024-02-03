package homework11;

public class Home11T2 {
    public static void main(String[] args) {
        int[] mas = new int[] {1, 2, 3, 4, 5, 67, 89, 94, 123, 11, 13, 34, 78};
          masPrime(mas);


    }

    public static void masPrime(int[] mas){
        System.out.println("Prostie chisla v amassive:");
        int numbers = 0;
        int j =0;
        for (j=0; j< mas.length; j++){
            if (Prime(mas[j])) {
                System.out.print(mas[j] + ", ");
                numbers++;
            }
        }
        System.out.println();
        System.out.println("Kolichestvo; " + numbers);
    }



    public static boolean Prime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <=Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;

            }
        }
        return true;



    }













}
