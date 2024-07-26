
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        int a = scan.nextInt();

        System.out.println("Enter your Operator number: ");
        String op = scan.next();

        System.out.println("Enter your second number: ");
        int b = scan.nextInt();

        int result = Calcute(a, op, b);
        System.out.println("Result: " + result);
    }

    public static int Calcute(int num1, String op, int num2) {
        int result;
        switch (op) {
            case "+" -> {
                result = num1 + num2;
                return result;
            }
            case "-" -> {
                result = num1 - num2;
                return result;
            }
            case "*" -> {
                result = num1 * num2;
                return result;
            }
            case "/" -> {
                result = num1 / num2;
                return result;
            }
            default -> {
                System.out.println("Invalid Operator");
                return 0;
            }
        }
    }
}
