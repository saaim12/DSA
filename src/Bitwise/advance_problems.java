package Bitwise;

public class advance_problems {
    public static void main(String[] args) {
        System.out.println(tows_complement_or_negative(5));
        int num=10;
        // it calculates the set bits
        System.out.println(Integer.bitCount(10));
        //padding
        String s=Integer.toBinaryString(10);
        String padded=String.format("%32s",s).replace(' ','0');
        System.out.println(padded);
    }


    public static int first_set_bit_index(int num) {
        if (num == 0) return 0;

        int index = 1;
        while ((num & 1) == 0) {
            num >>= 1;
            index++;
        }
        return index;
    }
    public static int tows_complement_or_negative(int num){
        int inverted_num=~num;
        inverted_num+=1;
        return inverted_num;
    }


}
