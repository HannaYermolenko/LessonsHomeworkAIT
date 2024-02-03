package lessons04;

public class LessonF04 {

    public static void main(String[] args) {
        int x = 3;
      //  x += x++;
      //  System.out.println(x);

        int a = 5;

        x = x + 1;


        System.out.println(x);

        a = ++x; // a=x x=x+1

        // x++ postinkrement
        // ++x preinkrement
        System.out.println(a);
        System.out.println(x);

        a = x++;
        System.out.println(a);
        System.out.println(x);

        // dekrement post i pre
        x--;

        --x;

        x = x + 5;
        x += 5; // x = x + 5;

        x -= 5;
        x *= 5;

        x += (a + 6 / x); // x = x + ();


        x += x++; // x = x + x++;   x = 3 + 3; x =3 > 4; x = 6
        System.out.println(x);

        int y = 5;

        y = y++ + y++;
        System.out.println("y" + y);











    }
}
