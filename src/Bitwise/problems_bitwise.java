package Bitwise;

public class problems_bitwise {
    public static void main(String[] args) {
        int a = 10; // Binary: 1010
        int b = 5;  // Binary: 0101

        // 1: Check if number is even or odd
        System.out.println("Is " + a + " even or odd? " + checkEvenOdd(a));

        // 2: Find the number that occurred only once in the array
        int[] arr = {1, 2, 3, 4, 5, 1, 2, 3, 4};
        System.out.println("Number that occurred once: " + numberOccuredOnce(arr));

        // 3: Get the 5th bit of number a
        ithBitOfNum(a, 5);

        // 4: Set the 2nd bit of a
        System.out.println("Set 2nd bit of " + a + ": " + setIthBit(a, 2));

        // 5: Clear the 2nd bit of a
        System.out.println("Clear 2nd bit of " + a + ": " + clearIthBit(a, 2));

        // 6: Toggle the 1st bit of a
        System.out.println("Toggle 1st bit of " + a + ": " + toggleIthBit(a, 1));

        // 7: Print binary of a
        System.out.println("Binary of " + a + ": " + Integer.toBinaryString(a));
    }

    // Method to get the ith bit of number a
    private static void ithBitOfNum(int a, int i) {
        int mask = 1 << (i - 1);
        int bit = (a & mask) != 0 ? 1 : 0;
        System.out.println("The " + i + "th bit of number " + a + " is: " + bit);
    }

    // Set the ith bit of number a
    private static int setIthBit(int a, int i) {
        int mask = 1 << (i - 1);
        return a | mask;
    }

    // Clear the ith bit of number a
    private static int clearIthBit(int a, int i) {
        int mask = ~(1 << (i - 1));
        return a & mask;
    }

    // Toggle the ith bit of number a
    private static int toggleIthBit(int a, int i) {
        int mask = 1 << (i - 1);
        return a ^ mask;
    }

    // Check whether a number is even or odd using bitwise AND
    public static String checkEvenOdd(int num) {
        return (num & 1) == 1 ? "odd" : "even";
    }

    // Find the number that occurs only once using XOR
    public static int numberOccuredOnce(int[] arr) {
        int num = 0;
        for (int a : arr) {
            num ^= a;
        }
        return num;
    }


}
