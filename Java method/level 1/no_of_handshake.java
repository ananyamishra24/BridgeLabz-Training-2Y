import java.util.Scanner;
public class no_of_handshake{
   public static int handshake(int n){
    int h = (n * (n-1))/2;
    return h;
   }
public static void main(String [] args){
    int people;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number of peoples: ");
    people = scanner.nextInt();
    int hand = no_of_handshake(people);
    System.out.print("The no of handshake are: " + hand);
}

}