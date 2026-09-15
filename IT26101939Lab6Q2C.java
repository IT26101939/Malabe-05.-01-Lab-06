import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];
        int i = 0;

        // Enter 10 numbers
        while (i < 10) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
            i++;
        }

        // Print the numbers
        i = 0;
        while (i < 10) {
            System.out.print(numbers[i] + " ");
            i++;
        }
    }
}