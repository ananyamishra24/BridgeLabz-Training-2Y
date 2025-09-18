import java.util.Scanner;
import java.util.Arrays;
public class practice{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
      int n;
      System.out.print("Enter the range of the series: ");
      n = scanner.nextInt();
      for(int i = 1;i<=n;i++){
        for(int j = 1;j<=i;j++){
            if((i+j)%2==0){
                System.out.print("1 ");
            }
            else{
                System.out.print("0 ");
            }
            
        }
        System.out.print("\n");
      }
    }
}
