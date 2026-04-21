import java.util.*;

public class UniqueElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};

        Set<Integer> unique = new LinkedHashSet<>();
        for (int num : arr) {
            unique.add(num);
        }

        System.out.println("Unique elements: " + unique);
    }
}
