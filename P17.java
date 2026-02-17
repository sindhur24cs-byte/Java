import java.util.*;

public class P17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your email: ");
        String email = sc.nextLine();

        if (email.contains("@") && email.contains(".")) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }

        sc.close();
    }
}
