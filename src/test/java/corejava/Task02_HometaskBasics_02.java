package corejava;
import java.util.Scanner;

   public class Task02_HometaskBasics_02 {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

      
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        
        double result;

      
        switch (operation) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;

            case '/':
              
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                }
                break;

            default:
                System.out.println("Error: Invalid operation. Please enter +, -, *, or /.");
                break;
        }

       
        scanner.close();
    }
}