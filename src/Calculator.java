//march week 2
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the calculator!");
        System.out.println("Please enter the first number:");
        double num1 = scanner.nextDouble();
        System.out.println("Please enter the second number:");
        double num2 = scanner.nextDouble();

        Calculator calc = new Calculator(num1, num2);

        System.out.println("What operation do you want to perform? (+, -, *, /)");
        String operator = scanner.next();


        double result = 0.0;
        switch (operator) {
            case "+":
                result = calc.add();
                break;
            case "-":
                result = calc.subtract();
                break;
            case "*":
                result = calc.multiply();
                break;
            case "/":
                result = calc.divide();
                break;
            default:
                System.out.println("Invalid operator.");
                System.exit(0);
        }

        System.out.println("The result is: " + result);

        scanner.close();
    }

    private double num1;
    private double num2;

    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add() {
        return num1 + num2;
    }

    public double subtract() {
        return num1 - num2;
    }

    public double multiply() {
        return num1 * num2;
    }

    public double divide() {
        if (num2 == 0) {
            System.out.println("Cannot divide by zero.");
            System.exit(0);
        }
        return num1 / num2;
    }
}
