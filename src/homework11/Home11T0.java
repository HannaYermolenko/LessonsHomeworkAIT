package homework11;

public class Home11T0 {
    public static void main(String[] args) {
        int[] massiv = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Massiv prymoi");
        for (int i = 0; i < massiv.length; i++) {
            System.out.print(massiv[i] + ", ");
        }
        System.out.println();

        turnNambers(massiv);
        turnNambers(massiv, 4);
        turnNambers(massiv, false);

    }

    public static void turnNambers(int[] massiv) {

        System.out.println("Perevernutiy massiv: ");
        for (int j = massiv.length - 1; j >= 0; j--) {
            System.out.print(massiv[j] + ", ");
        }
        System.out.println();
    }

    public static void turnNambers(int[] massiv, int index) {
        System.out.println("Perevernutii na seredine");
        for (int i = 0; i <= index; i++) {
            System.out.print(massiv[i] + ", ");
        }
        for (int j = massiv.length - 1; j > index; j--) {
            System.out.print(massiv[j] + ", ");
        }
        System.out.println();


    }

    public static void turnNambers(int[] massiv, boolean all) {
        if (all) {
            System.out.println("Pokasalo true");
            for (int j = massiv.length - 1; j >= 0; j--) {
                System.out.print(massiv[j] + ", ");
            }
        } else {
            System.out.println("pokasalo false");
            for (int i = 0; i < massiv.length; i++) {
                System.out.print(massiv[i] + ", ");
            }

        }


    }


}


