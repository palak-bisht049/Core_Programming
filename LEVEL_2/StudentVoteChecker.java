import java.util.Scanner;

public class StudentVoteChecker {
    
    // Method to check if student can vote
    public static boolean canStudentVote(int age) {
        // Check for negative age
        if (age < 0) {
            System.out.println("Invalid age! Age cannot be negative.");
            return false;
        }
        // Check voting eligibility
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] studentAges = new int[10];
        
        System.out.println("Enter the ages of 10 students:");
        
        // Input ages for 10 students
        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            studentAges[i] = scanner.nextInt();
        }
        
        System.out.println("\nVoting Eligibility Results:");
        
        // Check and display voting eligibility for each student
        for (int i = 0; i < studentAges.length; i++) {
            boolean canVote = canStudentVote(studentAges[i]);
            System.out.println("Student " + (i + 1) + " (Age: " + studentAges[i] + "): " + (canVote ? "Can vote" : "Cannot vote"));
        }
        
        scanner.close();
    }
}
