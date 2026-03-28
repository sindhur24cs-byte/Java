import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int sum = 0;

        System.out.print("Duplicate elements: ");

        for(int i = 0; i < n; i++) {
            int count = 0;

            for(int j = 0; j < n; j++) {
                if(arr[i] == arr[j])
                    count++;
            }

            // print only once
            if(count > 1) {
                boolean printed = false;

                for(int k = 0; k < i; k++) {
                    if(arr[k] == arr[i]) {
                        printed = true;
                        break;
                    }
                }

                if(!printed) {
                    System.out.print(arr[i] + " ");
                    sum += arr[i];
                }
            }
        }

        System.out.println("\nSum = " + sum);
    }
}
