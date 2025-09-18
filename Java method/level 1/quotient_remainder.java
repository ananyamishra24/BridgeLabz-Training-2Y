import java.util.Scanner;
public class quotient_remainder{
    public static int[] divide(int n1,int d){
     int quotient = n1/d;
     int remainder = n1%d;
     return new int[] {quotient,remainder};
    }
    public static void main(String[] args){
        int n1,d;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n1 = scanner.nextInt();
        System.out.print("Enter the divisor: ");
        d = scanner.nextInt();
        int[] result = divide(n1,d);
        System.out.print("Quotient = "+ result[0]);
        System.out.print("Remainder = "+ result[1]);
    }
}