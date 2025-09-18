import java.util.Scanner;
public class no_of_round{
    public static double round(double n1,double n2,double n3){
        double perimeter = n1+ n2 + n3;
        return perimeter;
    }
    public static void main(String[] args){
        double n1,n2,n3,distance = 5;
        System.out.print("Enter the first side of the triangle: ");
        Scanner scanner = new Scanner(System.in);
        n1 = scanner.nextDouble();
        System.out.print("Enter the second side of the triangle: ");
        n2 = scanner.nextDouble();
        System.out.print("Enter the third side of the traingle: ");
        n3 = scanner.nextDouble();
        double rounds = round(n1,n2,n3)/distance;
        System.out.print("The number p")
        
    }
}