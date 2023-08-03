package Calculator;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Calculator calculator = new CalculatorImpl();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Basic Calculator");
        System.out.println("----------------");
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Select operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.print("Enter your choice (1/2/3/4): ");
        int choice = scanner.nextInt();

        double result;
        switch (choice) {
            case 1:
                result = calculator.add(num1, num2);
                break;
            case 2:
                result = calculator.subtract(num1, num2);
                break;
            case 3:
                result = calculator.multiply(num1, num2);
                break;
            case 4:
                result = calculator.divide(num1, num2);
                break;
            default:
                System.out.println("Invalid choice.");
                scanner.close();
                return;
        }

        System.out.println("Result: " + result);
        scanner.close();
    }
}

