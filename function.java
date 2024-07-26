
import java.util.Scanner;

class function {

    public static int Add(int a, int b) {
        int result = a + b;
        return result;
    }

    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        int a = Scan.nextInt();

        System.out.println("Enter your second number: ");
        int b = Scan.nextInt();

        int Total = Add(a, b);
        System.out.println("Total: " + Total);
    }

}
