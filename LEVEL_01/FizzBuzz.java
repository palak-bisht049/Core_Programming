import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("Not a positive integer");
            return;
        }

        String[] result = new String[number + 1];

        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                result[i] = "FizzBuzz";
            else if (i % 3 == 0)
                result[i] = "Fizz";
            else if (i % 5 == 0)
                result[i] = "Buzz";
            else
                result[i] = String.valueOf(i);
        }

        for (int i = 1; i <= number; i++)
            System.out.println("Position " + i + " = " + result[i]);
    }
}










//OUTPUT ->
// 15
// Position 1 = 1
// Position 2 = 2
// Position 3 = Fizz
// Position 4 = 4
// Position 5 = Buzz
// Position 6 = Fizz
// Position 7 = 7
// Position 8 = 8
// Position 9 = Fizz
// Position 10 = Buzz
// Position 11 = 11
// Position 12 = Fizz
// Position 13 = 13
// Position 14 = 14
// Position 15 = FizzBuzz