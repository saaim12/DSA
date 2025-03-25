package Recursions;

public class Recursions {
    public static void main(String[] args) {
        // Printing numbers from 0 to 33
        // printing(0, 33);

        // Factorial calculation
        // System.out.println(factorial(8));

        // Sum of digits problem (e.g., sum of 1342 = 10, 1111 = 4)
        // System.out.println(sum(1234));

        // Product of digits problem
        // System.out.println(product(111223344));

        // Reversing a number
        // System.out.println(reverse_num(4321, 0));
        // System.out.println(reversed_num_2(22339988));

        // Checking if a number is a palindrome
        // System.out.println(isPalindrome(1121));

        // Count occurrences of a digit in a given number
        //System.out.println(count_num(11223311, 2, 0));

        //check if the array is sorted
        //isSorted(array,starting index)
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 3, 2, 4, 5};

        System.out.println(isSorted(arr1, 0)); // true
        System.out.println(isSorted(arr2, 0)); // false

    }

    private static boolean isSorted(int[] arr, int index) {
        if(index==arr.length-1){
            return  true;
        }
        if(arr[index]>arr[index+1]){
            return false;
        }
        return isSorted(arr,index++);

    }

    /**
     * Recursively counts occurrences of a specific digit in a number.
     * @param originalNum The original number
     * @param num The digit to count
     * @param count The current count of occurrences
     * @return The total occurrences of the digit
     */
    private static int count_num(int originalNum, int num, int count) {
        if (originalNum == 0) {
            return count;
        }
        int digit = originalNum % 10;
        if (digit == num) {
            count++;
        }
        return count_num(originalNum / 10, num, count);
    }

    /**
     * Checks if a number is a palindrome.
     * @param num The number to check
     * @return true if it's a palindrome, false otherwise
     */
    private static boolean isPalindrome(int num) {
        return num == reversed_num_2(num);
    }

    /**
     * Recursively prints numbers from num to limit.
     * @param num Starting number
     * @param limit The limit to print up to
     */
    public static void printing(int num, int limit) {
        if (num > limit) {
            return;
        }
        System.out.println(num);
        printing(num + 1, limit);
    }

    /**
     * Recursively calculates the factorial of a number.
     * @param num The number
     * @return Factorial of the number
     */
    public static int factorial(int num) {
        if (num == 0) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    /**
     * Recursively calculates the sum of digits of a number.
     * @param num The number
     * @return Sum of its digits
     */
    public static int sum(int num) {
        if (num == 0) {
            return 0;
        }
        return (num % 10) + sum(num / 10);
    }

    /**
     * Recursively calculates the product of digits of a number.
     * @param num The number
     * @return Product of its digits
     */
    public static int product(int num) {
        if (num == 0) {
            return 1;
        }
        return (num % 10) * product(num / 10);
    }

    /**
     * Recursively reverses a number using an accumulating sum.
     * @param num The number to reverse
     * @param sum Accumulated reversed number
     * @return The reversed number
     */
    public static int reverse_num(int num, int sum) {
        if (num == 0) {
            return sum;
        }
        int digit = num % 10;
        sum = sum * 10 + digit;
        return reverse_num(num / 10, sum);
    }

    /**
     * Recursively reverses a number using logarithmic calculations.
     * @param num The number to reverse
     * @return The reversed number
     */
    public static int reversed_num_2(int num) {
        if (num == 0) {
            return 0;
        }
        int digit = num % 10;
        digit *= Math.pow(10, (int) (Math.log10(num)));
        return digit + reversed_num_2(num / 10);
    }
}
