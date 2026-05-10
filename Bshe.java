class MaxMin {
    static int max;
    static int min;

    static void findMaxMin(int arr[], int low, int high) {
        if (low == high) {
            max = min = arr[low];
        } else if (high == low + 1) {
            if (arr[low] > arr[high]) {
                max = arr[low];
                min = arr[high];
            } else {
                max = arr[high];
                min = arr[low];
            }
        } else {
            int mid = (low + high) / 2;

            findMaxMin(arr, low, mid);
            int max1 = max;
            int min1 = min;

            findMaxMin(arr, mid + 1, high);

            if (max1 > max)
                max = max1;

            if (min1 < min)
                min = min1;
        }
    }

    public static void main(String args[]) {
        int arr[] = {100, 11, 445, 1, 330, 3000};

        findMaxMin(arr, 0, arr.length - 1);

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
}
