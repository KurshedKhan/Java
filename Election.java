import java.util.Scanner;
public class Election {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String name;
        System.out.println("Enter your name: ");
        name = userInput.next();
        int option, age;
        System.out.println("Select an option:\n1.Educated\t2.Uneducated\t[ 1/2 ]: ");
        option = userInput.nextInt();

        if (option == 1) {
            System.out.println("Enter your age: ");
            age = userInput.nextInt();
            if (age > 35) {
                System.out.println(name + " You are educated and eligible to stand as a candidate for Prime Minister.");
            } else if (age > 18 && age < 35) {
                System.out.println(name + " you are educated and eligible to stand in election for seat of MLA or Councillor");
            } else if (age == 18) {
                System.out.println(name + " You are educated and eligible to stand in election for seat of councillor only");
            } else {
                System.out.println(name + " You are educated but not eligible to vote");
            }
        }
        else{
                System.out.println(name + "You are not educated and not eligible to stand in election");
            }
        }
    }
