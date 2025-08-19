import java.util.Scanner;

public class RandomNumberAnalyzer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user input for how many numbers to generate
        System.out.print("How many 4-digit random numbers would you like to generate? ");
        int count = scanner.nextInt();
        
        // Validate input
        while (count <= 0) {
            System.out.print("Please enter a positive number: ");
            count = scanner.nextInt();
        }
        
        // Generate array of four-digit random numbers
        int[] numbers = generate4DigitRandomArray(count);
        
        // Display the generated numbers
        System.out.print("\nGenerated numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        
        // Calculate and display results
        double[] results = findAverageMinMax(numbers);
        System.out.printf("\nAverage: %.2f\n", results[0]);
        System.out.println("Minimum: " + (int)results[1]);
        System.out.println("Maximum: " + (int)results[2]);
        
        scanner.close();
    }
    
    // Generates an array of four-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            // Math.random() generates 0.0 to 1.0, scale to 1000-9999
            numbers[i] = (int)(Math.random() * 9000) + 1000;
        }
        return numbers;
    }
    
    // Finds average, min, and max of an array
    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];
        
        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        
        double average = sum / numbers.length;
        return new double[]{average, min, max};
    }
}






//OUTPUT ->
// How many 4-digit random numbers would you like to generate? 2

// Generated numbers: 6297, 2831

// Average: 4564.00
// Minimum: 2831
// Maximum: 6297
