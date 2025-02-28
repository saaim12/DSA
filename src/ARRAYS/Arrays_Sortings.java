package ARRAYS;
import java.util.*;
public class Arrays_Sortings {
    public static void main(String[] args) {
        int arr[]={2,3,4,1,18,-2,-33,-1,20};
        //bubbel sort
//         int  sorted_arr[]=bubble_sort(arr);
        int sorted_arr[]=selection_sort(arr);
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
    public static int[] selection_sort(int arr[]) {
        for (int i = 0; i < arr.length ; i++) {
            int last= arr.length-i-1;
            int index=getMaxIndex(arr,0,last);
            // Swap if index is not already at the correct position
            if (index != last) {
                arr[index] = arr[index] ^ arr[last];
                arr[last] = arr[index] ^ arr[last];
                arr[index] = arr[index] ^ arr[last];
            }

        }
        return arr;
    }
    public static int getMaxIndex(int arr[],int start,int end){
        int max=start;
        int index=0;
        for (int i =start+ 1; i <=end ; i++) {
            if(arr[i]>arr[max]){
                index=i;
            }
        }
        return index;
    }
}

