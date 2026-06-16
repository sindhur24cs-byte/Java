class Solution {
    static String checkLeapYear(int year) {
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            return "True";
        } else {
            return "False";
        }
    }
}
