package ARRAYS.Searching;

public class Binary_Search {
    public static void main(String[] args) {
        int[] ascendingArr = {1, 3, 5, 7, 9, 11, 13};
        int[] descendingArr = {20, 17, 15, 13, 10, 8, 5};
        int target = 13;

        int resultAsc = orderAgnosticBinarySearch(ascendingArr, target);
        int resultDesc = orderAgnosticBinarySearch(descendingArr, target);

        System.out.println("In ascending array:");
        printResult(resultAsc);

        System.out.println("In descending array:");
        printResult(resultDesc);
    }

    private static void printResult(int index) {
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    /**
     * Iterative binary search.
     * Works for arrays sorted in ascending order.
     */
    public static int binarySearchIterative(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    /**
     * Recursive binary search.
     * Works for arrays sorted in ascending order.
     */
    public static int binarySearchRecursive(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        } else if (target > arr[mid]) {
            return binarySearchRecursive(arr, target, mid + 1, end);
        } else {
            return binarySearchRecursive(arr, target, start, mid - 1);
        }
    }

    /**
     * ORDER AGNOSTIC BINARY SEARCH
     * ---------------------------------
     * This version of binary search works for both ascending and descending sorted arrays.
     *
     * ✅ Why do we need this?
     * Sometimes we get sorted arrays where the order is unknown (it could be ascending or descending).
     * Traditional binary search assumes ascending order. If we apply it on a descending array, it fails.
     * To overcome this, order-agnostic binary search checks the order first, then applies the correct logic.
     *
     * ✅ How it works:
     * 1. Compare the first and last element to detect order:
     *    - If first < last → ascending order.
     *    - Else → descending order.
     * 2. Apply binary search accordingly:
     *    - Ascending → move right if target > mid.
     *    - Descending → move left if target > mid.
     *
     * ✅ Time complexity: O(log n)
     */
    public static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // Step 1: Determine whether array is ascending or descending
        boolean isAscending = arr[start] < arr[end];

        // Step 2: Apply binary search logic according to the order
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAscending) {
                // Ascending order
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                // Descending order
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1; // Element not found
    }
}
