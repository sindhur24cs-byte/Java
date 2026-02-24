import java.util.*;

class P24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int flag = 0;

        for(int i = 0; i < n; i++) {
            if(arr[i] == key) {
                System.out.println("Element found at position: " + (i + 1));
                flag = 1;
                break;
            }
        }

        if(flag == 0) {
            System.out.println("Element not found");
        }
    }
}
