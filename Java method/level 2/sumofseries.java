import java.util.Scanner;
public class sumofseries{
    public static int sum(int n,int sum = 0){
       if(n==1){
        return 1;
       }
       return n+ sum(n-1);
    }
    public  static int seriesum(int n){
        return (n*(n+1))/2;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the range of the series: ");
        n = scanner.nextInt();
        int sum1 = sum(n);
        int sum2 = seriesum(n);
        if(sum1 == sum2){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
    
}