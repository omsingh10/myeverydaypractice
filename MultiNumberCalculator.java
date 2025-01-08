import java.util.Scanner;

public class MultiNumberCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        int numCount;
        double result;

        do {
            // Display menu
         
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            choice = scanner.nextInt();

            // If the user wants to perform a calculation
            if (choice >= 1 && choice <= 4) {
                // Get how many numbers the user wants to enter
                System.out.print("How many numbers do you want to calculate? ");
                numCount = scanner.nextInt();

                // Check if the user has entered a valid number of numbers
                if (numCount < 2) {
                    System.out.println("You need to enter at least two numbers for the calculation.");
                    continue;
                }

                // Initialize the result to 0 for addition, 1 for multiplication, and the first number for subtraction and division
                System.out.print("Enter the first number: ");
                result = scanner.nextDouble();

                // Loop through the remaining numbers and perform the operation
                for (int i = 2; i <= numCount; i++) {
                    System.out.print("Enter number " + i + ": ");
                    double num = scanner.nextDouble();

                    switch (choice) {
                        case 1: // Addition
                            result += num;
                            break;
                        case 2: // Subtraction
                            result -= num;
                            break;
                        case 3: // Multiplication
                            result *= num;
                            break;
                        case 4: // Division
                            // Handle division by zero
                            if (num == 0) {
                                System.out.println("Error: Division by zero is not allowed.");
                                result = Double.NaN; // Invalid result
                                break;
                            } else {
                                result /= num;
                            }
                            break;
                    }
                }

                // Display the result
                switch (choice) {
                    case 1:
                        System.out.println("Result (Addition): " + result);
                        break;
                    case 2:
                        System.out.println("Result (Subtraction): " + result);
                        break;
                    case 3:
                        System.out.println("Result (Multiplication): " + result);
                        break;
                    case 4:
                        if (Double.isNaN(result)) {
                            // If the result is NaN, it means there was an error like division by zero
                            System.out.println("Calculation failed due to division by zero.");
                        } else {
                            System.out.println("Result (Division): " + result);
                        }
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            } else if (choice == 5) {
                System.out.println("Exiting the calculator. Goodbye!");
            } else {
                System.out.println("Invalid choice. Please select again.");
            }

        } while (choice != 5); // Repeat until the user chooses to exit

        scanner.close();
    }
}
