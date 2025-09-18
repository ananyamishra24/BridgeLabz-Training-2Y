import java.util.Scanner;

public class vote {

    // Method to check if a student can vote
    public boolean canStudentVote(int age) {
        if (age < 0) {
            return false; // invalid age
        } else if (age >= 18) {
            return true; // eligible to vote
        } else {
            return false; // not eligible
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentVoteChecker checker = new StudentVoteChecker();

        int[] ages = new int[10]; // store 10 students' ages

        // Take input for all 10 students
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }

        // Check voting eligibility
        for (int i = 0; i < ages.length; i++) {
            boolean canVote = checker.canStudentVote(ages[i]);
            if (ages[i] < 0) {
                System.out.println("Student " + (i + 1) + " has invalid age (" + ages[i] + "). Cannot vote.");
            } else if (canVote) {
                System.out.println("Student " + (i + 1) + " with age " + ages[i] + " is eligible to vote.");
            } else {
                System.out.println("Student " + (i + 1) + " with age " + ages[i] + " is NOT eligible to vote.");
            }
        }

        scanner.close();
    }
}
