package lessons09;

public class Lessons09 {
    public static void main(String[] args) {

 //       for (<tfgfdgfdgfdxxd>; <blik proverok>; <izmeneniya schetchika>){
            //telo cikla

        int k = 0;
        while (k < 10) {
            k++;


        }
        System.out.println("k > " + k);


        for (int i = 0; i < 10; i++){
            //telo cikla
            System.out.print(i + " ");
        }

        int j = 15;

        for (j = 0; j < 20; j++) {
            System.out.print(j + " ");
        }

        System.out.println();
        System.out.println("j za ciklom " + j);

        for (int i = j - 5; i < 20; i++){
            System.out.println(i + " ");
        }
        System.out.println();

        for (int i = 0; i >= 0; i = i + 100000){
            System.out.println(i);
        }

        for (String str = "Hello"; str.length() < 10; str += "*"){
            System.out.println(str);
        }

        int k1 = 0;
        //stroki kods


        k1 = 15;

        for (int a = 0, f = 1; k1 >= 0 && f < 10; k1--, a = ++a + k1, f++ ){
            System.out.println(k1 + " : " + a + " : " + f);
        }

        System.out.println();

















    }




}
