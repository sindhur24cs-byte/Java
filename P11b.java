public class P11b {
    public static void main(String[] args) {
        
        int arr[] = {5, 10, 15, 20, 25};
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        System.out.println("Sum of all elements: " + sum);
    }
}
