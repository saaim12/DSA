package ARRAYS;
import java.util.*;
public class Arrays_Sortings {
    public static void main(String[] args) {
        int arr[]={2,3,4,1,18,-2,-33,-1,20};
        //bubbel sort
         int  sorted_arr[]=bubble_sort(arr);
        System.out.println(Arrays.toString(sorted_arr));
        //selection sort

        //insertion sort

    }
    public static int[] bubble_sort(int arr[]){
        if(arr.length==0){
            return arr;
        }
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 1; j <=arr.length-i-1; j++) {
                if(arr[j-1]>arr[j]){
                    //this is XOR swapping technique which dont requires and additional variable
                    arr[j]=arr[j]^arr[j-1];
                    arr[j-1]=arr[j]^arr[j-1];
                    arr[j]=arr[j] ^ arr[j-1];
                }
            }
        }
        return arr;

    }
}
