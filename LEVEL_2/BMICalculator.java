import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] members = new double[10][3]; // [weight][height][bmi]
        String[] statuses = new String[10];

        // Input data
        System.out.println("Enter weight (kg) and height (cm) for 10 members:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Member " + (i+1) + ": ");
            members[i][0] = sc.nextDouble(); // weight
            members[i][1] = sc.nextDouble(); // height
            members[i][2] = calculateBMI(members[i][0], members[i][1]);
            statuses[i] = getBMIStatus(members[i][2]);
        }

        // Display results
        System.out.println("\nBMI Results:");
        System.out.println("ID\tWeight(kg)\tHeight(cm)\tBMI\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t%.1f\t\t%.1f\t\t%.1f\t%s\n",
                i+1, members[i][0], members[i][1], members[i][2], statuses[i]);
        }
    }

    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100;
        return weight / (heightM * heightM);
    }

    public static String getBMIStatus(double bmi) {
        if (bmi <= 18.4) return "Underweight";
        if (bmi <= 24.9) return "Normal";
        if (bmi <= 39.9) return "Overweight";
        return "Obese";
    }
}









//OUTPUT ->
// Enter weight (kg) and height (cm) for 10 members:
// Member 1: 45
// 176
// Member 2: 70
// 186
// Member 3: 60
// 134
// Member 4: 56
// 186
// Member 5: 23
// 167
// Member 6: 45
// 182
// Member 7: 25
// 157
// Member 8: 45
// 134
// Member 9: 79
// 194
// Member 10: 14
// 159

// BMI Results:
// ID      Weight(kg)      Height(cm)      BMI     Status
// 1       45.0            176.0           14.5    Underweight
// 2       70.0            186.0           20.2    Normal
// 3       60.0            134.0           33.4    Overweight
// 4       56.0            186.0           16.2    Underweight
// 5       23.0            167.0           8.2     Underweight
// 6       45.0            182.0           13.6    Underweight
// 7       25.0            157.0           10.1    Underweight
// 8       45.0            134.0           25.1    Overweight
// 9       79.0            194.0           21.0    Normal
// 10      14.0            159.0           5.5     Underweight