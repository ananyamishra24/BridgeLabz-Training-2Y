import java.util.Scanner;
public class springsseason{
    public static boolean season(int date,int month){
        if(date>=20 &&(month>=3&&month<=6)){
            return true;

        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        int date,month;
        System.out.print("Enter the date: ");
        Scanner scanner = new Scanner(System.in);
        date = scanner.nextInt();
        System.out.print("Enter the month: ");
        month = scanner.nextInt();
        int result = springsseason(date,month);
        if(result == true){
            System.out.print("Its a Spring Season");
        }
        else{
            System.out.print("Not a Spring season");
        }
    }
}