import java.util.Scanner;
public class smallest_largest{
    public static int findSmallestAndLargest(int number1,int number2,int number3){
     if(number1>number2&&number1>number3){
        return number1;
     }
     else if(number2>number1 && number2>number3){
        return number2;
     }
     else{
        return number3;
     }
    }
    public static void main(String[] args){
        int n1,n2,n3;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number1: ");
        n1 = scanner.nextInt();
        System.out.print("Enter the number2: ");
        n2 = scanner.nextInt();
        System.out.print("Enter the number3: ");
        n3 = scanner.nextInt();
        int result = findSmallestAndLargest(n1,n2,n3);
        System.out.print("The greatest number is " + result);
    }
}