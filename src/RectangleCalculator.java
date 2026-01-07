import java.util.Scanner;

public class RectangleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Get User Input
        double length = getValidDimension("length", scanner);
        double width = getValidDimension("width", scanner);

        // 2. Perform Calculations
        double area = calculate(length, width, "area");
        double perimeter = calculate(length, width, "perimeter");

        // 3. Display Results
        displayResults(length, width, area, perimeter);

        scanner.close();
    }

    /**
     * Task 1: Handles user input and ensures no negative numbers are entered.
     */
    public static double getValidDimension(String name, Scanner scanner) {
        double value;
        while (true) {
            System.out.print("Enter the " + name + ": ");
            if (scanner.hasNextDouble()) {
                value = scanner.nextDouble();
                if (value >= 0) {
                    break;
                } else {
                    System.out.println("Error: " + name + " cannot be negative. Please try again.");
                }
            } else {
                System.out.println("Error: Invalid input. Please enter a numeric value.");
                scanner.next(); // Clear invalid input
            }
        }
        return value;
    }

    /**
     * Task 2: Core calculation logic in a single method.
     */
    public static double calculate(double l, double w, String type) {
        if (type.equalsIgnoreCase("area")) {
            return l * w;
        } else if (type.equalsIgnoreCase("perimeter")) {
            return 2 * (l + w);
        }
        return 0;
    }

    /**
     * Task 3: Formatted result display.
     */
    public static void displayResults(double l, double w, double area, double perimeter) {
        System.out.println("\n--- Rectangle Results ---");
        System.out.printf("Dimensions:  %.2f x %.2f%n", l, w);
        System.out.printf("Area:        %.2f%n", area);
        System.out.printf("Perimeter:   %.2f%n", perimeter);
        System.out.println("-------------------------");
    }
}