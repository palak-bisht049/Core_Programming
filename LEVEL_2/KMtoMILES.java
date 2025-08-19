import java.util.*;

public class KMtoMILES {

    public static double kmToMiles(double km) {
        return km * 0.621371;
    }

    public static double milesToKm(double miles) {
        return miles * 1.609344;
    }

    public static double metersToFeet(double meters) {
        return meters * 3.28084;
    }

    public static double inchesToFeet(double inches) {
        return inches / 12;
    }

    public static void main(String[] args) {
        System.out.println("5 km = " + kmToMiles(5) + " miles");
        System.out.println("3 miles = " + milesToKm(3) + " km");
        System.out.println("2 meters = " + metersToFeet(2) + " feet");
        System.out.println("24 inches = " + inchesToFeet(24) + " feet");
    }
}








//OUTPUT ->
// 5 km = 3.106855 miles
// 3 miles = 4.828032 km
// 2 meters = 6.56168 feet
// 24 inches = 2.0 feet
