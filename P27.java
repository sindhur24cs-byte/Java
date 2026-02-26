public class Main {

    public static int isUnique(int[] a, int n) {

        for(int i = 0; i < n; i++) {

            for(int j = i + 1; j < n; j++) {

                if(a[i] == a[j]) {
                    return 0;   // duplicate found
                }
            }
        }

        return 1;   // all elements are unique
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 5};   // you can change values here
        int n = arr.length;

        int result = isUnique(arr, n);

        System.out.println(result);
    }
}
