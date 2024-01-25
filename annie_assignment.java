import java.util.Scanner;
import java.util.InputMismatchException;


public class annie_assignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) { // Loop for retries
            try {
                System.out.print("Enter the first number (between 10 and 99): ");
                int firstNumber = scanner.nextInt();

                System.out.print("Enter the second number (between 10 and 99): ");
                int secondNumber = scanner.nextInt();

                System.out.print("Enter an operator (+, -, *, /): ");
                char operator = scanner.next().charAt(0);

                if (firstNumber < 10 || firstNumber > 99 || secondNumber < 10 || secondNumber > 99) {
                    System.out.println("Invalid input! Please enter two-digit numbers only.");
                    continue; // Retry input
                }

                if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
                    System.out.println("Invalid operator! Please enter +, -, *, or /.");
                    continue;
                }

                double result = 0;

                switch (operator) {
                    case '+':
                        result = firstNumber + secondNumber;
                        break;
                    case '-':
                        result = firstNumber - secondNumber;
                        break;
                    case '*':
                        result = firstNumber * secondNumber;
                        break;
                    case '/':
                        if (secondNumber == 0) {
                            System.out.println("Cannot divide by zero!");
                            continue;
                        } else {
                            result = (double) firstNumber / secondNumber;
                        }
                        break;
                }

                System.out.println("The result is: " + result);
                break; // Exit loop if successful calculation
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter numbers only.");
                scanner.nextLine(); // Clear invalid input
            }
        }

        scanner.close();
    }
}

