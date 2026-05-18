import java.util.ArrayList;
import java.util.Collections;
public class Program1 {
 public static void main(String[] args) {
 ArrayList<Integer> arrayList = new ArrayList<>();
 arrayList.add(5);
 arrayList.add(4);
 arrayList.add(8);
 arrayList.add(6);
 System.out.println("ArrayList after adding elements: " + arrayList);
 arrayList.remove(2);
 System.out.println("ArrayList after removing element at index 2: " + arrayList);
 Collections.sort(arrayList);
 System.out.println("ArrayList after sorting: " + arrayList);
 Integer[] array = arrayList.toArray(new Integer[0]);
 System.out.print("Array obtained from ArrayList using toArray(): ");
 for (int i : array) {
 System.out.print(i + " ");
 }
 System.out.println();
 }
}
