package lessons7;

public class Les7Cicle {
    public static void main(String[] args) {
        // Cikle nekii kod neskolko ras podryad

       //
        //while (condition){

      //  while (true){ // beskonechnii cikle
       //     System.out.println("hello");
        // vivesti cifri ot 0 do 10
        int i = 0;
        while (i < 10){
            System.out.println("i   " + i);
            i++; //yvelichivaetsya na 1






        }

        System.out.println("Konec cikla While ");

        String str = "Petya !";
        int idx = 0;

        while (idx < str.length()){
            System.out.print(str.charAt(idx) + " ");
            idx++;
        }

        int i1 = 1;
        while (i1 <= 21){
            if (i1 % 2 == 0)
                System.out.println(i1);
            i1++;
        }







    }
}
