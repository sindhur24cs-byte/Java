import java.util.*;

class ThreeSum {
    public static List<List<Integer>> threeSum(int[] a) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(a);

        for (int i = 0; i < a.length - 2; i++) {
            int l = i + 1, r = a.length - 1;

            while (l < r) {
                int sum = a[i] + a[l] + a[r];

                if (sum == 0) {
                    res.add(Arrays.asList(a[i], a[l], a[r]));
                    l++; r--;
                } else if (sum < 0) l++;
                else r--;
            }
        }
        return res;
    }
}
