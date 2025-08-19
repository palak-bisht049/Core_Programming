import java.util.Scanner;

public class NumberAnalyzer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        // Take user input for 5 numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Analyze each number
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + numbers[i] + ": ");
            if (isPositive(numbers[i])) {
                System.out.print("Positive, ");
                System.out.println(isEven(numbers[i]) ? "Even" : "Odd");
            } else {
                System.out.println("Negative");
            }
        }

        // Compare first and last elements
        int comparison = compare(numbers[0], numbers[numbers.length - 1]);
        System.out.print("\nComparison result: ");
        if (comparison == 1) {
            System.out.println("First number is greater than last number");
        } else if (comparison == -1) {
            System.out.println("First number is less than last number");
        } else {
            System.out.println("First and last numbers are equal");
        }
    }

    // Method to check if number is positive
    public static boolean isPositive(int num) {
        return num >= 0;
    }

    // Method to check if number is even
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    // Method to compare two numbers
    public static int compare(int num1, int num2) {
        if (num1 > num2) {
            return 1;
        } else if (num1 < num2) {
            return -1;
        } else {
            return 0;
        }
    }
}





//OUTPUT ->
// Enter 5 numbers:
// 2 4 6 5 8
// Number 2: Positive, Even
// Number 4: Positive, Even
// Number 6: Positive, Even
// Number 5: Positive, Odd
// Number 8: Positive, Even