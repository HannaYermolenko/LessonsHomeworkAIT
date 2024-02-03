package homework07;

import java.util.Random;

public class Homwork7t3 {
    public static void main(String[] args) {
        Random random = new Random();
        int hour = 45;
        int note = random.nextInt(12)+1;

        switch (note){
            case 12:
            case 11:
            case 10:
                hour += 60; // hour = 60 - hour + hour;
                System.out.println("Kakoi ti y menya ymnii!!!!  ");
                break;
            case 9:
            case 8:
            case 7:
                hour += 45; // hour = 45 - hour + hour;
                System.out.println("Molodecccc!!!! ");
                break;
            case 6:
            case 5:
            case 4:
                hour +=15;
                System.out.println("Ny takoi sebe molodec ");
                break;
            case 3:
            case 2:
                hour -=30;
                System.out.println("Ogorchenie konechno..");
                break;
            case 1:
                hour =0;
                System.out.println("Priexali..");
                break;
            default:
                System.out.println("chto eto takoe? ");

        }

        if (hour > 60){
            hour = 60;
        }else if (hour <0){
            hour = 0;
        }


        System.out.println("Vremya na segodnya  " + hour);



    }
}
