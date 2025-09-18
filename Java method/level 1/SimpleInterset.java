import java.util.Scanner;
public class SimpleInterest{
  public static double simpleinterest(double principal,double rate,double time){
    return (principal * rate * time)/100;
  }
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the principal Amount: ");
    double principal = scanner.nextDouble();
    System.out.print("Enter the rate of interest: ");
    double rate = scanner.nextDouble();
    Systen.out.print("Enter the time: ");
    double time = scanner.nextDouble();
    double si = SimpleInterest(principal,rate,time);
    System.out.print("The Simple Interest is " + si + " for principal "+ principal + "Rate of interest " + rate + "and time " + time);
    scanner.close();
  }
}