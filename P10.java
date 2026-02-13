// Finding the largest of two numbers
import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println(a + " is largest");
        } else if (b > a) {
            System.out.println(b + " is largest");
        } else {
            System.out.println("Both numbers are equal");
        }

        sc.close();
    }
}
// Finding the largest of three number
import java.util.Scanner;

public class P11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println(a + " is largest");
        } else if (b >= a && b >= c) {
            System.out.println(b + " is largest");
        } else {
            System.out.println(c + " is largest");
        }

        sc.close();
    }
}
