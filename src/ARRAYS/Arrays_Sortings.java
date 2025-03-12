package ARRAYS;
import java.util.*;
public class Arrays_Sortings {
    public static void main(String[] args) {
       // int arr[]={4,5,1,2,3};
        //bubbel sort
//         int  sorted_arr[]=bubble_sort(arr);
//        int sorted_arr[]=selection_sort(arr);
        //int sorted_arr[]=insertion_sort2(arr);
        int[] arr = {5, 3, 4, 1, 2};
        int sorted_arr[]=cyclicSort(arr);
        System.out.println(Arrays.toString(sorted_arr));

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
            System.out.println(Arrays.toString(arr));
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
    public static int [] insertion_sort1(int [] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = i+1; j > 0; j--) {
                if(arr[j-1]>arr[j]){
                    //this is XOR swapping technique which do not require an additional variable
                    arr[j]=arr[j]^arr[j-1];
                    arr[j-1]=arr[j]^arr[j-1];
                    arr[j]=arr[j] ^ arr[j-1];
                }
            }
            System.out.println(Arrays.toString(arr));

        }
        return arr;
    }
    public static int[] insertion_sort2(int [] arr){
        for (int i = 1; i < arr.length ; i++) {
          int current=arr[i];
          int j=i-1;
          while(j>=0 && arr[j]>current ){
              arr[j+1]=arr[j];
              j--;
          }
          arr[j+1]=current;
        }
        return arr;
    }
    public static int[] cyclicSort(int arr[]) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1; // Correct position for current value
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++; // Move to the next index if already in the correct place
            }
        }
        return  arr;
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

