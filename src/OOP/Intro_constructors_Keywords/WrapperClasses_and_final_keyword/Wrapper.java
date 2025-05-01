package OOP.Intro_constructors_Keywords.WrapperClasses_and_final_keyword;
import java.util.*;

public class Wrapper {

        public static void main(String[] args) {
            // Primitive type
            int a = 5;

            // Wrapper class object
            Integer b = Integer.valueOf(a); // Manual boxing
            System.out.println("Integer object b = " + b);

            // Autoboxing: automatic conversion from primitive to wrapper
            Integer c = a;
            System.out.println("Autoboxed Integer c = " + c);

            // Unboxing: automatic conversion from wrapper to primitive
            int d = c;
            System.out.println("Unboxed value d = " + d);

            // Wrapper class with ArrayList (can't store primitive `int`)
            ArrayList<Integer> list = new ArrayList<>();
            list.add(10); // Autoboxing: int -> Integer
            list.add(20);

            System.out.println("ArrayList with wrapper integers: " + list);

            // Using utility methods of wrapper class
            String number = "123";
            int parsed = Integer.parseInt(number); // String -> int
            System.out.println("Parsed integer from string: " + parsed );

            String boolStr = "true";
            boolean flag = Boolean.parseBoolean(boolStr);
            System.out.println("Parsed boolean: " + flag);
        }
        //wrapper classes are bascially final so we cannot change them by pass by reference

}
