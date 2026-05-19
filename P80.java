import java.util.Scanner;

class DrinkingWaterRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = new String[5];
        int[] liters = new int[5];

        // Input
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter person name:");
            names[i] = sc.nextLine();

            System.out.println("Enter liters of water consumed:");
            liters[i] = sc.nextInt();
            sc.nextLine();
        }

        // Display Records
        System.out.println("\n--- Drinking Water Record ---");

        for (int i = 0; i < 5; i++) {
            System.out.println("Name: " + names[i]);
            System.out.println("Water Consumed: " + liters[i] + " liters");
            System.out.println();
        }

        sc.close();
    }
}
