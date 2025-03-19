package Recursions;

public class Recursions {
    public static void main(String[] args) {
        //printing problem
    //printing(0,33);
        //factoiral problem
      //  System.out.println(factorial(8));
        //sum probelm
        //like sum of 1342=10 ,  1111=4
        System.out.println(sum(-123));
        System.out.println(product(111223344));
    }
    //simple printing function
    public static void printing(int num,int limit){
        if(num>=limit){
            System.out.println(num);
            return;
        }
        System.out.println(num);
        printing(num+1,limit);
    }
    public static int factorial(int num){
        if(num==0){
            return 1;
        }
        return  num * factorial(num-1);
    }
    public static int sum(int num){
        if(num==0){
            return num;
        }
        return (num%10) + sum(num/10);
    }
    public static int product(int num){
        if(num==0){
            return 1;
        }
        return (num%10) * product(num/10);
    }

}
