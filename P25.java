import java.util.*;

class P25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter sorted elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int low = 0;
        int high = n - 1;
        int flag = 0;

        while(low <= high) {

            int mid = (low + high) / 2;

            if(arr[mid] == key) {
                System.out.println("Element found at position: " + (mid + 1));
                flag = 1;
                break;
            }
            else if(arr[mid] < key) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        if(flag == 0) {
            System.out.println("Element not found");
        }
    }
}
