package homework12;

public class Home12T2 {

    public static void main(String[] args) {
        int[] zadacha = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int[] zadachaArray = masPrimeIn(zadacha);
        System.out.println("New mas");
        for (int i = 0; i< zadachaArray.length; i++){
            System.out.print(zadachaArray[i] + ", ");


        }
        System.out.println("");
        System.out.print("Long");
        System.out.println();
        System.out.println((zadachaArray.length));



    }

    public static int[] masPrimeIn(int[] primes){
        int[] primesArray = new int[primes.length];
        int primeIndex = 0;

        for (int j=0; j< primes.length; j++){
            if (isPrime(primes[j])) {
                primesArray[primeIndex] = primes[j];
                primeIndex++;
            }
        }

        int[] resultArray = new int[primeIndex];
        for (int i = 0; i < primeIndex; i++){
            resultArray[i] = primesArray[i];

        }

        return resultArray;



    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <=Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;

            }
        }
        return true;


    }

}







