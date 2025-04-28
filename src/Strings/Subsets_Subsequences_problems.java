package Strings;

import java.util.ArrayList;

public class Subsets_Subsequences_problems {
    public static void main(String[] args) {
    String str="abc";
       // System.out.println(subseq("",str,new ArrayList<String>()));
        //to print a ascii number of a char
        System.out.println('a'+0);
        //type casting it
        System.out.println((char) ('a'+2));
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

}
