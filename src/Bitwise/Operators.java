package Bitwise;

public class Operators {
    public static void main(String[] args) {
        int a = 10;  // Binary: 1010
        int b = 5;   // Binary: 0101

        System.out.println("a = " + a + " -> Binary: " + Integer.toBinaryString(a));
        System.out.println("b = " + b + " -> Binary: " + Integer.toBinaryString(b));

        // Bitwise AND
        int andResult = a & b;
        System.out.println("\na & b = " + andResult + " -> Binary: " + Integer.toBinaryString(andResult));

        // Bitwise OR
        int orResult = a | b;
        System.out.println("a | b = " + orResult + " -> Binary: " + Integer.toBinaryString(orResult));

        // Bitwise XOR
        int xorResult = a ^ b;
        System.out.println("a ^ b = " + xorResult + " -> Binary: " + Integer.toBinaryString(xorResult));

        // Bitwise NOT
        int notA = ~a;
        System.out.println("~a = " + notA + " -> Binary: " + Integer.toBinaryString(notA));

        // Left Shift
        int leftShift = a << 1;
        System.out.println("\na << 1 = " + leftShift + " -> Binary: " + Integer.toBinaryString(leftShift));

        // Right Shift
        int rightShift = a >> 1;
        System.out.println("a >> 1 = " + rightShift + " -> Binary: " + Integer.toBinaryString(rightShift));

        // Unsigned Right Shift
        int unsignedRightShift = a >>> 1;
        System.out.println("a >>> 1 = " + unsignedRightShift + " -> Binary: " + Integer.toBinaryString(unsignedRightShift));
    }
}
