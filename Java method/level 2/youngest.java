import java.util.Scanner;

public class youngest {

    // Method to find the youngest friend
    public static String findYoungest(String[] names, int[] ages) {
        int minAge = ages[0];
        int index = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                index = i;
            }
        }
        return names[index];
    }

    // Method to find the tallest friend
    public static String findTallest(String[] names, int[] heights) {
        int maxHeight = heights[0];
        int index = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                index = i;
            }
        }
        return names[index];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Friend names
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        int[] heights = new int[3];

        // Taking user input
        for (int i = 0; i < friends.length; i++) {
            System.out.print("Enter age of " + friends[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height (in cm) of " + friends[i] + ": ");
            heights[i] = sc.nextInt();
        }

        // Find youngest and tallest
        String youngest = findYoungest(friends, ages);
        String tallest = findTallest(friends, heights);

        // Display results
        System.out.println("\nYoungest Friend: " + youngest);
        System.out.println("Tallest Friend: " + tallest);

        sc.close();
    }
}
