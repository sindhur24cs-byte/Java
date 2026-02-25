public class P26 {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,6};

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != i + 1) {
                System.out.println("Missing number is " + (i + 1));
                return;
            }
        }
        System.out.println("Missing number is " + (arr.length + 1));
    }
}
