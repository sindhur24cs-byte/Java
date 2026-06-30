import java.util.Scanner;

public class ScholarshipEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Marks (0-100): ");
        int marks = sc.nextInt();

        System.out.print("Enter Attendance (%): ");
        int attendance = sc.nextInt();

        if (age >= 17 && age <= 25) {
            if (marks >= 90 && attendance >= 90) {
                System.out.println(name + " gets Full Scholarship.");
            } else if (marks >= 75 && attendance >= 80) {
                System.out.println(name + " gets Half Scholarship.");
            } else if (marks >= 60 && attendance >= 75) {
                System.out.println(name + " is Eligible for Fee Concession.");
            } else {
                System.out.println(name + " is Not Eligible.");
            }
        } else {
            System.out.println("Age does not satisfy the eligibility criteria.");
        }

        System.out.println("\nRelational Operator Results:");
        System.out.println("marks > 90  : " + (marks > 90));
        System.out.println("marks >= 75 : " + (marks >= 75));
        System.out.println("attendance < 75 : " + (attendance < 75));
        System.out.println("age == 18 : " + (age == 18));
        System.out.println("marks != 100 : " + (marks != 100));

        sc.close();
    }
}
