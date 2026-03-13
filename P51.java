import java.util.Scanner;

public class StockProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter buy price: ");
        double buyPrice = sc.nextDouble();

        System.out.print("Enter sell price: ");
        double sellPrice = sc.nextDouble();

        System.out.print("Enter number of shares: ");
        int shares = sc.nextInt();

        double result = (sellPrice - buyPrice) * shares;

        if(result > 0) {
            System.out.println("Profit = ₹" + result);
        } 
        else if(result < 0) {
            System.out.println("Loss = ₹" + Math.abs(result));
        } 
        else {
            System.out.println("No profit no loss");
        }

        sc.close();
    }
}
