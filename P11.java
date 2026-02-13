import java.util.Scanner;

public class P11 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        int sum = 0;
        
        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        for(int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        
        System.out.println("Sum of all elements: " + sum);
    }
}
