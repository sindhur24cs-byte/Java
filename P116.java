import java.util.Scanner;

public class ChecksumV3 {

    static String addBinary(String a, String b) {
        int carry = 0;
        String result = "";

        for (int i = a.length() - 1; i >= 0; i--) {
            int sum = (a.charAt(i) - '0') + (b.charAt(i) - '0') + carry;
            result = (sum % 2) + result;
            carry = sum / 2;
        }

        if (carry == 1) {
            result = addBinary(result, "0001");
        }

        return result;
    }

    static String complement(String s) {
        String comp = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0')
                comp += "1";
            else
                comp += "0";
        }
        return comp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of 4-bit data blocks: ");
        int n = sc.nextInt();

        String sum = "0000";

        System.out.println("Enter data blocks:");
        for (int i = 0; i < n; i++) {
            String data = sc.next();
            sum = addBinary(sum, data);
        }

        String checksum = complement(sum);

        System.out.println("Checksum = " + checksum);

        String verify = addBinary(sum, checksum);

        if (verify.equals("1111"))
            System.out.println("No Error");
        else
            System.out.println("Error Detected");

        sc.close();
    }
}
