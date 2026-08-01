import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of tickets: ");
        int tickets = sc.nextInt();

        int bill = 0;

        for (int i = 1; i <= tickets; i++) {

            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.println("1. Male");
            System.out.println("2. Female");
            System.out.print("Enter Gender: ");
            int gender = sc.nextInt();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            if (gender == 1 && age >= 18) {
                System.out.println(name + " Allowed");
                bill += 100;
            } else if (gender == 2 && age >= 21) {
                System.out.println(name + " Allowed");
                bill += 100;
            } else {
                System.out.println(name + " Not Allowed");
            }
        }

        System.out.println("Total Bill = Rs." + bill);

        sc.close();
    }
}
