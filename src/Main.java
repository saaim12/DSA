//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int num=1234;
        int num2=0;
        while(num>0){
            System.out.println(num%10);


            int ls=num%10;
            num2=num2*10+ls;
            num/=10;
        }
        System.out.println(num);
        System.out.println(num2);
    }
}