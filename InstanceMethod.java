import java.util.Scanner;
public class InstanceMethod {
    
    public static void main(String[] args) {
        
        InstanceMethod obj = new InstanceMethod();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int num1 = scan.nextInt();

        System.out.println("Enter second number : ");
        int num2 = scan.nextInt();

        int sum = obj.Addition(num1, num2);
        System.out.println("totla of two vlaue : "+ sum);

    }

    int result;
    public int Addition(int a , int b){

        result = a + b;
        return result;

    }
}
