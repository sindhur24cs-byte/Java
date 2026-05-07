import java.util.Arrays;
import java.util.Comparator;

class Item {
    int weight, value;

    Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }
}

public class FractionalKnapsack {

    public static double getMaxValue(Item[] items, int capacity) {

        Arrays.sort(items, new Comparator<Item>() {
            public int compare(Item a, Item b) {
                double r1 = (double) a.value / a.weight;
                double r2 = (double) b.value / b.weight;

                return Double.compare(r2, r1);
            }
        });

        double totalValue = 0.0;

        for (Item item : items) {

            if (capacity >= item.weight) {
                capacity -= item.weight;
                totalValue += item.value;
            } else {
                totalValue += ((double) item.value / item.weight) * capacity;
                break;
            }
        }

        return totalValue;
    }

    public static void main(String[] args) {

        Item[] items = {
            new Item(10, 60),
            new Item(20, 100),
            new Item(30, 120)
        };

        int capacity = 50;

        double maxValue = getMaxValue(items, capacity);

        System.out.println("Maximum value = " + maxValue);
    }
}
