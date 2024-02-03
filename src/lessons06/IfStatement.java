package lessons06;

public class IfStatement {
    public static void main(String[] args) {

      //  int x = 10;

        // operator block. opredelyaet oblast videmosti peremenix
        {
      //  int y = 5;
        //x = x + y;
        }
        //int y = 24;
       // System.out.println("x: " + x);

        //if (yslovie) kod/ operator  vipolnyaushiisa esli verno = true

        int number = 7;
      //   if (number > 10) System.out.println("x > 10; ");
        if (number > 10) {
            System.out.println("true");
            System.out.println("vsem privet");
            System.out.println("serfsa");


        } else if (number > 10){
            System.out.println("else if");
            System.out.println("x > 7");

        } else {
            System.out.println("false");
            System.out.println("z uhel ");
            System.out.println("seicha x bolshe 10");
            System.out.println("Bolshe 10");
        }

        System.out.println("konec programmi");

    }
}
