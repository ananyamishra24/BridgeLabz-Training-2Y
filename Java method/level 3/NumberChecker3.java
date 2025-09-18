import java.util.Scanner;

public class NumberChecker {

    // Check prime number
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // Sum of digits of a number
    public static int sumOfDigits(int number) {
        int sum = 0;
        int n = number;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }

    // Product of digits of a number
    public static int productOfDigits(int number) {
        int prod = 1;
        int n = number;
        while (n > 0) {
            prod *= n % 10;
            n = n / 10;
        }
        return prod;
    }

    // Check neon number
    public static boolean isNeon(int number) {
        int square = number * number;
        return sumOfDigits(square) == number;
    }

    // Check spy number
    public static boolean isSpy(int number) {
        return sumOfDigits(number) == productOfDigits(number);
    }

    // Check automorphic number
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        int n = number;
        while (n > 0) {
            if (n % 10 != square % 10) return false;
            n /= 10;
            square /= 10;
        }
        return true;
    }

    // Check buzz number
    public static boolean isBuzz(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Is Prime Number? " + isPrime(number));
        System.out.println("Is Neon Number? " + isNeon(number));
        System.out.println("Is Spy Number? " + isSpy(number));
        System.out.println("Is Automorphic Number? " + isAutomorphic(number));
        System.out.println("Is Buzz Number? " + isBuzz(number));
    }
}
