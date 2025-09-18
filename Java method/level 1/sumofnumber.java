import java.util.Scanner;
public class sumofnumber{
    public static int sum(int n){
        int sum = 0;
        for(int i =1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args){
        int n;
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter the range of the series: ");
       n = scanner.nextInt();
       int result = sum(n);
       System.out.print("The sum of the series is: " + result);
    }
}