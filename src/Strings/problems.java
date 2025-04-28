package Strings;

public class problems {
    public static void main(String[] args) {
        String s = "abcdef";

        // 1: First problem: skipping a specific character
         System.out.println(skipCharacter(s));

        // 2: Second problem: skip a substring
        System.out.println(skipSubstring(s));


    }

    /**
     * Problem 1: Skip a specific character ('e') in the string.
     */
    public static String skipCharacter(String original) {
        if (original.isEmpty()) {
            return "";
        }
        if (original.charAt(0) == 'e') {
            return skipCharacter(original.substring(1));
        } else {
            return original.charAt(0) + skipCharacter(original.substring(1));
        }
    }

    /**
     * Problem 2: Skip a specific substring ("ef") inside a string.
     */
    public static String skipSubstring(String original) {
        if (original.isEmpty()) {
            return "";
        }
        if (original.startsWith("ef")) {
            return skipSubstring(original.substring(2));
        } else {
            return original.charAt(0) + skipSubstring(original.substring(1));
        }
    }
}
