public class type_of_number{
    import java.util.Scanner;
class Main {
    public static int type_number(int n){
        if(n>0){
            return 1;
        }
        else if(n<0){
            return -1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int result = type_number(number);
        System.out.print(result);
        
    }
}
}