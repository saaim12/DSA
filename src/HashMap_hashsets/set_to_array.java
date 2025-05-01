import java.util.*;

public class set_to_array {
    public static void main(String[] args) {
        // Create a Set of integers
        Set<Integer> set = new HashSet<>(Arrays.asList(5, 3, 9, 1, 4));
        // this is really important
        // Convert Set to an Integer array
        Integer[] arr = set.toArray(new Integer[0]);

        // Sort the array
        Arrays.sort(arr);

        // Print the sorted array
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
