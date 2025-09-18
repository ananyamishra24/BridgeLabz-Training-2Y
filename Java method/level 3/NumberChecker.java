import java.util.Scanner;

public class NumberChecker {

    // Count digits
    public static int countDigits(int number) {
        int count = 0;
        int n = number;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    // Store digits in an array
    public static int[] getDigitsArray(int number) {
        int n = number;
        int numDigits = countDigits(number);
        int[] digits = new int[numDigits];

        // Fill array from last digit to first
        for (int i = numDigits - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n = n / 10;
        }
        return digits;
    }

    // Check Duck Number (has 0)
    public static boolean isDuckNumber(int number) {
        int n = number;
        while (n > 0) {
            if (n % 10 == 0) return true;
            n = n / 10;
        }
        return false;
    }

    // Check Armstrong Number
    public static boolean isArmstrong(int number) {
        int[] digits = getDigitsArray(number);
        int n = digits.length;
        int sum = 0;
        for (int d : digits) {
            int power = 1;
            for (int i = 0; i < n; i++) power *= d; // d^n
            sum += power;
        }
        return sum == number;
    }

    // Find largest and second largest
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > largest) {
                second = largest;
                largest = d;
            } else if (d > second && d != largest) {
                second = d;
            }
        }
        return new int[]{largest, second};
    }

    // Find smallest and second smallest
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < smallest) {
                second = smallest;
                smallest = d;
            } else if (d < second && d != smallest) {
                second = d;
            }
        }
        return new int[]{smallest, second};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] digits = getDigitsArray(number);

        System.out.println("Number of digits: " + digits.length);

        System.out.print("Digits: ");
        for (int d : digits) System.out.print(d + " ");
        System.out.println();

        System.out.println("Is Duck Number? " + isDuckNumber(number));
        System.out.println("Is Armstrong Number? " + isArmstrong(number));

        int[] largest = findLargestAndSecondLargest(digits);
        System.out.println("Largest: " + largest[0] + ", Second Largest: " + largest[1]);

        int[] smallest = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest: " + smallest[0] + ", Second Smallest: " + smallest[1]);
    }
}
