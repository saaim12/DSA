package Strings;

import java.util.ArrayList;
import java.util.List;

public class Subsets_Subsequences_problems {
    public static void main(String[] args) {
    String str="abc";
       System.out.println(subseq("",str,new ArrayList<String>()));
        //to print a ascii number of a char
        System.out.println('a'+0);
        //type casting it
        System.out.println((char) ('a'+2));
        System.out.println(subseq_iterative_method("123"));
    }
    // First subsequences problem
    public static ArrayList<String> subseq(String processed, String unprocessed, ArrayList<String> list) {
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            list.add(processed);
            return list;
            //we can also do list inside list
//            List<String> subset = new ArrayList<>();
//            subset.add(processed);
        }

        char ch = unprocessed.charAt(0);

        // Include the character
        subseq(processed + ch, unprocessed.substring(1), list);

        // Exclude the character
        subseq(processed, unprocessed.substring(1), list);

        return list;
    }
    public static List<List<Character>> subseq_iterative_method(String unprocessed) {
        char[] arr = unprocessed.toCharArray(); // Convert string to char array
        List<List<Character>> outer = new ArrayList<>(); // This will store all subsequences
        outer.add(new ArrayList<>()); // Add an empty list representing the empty subsequence

        for (char ch : arr) {
            int n = outer.size(); // Get the current size of the outer list

            for (int i = 0; i < n; i++) {
                List<Character> internal = new ArrayList<>(outer.get(i)); // Copy existing subsequence
                internal.add(ch); // Add the current character to the new subsequence
                outer.add(internal); // Add the new subsequence to the list
            }
        }

        return outer;
    }
}
