import java.util.Scanner;
public class factors{
    public static factor{
        int n,t = 0,sum = 0,square = 0,product = 1;
        int [] fac = new int[n];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = scanner.nextInt();
        for(int i =1;i<=n;i++){
              if(n%i==0){
                 fac[t] = i;
                 t++;
              }
        }
        System.out.println("The factors are: ");
        for(int i = 0;i<fac.length;i++){
               System.out.print(fac[i]);
               sum+=fac[i];
               square+=Math.pow(i,2);
               product*=fac[i];
        }
        System.out.print("Sum: " + sum);
        System.out.print("Product: " + product);
    }
    
}