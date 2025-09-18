import java.util.Scanner;

public class NumberChecker {

    // Method to count digits
    public static int countDigits(int number) {
        int count = 0;
        int n = number;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    // Method to get digits array
    public static int[] getDigitsArray(int number) {
        int size = countDigits(number);
        int[] digits = new int[size];
        int n = number;
        for (int i = size - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n = n / 10;
        }
        return digits;
    }

    // Method to reverse a digits array
    public static int[] reverseArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays
    public static boolean arraysEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    // Method to check if number is palindrome
    public static boolean isPalindrome(int number) {
        int[] digits = getDigitsArray(number);
        int[] reversed = reverseArray(digits);
        return arraysEqual(digits, reversed);
    }

    // Method to check if number is a Duck Number (contains 0)
    public static boolean isDuckNumber(int number) {
        int[] digits = getDigitsArray(number);
        for (int d : digits) {
            if (d == 0) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] digits = getDigitsArray(number);

        System.out.println("Number of digits: " + digits.length);

        System.out.print("Digits array: ");
        for (int d : digits) System.out.print(d + " ");
        System.out.println();

        int[] reversed = reverseArray(digits);
        System.out.print("Reversed digits array: ");
        for (int d : reversed) System.out.print(d + " ");
        System.out.println();

        System.out.println("Is Palindrome? " + isPalindrome(number));
        System.out.println("Is Duck Number? " + isDuckNumber(number));
    }
}
