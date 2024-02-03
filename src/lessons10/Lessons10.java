package lessons10;

public class Lessons10 {
    public static void main(String[] args) {

        // break continue
        // continue

        for (int i = 1; i < 11; i++){
            System.out.println("befor if " + i);
            if ( i == 4) continue; // ostanovili cikl tolko na i==4
            System.out.println("after if " + i);

            if (i == 8) break;
            System.out.println("posle break " + i); // ostanovil sovsem
        }
        System.out.println("posle cikla");

        for (int i = 1; i <= 20; i++){
            if (i % 2 != 0) continue; // toge samoe
            System.out.println(i);
        }



    }
}
