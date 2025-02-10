package ARRAYS;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={11,2,3,4,5,6,7,8};
        int target=6;
        System.out.println(LinearSearching(arr,target));
        System.out.println(finding_even_no(arr));
    }
    public static boolean LinearSearching(int arr[],int target){
         if(arr.length ==0){
             return false;
         }
         for (int element: arr ){
             if(element==target){
                return true;
             }
         }
         return false;
    }
    //leetcode problem 1295
    //for finding even no of digits
    public static int finding_even_no(int arr[]){
        if(arr.length==0){
            return 0;
        }
        //for counting the no of vaues in array having even no of digits
        int count=0;
        for (int element:arr){
            if(check_even_digits(element)){
                count ++;
            }
        }
        return count;
    }
    public static boolean check_even_digits(int value){
        int count=0;
        value = Math.abs(value); // Ensure positive number to handle negative inputs
        if (value == 0) { // Special case for 0
            return false;  // 0 has 1 digit, which is odd
        }
        while(value>0){
            value=value/10;
            count ++;
        }
        return count%2==0;
    }
    //leetcode richest-customer-wealth
//    class Solution {
//        public int maximumWealth(int[][] accounts) {
//            int max=0;
//
//            for(int i=0;i<accounts.length;i++){
//                int sum = 0;
//                for(int j=0;j<accounts[i].length;j++){
//                    sum += accounts[i][j];
//                }
//                if(sum>max){
//                    max=sum;
//                }
//            }
//            return max;
//        }
//    }
}
