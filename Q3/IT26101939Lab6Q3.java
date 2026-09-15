import java.util.Scanner;

public class IT26101939Lab6Q3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double sumOfSquares = 0;
        int count = 0;
        int number;

        System.out.println("Enter positive integers (-99 to stop):");

        while (true) {
            System.out.print("Enter number: ");
            number = input.nextInt();

            // Sentinel value
            if (number == -99) {
                break;
            }

            // Validate negative input
            if (number < 0) {
                System.out.println("Invalid input! Please enter a positive number.");
                continue;
            }

            // Add square of the number
            sumOfSquares += Math.pow(number, 2);
            count++;
        }

        // Calculate RMS
        if (count > 0) {
            double rms = Math.sqrt(sumOfSquares / count);

            System.out.println("\nNumber of values entered: " + count);
            System.out.println("Sum of squares: " + sumOfSquares);
            System.out.println("Root Mean Square: " + rms);
        } else {
            System.out.println("\nNo numbers were entered.");
        }

        input.close();
    }
}

