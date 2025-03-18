package Recursions;

public class Recursions {
    public static void main(String[] args) {
       // printing(10);
        fibbonachi_sequence(53);
    }
    //simple printing function
    public static void printing(int num){
        if(num==0){
            System.out.println(num);
            return;
        }
        System.out.println(num);
        printing(num-1);
    }
    //fibbonachi sequence
    public static int fibbonachi_sequence(int num){
        if(num<2){
            System.out.println(num);
            return 0;
        }
        System.out.println(num);
        return fibbonachi_sequence(num-1) + fibbonachi_sequence(num-2);
    }
}
