// The java.util package should be import while using Scanner class.
import java.util.Scanner;
public class inputOutput {

  public static void main(String[] args) {
    
    // ** Java Scanner Class for User Input ** 
    // Java Scanner class allows the user to take input from the console.
    // It belongs to java.util package. 
    // It is used to read the input of primitive types like int, double, long, short, float, and byte.
    
    // Scanner class having System.in as an argument.

    // System.in ==>
    // It means it is going to read from the standard input stream of the program.


    Scanner sc = new Scanner(System.in);


    // // Reading a String
    // String name;
    // System.out.print("Enter your name : ");
    // name = sc.nextLine();
    // System.out.println("Name : " + name);


    // // Reading a integer
    // int age;
    // System.out.print("Enter your age : ");
    // age = sc.nextInt();
    // System.out.println("Age : " + age);

    // // Reading a float
    // float height;
    // System.out.print("Enter your height : ");
    // height = sc.nextFloat();
    // System.out.println("height : " + height);

    String name;
    int age;
    float height;
    Boolean isValid;

    System.out.print("Enter your name : ");
    name = sc.nextLine();
    
    System.out.print("Enter your validation in boolean : ");
    isValid = sc.nextBoolean();

    System.out.print("Enter your age : ");
    age = sc.nextInt();
  
    System.out.print("Enter your height : ");
    height = sc.nextFloat();

    System.out.println("======================");
    System.out.println("Name : " + name);
    System.out.println("Age : " + age);
    System.out.println("Height : " + height);
    System.out.println("Validation : " + isValid);
    System.out.println("=======================");
    
    
    sc.close();
  }

}
