import java.util.*;

public class PalindromeWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.next();

        String reverse = new StringBuilder(word).reverse().toString();

        if (word.equalsIgnoreCase(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
