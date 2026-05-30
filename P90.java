import java.util.Scanner;

public class HeapSort {

    // Function to perform heap sort
    public static void heapSort(int arr[]) {
        int n = arr.length;

        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Extract elements from heap
        for (int i = n - 1; i > 0; i--) {

            // Swap current root with end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Call heapify on reduced heap
            heapify(arr, i, 0);
        }
    }

    // Heapify function
    public static void heapify(int arr[], int n, int i) {
        int largest = i; // Root
        int left = 2 * i + 1;
        int
