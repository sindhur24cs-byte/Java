import java.util.HashMap;

public class HorspoolAlgorithm {

    // Function to create shift table
    static HashMap<Character, Integer> shiftTable(String pattern) {
        int m = pattern.length();
        HashMap<Character, Integer> table = new HashMap<>();

        // Default shift value
        for (int i = 0; i < m - 1; i++) {
            table.put(pattern.charAt(i), m - 1 - i);
        }

        return table;
    }

    // Horspool searching function
    static int horspoolSearch(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();

        HashMap<Character, Integer> table = shiftTable(pattern);

        int i = m - 1;

        while (i < n) {
            int k = 0;

            while (k < m && pattern.charAt(m - 1 - k) == text.charAt(i - k)) {
                k++;
            }

            // Pattern found
            if (
