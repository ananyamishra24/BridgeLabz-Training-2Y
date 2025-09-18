import java.util.Scanner;
public class leap_year{
    public static boolean ly(int n){
       if(n>=1582){
        if((n%4==0&&n%400!=0||n%400==0)){
            return true;
        }
        else{
            return false;
        }
        
       } 
       else{
        return false;
       }
    public static void main(String[] args){
      int year;
      System.out.print("Enter the year: ");
    Scanner scanner = new Scanner(System.in);
     year = scanner.nextInt();
     int result = ly(year);
     System.out.print(result);
    }
    }
}