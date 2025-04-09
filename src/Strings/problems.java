package Strings;

import java.util.ArrayList;

public class problems {
    public static void main(String[] args) {
        String s="abc";
        System.out.println(substrings(s,0,0,new ArrayList<String>()));

    }

    /**
     * this problem is for finding substrings
     * also used these method in neetcode problems to solve others
     * should have it in mind while working with strings
     * */
    public static ArrayList<String> substrings(String str, int start, int end, ArrayList<String> subs){
        if(start==str.length()){
            return subs;
        }
        if(end <= str.length()){
            if(start < end){
                subs.add(str.substring(start,end));
            }
            substrings(str,start,end+1,subs);
        }else{
            substrings(str,start+1,start+1,subs);
        }
        return subs;
    }
//    public static ArrayList<String> substrings2(String str,char last,int start,ArrayList<String> subs){
//        if(start == str.length()){
//            return subs;
//        }
//        char to_be_added=str.charAt(start);
//
//
//    }
}
