import java.util.ArrayList;
import java.util.Collections;

public class P21 {
    public static void main(String[] args) {

        // Creating ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Adding elements
        list.add("Banana");
        list.add("Apple");
        list.add("Mango");
        list.add("Orange");

        System.out.println("Original List: " + list);

        // Removing element
        list.remove("Mango");
        System.out.println("After Removing Mango: " + list);

        // Sorting elements
        Collections.sort(list);
        System.out.println("After Sorting: " + list);
    }
}
