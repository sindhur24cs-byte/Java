import java.util.*;

class Item {
    int value, weight;

    Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }
}

public class FractionalKnapsack {

    public static double knapsack(int W, Item arr[], int n) {

        Arrays.sort(arr, (a, b) ->
            Double.compare((double)b.value / b.weight,
                           (double)a.value / a.weight));

        double totalValue = 0.0;

        for (Item item : arr) {

            if (W >= item.weight) {
                W -= item.weight;
                totalValue += item.value;
            } else {
                totalValue += ((double)item.value / item.weight) * W;
                break;
            }
        }

        return totalValue;
    }

    public static void main(String[] args) {

        Item arr[] = {
            new Item(60, 10),
            new Item(100, 20),
            new Item(120, 30)
        };

        int W = 50;

        System.out.println("Maximum value = " +
                knapsack(W, arr, arr.length));
    }
}
