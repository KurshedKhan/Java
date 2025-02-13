import java.util.Scanner;

public class addition {
  
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    
    int a,b,c,sum;
    System.out.print("Enter your first number : ");
    a = scan.nextInt();

    System.out.print("Enter your second number : ");
    b = scan.nextInt();

    System.out.print("Enter your third number : ");
    c = scan.nextInt();

    sum = a + b + c ;
    System.out.println("Total of three numbers : " + sum);
  }
}
