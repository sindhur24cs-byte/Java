package Advanced_java;

import java.util.ArrayList;
import java.util.Collections;

public class Program1 {
    public static void main(String[] args) {

        // Creating ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Adding elements
        arrayList.add(5);
        arrayList.add(3);
        arrayList.add(8);
        arrayList.add(1);

        System.out.println("ArrayList after adding elements: " + arrayList);

        // Removing element at index 2
        arrayList.remove(2);

        System.out.println("ArrayList after removing element at index 2: " + arrayList);

        // Sorting elements
        Collections.sort(arrayList);

        System.out.println("ArrayList after sorting: " + arrayList);
    }
}
