import java.util.Scanner;

public class RunningAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0;
        int count = 0;

        while (true) {
            System.out.print("Enter a number (-1 to stop): ");
            double number = input.nextDouble();

            if (number == -1) {
                System.exit(0);
            }

            total += number;
            count++;
            double runningAverage = total / count;
            System.out.printf("Running average: %.2f%n", runningAverage);
        }

    }
}
