
import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        System.out.println("Student Name: " + name);

        System.out.println("Enter your age: ");
        int age = scan.nextInt();
        System.out.println("Student Age: " + age);

        System.out.println("Enter your marks: ");
        float marks = scan.nextFloat();
        System.out.println("Student Marks: " + marks);

        System.out.println("Enter your address: ");
        String address = scan.nextLine();
        System.out.println("Student Address: " + address);

        System.out.println("Enter your city: ");
        String city = scan.nextLine();
        System.out.println("Student City: " + city);

        System.out.println("Enter your state: ");
        String state = scan.nextLine();
        System.out.println("Student State: " + state);

        System.out.println("Enter your pincode: ");
        int pincode = scan.nextInt();
        System.out.println("Student Pincode: " + pincode);

        System.out.println("Enter your country: ");
        String country = scan.nextLine();
        System.out.println("Enter your country code: " + country);
    }
}
