//If the number is a 2 Digit number then perform multiplication, 
// if the numbers are 1 digit then perform addition
import java.util.Scanner;

class DigitOperation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a >= 10 && a <= 99 && b >= 10 && b <= 99) {
            System.out.println("Multiplication: " + (a * b));
        }
        else if (a >= 0 && a <= 9 && b >= 0 && b <= 9) {

            System.out.println("Addition: " + (a + b));
        }
        else {
            System.out.println("Numbers are not both 1-digit or both 2-digit");
        }

        sc.close();
    }
}
