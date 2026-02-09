public class array {
    public static void main(String[] args) {
        int a [] = {2,5, 10, 300, 4};
        // a[1] = 4;
        for(int i=0; i<=a.length; i++){
            if(a[i]>a[i+1]){
                int max = a[i];
                System.out.println("max num is " + max);
            }
        }
    }
}