import java.util.*;

public class SeparateDuplicates {
    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 3, 3, 4, 5};

        int n = arr.length;
        int dup[] = new int[n];
        int rem[] = new int[n];

        int d = 0, r = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            // check if already appeared before
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (isDuplicate) {
                dup[d++] = arr[i];
            } else {
                rem[r++] = arr[i];
            }
        }

        System.out.println("Duplicates:");
        for (int i = 0; i < d; i++) {
            System.out.print(dup[i] + " ");
        }

        System.out.println("\nRemaining elements:");
        for (int i = 0; i < r; i++) {
            System.out.print(rem[i] + " ");
        }
    }
}
