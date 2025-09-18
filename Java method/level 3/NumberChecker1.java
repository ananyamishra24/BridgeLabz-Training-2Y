import java.util.Scanner;

public class NumberChecker1 {

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

    // Method to get digits in an array
    public static int[] getDigitsArray(int number) {
        int n = number;
        int size = countDigits(number);
        int[] digits = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n = n / 10;
        }
        return digits;
    }

    // Method to sum digits
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    // Method to sum squares of digits
    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, 2);
        return sum;
    }

    // Check if Harshad number
    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    // Frequency of each digit
    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2]; // 10 rows for digits 0-9
        for (int i = 0; i < 10; i++) freq[i][0] = i; // store digit in first column

        for (int d : digits) {
            freq[d][1]++; // increment frequency
        }
        return freq;
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

        System.out.println("Sum of digits: " + sumOfDigits(digits));
        System.out.println("Sum of squares of digits: " + sumOfSquares(digits));
        System.out.println("Is Harshad number? " + isHarshadNumber(number, digits));

        int[][] freq = digitFrequency(digits);
        System.out.println("Digit Frequencies:");
        System.out.println("Digit | Frequency");
        for (int i = 0; i < 10; i++) {
            if (freq[i][1] > 0) { // only display digits that appear
                System.out.println("  " + freq[i][0] + "   |   " + freq[i][1]);
            }
        }
    }
}
