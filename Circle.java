
import java.util.Scanner;

class Operation {

    int sequare(int n) {

        return n * n;
    }
}

public class Circle {

    double pi = 3.14;
    Operation op; // aggregation

    double area(int radius) {

        op = new Operation();

        int rsequare = op.sequare(radius);

        return rsequare * pi;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your radius : ");
        int radius = scan.nextInt();
        Circle c = new Circle();

        double result = c.area(radius);
        System.out.println("Area of circle : " + result);
    }
}
