import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 4, 9};

        // Sort array in ascending order
        Arrays.sort(arr);

        // Print sorted array
        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Calculate sum
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        // Print sum
        System.out.println("\nSum of elements: " + sum);
    }
}
