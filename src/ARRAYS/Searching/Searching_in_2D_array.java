package ARRAYS.Searching;

import java.util.Arrays;

public class Searching_in_2D_array {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int target = 5;
//        int[] result = linearSearch(arr, target);
        int result[]=BinarySearch(arr,target);

        if (result[0] != -1) {
            System.out.println("Element found at: " + Arrays.toString(result));
        } else {
            System.out.println("Element not found.");
        }
    }

    private static int[] BinarySearch(int[][] arr, int target) {
        int row=0;
        int column=arr[0].length-1;
        while(row<arr.length && column>=0){
            if(arr[row][column]==target){
                return new int[]{row,column};
            } else if (target > arr[row][column]) {
                row++;

            }else{
                column--;
            }
        }
        return new int[]{-1,-1};
    }

    // Performs linear search in a 2D array
    private static int[] linearSearch(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1}; // Not found
    }
}
