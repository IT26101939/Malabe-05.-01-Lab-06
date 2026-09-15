import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 1;

        while (i <= 10) {
            System.out.print("Enter number " + i + ": ");
            int num = input.nextInt();

            System.out.println("You entered: " + num);

            i++;
        }
    }
}

Example Output
Enter number 1: 5
You entered: 5
Enter number 2: 8
You entered: 8
Enter number 3: 12
You entered: 12
...
Enter number 10: 25
You entered: 25

If the question means enter 10 numbers and then print all 10 numbers together, use an array:

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

