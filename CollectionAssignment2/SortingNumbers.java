import java.util.ArrayList;
import java.util.Collections;

public class SortingNumbers {
    public static void main(String[] args) {
        // Step 1: Create an ArrayList<Integer> called numbers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Step 2: Add some unsorted numbers to the list
        numbers.add(34);
        numbers.add(12);
        numbers.add(89);
        numbers.add(45);
        numbers.add(22);

        // Step 3: Use Collections.sort() to sort the list in ascending order
        Collections.sort(numbers);

        // Step 4: Print the sorted list
        System.out.println("Sorted List: " + numbers);
    }
}
