public class p4 {
    public static void main(String[] args) {

        int a[] = {2, 5, 10, 300, 4, 6};

        int min = a[0]; 

        for(int i = 1; i < a.length; i++){
            if(a[i] < min){
                min = a[i];
            }
        }

        System.out.println("Smallest number is " + min);
    }
}

