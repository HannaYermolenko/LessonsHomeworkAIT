package lessons7;

import java.util.Random;

public class Lesson07 {
    public static void main(String[] args) {
        // SwitchExample

        int x = 7;

        if (x == 5){
            System.out.println("if x==5");
        }else if (x == 7){
            System.out.println("if x == 7 ");
        }else {
            System.out.println("else x imeet drugoe znach");
        }

       // String name = "Fred";

        switch (x) {
            case 5:
                System.out.println("switch x== 5");
                break;
            case 7:
            case 8:
                System.out.println("switch x == 7 or 8");
                break;
            default:
                System.out.println("switch x imeet drugoe znach");
                break;
        }

        System.out.println("##############\n");

        Random random = new Random();
        int money = 100;
        int note = random.nextInt(5)+1;


        System.out.println("ocenka " + note);



        switch (note){
            case 5:
                money += 20;
                System.out.println("Deneg " );
                break;
            case 4:
                money += 10;
                System.out.println("Deneg  " );
                break;
            case 3:
                break;
            case 2:
                money -= 20;
                System.out.println("Deneg " );
                break;
            case 1:
                money = 0;
                break;

            default:
                System.out.println("takix ocenok net");
        }

        System.out.println("Seichas deneg " + money);

      //  money = switch (note){
      //      case 5 -> money + 20;
      //      case 4 -> Dly drugoy java
        // String str = """"
        //jfjfjffjjf
        //kfkjkjkd

        }



    }


