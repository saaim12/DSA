package ARRAYS;
import java.util.*;
class Solution {
    public static void main(String[] args) {
        int arr[]={4,3,2,7,8,2,3,1};
      findDisappearedNumbers(arr);
    }
    public static List<Integer> findDisappearedNumbers(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i]-1; // Correct position for current value
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++; // Move to the next index if already in the correct place
            }

        }
        System.out.println(Arrays.toString(arr));
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j+1){
                list.add(j+1);

            }
        }
        return list;
    }
     private static void swap(int[] arr, int first, int second) {

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    //finding missing numbers in array
//    public int missingNumber(int[] nums) {
//        int i=0;
//        int missing=0;
//        while(i < nums.length){
//            int correct_index=nums[i];
//            if( nums[i]<nums.length && nums[correct_index]!=nums[i] ){
//                int temp=nums[correct_index];
//                nums[correct_index]=nums[i];
//                nums[i]=temp;
//            }else{
//                i++;
//            }
//
//        }
//        for(int k=0;k<nums.length;k++){
//            if(nums[k]!=k){
//                return k;
//            }
//
//        }
//        return nums.length;
//    }

}