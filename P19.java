import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int sum = 0;
        int digit;
        int count = 0;

        // Count number of digits
        int temp = num;
        while (temp > 0) {
            temp = temp / 10;
            count++;
        }

        // Calculate Armstrong sum
        while (num > 0) {
            digit = num % 10;
            sum += Math.pow(digit, count);
            num = num / 10;
        }

        if (sum == original)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");
    }
}
