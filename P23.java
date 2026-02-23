import java.util.Scanner;

public class Main {

    // Function to calculate string length (similar to slen in C)
    public static int slen(String s) {
        return s.length();
    }

    // Function to replace all occurrences of P with REP in T
    public static String replace(String T, String P, String REP) {

        int s = slen(T);
        int r = slen(P);

        StringBuilder FIN = new StringBuilder();

        int k = 0;

        while (k < s) {

            int e;

            // Check if pattern matches at current position
            for (e = 0; e < r && (k + e) < s; e++) {
                if (T.charAt(k + e) != P.charAt(e)) {
                    break;
                }
            }

            // Pattern found
            if (e == r) {
                FIN.append(REP);
                k += r;
            } else {
                FIN.append(T.charAt(k));
                k++;
            }
        }

        return FIN.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Main string: ");
        String T = sc.nextLine();

        System.out.print("Enter Pattern string: ");
        String P = sc.nextLine();

        System.out.print("Enter Replacement string: ");
        String REP = sc.nextLine();

        if (!T.contains(P)) {
            System.out.println("Pattern not found in the main string.");
        } else {
            String result = replace(T, P, REP);
            System.out.println("Output: " + result);
        }

        sc.close();
    }
}
