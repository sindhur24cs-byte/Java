import java.util.Scanner;

public class KnapsackDP {

    public static int knapsack(int[] weight, int[] profit, int n, int capacity) {

        int[][] dp = new int[n + 1][capacity + 1];

        // Build table dp[][]
        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= capacity; w++) {

                // Base condition
                if (i == 0 || w == 0) {
                    dp[i][w] = 0;
                }

                // If current item's weight is less than capacity
                else if (weight[i - 1] <= w) {
                    dp[i][w] = Math.max(
                            profit[i - 1] + dp[i - 1][w - weight[i - 1]],
                            dp[i - 1][w]
                    );
                }

                // If current item's weight is more than capacity
                else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        return dp[n][capacity];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        int[] profit = new int[n];
        int[] weight = new int[n];

        System.out.println("Enter profits:");
        for (int i = 0; i < n; i++) {
            profit[i] = sc.nextInt();
        }

        System.out.println("Enter weights:");
        for (int i = 0; i < n; i++) {
            weight[i] = sc.nextInt();
        }

        System.out.print("Enter knapsack capacity: ");
        int capacity = sc.nextInt();

        int result = knapsack(weight, profit, n, capacity);

        System.out.println("Maximum Profit = " + result);

        sc.close();
    }
}
