import java.util.Scanner;
public class chocolateproblem{
    public static int[] chocolate(int n,int m){
        int remaining = m%n;
        int total = n - remaining;
        return new int[] {remaining,total};
    }
    public static void main(String[] args){
        int total,children;
        System.out.print("Enter the number of chocolates: ");
        Scanner scanner = new Scanner(System.in);
        total = scanner.nextInt();
        System.out.print("Enter the number of childrens: ");
        children = scanner.nextInt();
        int [] result = chocolate(total,children);
        System.out.print("The remaining chocolates: "+ result[0]);
        System.out.print("Each children get " + result[1] + " chocolate");
    }
}