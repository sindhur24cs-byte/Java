package Advanced_java;
import java.util.*;
// Comparator to compare numbers based on tens place
class TensPlaceComparator  implements Comparator<Integer> 
{
    @Override
    public int compare(Integer num1, Integer num2)
 {
        int tensPlace1 = (num1 % 100) / 10;
        int tensPlace2 = (num2 % 100) / 10;
        // Compare based on tens place
        return Integer.compare(tensPlace1, tensPlace2);
    }
}

public class Program2 
{
    public static void main(String[] args) 
{
        // Define the range for random numbers
        int lowerBound = 100;
        int upperBound = 1000;

        // Generate random numbers that are multiples of 2 and 5
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) 
{
            int randomNumber;
            do 
{
                randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            } 
            while (randomNumber % 2 != 0 || randomNumber % 5 != 0);

            numbers.add(randomNumber);
        }
        System.out.println("Random numbers: " + numbers);
        Collections.sort(numbers, new TensPlaceComparator());
        System.out.println("Sorted numbers according to tens place: " + numbers);
    }
}
