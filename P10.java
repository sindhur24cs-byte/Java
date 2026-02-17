//Laregst of three number
import java.util.*;
public class P10 {

    public static void main(String[] args) {

        Random r = new Random();

        int a = r.nextInt(100);
        int b = r.nextInt(100);
        int c = r.nextInt(100);

        System.out.println("First Number  : " + a);
        System.out.println("Second Number : " + b);
        System.out.println("Third Number  : " + c);

        int largest;

        if (a >= b && a >= c) {
            largest = a;
        } else if (b >= a && b >= c) {
            largest = b;
        } else {
            largest = c;
        }

        System.out.println("Largest Number is: " + largest);
    }
}
