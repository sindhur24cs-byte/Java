public class P15 {
    public static void main(String[] args) {

        int arr[] = {1, 2, 2, 3, 4, 4, 5};

        System.out.print("After removing duplicates: ");

        for (int i = 0; i < arr.length; i++) {
            boolean duplicate = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
