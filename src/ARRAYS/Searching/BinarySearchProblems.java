package ARRAYS.Searching;

public class BinarySearchProblems {
    public static void main(String[] args) {
        int[] sortedArray = {2, 4, 6, 8, 10, 12, 14};
        int[] rotatedArray = {1,3};
        System.out.println("sorted array "+ sortedArray);
        System.out.println("rotated array " + rotatedArray);
        int target1 = 5;
        int target2 = 9;

        // Leetcode 33: Search in Rotated Sorted Array
        // Explanation: Finds the index of target in a rotated sorted array.
        System.out.println("\nLeetcode 33: Search in Rotated Sorted Array");
        System.out.println("Target 1 -> Index: " + searchInRotatedArray(rotatedArray, 1));

        // Custom: Ceil and Floor in a sorted array
        System.out.println("\nCustom: Ceil and Floor of Target");
        int ceilIndex1 = ceilOfNumber(sortedArray, target1);
        int floorIndex1 = floorOfNumber(sortedArray, target1);
        int ceilIndex2 = ceilOfNumber(sortedArray, target2);
        int floorIndex2 = floorOfNumber(sortedArray, target2);

        System.out.println("Target: " + target1);
        printCeilFloor(sortedArray, ceilIndex1, floorIndex1);

        System.out.println("Target: " + target2);
        printCeilFloor(sortedArray, ceilIndex2, floorIndex2);

        // Leetcode 744: Next Greatest Letter
        // Explanation: Finds the smallest character greater than target.
        System.out.println("\nLeetcode 744: Next Greatest Letter");
        System.out.println("Next Greatest Letter: " + new BinarySearchProblems().nextGreatestLetter(new char[]{'c','f','j'}, 'c'));

        // Leetcode 34: Find First and Last Position of Element in Sorted Array
        // Explanation: Finds starting and ending index of target value.
        System.out.println("\nLeetcode 34: Find First and Last Position");
        int[] range = new BinarySearchProblems().searchRange(new int[]{5,7,7,8,8,10}, 8);
        System.out.println("Range for 8: [" + range[0] + ", " + range[1] + "]");

        // Infinite sorted array simulation
        System.out.println("\nInfinite Sorted Array Simulation");
        int[] infiniteArray = new int[100];
        for (int i = 0; i < 100; i++) infiniteArray[i] = i * 2; // Even numbers
        int infiniteIndex = new BinarySearchProblems().searchInInfiniteArray(infiniteArray, 74);
        System.out.println("Index of 74 in simulated infinite array: " + infiniteIndex);

        // Leetcode 852: Peak Index in Mountain Array
        // Explanation: Finds the peak index where arr[i] > arr[i-1] and arr[i] > arr[i+1]
        System.out.println("\nLeetcode 852: Peak Index in Mountain Array");
        int[] mountainArr = {0, 2, 4, 6, 3, 1};
        System.out.println("Peak Index: " + new BinarySearchProblems().peakIndexInMountainArray(mountainArr));

        // Leetcode 153: Find Minimum in Rotated Sorted Array
        // Explanation: Finds the minimum element in a rotated sorted array.
        System.out.println("\nLeetcode 153: Find Minimum in Rotated Sorted Array");
        System.out.println("Minimum Element: " + findMin(rotatedArray));
    }

    private static void printCeilFloor(int[] arr, int ceilIndex, int floorIndex) {
        System.out.println("Ceil Index: " + ceilIndex + (ceilIndex >= 0 && ceilIndex < arr.length ? ", Value: " + arr[ceilIndex] : " (No ceil)"));
        System.out.println("Floor Index: " + floorIndex + (floorIndex >= 0 && floorIndex < arr.length ? ", Value: " + arr[floorIndex] : " (No floor)"));
        System.out.println("-----------------------------------");
    }

    public static int ceilOfNumber(int[] arr, int target) {
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

        return start;
    }

    public static int floorOfNumber(int[] arr, int target) {
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

        return end;
    }

    public char nextGreatestLetter(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return arr[start % arr.length];
    }

    public int[] searchRange(int[] nums, int target) {
        int start = binarySearchFirstLast(nums, target, true);
        int end = binarySearchFirstLast(nums, target, false);
        return new int[]{start, end};
    }

    private int binarySearchFirstLast(int[] arr, int target, boolean findFirst) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (findFirst) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return ans;
    }

    public int searchInInfiniteArray(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }

        return binarySearch(arr, target, start, end);
    }

    public static int binarySearch(int[] arr, int target, int start, int end) {
        if (start > end) return -1;

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) return mid;
        if (target > arr[mid]) return binarySearch(arr, target, mid + 1, end);
        return binarySearch(arr, target, start, mid - 1);
    }

    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    public static int findMin(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return arr[start];
    }

    public static int searchInRotatedArray(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        int pivot = start;
        if (target >= arr[pivot] && target <= arr[arr.length - 1]) {
            return binarySearch(arr, target, pivot, arr.length - 1);
        } else {
            return binarySearch(arr, target, 0, pivot - 1);
        }
    }
}
