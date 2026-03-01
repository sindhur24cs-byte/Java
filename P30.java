public class SwapArray {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {5, 15, 25, 35};

        swap(arr, 0, 2);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
