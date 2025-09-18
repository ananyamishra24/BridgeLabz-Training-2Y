import java.util.Scanner;
public class windchill{
    public static double calculateWindChill(double temperature,double windSpeed){
        double windchill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75)*Math.pow(windSpeed,0.16);
        return windchill;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double temp,wspeed;
        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();
        System.out.print("Enter the speed of the wind: ");
        wspeed = scanner.nextDouble();
        double result = calculateWindChill(temp,wspeed);
        System.out.print("The wind chill temperature is " + result);
    }
}