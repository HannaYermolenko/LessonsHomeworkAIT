package homework11;

public class Home11T1 {
    public static void main(String[] args) {
        Prime(3);

    }


    public static boolean Prime(int num) {
        if (num <= 1) {System.out.println("Not Prime " + num);
            return false;
        }
        for (int i = 2; i <=Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println("Not Prime " + num);
                return false;

            }
        }
        System.out.println("Yees, it is Prime..." + num);
        return true;



    }


}
