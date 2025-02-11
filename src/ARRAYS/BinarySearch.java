package ARRAYS;
//binary search always reuires sorted arrays
public class BinarySearch {
    public static void main(String[] args) {
    //any sorted array
        int arr[]={1,2,3,4,5,6,7,8,9};
        System.out.println(binarySearching(arr,10));
    }
    public static int binarySearching(int arr[], int target) {
        // Handle empty array case more efficiently at the beginning
        if (arr == null || arr.length == 0) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        // Use a while loop that continues as long as the search space is valid
        while (start <= end) {
            // Calculate mid *without* the risk of integer overflow
            int mid = start + (end - start) / 2;  // Improved mid calculation

            if (arr[mid] == target) {
                return mid; // Target found!
            } else if (target > arr[mid]) { // Target is in the right half
                start = mid + 1;
            } else { // Target is in the left half
                end = mid - 1;
            }
        }

        return -1; // Target not found
    }
}
