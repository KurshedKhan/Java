import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        int year;
        System.out.println("Enter year to check if leap or not: ");
        year = userInput.nextInt();
        if((year%4) == 0 || (year%400) == 0 && (year%100) != 0){
            System.out.println(year+" It is a leap year");
        }
        else{
            System.out.println(year+" Its not a leap year");
        }
    }
}
