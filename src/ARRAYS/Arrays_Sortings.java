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
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    //this is XOR swapping technique which dont requires and additional variable
                    arr[i]=arr[i]^arr[j];
                    arr[j]=arr[i]^arr[j];
                    arr[i]=arr[i] ^ arr[j];
                }
            }
        }
        return arr;

    }
}
