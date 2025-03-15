package ARRAYS;

class cyclic_sort_problems {
    public static void main(String[] args) {
        int arr[] = {4, 3, 2, 7, 8, 2, 3, 1};

    }

//    public static List<Integer> findDisappearedNumbers(int[] arr) {
//        List<Integer> list = new ArrayList<>();
//        int i = 0;
//        while (i < arr.length) {
//            int correctIndex = arr[i]-1; // Correct position for current value
//            if (arr[i] != arr[correctIndex]) {
//                swap(arr, i, correctIndex);
//            } else {
//                i++; // Move to the next index if already in the correct place
//            }
//
//        }
//        System.out.println(Arrays.toString(arr));
//        for(int j=0;j<arr.length;j++){
//            if(arr[j]!=j+1){
//                list.add(j+1);
//
//            }
//        }
//        return list;
//    }
//     private static void swap(int[] arr, int first, int second) {
//
//        int temp = arr[first];
//        arr[first] = arr[second];
//        arr[second] = temp;
//    }
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


//

//leetcode 287 medium solutions
//but in case there is only one dublicate
//we can use hashmap for more than one dublicate
//
// class Solution {
//     public int findDuplicate(int[] nums) {
//         for (int i = 0; i <nums.length ; i++) {
//             for (int j = nums.length-1; j >=0 ; j--) {
//                 if(i != j && nums[i]==nums[j]){
//                     return nums[j];
//                 }
//             }
//         }

//     return nums[0];
//     }

// }
// using frequency method

//    public int findDuplicate(int[] nums) {
//        int[] numbers_frequency = new int[nums.length]; // Initialize array with correct length
//
//        for (int i = 0; i < nums.length; i++) {
//            int value = nums[i];
//            numbers_frequency[value]++;
//            if (numbers_frequency[value] > 1) {
//                return value;
//
//            }
//        }
//
//
//        return -1;
//    }


//using bubble sort
// public class Solution {
//     public int findDuplicate(int[] nums) {
//         Arrays.sort(nums); // Sort the array in ascending order

//         for (int i = 1; i < nums.length; i++) {
//             if (nums[i] == nums[i - 1]) {
//                 return nums[i]; // Return the duplicate number found
//             }
//         }

//         return nums.length; // Return the length of the array if no duplicate is found
//     }
// }
//
    // leetcode medium 442
//find dublicate
//
//class Solution {
//    public List<Integer> findDuplicates(int[] nums) {
//        HashSet<Integer> set = new HashSet<>();
//        List<Integer> ls=new ArrayList<>();
//        for(int i=0;i<nums.length;i++){
//            if(set.contains(nums[i])){
//                ls.add(nums[i]);
//            }
//            set.add(nums[i]);
//        }
//        return ls;
//    }
//}
//
// solution 2: with cyclic sort
//class Solution {
//    public List<Integer> findDuplicates(int[] nums) {
//        int i = 0;
//        while(i < nums.length){
//            int correct = nums[i]-1;
//            if(nums[i] != nums[correct]){
//                swap(nums, i, correct);
//            }else{
//                i++;
//            }
//        }
//        List<Integer> ans = new ArrayList<>();
//        for(int index = 0; index < nums.length; index++){
//            if(nums[index] != index + 1){
//                ans.add(nums[index]);
//            }
//        }
//        return ans;
//    }
//    static void swap(int [] nums, int first , int second){
//        int temp = nums[first];
//        nums[first] = nums[second];
//        nums[second] = temp;
//    }
//}
//leetcode 645
//class Solution {
//    public int[] findErrorNums(int[] nums) {
//        int[] arr = new int[2];
//        //first doing cyclic sort
//        int i=0;
//        while(i<nums.length){
//            int correct_index=nums[i]-1;
//            if(nums[i]!=nums[correct_index]){
//                int temp=nums[i];
//                nums[i]=nums[correct_index];
//                nums[correct_index]=temp;
//            }else {
//                i++;
//            }
//        }
//        for (int j= 0; j < nums.length; j++) {
//            if (nums[j] != j + 1) {
//                arr[0] = nums[j];    // Duplicate number
//                arr[1] = j + 1;      // Missing number
//                break;
//            }
//        }
//        return arr;
//    }
//}
    //leetcode hard 41
//class Solution {
//    public int firstMissingPositive(int[] nums) {
//        int i=0;
//        while(i<nums.length){
//            int correct_index=nums[i]-1;
//            if(nums[i] > 0 && nums[i] <= nums.length && nums[i]!=nums[correct_index] ){
//                int temp=nums[i];
//                nums[i]=nums[correct_index];
//                nums[correct_index]=temp;
//            }
//            else{
//                i++;
//            }
//        }
//        int k=1;
//        for(int j=0;j<nums.length;j++){
//            if(nums[j] != j+1 ){
//                return j+1;
//            }
//        }
//        return nums.length+1;
//    }
//}
}
