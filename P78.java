import java.util.*;

public class UniqueCheck {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2};

        Set<Integer> set = new HashSet<>();
        boolean isUnique = true;

        for (int num : arr) {
            if (!set.add(num)) {
                isUnique = false;
                break;
            }
        }

        System.out.println(isUnique ? "All elements are unique" : "Duplicates found");
    }
}
