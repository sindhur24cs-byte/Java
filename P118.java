import java.util.Scanner;

public class ChecksumV2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first 4-bit binary number: ");
        String a = sc.next();

        System.out.print("Enter second 4-bit binary number: ");
        String b = sc.next();

        int sum = Integer.parseInt(a, 2) + Integer.parseInt(b, 2);

        if (sum > 15) {
            sum = (sum & 15) + 1; // End-around carry
        }

        String binary = String.format("%4s", Integer.toBinaryString(sum))
                             .replace(' ', '0');

        String checksum = "";
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '0')
                checksum += "1";
            else
                checksum += "0";
        }

        System.out.println("Sum      : " + binary);
        System.out.println("Checksum : " + checksum);

        sc.close();
    }
}
