class Solution {
    int areAnagram(String S1, String S2) {
        if (S1.length() != S2.length()) {
            return 0;
        }

        int[] count = new int[256];

        for (int i = 0; i < S1.length(); i++) {
            count[S1.charAt(i)]++;
            count[S2.charAt(i)]--;
        }

        for (int x : count) {
            if (x != 0) {
                return 0;
            }
        }

        return 1;
    }
}
