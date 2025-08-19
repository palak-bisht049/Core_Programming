import java.util.Scanner;

public class WindChillCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the temperature (in °F): ");
        double temperature = sc.nextDouble();

        System.out.print("Enter the wind speed (in mph): ");
        double windSpeed = sc.nextDouble();

        WindChillCalculator calculator = new WindChillCalculator();


        double windChill = calculator.calculateWindChill(temperature, windSpeed);

        System.out.printf("The wind chill temperature is: %.2f°F%n", windChill);

        sc.close();
    }
    public double calculateWindChill(double temperature, double windSpeed) {
        double windChill = 35.74 + 0.6215 * temperature 
                + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        return windChill;
    }
}





//OUTPUT ->
// Enter the temperature (in °F): 45
// Enter the wind speed (in mph): 23
// The wind chill temperature is: 36.44°F

