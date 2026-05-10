import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char choice;

        do {

            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            System.out.print("Enter operator (+, -, *, /): ");
            char op = sc.next().charAt(0);

            double result;

            switch(op) {

                case '+':
                    result = num1 + num2;
                    System.out.println("Result = " + result);
                    break;

                case '-':
                    result = num1 - num2;
                    System.out.println("Result = " + result);
                    break;

                case '*':
                    result = num1 * num2;
                    System.out.println("Result = " + result);
                    break;

                case '/':
                    if(num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result = " + result);
                    } else {
                        System.out.println("Division by zero is not allowed.");
                    }
                    break;

                default:
                    System.out.println("Invalid Operator");
            }

            System.out.print("Do you want to continue? (y/n): ");
            choice = sc.next().charAt(0);

        } while(choice == 'y' || choice == 'Y');

        System.out.println("Calculator Closed.");

        sc.close();
    }
}